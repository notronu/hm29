package hogwarts.school.repository;

import hogwarts.school.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository <Faculty, Long> {
}
