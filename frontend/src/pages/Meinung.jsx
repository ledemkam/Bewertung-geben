import { useEffect,useState } from "react";


 const Meinung = () => {
  const[meinung,setMeinung] = useState([])

  console.log(meinung);
  

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
      <pre>{JSON.stringify(meinung,null,2)}</pre>
    </div>
  )
}

export default Meinung