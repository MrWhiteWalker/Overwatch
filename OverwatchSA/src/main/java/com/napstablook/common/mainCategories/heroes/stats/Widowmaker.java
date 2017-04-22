package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats5;
import com.napstablook.common.mainCategories.GeneralStats3;
import com.napstablook.common.mainCategories.HeroStats3;

public class Widowmaker
{
    private AverageStats5 average_stats;

    public AverageStats5 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats5 average_stats) { this.average_stats = average_stats; }

    private HeroStats3 hero_stats;

    public HeroStats3 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats3 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats3 general_stats;

    public GeneralStats3 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats3 general_stats) { this.general_stats = general_stats; }
}
