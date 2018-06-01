/**
*
* @author Muhammed Erdinç
* @since 07.03.2018
* <p>
* "Program.java" isimli bir Java kaynak dosyasını okuyacak ve içerisinde bulunan sınıfın değişkenlerini ve fonksiyonlarını  istenen formatta ekrana listeleyen Java programı.
* </p>
*/
import java.awt.List;
import java.awt.Window.Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, SecurityException, NoSuchMethodException {
		// TODO Auto-generated method stub

		//Scanner scan =new Scanner(System.in);
		Program program= new Program();
		
	
		System.out.println("Sınıf Adı: "+program.getClass().getSimpleName()+"\n");
		
		
		Field[] fields = Program.class.getDeclaredFields();
		
		System.out.println("Alt Elemanlar: "+fields.length+"\n"); 
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		Field field;
		for (int i=0;i<fields.length;i++) {
			
			field=fields[i];
		    System.out.println("Değişken Adı: "+field.getName());  
		    System.out.println("Değişken Tipi: "+ fields[i].getType().getSimpleName()+"\n");
		    
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		Method[] methods =Program.class.getDeclaredMethods();
		
        Constructor[] cons =Program.class.getDeclaredConstructors();
        System.out.println("Üye Fonksiyonlar: "+cons.length +" adet\n");
        
        for(int i=0; i<cons.length;i++) {
        	
        	 System.out.println("Fonksiyon Adı:  " + cons[i].getName()+ "\nAldığı Parametre Sayısı:  "+ cons[i].getParameters().length + " adet\n");
        	
        	
 
        }
        
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
 
		System.out.println("Metotlar= "+ methods.length+" adet\n");
		 for (int i = 0; i < methods.length; i++) {
	            System.out.println((i+1)+".metot: "+methods[i].getName());
	       
		
		 }
		 System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		for(int i=1;i<methods.length;i++)	{ 
		 System.out.println("\n"+"*** "+methods[i].getName());
		 Parameter[] parameters = methods[i].getParameters();
		 System.out.println("Aldığı Parametre: "+parameters.length);
		 System.out.print("Parametre Tipi: ");
		 for(int j=0;j<parameters.length;j++) {
		 System.out.print(parameters[j].getType().getSimpleName()+", ");
		
		 }
		 System.out.println();
		 System.out.println("Dönüş Türü: "+methods[i].getReturnType().getName());
		
		 
		}
	
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	
	}
	
}

