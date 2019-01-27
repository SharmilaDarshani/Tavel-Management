package lk.ijse.travelAgent.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "passenger")
public class Passenger implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int passID;

    @Column(name = "pass_Name")
    private String passName;

    @Column(name = "pass_Adreess")
    private String passAddress;

    @Column(name = "pass_Nic")
    private String passNic;

    @Column(name = "pass_Moblile")
    private int passMobile;

    @Column(name = "pass_PassPassPortNo")
    private String passPassPortNo;

    public Passenger(){

    }

    public Passenger(int passID, String passName, String passAddress, String passNic, int passMobile, String passPassPortNo) {
        this.passName = passName;
        this.passAddress = passAddress;
        this.passNic = passNic;
        this.passMobile = passMobile;
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

    public int getPassMobile() {
        return passMobile;
    }

    public void setPassMobile(int passMobile) {
        this.passMobile = passMobile;
    }

    public String getPassPassPortNo() {
        return passPassPortNo;
    }

    public void setPassPassPortNo(String passPassPortNo) {
        this.passPassPortNo = passPassPortNo;
    }
}

