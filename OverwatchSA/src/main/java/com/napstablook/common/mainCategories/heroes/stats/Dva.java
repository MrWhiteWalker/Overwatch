package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.GeneralStats;
import com.napstablook.common.mainCategories.AverageStats3;
import com.napstablook.common.mainCategories.HeroStats;

public class Dva
{
    private AverageStats3 average_stats;

    public AverageStats3 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats3 average_stats) { this.average_stats = average_stats; }

    private HeroStats hero_stats;

    public HeroStats getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats general_stats;

    public GeneralStats getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats general_stats) { this.general_stats = general_stats; }
}
