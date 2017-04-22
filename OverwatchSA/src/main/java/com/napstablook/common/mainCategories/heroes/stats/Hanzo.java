package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats15;
import com.napstablook.common.mainCategories.GeneralStats13;
import com.napstablook.common.mainCategories.HeroStats13;

public class Hanzo
{
    private AverageStats15 average_stats;

    public AverageStats15 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats15 average_stats) { this.average_stats = average_stats; }

    private HeroStats13 hero_stats;

    public HeroStats13 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats13 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats13 general_stats;

    public GeneralStats13 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats13 general_stats) { this.general_stats = general_stats; }
}
