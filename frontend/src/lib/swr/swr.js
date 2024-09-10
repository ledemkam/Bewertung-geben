import useSWR from "swr"
import { getAllMeinung } from "./api"


//getAllMeinung
export const useGetAllMeinung = () => {
  const { data, error, isLoading } = useSWR("/db.json", getAllMeinung)

 
  
 
  return {
    meinung: data,
    isLoading,
    isError: error
  }
}