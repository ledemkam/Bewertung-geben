import { Link } from "react-router-dom";
import { Outlet } from "react-router-dom";

export default function App() {



  return (
    <main className="bg-blue-900 text-slate-50">
      <header className="flex justify-between px-32 py-6">
         <Link to="/" className="text-3xl font-bold">Home</Link>
         <nav>
           <ul className="flex gap-6 items-center">
             <li>
             <Link to="/eine-meinung-geben" className="text-slate-50 border-b border-slate-500 text-xl">neue Meinung verfassen</Link>
             </li>
             <li>
             <Link to="/meinung" className="text-slate-50 border-b border-slate-500 text-xl">Bewertungen</Link>
             </li>
           </ul>
         </nav>
      </header>
       <Outlet />
    </main>
  )
}