import React from "react";
import Header from "./Header";
import SideBar from "./SideBar";

const HomePage = () => {
  return (
    <div>
      <Header />
      <div className="row">
        <div className="col-2">
          <SideBar />
        </div>
        <div className="col-10">Other stuff</div>
      </div>
    </div>
  );
};

export default HomePage;
