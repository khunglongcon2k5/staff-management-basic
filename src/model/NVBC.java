/*
 * 
 * @author NguyenHung
 * @date Nov 30, 2024
 * @version 1.0
 *
 */

package model;

import java.time.LocalDate;

public class NVBC extends NV {
	private double heSoLuong;
	private double soNamCT;
	
	public NVBC(String maNhanVien, String hoTen, LocalDate ngaySinh, String gioiTinh, double heSoLuong,
			double soNamCT) {
		super(maNhanVien, hoTen, ngaySinh, gioiTinh);
		this.heSoLuong = heSoLuong;
		this.soNamCT = soNamCT;
	}

	/**
	 * @return the heSoLuong
	 */
	public double getHeSoLuong() {
		return heSoLuong;
	}

	/**
	 * @param heSoLuong the heSoLuong to set
	 */
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	/**
	 * @return the soNamCT
	 */
	public double getSoNamCT() {
		return soNamCT;
	}

	/**
	 * @param soNamCT the soNamCT to set
	 */
	public void setSoNamCT(double soNamCT) {
		this.soNamCT = soNamCT;
	}

	@Override
	public String toString() {
		return super.toString() + 
			   "Hệ số lương: " + heSoLuong + ". " +
			   "Số năm công tác: " + soNamCT + "\n";
	}

	@Override
	public double tinhLuong() {
		double luongCoBan = 1800000;
		return (luongCoBan * heSoLuong);
	}
}
