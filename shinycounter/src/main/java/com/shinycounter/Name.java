package com.shinycounter;

public class Name {
    private String fr;
    private String en;
    private String jp;

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getJp() {
        return jp;
    }

    public void setJp(String jp) {
        this.jp = jp;
    }

    @Override
    public String toString() {
        return "{fr='" + fr + "', en='" + en + "', jp='" + jp + "'}";
    }
}