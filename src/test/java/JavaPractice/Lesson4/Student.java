package JavaPractice.Lesson4;

public class Student {
    int studentId;
    String studentFirstName;
    String studentLastName;
    int studentGraduationYear;
    double averageMathScore;
    double averageEconomicScore;
    double averageForeignLanguageScore;

    double averageScore(Student st){
        double sum = (st.averageEconomicScore + st.averageMathScore + st.averageForeignLanguageScore) / 3;
        return sum;
    }

}

class  StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentId = 1;
        student1.studentFirstName = "Mike";
        student1.studentLastName = "B";
        student1.studentGraduationYear = 2019;
        student1.averageMathScore = 7.2;
        student1.averageEconomicScore  = 6.3;
        student1.averageForeignLanguageScore = 5.3;

        student2.studentId = 2;
        student2.studentFirstName = "Lionel";
        student2.studentLastName = "Messi";
        student2.studentGraduationYear = 2010;
        student2.averageMathScore = 9.3;
        student2.averageEconomicScore  = 4.6;
        student2.averageForeignLanguageScore = 9.7;

        student3.studentId = 3;
        student3.studentFirstName = "John";
        student3.studentLastName = "Wick";
        student3.studentGraduationYear = 1190;
        student3.averageMathScore = 2.3;
        student3.averageEconomicScore  = 3.7;
        student3.averageForeignLanguageScore = 1.6;



//        System.out.println((student1.averageMathScore + student1.averageEconomicScore + student1.averageForeignLanguageScore) / 3.0 );
//        System.out.println((student2.averageMathScore + student2.averageEconomicScore + student2.averageForeignLanguageScore) / 3.0 );
//        System.out.println((student3.averageMathScore + student3.averageEconomicScore + student3.averageForeignLanguageScore) / 3.0 );
        System.out.println(student1.averageScore(student1));
        System.out.println(student2.averageScore(student2));
        System.out.println(student3.averageScore(student3));

    }



}
