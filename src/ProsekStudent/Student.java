package ProsekStudent;

import java.util.Arrays;

public class Student extends Covek {
	
	private Ocenka oc[]=new Ocenka[10];
	private int n,i;
	private double prosek;
			public Student(String ime,String prezime,int index,int n,double prosek)  {
    	super(ime,prezime,index);
    	for(int i=0;i<n;i++)
    	this.n=n;
    	this.oc[i]=oc[i];
    	this.prosek=getProsek();
    }
			

		public Ocenka[] getOc() {
				return oc;
			}


			public void setOc(Ocenka[] oc) {
				this.oc = oc;
			}

			public void setProsek(double prosek) {
				this.prosek = prosek;
			}


		public double getProsek() {
			int s=0;
			int k=0;
			for(int i=0;i<n;i++)
				if(oc[i].getOcenka()>5) {
					s=s+oc[i].getOcenka();
					k=k+1;
			  }
			prosek=s/k;
			return prosek;
		}
		public void setOc(Ocenka oc1) {
			oc[n-1]=oc1;
			n++;
			
		}

		@Override
		public String toString() {
			return "Student [oc=" + Arrays.toString(oc) + ", prosek=" + prosek + "]";
		}
		
		
}
		

	
	
	

