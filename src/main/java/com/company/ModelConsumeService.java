package com.company;

import com.company.model.Model;

public class ModelConsumeService {

    public Model getModel(Model model) {
        System.out.println("This is model object: " + model);
        model.setMessage("Obtained from ModelConsumeService class");
        return model;
    }
}
