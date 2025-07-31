package com.shinycounter;

public class Name {
    String fr;
    String en;
    String jp;

    public Name(String en, String fr, String jp) {
        this.en = en;
        this.fr = fr;
        this.jp = jp;
    }

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

}