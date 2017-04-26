/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Global Store
 */
public class Employee {
    private long gajiPokok = 2500000;
    private long gajiPer2Bulan = 500000;
    private long finalGaji;

    public Employee() {
    }

    public long getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(long gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public long getGajiPer2Bulan() {
        return gajiPer2Bulan;
    }

    public void setGajiPer2Bulan(long gajiPer2Bulan) {
        this.gajiPer2Bulan = gajiPer2Bulan;
    }    

    public long getFinalGaji() {
        return finalGaji;
    }

    public void setFinalGaji(long finalGaji) {
        this.finalGaji = finalGaji;
    }
}
