import eu.ensup.service.Response;
import eu.ensup.service.Track;
import eu.ensup.service.TrackService;
import eu.ensup.service.TrackServiceService;

public class Main {
    public static void main(String[] args) {
        // instanciation du service généré par wsimport
        TrackServiceService service = new TrackServiceService();

        // récupération du eu.ensup.client
        TrackService port = service.getTrackServicePort();
        Track res = port.getTrack();

        System.out.println(res.getSinger() + " " + res.getTitle());

        // Modify track
        res.setSinger("Maxime");
        res.setTitle("Il n'a pas dit bonjour");

        // publish track
        Response response = port.setTrack(res);
        System.out.println(response.getStatus().toString() + " " + response.getReason());
    }
}
