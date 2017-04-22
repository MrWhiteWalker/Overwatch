package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats16;
import com.napstablook.common.mainCategories.GeneralStats14;
import com.napstablook.common.mainCategories.HeroStats14;

public class Winston
{
    private AverageStats16 average_stats;

    public AverageStats16 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats16 average_stats) { this.average_stats = average_stats; }

    private HeroStats14 hero_stats;

    public HeroStats14 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats14 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats14 general_stats;

    public GeneralStats14 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats14 general_stats) { this.general_stats = general_stats; }
}
