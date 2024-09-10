import { useEffect,useState } from "react";
import CardAvisItem from "../components/CardAvisItem";


 const Meinung = () => {
  const[meinung,setMeinung] = useState([])

  

  const fechMeinung = async () => {
     try {
      const response = await fetch('/db.json')
      const data = await response.json()
      setMeinung(data)
      
     } catch (error) {
        console.log(error);
        
     }
  }

  useEffect(() => {
    fechMeinung()
  },[])
  return (
    <div className="container flex flex-col h-screen justify-center">
      <div className="grid grid-cols-3 gap-4">

      {meinung.map((items) => 
        <CardAvisItem key={items.id} items={items}/>
      )}
    </div>
    </div>
  )
}

export default Meinung