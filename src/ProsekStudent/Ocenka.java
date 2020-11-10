package ProsekStudent;

public class Ocenka {
	private String predmet;
	private String data;
	private int ocenka;
	
	public Ocenka() {
		predmet=" ";
		data=" ";
		ocenka=0;
	}
	public Ocenka(String predmet,String data,int ocenka) {
		this.predmet=predmet;
		this.data=data;
		this.ocenka=ocenka;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getOcenka() {
		return ocenka;
	}
	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}
	@Override
	public String toString() {
		return "Ocenka [predmet=" + predmet + ", data=" + data + ", ocenka=" + ocenka + "]";
	}
	
}
