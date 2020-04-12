package dev.drugowick.securingapiandpages.web.api;

import dev.drugowick.securingapiandpages.domain.Role;
import dev.drugowick.securingapiandpages.repository.RoleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RolesController {

    private final RoleRepository roleRepository;

    public RolesController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/roles")
    public List<Role> list() {
        return roleRepository.findAll();
    }

    @PostMapping("/roles")
    public Role save(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    @DeleteMapping("/roles/{id}")
    public void get(@PathVariable Long id) {
        roleRepository.deleteById(id);
    }
}
