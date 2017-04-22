package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats22;
import com.napstablook.common.mainCategories.GeneralStats20;
import com.napstablook.common.mainCategories.HeroStats20;

public class Soldier76
{
    private AverageStats22 average_stats;

    public AverageStats22 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats22 average_stats) { this.average_stats = average_stats; }

    private HeroStats20 hero_stats;

    public HeroStats20 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats20 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats20 general_stats;

    public GeneralStats20 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats20 general_stats) { this.general_stats = general_stats; }
}
