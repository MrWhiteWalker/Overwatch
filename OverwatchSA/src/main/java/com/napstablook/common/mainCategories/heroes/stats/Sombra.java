package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats13;
import com.napstablook.common.mainCategories.GeneralStats11;
import com.napstablook.common.mainCategories.HeroStats11;

public class Sombra
{
    private AverageStats13 average_stats;

    public AverageStats13 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats13 average_stats) { this.average_stats = average_stats; }

    private HeroStats11 hero_stats;

    public HeroStats11 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats11 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats11 general_stats;

    public GeneralStats11 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats11 general_stats) { this.general_stats = general_stats; }
}
