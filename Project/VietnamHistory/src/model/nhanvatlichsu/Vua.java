package model.nhanvatlichsu;

import java.util.ArrayList;

import model.thoiky.ThoiKy;

public class Vua extends NhanVatLichSu {
	private String mieuHieu;
	private String thuyHieu;
	private String nienHieu;
	private String tenHuy;
	private String theThu;
	private String namTriVi;
	
	public Vua(String ten, String tenKhac, String namSinh, String namMat, String queQuan, ArrayList<ThoiKy> thoiKy,
			String ghiChu, String mieuHieu, String thuyHieu, String nienHieu, String tenHuy, String theThu,
			String namTriVi) {
		super(ten, tenKhac, namSinh, namMat, queQuan, thoiKy, ghiChu);
		this.setMieuHieu(mieuHieu);
		this.setThuyHieu(thuyHieu);
		this.setNienHieu(nienHieu);
		this.setTenHuy(tenHuy);
		this.setTheThu(theThu);
		this.setNamTriVi(namTriVi);
	}
	
	public Vua(String ten, String namSinh, String namMat, String queQuan,
			String ghiChu, String mieuHieu, String thuyHieu, String nienHieu, String tenHuy, String theThu,
			String namTriVi) {
		super(ten, namSinh, namMat, queQuan, ghiChu);
		this.setMieuHieu(mieuHieu);
		this.setThuyHieu(thuyHieu);
		this.setNienHieu(nienHieu);
		this.setTenHuy(tenHuy);
		this.setTheThu(theThu);
		this.setNamTriVi(namTriVi);
	}

	public Vua(String ten){
		super(ten);
	}
	
	public Vua() {
		super();
	}
	
	public String getMieuHieu() {
		return mieuHieu;
	}
	
	public void setMieuHieu(String mieuHieu) {
		this.mieuHieu = mieuHieu;
	}
	
	public String getThuyHieu() {
		return thuyHieu;
	}
	
	public void setThuyHieu(String thuyHieu) {
		this.thuyHieu = thuyHieu;
	}
	
	public String getNienHieu() {
		return nienHieu;
	}
	
	public void setNienHieu(String nienHieu) {
		this.nienHieu = nienHieu;
	}
	
	public String getTenHuy() {
		return tenHuy;
	}
	
	public void setTenHuy(String tenHuy) {
		this.tenHuy = tenHuy;
	}
	
	public String getTheThu() {
		return theThu;
	}
	
	public void setTheThu(String theThu) {
		this.theThu = theThu;
	}
	
	public String getNamTriVi() {
		return namTriVi;
	}
	
	public void setNamTriVi(String namTriVi) {
		this.namTriVi = namTriVi;
	}
}
