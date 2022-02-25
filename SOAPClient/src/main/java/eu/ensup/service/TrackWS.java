
package eu.ensup.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TrackWS", targetNamespace = "http://service.ensup.eu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TrackWS {


    /**
     * 
     * @return
     *     returns eu.ensup.service.Track
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTrack", targetNamespace = "http://service.ensup.eu/", className = "eu.ensup.service.GetTrack")
    @ResponseWrapper(localName = "getTrackResponse", targetNamespace = "http://service.ensup.eu/", className = "eu.ensup.service.GetTrackResponse")
    @Action(input = "http://service.ensup.eu/TrackWS/getTrackRequest", output = "http://service.ensup.eu/TrackWS/getTrackResponse")
    public Track getTrack();

    /**
     * 
     * @param arg0
     * @return
     *     returns eu.ensup.service.Response
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setTrack", targetNamespace = "http://service.ensup.eu/", className = "eu.ensup.service.SetTrack")
    @ResponseWrapper(localName = "setTrackResponse", targetNamespace = "http://service.ensup.eu/", className = "eu.ensup.service.SetTrackResponse")
    @Action(input = "http://service.ensup.eu/TrackWS/setTrackRequest", output = "http://service.ensup.eu/TrackWS/setTrackResponse")
    public Response setTrack(
        @WebParam(name = "arg0", targetNamespace = "")
        Track arg0);

}