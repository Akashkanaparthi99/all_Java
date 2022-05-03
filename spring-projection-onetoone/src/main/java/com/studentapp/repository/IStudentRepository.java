package com.studentapp.repository;

import com.studentapp.model.Student;
import com.studentapp.model.StudentDTO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findByDepartment(String department);
    List<Student> findByAddressCity(String city, Sort sort);
    List<Student> findByDepartmentAndAddressCity(String dept,String city);
    @Query("from Student s inner join s.address a where a.state = ?1")
    List<Student> findByState(String state);
    @Query("from Student s inner join s.address a where s.department = ?1 and a.city = ?2")
    List<Student> findByDeptAndCity(String dept,String city);
    // PROJECTION
    @Query("from Student s inner join s.address a where s.studentId = ?1")
    StudentDTO getByStudentId(int studentId);

    //VIEW -> from student s inner join s.address a where s.department = ?1 and a.city = ?2
    // STORED -> count of students for a particular city
}
