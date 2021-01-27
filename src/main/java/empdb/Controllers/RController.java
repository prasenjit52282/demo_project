package empdb.Controllers;

import empdb.DB.DataBaseService;
import empdb.DB.Emp;
import empdb.ErrorHandlers.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RController {
    @Autowired
    DataBaseService db;

    @GetMapping("/")
    public String home(){
        return "hello from the server";
    }

    @GetMapping("/findAll")
    Iterable<Emp> findall(){
        return db.findAll();
    }

    @GetMapping("/findByName/{name}")
    List<Emp> findbyname(@PathVariable String name){
        return db.findByName(name);
    }
    @GetMapping("/findById/{id}")
    Emp findbyid(@PathVariable Long id){
        return db.findById(id);
    }

    @PostMapping("/insert")
    String insert(@RequestBody Emp emp){
        db.insert(emp);
        return "Inserted";
    }

    @PutMapping("/update/{id}")
     String update(@PathVariable Long id, @RequestBody Emp emp){
        Boolean stat=db.update(id,emp);
        if (stat==true)
            return "Record Updated";
        else
            throw new EmployeeNotFoundException(id);
    }

    @DeleteMapping("/delete/{id}")
    String delete(@PathVariable Long id){
        Boolean stat=db.delete(id);
        if (stat==true)
            return "Record Deleted";
        else
            throw new EmployeeNotFoundException(id);
    }
}
