@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        // Validate input and create a new user in DynamoDB
        userService.createUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Authenticate the user (you can use JWT for token-based authentication)
        // Return a token or a success message upon successful login
        return ResponseEntity.ok("Login successful");
    }
}