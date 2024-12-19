package CodeWars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.LongStream;

import static java.lang.Integer.MAX_VALUE;

public class CodeWars {

//    Given an array of integers, return a new array with each value doubled. For example: [1, 2, 3] --> [2, 4, 6]

    public static int[] map(int[] arr) {

        Map<Integer, Integer> mapArray = new HashMap<>();

        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            mapArray.put(i, arr[i] * 2);
            resultArray[i] = mapArray.get(i);
        }

        return resultArray;
    }

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= 2;
//        }
//        return arr;

//  Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//  The output should be two capital letters with a dot separating them. It should look like this:
//        Sam Harris => S.H   ->  patrick feeney => P.F


    public static String abbrevName(String name) {
        String[] vert = name.split(" ");
        return (vert[0].charAt(0) + "." + vert[1].charAt(0)).toUpperCase();
    }

//    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//    highAndLow("1 2 3 4 5") // return "5 1"
//    highAndLow("1 2 -3 4 5") // return "5 -3"
//    highAndLow("1 9 3 4 -5") // return "9 -5"
//    Notes:
//    All numbers are valid Int32, no need to validate them.There will always be at least one number in the input string.
//    Output string must be two numbers separated by a single space, and highest number is first.

    public static String highAndLow(String numbers) {

        String[] space = numbers.split(" ");

        int high = 0;
        int low = 1;

        for (int i = 0; i < space.length; i++) {

            int value = Integer.parseInt(space[i]);
            if (value > high) {
                high = value;
            }
            if (value < low) {
                low = value;
            }
        }
        return high + " " + low;
    }

//    Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//    Examples input/output:
//    XO("ooxx") => true
//    XO("xooxx") => false
//    XO("ooxXm") => true
//    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//    XO("zzoo") => false

    public static boolean getXO(String str) {

//        int countX = 0;
//        int countO = 0;
//
//        str = str.toLowerCase();
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'x') {
//                countX++;
//            } else if (str.charAt(i) == 'o') {
//                countO++;
//            }
//        }
//        if (countO == countX) {
//            return true;
//        } else {
//            return false;
//        }

//// retry

        int countX = 0;
        int countO = 0;
        str = str.toLowerCase();

        String[] arrayStr = str.split("");

        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].contains("x")) {
                countX += 1;
            } else if (arrayStr[i].contains("o")) {
                countO += 1;
            }
        }
        if (countO == countX) {
            return true;

        } else {
            return false;
        }
    }
//    Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
//    Examples (Input -> Output):
//            * "String"      -> "SSttrriinngg"
//            * "Hello World" -> "HHeelllloo  WWoorrlldd"
//            * "1234!_ "     -> "11223344!!__  "

    public static String doubleChar(String s) {

//        String[] separateString = s.split("");
//        String result = "";
//
//        for (int i = 0; i < separateString.length; i++) {
//            result = result + separateString[i] + separateString[i];
//        }
//        return result;


        // avoid arrays

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result = result + s.charAt(i) + s.charAt(i);
        }
        return result;


    }

    // try string builder


//    We need a simple function that determines if a plural is needed or not. It should take a number, and return true if a plural should be used with that number or false if not.
//    This would be useful when printing out a string such as 5 minutes, 14 apples, or 1 sun.
//    You only need to worry about english grammar rules for this kata, where anything that isn't singular (one of something), it is plural (not one of something).
//    All values will be positive integers or floats, or zero.

    public static boolean isPlural(float f) {

        return f == 1 ? false : true;
    }

//    Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero numbers.
//    Examples:
//            1) n =   3, x = 1, y = 3 =>  true because   3 is divisible by 1 and 3
//            2) n =  12, x = 2, y = 6 =>  true because  12 is divisible by 2 and 6
//            3) n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
//            4) n =  12, x = 7, y = 5 => false because  12 is neither divisible by 7 nor 5


//    Write a function to find if a number is lucky or not. If the sum of all digits is 0 or multiple of 9 then the number is lucky.
//
//  1892376 => 1+8+9+2+3+7+6 = 36. 36 is divisible by 9, hence number is lucky.
//
//    Function will return true for lucky numbers and false for others.


    public static boolean isLucky(long n) {

        String[] arr = String.valueOf(n).split("");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        if (sum % 9 == 0) {
            return true;
        }
        return false;

    }


