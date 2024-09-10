import CardAvisItem from "../components/CardAvisItem";
import { useGetAllMeinung } from "../lib/swr/swr";

  const Meinung = () => {
const {meinung,isLoading,isError} = useGetAllMeinung()

  return (
    <div className="container flex flex-col h-screen justify-center">
      <div className="grid grid-cols-3 gap-4">

      {isLoading ? (
         <svg className="animate-spin h-5 w-5 mr-3 ..." viewBox="0 0 24 24">      
       </svg>
      ) :(
        meinung.map((items) => 
          <CardAvisItem key={items.id} items={items}/>
      ))}
      {isError && <span>Error: {isError.message}</span>}
    </div>
    </div>
  )
}

export default Meinung