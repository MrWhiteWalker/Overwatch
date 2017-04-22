package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats26;
import com.napstablook.common.mainCategories.GeneralStats24;
import com.napstablook.common.mainCategories.HeroStats24;

public class Pharah
{
    private AverageStats26 average_stats;

    public AverageStats26 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats26 average_stats) { this.average_stats = average_stats; }

    private HeroStats24 hero_stats;

    public HeroStats24 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats24 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats24 general_stats;

    public GeneralStats24 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats24 general_stats) { this.general_stats = general_stats; }
}
