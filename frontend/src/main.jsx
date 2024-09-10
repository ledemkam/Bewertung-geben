import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import {
  createBrowserRouter,
  RouterProvider,
} from 'react-router-dom'
import Meinung from './pages/Meinung.jsx'
import Home from './pages/Home.jsx'
import EditMeinung from './pages/EditMeinung.jsx'

const routes = createBrowserRouter([
  {
    path: '/',
    element: <App />,
    children: [
     {
      path: '',
      element: <Home />,
     },
     {
      path: 'eine-meinung-geben',
      element: <EditMeinung/>,

     },
     {
      path: '/meinung',
      element: <Meinung/>
  
    }

    ]

  }
])

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <RouterProvider  router={routes} />
  </StrictMode>,
)
