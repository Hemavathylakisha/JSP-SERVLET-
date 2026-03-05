package com.SportsTournament;

import java.util.List;

public class MatchSchedule {

    private String matchId;
    private List<String> teams;
    private String venue;
    private String date;

    public MatchSchedule() {}

    public String getMatchId() { return matchId; }
    public void setMatchId(String matchId) { this.matchId = matchId; }

    public List<String> getTeams() { return teams; }
    public void setTeams(List<String> teams) { this.teams = teams; }

    public String getVenue() { return venue; }
    public void setVenue(String venue) { this.venue = venue; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
