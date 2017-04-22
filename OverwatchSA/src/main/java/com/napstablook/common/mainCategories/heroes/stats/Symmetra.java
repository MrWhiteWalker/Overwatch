package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats24;
import com.napstablook.common.mainCategories.GeneralStats22;
import com.napstablook.common.mainCategories.HeroStats22;

public class Symmetra
{
    private AverageStats24 average_stats;

    public AverageStats24 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats24 average_stats) { this.average_stats = average_stats; }

    private HeroStats22 hero_stats;

    public HeroStats22 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats22 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats22 general_stats;

    public GeneralStats22 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats22 general_stats) { this.general_stats = general_stats; }
}
