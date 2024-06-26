package student.Service;

import student.model.Student;
import student.model.Student;
import student.model.Subject;

public class StudentService {

    public Student result(Student student){
        for (Subject subject:student.subject){
            if (subject.marks>=35){
                System.out.println(student.name+"pass");
            }else{
                System.out.println("fail");
            }
        }
        return student;
    }
}
