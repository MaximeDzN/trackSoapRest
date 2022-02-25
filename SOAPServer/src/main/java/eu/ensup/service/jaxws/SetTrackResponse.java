
package eu.ensup.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.ensup.domain.Response;

@XmlRootElement(name = "setTrackResponse", namespace = "http://service.ensup.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTrackResponse", namespace = "http://service.ensup.eu/")
public class SetTrackResponse {

    @XmlElement(name = "return", namespace = "")
    private Response _return;

    /**
     * 
     * @return
     *     returns Response
     */
    public Response getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Response _return) {
        this._return = _return;
    }

}
