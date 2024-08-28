import React, { useState, useEffect } from 'react';
import './MemoryGame.css';

const MemoryGame = () => {
    //definir valores de las cartas
    let cardValues = ["A", "B", "C", "D", "E", "F", "G", "H"];

    //bajear cartas
    const shuffleCards = [...cardValues, ...cardValues].sort(() => Math.random() - 0.5);

    //estados para cartas, tiempo e intentos

    const [cards, setCards] = useState(shuffleCards.map(value => ({
        value, 
        flipped: false,
        mathched: false
    })));

    const [selectedCards, setSelectedCards] = useState([]); //cartas seleccionadas
    const [attemps, setAttemps] = useState(0); //intentos
    const [time, setTime] = useState(0); //tiempo
    const [timerActive, setTimerActive] = useState(false); //tiempo activo

    //efecto para el temporizador
    useEffect (() => {
        let timer;
        if(timerActive){
            timer = setInterval(() =>{
                setTime(prevTime => prevTime + 1);
            }, 1000);
        }else if (!timerActive && time !== 0){
            clearInterval(timer);
        }
        return () =>{
            clearInterval(timer);
        }
    }, [timerActive]);

    //manejar efecto de click en cartas
    const  handleClick = (index) =>{
        if(selectedCards.length === 2 || cards[index].flipped) return; //se salta las cartas que ya estan elegidas y con pareja
        //en caso de que no tengan pareja descubierta 

        const newCards = [...cards];
        newCards[index].flipped = true;
        setSelectedCards([...selectedCards, index]);

        if (!timerActive){
            setTimerActive(true); 
        }

        if(selectedCards.length === 1){
            setAttemps(attemps+1);
            const firstIndex = selectedCards[0];
            const secondIndex = index; //indice de la segunda carta

            if(newCards[firstIndex].value === newCards[secondIndex].value){
                //si las cartas coinciden, se marcan como emparejadas
                newCards[firstIndex].mathched = true;
                newCards[secondIndex].mathched = true;
            }else{
                setTimeout(()=> {
                    newCards[firstIndex].flipped = false;
                    newCards[secondIndex].flipped = false;
                    setCards(newCards);

                }, 1000);
            }
            setSelectedCards([]); //limpia el estado de las cartas seleccionadas
        }
        setCards(newCards); //actualiza el estado de las cartas
    }

    //reinicio del juego
    const handleResetGame =() =>{
        const resetCards = shuffleCards.map(value=>({
            value,
            flipped: false,
            mathched: false
        }));
        setCards(resetCards);
        setSelectedCards([]);
        setAttemps(0);
        setTime(0);
        setTimerActive(false);
    };

    //comprobar si todas las cartas han sido emparejadas
    useEffect(() => {
        if (cards.every(card => card.mathched)){
            setTimerActive(false); //parar el tiempo por que el juego esta completado
        }
    }, [cards]);

    return (
        <div className="memory-game">
            <h1>Memory Game</h1>
            <p>Intentos: {attemps}</p> <p>Tiempo: {time}</p>
            <button onClick={handleResetGame}>Reiniciar</button>
            <div className="card-grid">
                {cards.map((card, index) => (
                    <div 
                    key={index} 
                    className={`card ${card.flipped ? "flipped" : ""}`}
                    onClick={()=> handleClick(index)}
                    >
                        <div className="card-inner">
                            <div className="card-front">?</div>
                            <div className="card-back">{card.value}</div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    )
}

export default MemoryGame
