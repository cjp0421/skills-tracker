package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SkillsController {
@GetMapping("/")
    public String displayHomePage(){
    return "<html>" +
            "<body>" +
            "<h1>Skills Tracker</h1>" +
            "<h3>We have a few skills we'd like to learn. Here is the list!</h3>" +
            "<ol>" +
            "<li>JavaScript</li>" +
            "<li>Java</li>" +
            "<li>TypeScript</li>" +
            "<li>SQL</li>" +
            "</ol>" +
            "</body>" +
            "</html>";

}

@GetMapping("/form")
    public String displaySkillsForm(){
    return "<html>" +
            "<body>" +
            "<form action='/results'>" +
            "<label>Name: </label>" +
            "<input type='text' name='userName'/>" +
            "<select name='fav1'>" +
            "<option value='javascript'>JavaScript</option>" +
            "<option value='java'>Java</option>" +
            "<option value='typescript'>TypeScript</option>" +
            "<option value='sql'>SQL</option>" +
            "</form>"+
            "</body>" +
            "</html>";

        }
    }

