
import './App.css'
import EmployeeComponent from './component/EmployeeComponent'
import FooterComponent from './component/FooterComponent'
import HeaderComponent from './component/HeaderComponent'

import ListEmployeeComponent from './component/ListEmployeeComponent'
import {BrowserRouter, Routes  ,Route} from 'react-router-dom'

function App() {
  

  return (
    <>
    <BrowserRouter>
    <HeaderComponent/>
    <Routes>
     {/* //http://localhost:5173 */}
      <Route path='/' element = {<ListEmployeeComponent />}>  </Route>
      {/* //http://localhost:5173/employee */}
      <Route path='/employee' element = {<ListEmployeeComponent />}>  </Route>
      
      {/* //http://localhost:5173/add-employee */}
      <Route path='/add-employee' element = {< EmployeeComponent />}>  </Route>

      {/* //http://localhost:5173/edit-employee */}
      <Route path='/edit-employee/:id' element = {< EmployeeComponent />}>  </Route>

      </Routes> 
      <FooterComponent/>
      </BrowserRouter>
    </>
  )
}

export default App
