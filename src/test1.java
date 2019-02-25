
public class test1 {
	public static void main(String args[]) {
		int a[]= {20,10,20,10,40};
		int c=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					c=c+1;
				}
			}
			if(c>=1) {


				System.out.println("number"+a[i]+"count"+c);


				System.out.println("number"+a[i]+" this is count"+c);
			}
			c=0;
			System.out.println("number"+a[i]+"count"+c);
		}
	}

}