//    The male gametes or sperm cells in humans and other mammals are heterogametic and contain one of two types of sex chromosomes. They are either X or Y. The female gametes or eggs however, contain only the X sex chromosome and are homogametic.
//
//    The sperm cell determines the sex of an individual in this case. If a sperm cell containing an X chromosome fertilizes an egg, the resulting zygote will be XX or female. If the sperm cell contains a Y chromosome, then the resulting zygote will be XY or male.
//
//    Determine if the sex of the offspring will be male or female based on the X or Y chromosome present in the male's sperm.
//
//    If the sperm contains the X chromosome, return "Congratulations! You're going to have a daughter."; If the sperm contains the Y chromosome, return "Congratulations! You're going to have a son.";


    public static String chromosomeCheck(String sperm) {

        if (sperm.contains("Y")) {
            return "Congratulations! You're going to have a son.";
        }
        return "Congratulations! You're going to have a daughter.";
    }


//    We need a function that can transform a string into a number. What ways of achieving this do you know?
//    Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
//    Examples
//         "1234" --> 1234
//        "605"  --> 605
//        "1405" --> 1405
//        "-7" --> -7

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }


//    We need a function that can transform a number (integer) into a string.
//    What ways of achieving this do you know?
//    Examples (input --> output):
//            123  --> "123"
//            999  --> "999"
//            -100 --> "-100"

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

//    Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
//            Examples (input -> output)
//            6, "I"     -> "IIIIII"
//            5, "Hello" -> "HelloHelloHelloHelloHello"

    public static String repeatStr(final int repeat, final String string) {

        String str = " ";

        for (int i = 0; i < repeat; i++) {

            str += string;
        }
        return str;
    }


//    Given an array of integers your solution should find the smallest integer.
//
//    For example:
//
//    Given [34, 15, 88, 2] your solution will return 2
//    Given [34, -345, -1, 100] your solution will return -345
//    You can assume, for the purpose of this kata, that the supplied array will not be empty.

    public static int findSmallestInt(int[] args) {

        int min = MAX_VALUE;

        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;

    }

    public static int[] monkeyCount(final int n) {

        int[] result = new int[n];

        for (int i = 1; i < n; i++) {
            result[i] = i++;
        }
        return result;

    }

//    You must implement a function that returns the difference between the largest and the smallest value in a given list / array (lst) received as the parameter.
//lst contains integers, that means it may contain some negative numbers. if lst is empty or contains a single element, return 0 . lst is not sorted
//[1, 2, 3, 4]   //  returns 3 because 4 -   1  == 3
// [1, 2, 3, -4]  //  returns 7 because 3 - (-4) == 7

    public static int maxDiff(int[] lst) {

        if (lst.length < 2) {
            return 0;
        }

        int max = lst[0];
        int min = lst[0];

        for (int i = 0; i < lst.length; i++) {
            if (lst[i] > max) {
                max = lst[i];
            }
            if (lst[i] < min) {
                min = lst[i];
            }
        }
        return max - min;
    }


    public static double sum(double[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        double count = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i];

        }
        return count;
    }

    public static boolean check(Object[] a, Object x) {

        if (a == null || x == null) {
            return false;
        }
        for (Object element : a) {
            if (element != null & element.equals(x)) {
                return true;
            }
        }
        return false;
    }

//    Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny, and would like to greet him slightly different.
//    She added a special case to her function, but she made a mistake.Can you help her?

    public static String greet(String name) {

        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }

//    You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.
//    Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.
//    For example, when the input is green, output should be yellow.

    public static String updateLight(String current) {

        String green = "green";
        String yellow = "yellow";
        String red = "red";
        if (green.equals(current)) {
            return yellow;
        } else if (yellow.equals(current)) {
            return red;
        } else if (red.equals(current)) {
            return green;
        } else {
            return "light is not working";
        }

    }

    public static String updateLight1(String current) {
        switch (current) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                return "Light is not working";
        }

    }


//    All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and end with the same letters as the animal's name.
//    For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake
//    Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.
//    Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may contain hyphens and spaces,
//    but these will not appear at the beginning or end of the string. They will not contain numerals.

    public static boolean fast(String beast, String dish) {

        int beastArr = beast.length();
        int dishArr = dish.length();

        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beastArr - 1) == dish.charAt(dishArr - 1)) {
            return true;
        }
        return false;
    }

