package ru.geegbrain.hw4sem4.server;



import org.springframework.stereotype.Service;
import ru.geegbrain.hw4sem4.model.Cat;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatService {
    private List<Cat> cats = new ArrayList<>();

    public List<Cat> getAllCats() {
        return cats;
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }
}
