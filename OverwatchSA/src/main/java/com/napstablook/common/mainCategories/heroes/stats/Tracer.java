package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats25;
import com.napstablook.common.mainCategories.GeneralStats23;
import com.napstablook.common.mainCategories.HeroStats23;

public class Tracer
{
    private AverageStats25 average_stats;

    public AverageStats25 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats25 average_stats) { this.average_stats = average_stats; }

    private HeroStats23 hero_stats;

    public HeroStats23 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats23 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats23 general_stats;

    public GeneralStats23 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats23 general_stats) { this.general_stats = general_stats; }
}
