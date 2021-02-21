package com.aplication;

public class Questions {

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getOdp() {
        return odp;
    }

    public void setOdp(String odp) {
        this.odp = odp;
    }

    public String getCorrectOdp() {
        return CorrectOdp;
    }

    public void setCorrectOdp(String correctOdp) {
        CorrectOdp = correctOdp;
    }

    public String tresc;
    public String odp;
    public String CorrectOdp;


    @Override
    public String toString() {
        return getTresc() + ", " + getOdp() + ", " + getCorrectOdp();
    }
    public String readTresc(){
        return getTresc();
    }
}