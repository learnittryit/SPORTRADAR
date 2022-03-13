package com.example.generic.scoreboard.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.generic.scoreboard.model.Teams;

@Service
public class FootballScoreboardService implements ScoreBoardService{


	@Override
	public List<Teams> updateScore(Teams teams, boolean isPresent, List<Teams> globalTeamsList) {
		isPresent=true;
			globalTeamsList.add(new Teams(teams.getTeamA(), teams.getTeamB(), teams.getScoreA(), teams.getScoreB()));
		return globalTeamsList;
	}

	@Override
	public Map<String, Teams> updateScore(Teams teams, boolean isPresent, List<Teams> globalTeamsList,
			Map<String, Teams> mapOfTeams) {
		
		
		String key=teams.getTeamA().concat(teams.getTeamB());
		
		mapOfTeams.put(key, new Teams(teams.getTeamA(), teams.getTeamB(), teams.getScoreA(), teams.getScoreB()));
		return mapOfTeams;
	}


}
