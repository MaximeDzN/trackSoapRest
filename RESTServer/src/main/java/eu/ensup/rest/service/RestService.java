package eu.ensup.rest.service;

import eu.ensup.rest.domaine.Track;
import io.swagger.v3.oas.annotations.Parameter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class RestService {

    @GET
    @Path("sandman")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJson(){
        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");
        return track;
    }

    @POST
    public Response createTrackInJson(@Parameter(description = "Track is the best") Track track){
        String result = "Track save : " + track;
        return Response.status(201).entity(result).build();
    }
}
