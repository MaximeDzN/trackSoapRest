package eu.ensup.service;

import eu.ensup.domain.Track;

import javax.xml.ws.Endpoint;

public class TrackPublisher {
    public static void main(String[] args) {
        int port = 8888;
        String url = "http://192.168.133.19:" + port + "/track";
        System.out.println("Publishing Track on port " + port);
        Endpoint.publish(url, new TrackService());
    }
}
