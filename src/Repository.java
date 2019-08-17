import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Repository {
    List<Student> students = new ArrayList<>();
    public static String GLOBAL_DATE_PATTERN = "yyyy-MM-dd";

    public void addStudent(Student student) throws InvalidStudentException {
        if(student == null){
            throw new InvalidStudentException("No student to add");
        }

        if(student.firstName == null || student.firstName.isEmpty()){
            throw new InvalidStudentException("Missing student firstname");
        }

        if(student.lastName == null || student.lastName.isEmpty()){
            throw new InvalidStudentException("Missing student lastname");
        }

        if(student.gender == null || student.gender.isEmpty()){
            throw new InvalidStudentException("Missing student gender");
        }

        if(!Student.GENDER_TYPES.contains(student.gender.toUpperCase())){
            throw new InvalidStudentException("Student " + student.firstName + " has gender invalid");
        }

        if(student.dateofBirth == null || student.dateofBirth.isEmpty()){
            throw new InvalidStudentException("Student " + student.firstName + " has birth date");
        }

        if(student.dateofBirth == null || student.dateofBirth.isEmpty()){
            SimpleDateFormat sdf = new SimpleDateFormat(GLOBAL_DATE_PATTERN);
            try{
                Date dt = sdf.parse(student.dateofBirth);
                if(dt.getYear() < 1900 || dt.getYear() > (new Date().getYear()-18)){
                    throw new InvalidStudentException("Student birth date must be after 1900 and must be at least eighteen years old");
                }
            }catch (Exception e){
                throw new InvalidStudentException("Student " + student.firstName + " has birth date");
            }

        }
        students.add(student);
    }

    public void deleteStudent(int studentId) throws StudentNotFoundException {
        for (int i = 0; i < students.size(); i++) {
            if (studentId == students.get(i).id) {
                students.remove(i);
                break;
            }
            if (i == students.size() - 1) {
                throw new StudentNotFoundException("Student with id: " + studentId + " not in the list");
            }
            }
        }

    public void listStudent() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).afisare();
            //         System.out.println("name: " + students.get(i).firstName + ", prenume: " + students.get(i).lastName + "gender" + students.get(i).gender);
        }
    }


}

