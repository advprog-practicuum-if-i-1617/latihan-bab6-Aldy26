/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Global Store
 */
public class SoftawareEn extends Employee {
    private long tunjanganPerBulan = 5500000;
    private long bonusPerBulan = 300000;
    private int tahunAkhir = 2017, bulanAkhir = 4;
    
    public long getTunjanganPerBulan() {
        return tunjanganPerBulan;
    }

    public void setTunjanganPerBulan(long tunjanganPerBulan) {
        this.tunjanganPerBulan = tunjanganPerBulan;
    }

    public long getBonusPerBulan() {
        return bonusPerBulan;
    }

    public void setBonusPerBulan(long bonusPerBulan) {
        this.bonusPerBulan = bonusPerBulan;
    }
    
    public SoftawareEn (int tahunAwal, int bulanAwal, String nama){
        int lama = tahunAkhir - tahunAwal;
        int lamabulan = bulanAkhir + (12 - bulanAwal);
        
        long priki = (lama*12 + lamabulan) * tunjanganPerBulan;
        long bonus = (lama*12 + lamabulan) * bonusPerBulan;
        
        long gaji = super.getGajiPer2Bulan() * (lama * 12 + lamabulan)/2;
        long gaji2 = super.getGajiPokok() * (lama * 12 + lamabulan);
        
        super.setFinalGaji(gaji + gaji2 + priki + bonus);
        System.out.println("gaji Anda "+ nama + " " +super.getFinalGaji());
    }
}