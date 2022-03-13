package com.example.generic.scoreboard.service;

import java.util.List;
import java.util.Map;

import com.example.generic.scoreboard.model.Teams;

public interface ScoreBoardService {
	
	List<Teams> updateScore(Teams teams, boolean isPresent,List<Teams> globalTeamsList);
	
	Map<String,Teams> updateScore(Teams teams, boolean isPresent,List<Teams> globalTeamsList,Map<String, Teams> mapOfTeams);

	

}
