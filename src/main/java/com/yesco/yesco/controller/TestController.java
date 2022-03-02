package com.yesco.yesco.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test")
    public String cateLList(Locale locale, Model model, HttpServletRequest request) {

        logger.debug("test");
        return "test";
    }
}