package swiggy.service;

import swiggy.model.Menu;
import swiggy.model.OTP;
import swiggy.model.Restaurant;

import java.awt.*;
import java.util.Stack;

public class SwiggyServiceTest {

    public static void main(String[] args) {

        Restaurant r =new Restaurant();
        Menu m =new Menu();
            r.name="KFC";
            r.area="KPHP";
            r.faltNo="205";
            r.landMark="HiTechCity";
            r.pinCode=504274;

            m.name="Biryani";
            m.price=250;
            m.status=true;

            r.menu=m;

        SwiggyService service=new SwiggyService();
          OTP r1=service.registerRestaurant(r);
         System.out.println(r1);

    }

}
