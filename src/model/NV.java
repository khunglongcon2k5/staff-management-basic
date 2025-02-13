/*
 * 
 * @author NguyenHung
 * @date Nov 30, 2024
 * @version 1.0
 *
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class NV {
	private String maNhanVien;
	private String hoTen;
	private LocalDate ngaySinh;
	private String gioiTinh;
	
	public NV(String maNhanVien, String hoTen, LocalDate ngaySinh, String gioiTinh) {
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	/**
	 * @return the maNhanVien
	 */
	public String getMaNhanVien() {
		return maNhanVien;
	}

	/**
	 * @param maNhanVien the maNhanVien to set
	 */
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the ngaySinh
	 */
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "- MNV: " + maNhanVien + ". " +
	           "Họ tên: " + hoTen + ". " + 
			   "Ngày sinh: " + dtf.format(ngaySinh) + ". " +
	           "Giới tính: " + gioiTinh + ". ";
	}
	
	public abstract double tinhLuong();
}
