package com.SportsTournament;

import java.util.List;

public class Team {

    private String teamId;
    private String name;
    private List<Player> players;
    private String coach;

    public Team() {}

    public String getTeamId() { return teamId; }
    public void setTeamId(String teamId) { this.teamId = teamId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Player> getPlayers() { return players; }
    public void setPlayers(List<Player> players) { this.players = players; }

    public String getCoach() { return coach; }
    public void setCoach(String coach) { this.coach = coach; }
}
