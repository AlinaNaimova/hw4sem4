package ru.geegbrain.hw4sem4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geegbrain.hw4sem4.model.Cat;
import ru.geegbrain.hw4sem4.server.CatService;

import java.util.List;

@Controller
@AllArgsConstructor
public class HomeController {

    private final CatService catService;

    @GetMapping("/home")
    public String homePage() {
        return "cat-hotel";
    }

    @GetMapping("/cats")
    public String showAllCats(Model model) {
        List<Cat> cats = catService.getAllCats();
        model.addAttribute("cats", cats);
        return "cat-hotel";
    }

    @PostMapping("/cats")
    public String addCat(Cat cat, Model model) {
        catService.addCat(cat);

        List<Cat> cats = catService.getAllCats();
        model.addAttribute("cats", cats);

        return "cat-hotel";
    }

}