package BT2;

public class People {
	private String ten;
	private int tuoi;
	private int namsinh;
	private String nghe;

	public People() {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.namsinh = namsinh;
		this.nghe = nghe;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public String getNghe() {
		return nghe;
	}

	public void setNghe(String nghe) {
		this.nghe = nghe;
	}

	@Override
	public String toString() {
		return "People [ten=" + ten + ", tuoi=" + tuoi + ", namsinh=" + namsinh + ", nghe=" + nghe + "]";
	}

}
