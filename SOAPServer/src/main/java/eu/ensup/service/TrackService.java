package eu.ensup.service;

import eu.ensup.domain.Track;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@WebService
public class TrackService {
    private String url = "http://192.168.133.175:8080/RESTServer/rest/track/";

    public TrackService(){

    }

    @WebMethod
    public Track getTrack() {
        // GET
        Client client = ClientBuilder.newClient();
        Track c = client.target(url+"sandman").request("application/json").get(Track.class);
        System.out.println(c);
        return c;
    }

    @WebMethod
    @WebResult
    public Response setTrack(Track track) {
        Client client = ClientBuilder.newClient();
        Response res = client.target(url).request("application/json").post(Entity.entity(track, MediaType.APPLICATION_JSON));
        System.out.println(res);
        return res;
    }
}
