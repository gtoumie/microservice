package com.gtoumie.example;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Team {
	@Id
	@GeneratedValue
	long id;
	String name;
	String location;
	String mascot;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teamId")
	Set<Player> players;
	
	public Team(String name, String location, Set<Player> players) {
		super();
		this.name = name;
		this.location = location;
		this.players = players;
	}
	public Team() {
		super();
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
}
