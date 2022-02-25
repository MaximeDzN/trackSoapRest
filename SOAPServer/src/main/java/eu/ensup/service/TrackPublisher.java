package eu.ensup.service;

import javax.xml.ws.Endpoint;

public class TrackPublisher {
    public static void main(String[] args) {
        int port = 8888;
        String url = "http://localhost:" + port + "/track";
        System.out.println("Publishing Track on port " + port);
        Endpoint.publish(url, new TrackWS());
    }
}
