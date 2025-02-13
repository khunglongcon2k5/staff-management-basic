/*
 * 
 * @author NguyenHung
 * @date Nov 30, 2024
 * @version 1.0
 *
 */

package model;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class NVHD extends NV {
	private double luongHopDong;
	private LoaiHopDong loaiHopDong;
	
	public enum LoaiHopDong {
		NH("Ngắn hạn"),
		DH("Dài hạn");
		
		private String moTa;
		
		private LoaiHopDong(String moTa) {
			this.moTa = moTa;
		}

		/**
		 * @return the moTa
		 */
		public String getMoTa() {
			return moTa;
		}
	}
	
	public NVHD(String maNhanVien, String hoTen, LocalDate ngaySinh, String gioiTinh, double luongHopDong,
			LoaiHopDong loaiHopDong) {
		super(maNhanVien, hoTen, ngaySinh, gioiTinh);
		this.luongHopDong = luongHopDong;
		this.loaiHopDong = loaiHopDong;
	}

	/**
	 * @return the luongHopDong
	 */
	public double getLuongHopDong() {
		return luongHopDong;
	}

	/**
	 * @param luongHopDong the luongHopDong to set
	 */
	public void setLuongHopDong(double luongHopDong) {
		this.luongHopDong = luongHopDong;
	}

	/**
	 * @return the loaiHopDong
	 */
	public LoaiHopDong getLoaiHopDong() {
		return loaiHopDong;
	}

	/**
	 * @param loaiHopDong the loaiHopDong to set
	 */
	public void setLoaiHopDong(LoaiHopDong loaiHopDong) {
		this.loaiHopDong = loaiHopDong;
	}

	@Override
	public String toString() {
		Locale locale = Locale.forLanguageTag("vi-VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return super.toString() + 
			   "Lương hợp đồng: " + nf.format(luongHopDong) + ". " + 
			   "Loại hợp đồng: " + loaiHopDong + "\n";
	}

	@Override
	public double tinhLuong() {
		double phuCap = 0;

		if (LoaiHopDong.NH.name().equals("NH")) {
			phuCap = 500000;
		} else if (LoaiHopDong.DH.name().equals("DH")) {
			phuCap = 2000000;
		}

		return luongHopDong + phuCap;
	}
}
