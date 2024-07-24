package usuarioController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usuario.User;

import java.math.BigDecimal;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Boolean> validation(@RequestBody User sender, @RequestParam BigDecimal value) {
        return ResponseEntity.ok(userService.validation(sender, value));
    }

    @GetMapping
    public String online(){
        return "hello world";
    }
}
