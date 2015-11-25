package com.soap.export;

import javax.xml.ws.Endpoint;

import com.soap.service.GetAccountServiceImpl;

public class Exporter {

    public static void main(String args[]) {
        Endpoint.publish("http://localhost:4500/soap/accounts", new GetAccountServiceImpl());
    }
}
