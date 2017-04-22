package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats21;
import com.napstablook.common.mainCategories.GeneralStats19;
import com.napstablook.common.mainCategories.HeroStats19;

public class Reinhardt
{
    private AverageStats21 average_stats;

    public AverageStats21 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats21 average_stats) { this.average_stats = average_stats; }

    private HeroStats19 hero_stats;

    public HeroStats19 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats19 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats19 general_stats;

    public GeneralStats19 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats19 general_stats) { this.general_stats = general_stats; }
}
