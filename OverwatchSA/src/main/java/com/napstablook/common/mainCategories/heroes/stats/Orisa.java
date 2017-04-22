package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats4;
import com.napstablook.common.mainCategories.GeneralStats2;
import com.napstablook.common.mainCategories.HeroStats2;

public class Orisa
{
    private AverageStats4 average_stats;

    public AverageStats4 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats4 average_stats) { this.average_stats = average_stats; }

    private HeroStats2 hero_stats;

    public HeroStats2 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats2 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats2 general_stats;

    public GeneralStats2 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats2 general_stats) { this.general_stats = general_stats; }
}
