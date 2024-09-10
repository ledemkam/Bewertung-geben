import PropTypes from "prop-types"

const CardAvisItem = ({items}) => {
  return (
    <article className="p-4 rounded-md bg-slate-50 text-gray-700">
       <div className="text-xl">{items.meinung}</div>
       <h4 className="mt-2">{items.email}</h4>
    </article>
  )
}



CardAvisItem.propTypes = {
  items: PropTypes.objectOf({
    id: PropTypes.number,
    meinung: PropTypes.string,
    email: PropTypes.string
  })
}
export default CardAvisItem