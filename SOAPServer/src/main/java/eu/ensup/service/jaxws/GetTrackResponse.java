
package eu.ensup.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.ensup.domain.Track;

@XmlRootElement(name = "getTrackResponse", namespace = "http://service.ensup.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTrackResponse", namespace = "http://service.ensup.eu/")
public class GetTrackResponse {

    @XmlElement(name = "return", namespace = "")
    private Track _return;

    /**
     * 
     * @return
     *     returns Track
     */
    public Track getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Track _return) {
        this._return = _return;
    }

}
