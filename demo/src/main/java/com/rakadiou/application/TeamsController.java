package com.rakadiou.application;


import com.rakadiou.domain.TeamsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TeamsController {

    @Autowired
    TeamsServiceImpl teamsService;

    @RequestMapping("/teams/{code}")
    @ResponseBody
    String retrieveTeams(@PathVariable String code) {
        return teamsService.getTeams(code);
    }


}
