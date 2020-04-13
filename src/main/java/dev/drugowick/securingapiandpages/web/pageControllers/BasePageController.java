package dev.drugowick.securingapiandpages.web.pageControllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

public class BasePageController {

    @ModelAttribute("logged")
    public boolean logged(Principal principal) {
        return principal != null;
    }

    @ModelAttribute("username")
    public String username(Principal principal) {
        if (principal == null) return "Visitante";
        return principal.getName();
    }
}
