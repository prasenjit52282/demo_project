package empdb.ErrorHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public @ResponseBody ErrorInfo employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return new ErrorInfo(HttpStatus.NOT_FOUND,ex.getMessage());
    }
}