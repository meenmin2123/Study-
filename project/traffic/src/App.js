import { BrowserRouter as Router, Route, Routes, useLocation, useMatch } from 'react-router-dom';
import Login from './login/login';
import Main from './page/main';

function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Main />} />
        <Route path='/login' element={<Login />} />
      </Routes>
    </Router>
  );
}

export default App;
