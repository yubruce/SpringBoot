package com.example.springboot3_provalues.restcontroller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDefvalController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("teamInfo")
    public String getTeamName(){
        return "Player Name: " + coachName + ", Team Name: " + teamName;
    }


}
