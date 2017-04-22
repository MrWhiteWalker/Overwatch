package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats8;
import com.napstablook.common.mainCategories.GeneralStats6;
import com.napstablook.common.mainCategories.HeroStats6;

public class Bastion
{
    private AverageStats8 average_stats;

    public AverageStats8 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats8 average_stats) { this.average_stats = average_stats; }

    private HeroStats6 hero_stats;

    public HeroStats6 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats6 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats6 general_stats;

    public GeneralStats6 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats6 general_stats) { this.general_stats = general_stats; }
}
