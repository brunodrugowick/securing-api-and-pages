package dev.drugowick.securingapiandpages.web.pageControllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

public class BasePageController {

    @ModelAttribute("username")
    public String username(Principal principal) {
        return principal.getName();
    }
}
