/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Global Store
 */
public class ProjectMan extends Employee {
    private long tunjanganPerBulan = 6000000;
    private long bonusPerBulan = 450000;
    private long tahunAkhir = 2017, bulanAkhir = 4;

    public double getTunjanganPerBulan() {
        return tunjanganPerBulan;
    }

    public void setTunjanganPerBulan(long tunjanganPerBulan) {
        this.tunjanganPerBulan = tunjanganPerBulan;
    }

    public double getBonusPerBulan() {
        return bonusPerBulan;
    }

    public void setBonusPerBulan(long bonusPerBulan) {
        this.bonusPerBulan = bonusPerBulan;
    }
    
    public ProjectMan (int tahunAwal, int bulanAwal, String nama){
        long lama = tahunAkhir - tahunAwal;
        long lamabulan = bulanAkhir + (12 - bulanAwal);
        
        long priki = (lama*12 + lamabulan) * tunjanganPerBulan;
        long bonus = (lama*12 + lamabulan) * bonusPerBulan;
        
        if (lama >= 10){
            long proko = 700000 * (((lama - 10)*12) + bulanAkhir);
            bonus += proko;
        }
        else{
            long proko = 450000 * ((lama * 12) + bulanAkhir)/2;
            bonus += proko;
        }
        
        long gaji = super.getGajiPer2Bulan() * (lama * 12 + lamabulan)/2;
        long gaji2 = super.getGajiPokok() * (lama * 12 + lamabulan);
        
        super.setFinalGaji(gaji + gaji2 + priki + bonus);
        System.out.println("gaji Anda "+ nama + " " + super.getFinalGaji());        
    }
}