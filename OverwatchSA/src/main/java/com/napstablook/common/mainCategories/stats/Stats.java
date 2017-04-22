package com.napstablook.common.mainCategories.stats;

import com.napstablook.common.mainCategories.Quickplay;
import com.napstablook.common.mainCategories.Competitive;

public class Stats
{
    private Quickplay quickplay;

    public Quickplay getQuickplay() { return this.quickplay; }

    public void setQuickplay(Quickplay quickplay) { this.quickplay = quickplay; }

    private Competitive competitive;

    public Competitive getCompetitive() { return this.competitive; }

    public void setCompetitive(Competitive competitive) { this.competitive = competitive; }
}
