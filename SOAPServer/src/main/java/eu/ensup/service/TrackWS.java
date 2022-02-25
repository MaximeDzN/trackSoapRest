package eu.ensup.service;


import eu.ensup.domain.Track;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@WebService
public class TrackWS {
    private String url = "http://localhost:8080/RESTServer/track/";

    @WebMethod
    public Track getTrack() {
        // GET
        Client client = ClientBuilder.newClient();
        Track c = client.target(url+"sandman").request("application/json").get(Track.class);
        System.out.println(c);
        return c;
    }

    @WebMethod
    public eu.ensup.domain.Response setTrack(Track track) {
        Client client = ClientBuilder.newClient();
        Response res = client.target(url).request("application/json").post(Entity.entity(track, MediaType.APPLICATION_JSON));
        System.out.println(res);
        return new eu.ensup.domain.Response(res.getStatus(), res.getStatusInfo().getReasonPhrase());
    }
}
