package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats19;
import com.napstablook.common.mainCategories.GeneralStats17;
import com.napstablook.common.mainCategories.HeroStats17;

public class Genji
{
    private AverageStats19 average_stats;

    public AverageStats19 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats19 average_stats) { this.average_stats = average_stats; }

    private HeroStats17 hero_stats;

    public HeroStats17 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats17 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats17 general_stats;

    public GeneralStats17 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats17 general_stats) { this.general_stats = general_stats; }
}
