@GetMapping("/fetchdatabyid/{id}")
public Optional<Student> fetchDataById(@PathVariable int id){
return ser.fetchDataById(id);