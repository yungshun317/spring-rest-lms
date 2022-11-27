package yungshun.chang.springrestlms.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yungshun.chang.springrestlms.entity.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {

        students = new ArrayList<>();

        students.add(new Student("Kula", "Diamond"));
        students.add(new Student("Morrigan", "Aensland"));
        students.add(new Student("Mai", "Shiranui"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return students;
    }
    
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if ((studentId >= students.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return students.get(studentId);
    }

}
