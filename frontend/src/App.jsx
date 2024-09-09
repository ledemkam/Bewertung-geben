import { useForm } from "react-hook-form"

export default function App() {
  const {
    register,
    handleSubmit,
   
    formState: { errors },
  } = useForm()

   const onSubmit = (data) => console.log(data)

  return (
    <section className="bg-blue-900 text-slate-50">
      <div className="container flex flex-col h-screen justify-center">
      <h2 className="text-3xl px-56 mb-20 text-center">Die Stimmen unserer Kunden</h2>

        <form onSubmit={handleSubmit(onSubmit)} className="text-xl px-56 flex flex-col gap-4">
        <div className="form-group flex flex-col">
            <label className="form-label" htmlFor="email">Ihr Email</label>
            <input  id="email"  className="text-gray-900 mt-3 p-2 rounded-sm" placeholder="Ihr Email hier" {...register("email",{required:true})}/>
            {errors.email && <p className="text-red-500">Wird es benötigt</p>}
          </div>
          <div className="form-group flex flex-col mt-5">
            <label className="form-label" htmlFor="meinung">Ihre persönliche Erfahrung</label>
            <textarea 
                      id="meinung" 
                      rows="4" 
                      className="text-gray-900 mt-3 p-2 rounded-sm" placeholder="Womit waren Sie zufrieden?Warum würden Sie firmaGmbh weiterempfehlen"
                      {...register("meinung",{required:true})}/>
                      {errors.meinung && <p className="text-red-500">Wird es benötigt</p>}

          </div>
          <div className="form-group flex flex-col mt-5">
            <button type="submit" className="p-2 rounded-md bg-green-700">Bewertung veröffentlichen</button>
          </div>
        </form>
      </div>
    </section>
  )
}