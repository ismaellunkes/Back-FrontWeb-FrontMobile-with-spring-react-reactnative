import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Header from '../src/components/Header';
import Charts from '../src/pages/Charts';
import Home from '../src/pages/Home';
import Records from '../src/pages/Records';

const Routes = () => (
    <BrowserRouter>
        <Header />
        <Switch>
            <Route path="/" exact>
                <Home />
            </Route>
            <Route path="/records">
                <Records />
            </Route>
            <Route path="/charts">
                <Charts />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;