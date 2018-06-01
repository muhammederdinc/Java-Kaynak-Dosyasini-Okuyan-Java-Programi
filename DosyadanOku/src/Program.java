/**
*
* @author Muhammed Erdinç
* @since 07.03.2018
* <p>
* "Program.java" isimli bir Java kaynak dosyasını okuyacak ve içerisinde bulunan sınıfın değişkenlerini ve fonksiyonlarını  istenen formatta ekrana listeleyen Java programı.
* </p>
*/
public class Program {
    
   /* public Program() {
		
	}
    
    private int deger; 
    private boolean eksimi;
    public Program(int deger)
    { this.deger = deger; 
    eksimi = deger < 0; }
    
    public void setDeger(int value)
    { this.deger = value; eksimi = this.deger < 0; }
    
    public boolean Eksimi(){ return eksimi; }
    
    @Override public String toString() { return String.valueOf(deger); }*/

	String ad;
	int yas;
	boolean meslek;

	
	public Program() {
		
	}
	
	public Program (String ad , int yas, boolean meslek ) {
		this.ad=ad;
		this.yas=yas;
		this.meslek=meslek;
		
	}

	
	public String getAd()
	{
	return ad;
	}

	public void setAd(String ad)
	{
	this.ad=ad;
	}
	
	public int getYas()
	{
	return yas;
	}

	public void setYas(int yas)
	{
	this.yas=yas;
	}
	
	public boolean getMeslek()
	{
	return meslek;
	}

	public void setMeslek(boolean meslek)
	{
	this.meslek=meslek;
	}
        

}
