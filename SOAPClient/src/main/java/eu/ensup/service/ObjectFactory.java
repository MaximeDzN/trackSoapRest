
package eu.ensup.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ensup.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTrack_QNAME = new QName("http://service.ensup.eu/", "getTrack");
    private final static QName _GetTrackResponse_QNAME = new QName("http://service.ensup.eu/", "getTrackResponse");
    private final static QName _SetTrack_QNAME = new QName("http://service.ensup.eu/", "setTrack");
    private final static QName _SetTrackResponse_QNAME = new QName("http://service.ensup.eu/", "setTrackResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ensup.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTrack }
     * 
     */
    public GetTrack createGetTrack() {
        return new GetTrack();
    }

    /**
     * Create an instance of {@link GetTrackResponse }
     * 
     */
    public GetTrackResponse createGetTrackResponse() {
        return new GetTrackResponse();
    }

    /**
     * Create an instance of {@link SetTrack }
     * 
     */
    public SetTrack createSetTrack() {
        return new SetTrack();
    }

    /**
     * Create an instance of {@link SetTrackResponse }
     * 
     */
    public SetTrackResponse createSetTrackResponse() {
        return new SetTrackResponse();
    }

    /**
     * Create an instance of {@link Track }
     * 
     */
    public Track createTrack() {
        return new Track();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrack }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTrack }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ensup.eu/", name = "getTrack")
    public JAXBElement<GetTrack> createGetTrack(GetTrack value) {
        return new JAXBElement<GetTrack>(_GetTrack_QNAME, GetTrack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrackResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTrackResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ensup.eu/", name = "getTrackResponse")
    public JAXBElement<GetTrackResponse> createGetTrackResponse(GetTrackResponse value) {
        return new JAXBElement<GetTrackResponse>(_GetTrackResponse_QNAME, GetTrackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTrack }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetTrack }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ensup.eu/", name = "setTrack")
    public JAXBElement<SetTrack> createSetTrack(SetTrack value) {
        return new JAXBElement<SetTrack>(_SetTrack_QNAME, SetTrack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTrackResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetTrackResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ensup.eu/", name = "setTrackResponse")
    public JAXBElement<SetTrackResponse> createSetTrackResponse(SetTrackResponse value) {
        return new JAXBElement<SetTrackResponse>(_SetTrackResponse_QNAME, SetTrackResponse.class, null, value);
    }

}
