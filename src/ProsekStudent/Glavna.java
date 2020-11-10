package ProsekStudent;
import java.util.Scanner;
public class Glavna {

	public static void main(String[] args) {
		String ime,prezime,predmet,data;
		int index,n,ocenka,n1,j;
		double prosek;
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete n");
		n=sc.nextInt();
		Student s[]=new Student[100];
		for(int i=0;i<n;i++) {
		Covek c=new Covek();
		    System.out.println("Vnesete ime");
			ime=sc.next();
			c.setIme(ime);
			System.out.println("Vnesete prezime");
			prezime=sc.next();
			c.setPrezime(prezime);
			System.out.println("Vnesete index");
			index=sc.nextInt();
			c.setIndex(index);
			System.out.println("Vnesete n1");
			n1=sc.nextInt();
			for(j=0;j<n1;j++) {
			
        Ocenka o=new Ocenka();
		    System.out.println("Vnesete predmet");
		    predmet=sc.next();
		    o.setPredmet(predmet);
		    System.out.println("Vnesete data");
		    data=sc.next();
		    o.setData(data);
		    System.out.println("Vnesete ocenka");
		    ocenka=sc.nextInt();
		    o.setOcenka(ocenka);
		    
		    
			Student s1=new Student();
			System.out.println("Vnesete prosek");
			prosek=sc.nextDouble();
			s1.setProsek(prosek);
				  
			  }
			
		}
		
		

	}
		
}
