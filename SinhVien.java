/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSV,hoTen,diaChi,email;
    private int soDT;
    private double diemTK;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String diaChi, String email, int soDT, double diemTK) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.soDT = soDT;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public double getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(double diemTK) {
        this.diemTK = diemTK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.maSV);
        hash = 83 * hash + Objects.hashCode(this.hoTen);
        hash = 83 * hash + Objects.hashCode(this.diaChi);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + this.soDT;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.diemTK) ^ (Double.doubleToLongBits(this.diemTK) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (this.soDT != other.soDT) {
            return false;
        }
        if (Double.doubleToLongBits(this.diemTK) != Double.doubleToLongBits(other.diemTK)) {
            return false;
        }
        if (!Objects.equals(this.maSV, other.maSV)) {
            return false;
        }
        if (!Objects.equals(this.hoTen, other.hoTen)) {
            return false;
        }
        if (!Objects.equals(this.diaChi, other.diaChi)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    
}
