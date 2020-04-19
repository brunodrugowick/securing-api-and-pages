package dev.drugowick.securingapiandpages.web.pageControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController extends BasePageController {

    @RequestMapping("/users")
    public String usersPage() {
        return "users";
    }
}
