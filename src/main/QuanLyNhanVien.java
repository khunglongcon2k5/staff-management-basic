/*
 * 
 * @author NguyenHung
 * @date Nov 30, 2024
 * @version 1.0
 *
 */

package main;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import model.NVBC;
import model.NVHD;
import model.NVHD.LoaiHopDong;
import service.DSNV;

public class QuanLyNhanVien {
	public static void main(String[] args) {
		DSNV dsnv = new DSNV();
		
		dsnv.themNV(new NVBC("001", "Nguyễn Hùng", LocalDate.of(2005, 12, 19), "Nam", 6.2, 4.5));
		dsnv.themNV(new NVBC("002", "Phạm Nam Hải", LocalDate.of(2004, 4, 20), "Nam", 4.5, 3));
		dsnv.themNV(new NVBC("003", "Nguyễn Trúc Anh", LocalDate.of(2006, 8, 9), "Nữ", 3.4, 1));

		dsnv.themNV(new NVHD("111", "Nguyễn Mai Trang", LocalDate.of(2004, 1, 1), "Nữ", 5000000, LoaiHopDong.DH));
		dsnv.themNV(new NVHD("222", "Phạm Hải Băng", LocalDate.of(2003, 12, 25), "Nữ", 4000000, LoaiHopDong.NH));
		dsnv.themNV(new NVHD("333", "Lê Bảo Anh", LocalDate.of(2007, 11, 20), "Nữ", 6800000, LoaiHopDong.DH));
		
		System.out.println("Danh sách nhân viên: ");
		dsnv.danhSachNV();
		
		System.out.println("Danh sách NVBC: ");
		dsnv.danhSachNVBC();
		
		System.out.println("Danh sách NVHD: ");
		dsnv.danhSachNVHD();
		
		System.out.println("Danh sách NVHD Dài hạn: ");
		dsnv.danhSachNhanVienHopDongDaiHan();
		
		Locale locale = Locale.forLanguageTag("vi-VN");
		NumberFormat nf = NumberFormat.getInstance(locale);
		System.out.println("Tổng lương NV: " + nf.format(dsnv.tinhTongLuong()));
	}
}
