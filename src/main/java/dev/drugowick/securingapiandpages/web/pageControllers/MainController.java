package dev.drugowick.securingapiandpages.web.pageControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController extends BasePageController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
