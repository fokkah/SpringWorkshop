package fokka.se.data_access;

import fokka.se.models.Student;

import java.util.List;

public interface StudentDAO {

    Student save(Student student);
    Student find(int id);
    List<Student>findAll();
    void delete(int id);

}
