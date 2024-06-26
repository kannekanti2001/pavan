package swiggy.service;


import swiggy.model.OTP;
import swiggy.model.Restaurant;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class SwiggyService {

    public static Restaurant restaurantStaticVariable;


    public OTP registerRestaurant(Restaurant rrr) {
        restaurantStaticVariable = rrr;
        OTP otp = new OTP();
        otp.number = UUID.randomUUID().toString();
        otp.CreationDate = new Date();
        long currentTimeInMills = otp.CreationDate.getTime();
        //15 mints -> 900 sec ->  900*1000=900000;
        long endTimeInMills = currentTimeInMills + 900000;
        otp.expiryDate = new Date(endTimeInMills);
        return otp;
    }


}

