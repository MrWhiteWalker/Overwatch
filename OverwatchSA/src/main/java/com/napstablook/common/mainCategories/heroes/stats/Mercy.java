package com.napstablook.common.mainCategories.heroes.stats;

import com.napstablook.common.mainCategories.AverageStats18;
import com.napstablook.common.mainCategories.GeneralStats16;
import com.napstablook.common.mainCategories.HeroStats16;

public class Mercy
{
    private AverageStats18 average_stats;

    public AverageStats18 getAverageStats() { return this.average_stats; }

    public void setAverageStats(AverageStats18 average_stats) { this.average_stats = average_stats; }

    private HeroStats16 hero_stats;

    public HeroStats16 getHeroStats() { return this.hero_stats; }

    public void setHeroStats(HeroStats16 hero_stats) { this.hero_stats = hero_stats; }

    private GeneralStats16 general_stats;

    public GeneralStats16 getGeneralStats() { return this.general_stats; }

    public void setGeneralStats(GeneralStats16 general_stats) { this.general_stats = general_stats; }
}
