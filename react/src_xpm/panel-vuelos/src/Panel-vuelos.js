import React, { useState } from 'react';


const Panel_vuelos = () =>{
 
    
    const [flys, setflys] = useState([
        {number : 12934,plane : "harfel",state : programated},
        {number : 13934,plane : "harfel",state : programated}
  
    ]);
     


     
    setflys(prevflys =>
        prevflys.map(fly => {
          if (fly.state === 'programated') {
            return { ...fly, state: 'takeof' };
          } else if (fly.state === 'takeof') {
            return { ...fly, state: 'landed' };
          } else {
            return fly;
          }
        })
      );



    
    return(
        <div>
            <label>Contador: {num}</label> 
            <button onClick={increment}>increment</button>
            <button onClick={decrement}>decrement</button>

        </div>
    )



}


export default Panel_vuelos