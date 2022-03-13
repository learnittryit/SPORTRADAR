package com.example.generic.scoreboard.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.generic.scoreboard.model.Teams;
import com.example.generic.scoreboard.service.ScoreBoardService;

@Controller
public class ScoreboardController {

	List<Teams> globalTeamsList = new ArrayList<Teams>();
	Map<String, Teams> mapOfTeams=new HashMap<String, Teams>();

	@Autowired
	ScoreBoardService footballScoreboardService;

	@GetMapping("/")
	public ModelAndView startUp(ModelAndView modelAndView) {
		modelAndView.addObject("teams", globalTeamsList);
		modelAndView.setViewName("startupPage");
		return modelAndView;

	}

	@GetMapping("/start")
	public ModelAndView start() {
		globalTeamsList=new ArrayList();
		mapOfTeams=new HashMap<String, Teams>();
		ModelAndView modelAndView = new ModelAndView("startupPage");
		List<Teams> listOfTeaams = new ArrayList<Teams>();
		listOfTeaams.add(new Teams("teamA", "teamB", 0, 0));
		modelAndView.addObject("teams", listOfTeaams);

		return modelAndView;

	}

	@GetMapping("/add")
	public ModelAndView newContact(ModelAndView modelAndView) {
		Teams teams = new Teams();
		modelAndView.addObject("teams", teams);
		modelAndView.setViewName("AddScoreCard");
		return modelAndView;
	}


	@PostMapping("/saveTeam")
	public ModelAndView saveTeams(@ModelAttribute Teams teams) {
		boolean isPresent = false;
		
		for (Teams team : globalTeamsList) {
			if(team.getTeamA().equalsIgnoreCase(teams.getTeamA())) {
				isPresent = true;
				break;
			}
		}
		
			footballScoreboardService.updateScore(teams,isPresent,globalTeamsList,mapOfTeams);
			globalTeamsList=mapOfTeams.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
			globalTeamsList.forEach(x->System.out.println(x.getScoreA()+"-"+x.getScoreB()));
			return new ModelAndView("redirect:/");

	}

	
	
	@GetMapping("/update")
	public ModelAndView saveTeams(HttpServletRequest request,ModelAndView modelAndView) {
		mapOfTeams.entrySet().stream().forEach(x->System.out.println("Key is :"+ x.getKey()));
		String key = request.getParameter("id");
		Teams teams=mapOfTeams.get(key);
		modelAndView.addObject("teams", teams);
		modelAndView.setViewName("AddScoreCard");
		return modelAndView;

	}
	
	
	@GetMapping("/finish")
	public String finish() {
		return "finish";
	}

}
