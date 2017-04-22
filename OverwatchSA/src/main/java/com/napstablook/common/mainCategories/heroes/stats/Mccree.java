package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.HeroStats18;
import com.napstablook.common.mainCategories.AverageStats20;
import com.napstablook.common.mainCategories.GeneralStats18;

public class Mccree
{
    private AverageStats20 average_stats;

    public AverageStats20 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats20 average_stats) { this.average_stats = average_stats; }

    private HeroStats18 hero_stats;

    public HeroStats18 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats18 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats18 general_stats;

    public GeneralStats18 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats18 general_stats) { this.general_stats = general_stats; }
}
