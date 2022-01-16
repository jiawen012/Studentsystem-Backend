package studentsystem0.service;

import studentsystem0.model.Student;
import java.util.List;
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
