package com.android.learnandroidlifetime;

public class SinhVien
{
    private String hoTen;
    private String maSV;
    private boolean gioiTinh;

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {

        return getMaSV() + " : " + getHoTen();
    }

    public void setGioiTinh(boolean gioiTinh) {

       this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {

        return this.hoTen;
    }

    public void setHoTen(String hoTen) {

        this.hoTen = hoTen;
    }

    public String getMaSV() {

        return this.maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

}
