package dev.drugowick.securingapiandpages.web.api;

import dev.drugowick.securingapiandpages.domain.Role;
import dev.drugowick.securingapiandpages.domain.User;
import dev.drugowick.securingapiandpages.repository.RoleRepository;
import dev.drugowick.securingapiandpages.repository.UserRepository;
import dev.drugowick.securingapiandpages.web.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UsersController(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @GetMapping("/users")
    public List<User> list() {
        List<User> all = userRepository.findAll();
        return all;
    }

    @PostMapping("/users")
    public User save(@RequestBody @NotNull UserDto userDto) {
        Optional<Role> optionalRole = roleRepository.findById(userDto.getRoleId());

        if (optionalRole.isPresent()) {
            User user = new User();
            if (userDto.getId() != null) user.setId(userDto.getId());
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setRole(optionalRole.get());

            return userRepository.save(user);
        }

        return null;
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
