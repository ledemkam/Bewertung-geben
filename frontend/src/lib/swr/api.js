
//fetch all meinungen
export const getAllMeinung = async url => {
  const res = await fetch(url)
   if (!res.ok) {
    const error = new Error('Beim Abrufen der Daten ist ein Fehler aufgetreten.')
    // Zusätzliche Informationen an das Fehlerobjekt anhängen.
    error.info = await res.json()
    error.status = res.status
    throw error
  }
 
  return res.json()
}