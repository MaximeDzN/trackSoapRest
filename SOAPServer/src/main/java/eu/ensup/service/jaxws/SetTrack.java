
package eu.ensup.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.ensup.domain.Track;

@XmlRootElement(name = "setTrack", namespace = "http://service.ensup.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTrack", namespace = "http://service.ensup.eu/")
public class SetTrack {

    @XmlElement(name = "arg0", namespace = "")
    private Track arg0;

    /**
     * 
     * @return
     *     returns Track
     */
    public Track getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Track arg0) {
        this.arg0 = arg0;
    }

}
