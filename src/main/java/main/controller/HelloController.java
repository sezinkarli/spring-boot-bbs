package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: beren
 * Date: 22.06.2014
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/{name}")
    public String getHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);

        return "hello-page";
    }


}
