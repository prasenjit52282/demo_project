package empdb.DB;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpRepo extends CrudRepository<Emp,Long> {
    public List<Emp> findByName(String name);
}
