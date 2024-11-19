package JavaPractice.Leson5;

public class Car2 {

    String color;
    String engine;
    int speed;

    int gas(int skorasti) {
        speed += skorasti;
        return speed;
    }

    int brake(int skorasti) {
        speed -= skorasti;
        return speed;
    }


    void showInfo() {
        System.out.println("Car Color  " + color + " motor " + engine + " skorasti " + speed);
    }
}
    class Car2Test {

        public static void main(String[] args) {

            Car2 audi = new Car2();
            audi.color = "white";
            audi.engine = "V6";
            audi.speed = 60;

            audi.showInfo();
            audi.gas(20);
            audi.showInfo();
            audi.brake(80);
            audi.showInfo();





        }
    }



