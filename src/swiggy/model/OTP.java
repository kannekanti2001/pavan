package swiggy.model;

import java.util.Date;

public class OTP {

    public String number;

    public Date CreationDate;

    @Override
    public String toString() {
        return "OTP{" +
                "number='" + number + '\'' +
                ", CreationDate=" + CreationDate +
                ", expiryDate=" + expiryDate +
                '}';
    }

    public Date expiryDate;

}