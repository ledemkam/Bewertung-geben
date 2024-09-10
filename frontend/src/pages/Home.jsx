import { Link } from "react-router-dom"

const Home = () => {
  return (
    <div className="container flex flex-col h-screen justify-center items-center">
       <h1 className="text-2xl mb-2">Bitte Ihre Meinung Geben</h1>
       <Link to="/eine-meinung-geben" className="text-green-500 border-b border-green-500 text-xl">neue Meinung verfassen</Link>
   </div>
  )
}
export default Home