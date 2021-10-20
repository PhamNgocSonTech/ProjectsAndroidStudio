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
        gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        maSV = maSV;
    }

}
