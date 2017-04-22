package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats10;
import com.napstablook.common.mainCategories.GeneralStats8;
import com.napstablook.common.mainCategories.HeroStats8;

public class Junkrat
{
    private AverageStats10 average_stats;

    public AverageStats10 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats10 average_stats) { this.average_stats = average_stats; }

    private HeroStats8 hero_stats;

    public HeroStats8 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats8 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats8 general_stats;

    public GeneralStats8 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats8 general_stats) { this.general_stats = general_stats; }
}
