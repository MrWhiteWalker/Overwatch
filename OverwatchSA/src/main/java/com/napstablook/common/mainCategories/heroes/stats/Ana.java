package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats11;
import com.napstablook.common.mainCategories.GeneralStats9;
import com.napstablook.common.mainCategories.HeroStats9;

public class Ana
{
    private AverageStats11 average_stats;

    public AverageStats11 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats11 average_stats) { this.average_stats = average_stats; }

    private HeroStats9 hero_stats;

    public HeroStats9 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats9 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats9 general_stats;

    public GeneralStats9 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats9 general_stats) { this.general_stats = general_stats; }
}
