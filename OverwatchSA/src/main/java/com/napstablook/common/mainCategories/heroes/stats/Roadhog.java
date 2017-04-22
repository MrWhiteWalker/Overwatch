package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats9;
import com.napstablook.common.mainCategories.GeneralStats7;
import com.napstablook.common.mainCategories.HeroStats7;

public class Roadhog
{
    private AverageStats9 average_stats;

    public AverageStats9 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats9 average_stats) { this.average_stats = average_stats; }

    private HeroStats7 hero_stats;

    public HeroStats7 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats7 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats7 general_stats;

    public GeneralStats7 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats7 general_stats) { this.general_stats = general_stats; }
}
