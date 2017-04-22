package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats23;
import com.napstablook.common.mainCategories.GeneralStats21;
import com.napstablook.common.mainCategories.HeroStats21;

public class Torbjorn
{
    private AverageStats23 average_stats;

    public AverageStats23 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats23 average_stats) { this.average_stats = average_stats; }

    private HeroStats21 hero_stats;

    public HeroStats21 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats21 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats21 general_stats;

    public GeneralStats21 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats21 general_stats) { this.general_stats = general_stats; }
}
