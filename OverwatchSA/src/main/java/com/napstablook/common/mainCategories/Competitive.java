package com.napstablook.common.mainCategories;
public class Competitive
{
    private GameStats2 game_stats;

    public GameStats2 getGameStats() { return this.game_stats; }

    public void setGameStats(GameStats2 game_stats) { this.game_stats = game_stats; }

    private AverageStats2 average_stats;

    public AverageStats2 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats2 average_stats) { this.average_stats = average_stats; }

    private OverallStats2 overall_stats;

    public OverallStats2 getOverallStats() { return this.overall_stats; }

    public void setOverallStats(OverallStats2 overall_stats) { this.overall_stats = overall_stats; }

    private boolean competitive;

    public boolean getCompetitive() { return this.competitive; }

    public void setCompetitive(boolean competitive) { this.competitive = competitive; }
}
