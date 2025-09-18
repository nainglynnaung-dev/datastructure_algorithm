package algorithm;

public class Arrayy {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] num= {3,45,2,6,7,34,66};
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("%s is Maximum Number".formatted(max));

	}

}
