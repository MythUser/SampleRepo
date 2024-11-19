package JavaPractice.Leson5;

class CallingMethods {

    public static void main(String[] args) {

        CountingPractice c = new CountingPractice();
        int sumaTrexCisel = c.summa(1, 5, 6);
        System.out.println(c.summa(10, 5, 3));
        System.out.println(sumaTrexCisel);

        Test20 t = new Test20();
        int k = t.summa(26, 2, 25);
        System.out.println(t.summa(32, 35, 233));
        System.out.println(k);

        System.out.println(t.sredneeArifm(20, 40, 60));


    }
}
