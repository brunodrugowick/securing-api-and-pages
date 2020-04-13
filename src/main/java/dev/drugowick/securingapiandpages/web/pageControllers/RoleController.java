package dev.drugowick.securingapiandpages.web.pageControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoleController extends BasePageController {

    @GetMapping("/roles")
    public String rolesPage() {
        return "roles";
    }
}
