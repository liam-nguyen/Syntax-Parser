import React from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import FileUploader from '../src/components/FileUploader';
function App() {
  return (
    <div className="App">
        <FileUploader />
    </div>
    
  );
}

export default App;