package com.SportsTournament;

import java.util.List;

public class Tournament {

    private String tournamentId;
    private String name;
    private String hostCountry;
    private List<Venue> venues;
    private List<Team> teams;
    private List<MatchSchedule> schedule;
    private PrizeMoney prizeMoney;

    public Tournament() {}

    public String getTournamentId() { return tournamentId; }
    public void setTournamentId(String tournamentId) { this.tournamentId = tournamentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHostCountry() { return hostCountry; }
    public void setHostCountry(String hostCountry) { this.hostCountry = hostCountry; }

    public List<Venue> getVenues() { return venues; }
    public void setVenues(List<Venue> venues) { this.venues = venues; }

    public List<Team> getTeams() { return teams; }
    public void setTeams(List<Team> teams) { this.teams = teams; }

    public List<MatchSchedule> getSchedule() { return schedule; }
    public void setSchedule(List<MatchSchedule> schedule) { this.schedule = schedule; }

    public PrizeMoney getPrizeMoney() { return prizeMoney; }
    public void setPrizeMoney(PrizeMoney prizeMoney) { this.prizeMoney = prizeMoney; }
}
