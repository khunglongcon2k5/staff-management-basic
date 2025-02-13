/*
 * 
 * @author NguyenHung
 * @date Nov 30, 2024
 * @version 1.0
 *
 */

package service;

import java.util.ArrayList;
import java.util.List;

import model.NV;
import model.NVBC;
import model.NVHD;

public class DSNV {
	private List<NV> dsnv = new ArrayList<>();

	public void themNV(NV nv) {
		dsnv.add(nv);
	}

	public void danhSachNV() {
		for (NV nv : dsnv) {
			System.out.println(nv.toString());
		}
	}

	public void danhSachNVBC() {
		for (NV nv : dsnv) {
			if (nv instanceof NVBC) {
				System.out.println(nv.toString());
			}
		}
	}

	public void danhSachNVHD() {
		for (NV nv : dsnv) {
			if (nv instanceof NVHD) {
				System.out.println(nv.toString());
			}
		}
	}

	public double tinhTongLuong() {
		double tongLuong = 0;
		for (NV nv : dsnv) {
			tongLuong += nv.tinhLuong();
		}
		return tongLuong;
	}

	public void danhSachNhanVienHopDongDaiHan() {
		for (NV nv : dsnv) {
			if (nv instanceof NVHD) {
				NVHD nvhd = (NVHD) nv;
				if (nvhd.getLoaiHopDong() == NVHD.LoaiHopDong.DH) {
					System.out.println(nv);
				}
			}
		}
	}
}
