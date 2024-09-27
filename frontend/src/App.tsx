import { Routes, Route, Link } from 'react-router-dom'
import './App.css'
import Home from './pages/Home.tsx'

function App() {

  return (
    <>
      <div className="App">

      </div>

      <Routes>
        <Route path="/" element={<Home />} />
      </Routes>
    </>
  )
}

export default App
