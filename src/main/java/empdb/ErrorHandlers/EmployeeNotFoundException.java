package empdb.ErrorHandlers;

import org.springframework.http.HttpStatus;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}