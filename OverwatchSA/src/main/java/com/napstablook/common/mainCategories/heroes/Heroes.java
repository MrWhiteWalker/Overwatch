package com.napstablook.common.mainCategories.heroes;

import com.napstablook.common.mainCategories.heroes.stats.Stats;
import com.napstablook.common.mainCategories.heroes.playtime.Playtime;

public class Heroes
{
    private Stats stats;

    public Stats getStats() { return this.stats; }

    public void setStats(Stats stats) { this.stats = stats; }

    private Playtime playtime;

    public Playtime getPlaytime() { return this.playtime; }

    public void setPlaytime(Playtime playtime) { this.playtime = playtime; }
}
