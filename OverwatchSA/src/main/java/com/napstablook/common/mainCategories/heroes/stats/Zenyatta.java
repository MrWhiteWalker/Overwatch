package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats7;
import com.napstablook.common.mainCategories.GeneralStats5;
import com.napstablook.common.mainCategories.HeroStats5;

public class Zenyatta
{
    private AverageStats7 average_stats;

    public AverageStats7 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats7 average_stats) { this.average_stats = average_stats; }

    private HeroStats5 hero_stats;

    public HeroStats5 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats5 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats5 general_stats;

    public GeneralStats5 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats5 general_stats) { this.general_stats = general_stats; }
}
