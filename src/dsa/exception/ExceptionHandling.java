package dsa.exception;

public class ExceptionHandling {
}


//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @GetMapping("/{id}")
//    public String getUser(@PathVariable int id) {
//        if (id <= 0) {
//            throw new UserNotFoundException("User with ID " + id + " not found");
//        }
//        return "User " + id;
//    }
//
//    // Handling UserNotFoundException
//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<String> handleUserNotFound(UserNotFoundException ex) {
//        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//    }
//}

// Custom Exception Class
class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
