package JavaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CarInfo extends MainTest{

    final String name;
    final String engine;
    final int speed;
    final int year;
    final  String color;

    CarInfo(String name1, String engine1, int speed1, int year1, String color1) {
        this.name = name1;
        this.engine = engine1;
        this.speed = speed1;
        this.year = year1;
        this.color = color1;
    }

    static String inform(CarInfo information){
        String sum = ("Car model " + information.name + " with engine " + information.engine + information.color + " color! "
                + " from " + information.year + " going up to " + information.speed);
        return sum;
    }

    public String toString(){
        return  "Car model " + name + " with engine " + engine + color + " color! "
                + " from " + year + " going up to " + speed;

    }
}


class MainTest{
    public static void main(String[] args) {

        CarInfo bmw = new CarInfo("BWM", " V6 " , 180, 2020, "Black");
        System.out.println(bmw.color);

        CarInfo audi = new CarInfo("Audi", "V8 ", 187, 2022, "White");
        CarInfo porsche = new CarInfo("Porche", "V12 ", 194, 2025, "Grey");

        System.out.println(CarInfo.inform(bmw));

        CarInfo[] cars = {bmw, audi, porsche};

        System.out.println(Arrays.toString(new CarInfo[]{cars[1]}));



    }
}