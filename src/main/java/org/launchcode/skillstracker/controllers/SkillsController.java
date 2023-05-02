package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
            "<p>Click <a href='/form'>HERE</a> to choose your favorite languages!</p>" +
            "</body>" +
            "</html>";

}

@GetMapping("/form")
    public String displaySkillsForm(){
    return "<html>" +
            "<body>" +
            "<form action='/form' method='POST'>" +
            "<label>Name: </label>" +
            "<input type='text' name='name'/>" +
            "<br/>" +
            "<br/>" +
            "<label>My Favorite Language is: </label>" +
            "<select name='fav1'>" +
            "<option value='JavaScript'>JavaScript</option>" +
            "<option value='Java'>Java</option>" +
            "<option value='TypeScript'>TypeScript</option>" +
            "<option value='SQL'>SQL</option>" +
            "</select>" +
            "<br/>" +
            "<label>My Second Favorite Language is: </label>" +
            "<select name='fav2'>" +
            "<option value='JavaScript'>JavaScript</option>" +
            "<option value='Java'>Java</option>" +
            "<option value='TypeScript'>TypeScript</option>" +
            "<option value='SQL'>SQL</option>" +
            "</select>" +
            "<br/>" +
            "<label>My Third Favorite Language is: </label>" +
            "<select name='fav3'>" +
            "<option value='JavaScript'>JavaScript</option>" +
            "<option value='Java'>Java</option>" +
            "<option value='TypeScript'>TypeScript</option>" +
            "<option value='SQL'>SQL</option>" +
            "</select>" +
            "<br/>" +
            "<input type='submit' value='Submit'/>" +
            "</form>"+
            "</body>" +
            "</html>";

        }

        @PostMapping("/form")
            public String skillsOutput(@RequestParam String name, String fav1, String fav2, String fav3){
            return "<html>" +
                    "<body>" +
                    "<h1>"+ name + "'s Favorite Languages</h1>" +
                    "<ol>" +
                    "<li>"+fav1+"</li>" +
                    "<li>"+fav2+"</li>" +
                    "<li>"+fav3+"</li>" +
                    "</ol>" +
                    "</body>" +
                    "</html>";
        }

    }

