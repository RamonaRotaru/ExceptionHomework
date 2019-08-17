import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    public int id;
    String firstName;
    String lastName;
    String dateofBirth;
    String gender;
    String CNP;
    public static List GENDER_TYPES;

    static{
        GENDER_TYPES = new ArrayList(Arrays.asList("M","F", "MALE","FEMALE"));
    }

    public Student(String firstName, String lastName, String dateofBirth,String gender, String CNP){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateofBirth=dateofBirth;
        this.gender=gender;
        this.CNP=CNP;
    }

    public void afisare ()
    {
        System.out.println("ID: " + id + ",  "+ firstName+ " " + lastName + ", data nasterii, "+ dateofBirth+", gen "+gender+", CNP"+CNP);
    }

}
