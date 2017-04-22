package com.napstablook.common.mainCategories;
public class Quickplay
{
    private GameStats game_stats;

    public GameStats getGameStats() { return this.game_stats; }

    public void setGameStats(GameStats game_stats) { this.game_stats = game_stats; }

    private AverageStats average_stats;

    public AverageStats getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats average_stats) { this.average_stats = average_stats; }

    private OverallStats overall_stats;

    public OverallStats getOverallStats() { return this.overall_stats; }

    public void setOverallStats(OverallStats overall_stats) { this.overall_stats = overall_stats; }

    private boolean competitive;

    public boolean getCompetitive() { return this.competitive; }

    public void setCompetitive(boolean competitive) { this.competitive = competitive; }
}
