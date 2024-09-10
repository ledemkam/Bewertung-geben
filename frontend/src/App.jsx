import { NavLink } from "react-router-dom";
import { Outlet } from "react-router-dom";

export default function App() {



  return (
    <main className="bg-blue-900 text-slate-50">
      <header className="flex justify-between px-32 py-6">
         <NavLink to="/" 
                  style={({isActive}) => {
                    return isActive ? 
                    {color: 'green',
                     fontSize:"30px",
                     lineHeight: "36px",
                     fontWeight: "bold",
                     
                    } : {
                      color :  "#f8fafc ",
                      opacity: "1",
                      fontSize:"30px",
                      lineHeight: "36px" ,
                      fontWeight: "bold",    
                    }
                  }}           
          >Home</NavLink>
         <nav>
           <ul className="flex gap-6 items-center">
             <li>
             <NavLink to="/eine-meinung-geben"
                      style={({isActive}) => {
                        return isActive ? 
                        {color: 'green',
                         fontSize:"20px",
                         lineHeight: "28px"
                         
                        } : {
                          color :  "#f8fafc ",
                          opacity: "1",
                          fontSize:"20px",
                          lineHeight: "28px"                        
                        }
                      }}           
             >neue Meinung verfassen</NavLink>
             </li>
             <li>
             <NavLink to="/meinung"
                      style={({isActive}) => {
                        return isActive ? 
                        {color: 'green',
                         fontSize:"20px",
                         lineHeight: "28px"
                         
                        } : {
                          color :  "#f8fafc ",
                          opacity: "1",
                          fontSize:"20px",
                          lineHeight: "28px"
                          
                        }
                      }}                 
                     >Bewertungen</NavLink>
             </li>
           </ul>
         </nav>
      </header>
       <Outlet />
    </main>
  )
}