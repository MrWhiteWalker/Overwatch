package com.napstablook;

import com.napstablook.eu.Eu;
import com.napstablook.kr.Kr;
import com.napstablook.us.Us;

/**
 * Created by Ramandeep on 22-04-2017.
 */
public class MainObject {
    private Eu eu;
    private Us us;
    private Kr kr;

    public Eu getEu() {
        return eu;
    }

    public void setEu(Eu eu) {
        this.eu = eu;
    }

    public Us getUs() {
        return us;
    }

    public void setUs(Us us) {
        this.us = us;
    }

    public Kr getKr() {
        return kr;
    }

    public void setKr(Kr kr) {
        this.kr = kr;
    }

    @Override
    public String toString() {
        return "MainObject{" +
                "eu=" + eu +
                ", us=" + us +
                ", kr=" + kr +
                '}';
    }
}
