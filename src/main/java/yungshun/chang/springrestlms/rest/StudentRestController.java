package yungshun.chang.springrestlms.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yungshun.chang.springrestlms.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Kula", "Diamond"));
        students.add(new Student("Morrigan", "Aensland"));
        students.add(new Student("Mai", "Shiranui"));

        return students;
    }
}
