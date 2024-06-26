package student.Service;

import student.model.Student;
import student.model.Subject;

public class StudentTest {
    public static void main(String[] args) {
        Student student1=new Student();

    student1.name="pavan";
    Subject[]subject=new Subject[6];
    subject[0]=new Subject();
    subject[0].subjectName="telugu";
    subject[0].marks=45;
    subject[1]=new Subject();
    subject[1].subjectName="hindi";
    subject[1].marks=55;
    subject[2]=new Subject();
    subject[2].subjectName="english";
    subject[2].marks=60;
    subject[3]=new Subject();
    subject[3].subjectName="maths";
    subject[3].marks=55;
    subject[4]=new Subject();
    subject[4].subjectName="science";
    subject[4].marks=65;
    subject[5]=new Subject();
    subject[5].subjectName="social";
    subject[5].marks=85;

    student1.subject=subject;
    StudentService studentService=new StudentService();
    studentService.result(student1);
   }
}