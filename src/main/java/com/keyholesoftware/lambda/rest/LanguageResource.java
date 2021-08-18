package com.keyholesoftware.lambda.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keyholesoftware.lambda.model.Language;

@RestController
public class LanguageResource {

    @GetMapping(path = "/languages")
    public List<Language> listLambdaLanguages() {
        return Arrays.asList(new Language("node"), new Language("java"), new Language("python"));
    }

}