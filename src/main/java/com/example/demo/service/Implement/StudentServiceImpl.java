3

4
5
6

7

8
9

10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository. StudentRepository;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

@Autowired
StudentRepos!tory repo;

@Override
//create (or) Insert data
public Student createData(Student stu) {
return repo.save(stu);

I

@Override
// Fetch all records
public List<Student> fetchRecord() {
return repo.findA11();