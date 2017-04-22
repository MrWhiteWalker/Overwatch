package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats12;
import com.napstablook.common.mainCategories.GeneralStats10;
import com.napstablook.common.mainCategories.HeroStats10;

public class Lucio
{
    private AverageStats12 average_stats;

    public AverageStats12 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats12 average_stats) { this.average_stats = average_stats; }

    private HeroStats10 hero_stats;

    public HeroStats10 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats10 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats10 general_stats;

    public GeneralStats10 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats10 general_stats) { this.general_stats = general_stats; }
}
