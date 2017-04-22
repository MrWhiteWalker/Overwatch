package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats17;
import com.napstablook.common.mainCategories.GeneralStats15;
import com.napstablook.common.mainCategories.HeroStats15;

public class Zarya
{
    private AverageStats17 average_stats;

    public AverageStats17 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats17 average_stats) { this.average_stats = average_stats; }

    private HeroStats15 hero_stats;

    public HeroStats15 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats15 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats15 general_stats;

    public GeneralStats15 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats15 general_stats) { this.general_stats = general_stats; }
}
