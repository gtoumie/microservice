package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams(){
		return teamRepository.findAll();
	}
	@GetMapping("/teams/{id}")
	public Team getTeam(@PathVariable Long id) {
		return teamRepository.findById(id).get();
	}
}
