package lk.ijse.travelAgent.dto;

import java.io.Serializable;

public class PassengerDTO implements Serializable {
    private int passID;
    private String passName;
    private String passAddress;
    private String passNic;
    private int passPhone;
    private String passPassPortNo;

    public PassengerDTO(){

    }

    public PassengerDTO(int passID, String passName, String passAddress, String passNic, int passPhone, String passPassPortNo) {
        this.passID = passID;
        this.passName = passName;
        this.passAddress = passAddress;
        this.passNic = passNic;
        this.passPhone = passPhone;
        this.passPassPortNo = passPassPortNo;
    }

    public int getPassID() {
        return passID;
    }

    public void setPassID(int passID) {
        this.passID = passID;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getPassAddress() {
        return passAddress;
    }

    public void setPassAddress(String passAddress) {
        this.passAddress = passAddress;
    }

    public String getPassNic() {
        return passNic;
    }

    public void setPassNic(String passNic) {
        this.passNic = passNic;
    }

    public int getPassPhone() {
        return passPhone;
    }

    public void setPassPhone(int passPhone) {
        this.passPhone = passPhone;
    }

    public String getPassPassPortNo() {
        return passPassPortNo;
    }

    public void setPassPassPortNo(String passPassPortNo) {
        this.passPassPortNo = passPassPortNo;
    }
}
