package com.napstablook.kr;

import com.napstablook.common.mainCategories.achievements.Achievements;
import com.napstablook.common.mainCategories.heroes.Heroes;
import com.napstablook.common.mainCategories.stats.Stats;

public class Kr {
    private Stats stats;

    public Stats getStats() {
        return this.stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    private Achievements achievements;

    public Achievements getAchievements() {
        return this.achievements;
    }

    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }

    private Heroes heroes;

    public Heroes getHeroes() {
        return this.heroes;
    }

    public void setHeroes(Heroes heroes) {
        this.heroes = heroes;
    }
}