//    Given that
//    f0 = '0'
//    f1 = '01'
//    f2 = '010' = f1 + f0
//    f3 = '01001' = f2 + f1
//    You will be given a number and your task is to return the nth fibonacci string. For example:
//    solve(2) = '010'
//    solve(3) = '01001'

    public static String solve(int n) {

        String f0 = "0";
        String f1 = "01";
        String f2 = "010";

        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        if (n == 2) {
            return f2;
        }

        return solve(n - 1) + solve(n - 2);

    }


//    Numbers ending with zeros are boring. They might be fun in your world, but not here. Get rid of them. Only the ending ones.
//            1450 -> 145
//            960000 -> 96
//            1050 -> 105
//            -1050 -> -105

    public static int noBoringZeros(int n) {

        return ((n % 10) == 0) && (n != 0) ? noBoringZeros(n / 10) : n;
    }


    //  Your task is to write function factorial.

    public static long factorial(int n) {

        long product = 1L;

//     for(int i = 1; i <= n ;i++)  {
//         product *= i;
//     }
//        return product;

        return LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
//explaining the above syntax
//        Stream Creation:
//        LongStream.rangeClosed(1, 5) creates the stream [1, 2, 3, 4, 5].
//        Reduction Process:
//        Initially, a = 1 (identity value).
//        The function (a, b) -> a * b is applied to each element in the stream:
//        Step 1: a = 1, b = 1 → 1 * 1 = 1
//        Step 2: a = 1, b = 2 → 1 * 2 = 2
//        Step 3: a = 2, b = 3 → 2 * 3 = 6
//        Step 4: a = 6, b = 4 → 6 * 4 = 24
//        Step 5: a = 24, b = 5 → 24 * 5 = 120
//        Final Result:
//        After processing all elements, the result is 120.
    }


//    In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
//Kata.makeNegative(1);  // return -1
//Kata.makeNegative(-5); // return -5
//Kata.makeNegative(0);  // return 0
//    The number can be negative already, in which case no change is required.
//    Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.

//    public static boolean makeNegative(final int x) {
//
//        return -abs(x);
//}

//        if(x < 0){
//            return x;
//        }
//
//        if(x > 0){
//            return x * (-1);
//        }
//
//        return 0;

//        In this Kata we are passing a number (n) into a function.
//
//        Your code will determine if the number passed is even (or not).
//
//                The function needs to return either a true or false.
//
//                Numbers may be positive or negative, integers or floats.
//
//        Floats with decimal part non equal to zero are considered UNeven for this kata.

    public boolean isEven(double n) {

        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

//    Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
//
//    Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
//
//    Example:
//    n= 5, m=5: 25
//    n=-5, m=5:  0

    public static int paperWork(int n, int m) {

        if (n < 0 || m < 0) {
            return 0;
        }
        return n * m;

    }

//    Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
//
//    Use conditionals to return the proper message:
//
//            case	return
//    name equals owner	'Hello boss'
//    otherwise

    static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        }
        return "Hello guest";
    }
//
//    It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?
//
//    Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.
//
//    If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.

    public static String bonusTime(final int salary, final boolean bonus) {

        if (bonus) {
            return salary * 10 + "\u00A3";
        }
        return salary + "\u00A3";

    }

//    Alex just got a new hula hoop, he loves it but feels discouraged because his little brother is better than him.
//    Write a program where Alex can input (n) how many times the hoop goes round and it will return him an encouraging message:
//    If Alex gets 10 or more hoops, return the string "Great, now move on to tricks".
//    If he doesn't get 10 hoops, return the string "Keep at it until you get it".

    public static String hoopCount(int n) {

        if (n >= 10) {
            return "Great, now move on to tricks";
        }
        return "Keep at it until you get it";
    }

//    You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away!
//    You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.
//    Considering these factors, write a function that tells you if it is possible to get to the pump or not.
//
//    Function should return true if it is possible and false if not.


    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        if (mpg * fuelLeft == distanceToPump) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        //  System.out.println(Arrays.toString(map(new int[]{12, 24, 31, 24, 11})));
        // System.out.println(highAndLow("1 2 3 4 5"));
        // System.out.println(getXO("asgl;gal;gm"));


//            System.out.println(factorial(0));
//            System.out.println(factorial(4));
//            System.out.println(factorial(7));

        System.out.println(solve(1));
        System.out.println(solve(2));
        System.out.println(solve(3));
        System.out.println(solve(4));
        System.out.println(solve(5));


    }


}
