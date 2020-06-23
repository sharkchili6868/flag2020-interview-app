import React from "react";

import "./styles/main.scss";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import HomePage from "./components/layout/HomePage";
import LoginPage from "./components/layout/LoginPage";

const App = () => {
  return (
    <BrowserRouter>
      <div className="container">
        <Switch>
          <Route exact path="/" component={HomePage} />
          <Route exact path="/" component={LoginPage} />
        </Switch>
      </div>
    </BrowserRouter>
  );
};

export default App;
