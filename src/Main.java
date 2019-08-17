import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository();
        Student st = new Student("test", "ptest", "1990-12-30", "M", "123");
        st.id=1;

        Student st2 = new Student("test2", "ptest", "1990-12-30", "a", "123");
        st2.id = 2;
        try{
            repository.addStudent(st);
            repository.addStudent(st2);
        }catch (InvalidStudentException e){
            System.out.println("Student has invalid data, " + e.getMessage());

        }


        repository.listStudent();

        try{
            repository.deleteStudent(11);
        }catch (StudentNotFoundException e){
            System.out.println("error" + e.getMessage());
        }
        repository.listStudent();


        /*
        Scanner sc = new Scanner(System.in);


        System.out.println("Introdu numele de familie");

        String lastName = sc.next();

        System.out.println("Introdu data nasterii");
        int dateOfBirth=sc.nextInt();

        System.out.println("Introdu gender");

        String type = sc.next();
        System.out.println("Introdu CNP");

        String CNP = sc.next();



        Student student = new Student("alin", "popescu", "1900-12-12", "gender", CNP);
        */

    }
}
