import React, { useState } from 'react';


const Contador = () =>{
 
    
    const [num, setnum] = useState(0)
    const increment = () =>{
        setnum(num+1);
    }

    const decrement = () =>{
        setnum(num-1);
    }

    return(
        <div>
            <label>Contador: {num}</label> 
            <button onClick={increment}>increment</button>
            <button onClick={decrement}>decrement</button>

        </div>
    )



}


export default Contador