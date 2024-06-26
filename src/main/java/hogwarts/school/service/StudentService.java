package hogwarts.school.service;

import hogwarts.school.model.Student;

import java.util.Collection;

public interface StudentService {

    Student add(Student student);

    Student get(Long id);

    Student remove(Long id);

    Student update(Student student);

    Collection<Student> getByAge(Integer age);

    Collection<Student> getAll();
}
