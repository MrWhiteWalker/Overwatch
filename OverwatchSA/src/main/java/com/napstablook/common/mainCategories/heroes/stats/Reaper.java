package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats14;
import com.napstablook.common.mainCategories.GeneralStats12;
import com.napstablook.common.mainCategories.HeroStats12;

public class Reaper
{
    private AverageStats14 average_stats;

    public AverageStats14 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats14 average_stats) { this.average_stats = average_stats; }

    private HeroStats12 hero_stats;

    public HeroStats12 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats12 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats12 general_stats;

    public GeneralStats12 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats12 general_stats) { this.general_stats = general_stats; }
}
