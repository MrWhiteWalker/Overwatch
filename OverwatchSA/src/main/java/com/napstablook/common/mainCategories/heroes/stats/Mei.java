package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats6;
import com.napstablook.common.mainCategories.GeneralStats4;
import com.napstablook.common.mainCategories.HeroStats4;

public class Mei
{
    private AverageStats6 average_stats;

    public AverageStats6 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats6 average_stats) { this.average_stats = average_stats; }

    private HeroStats4 hero_stats;

    public HeroStats4 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats4 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats4 general_stats;

    public GeneralStats4 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats4 general_stats) { this.general_stats = general_stats; }
}
