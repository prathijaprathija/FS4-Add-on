package jp;

public class Jump_Statement {
	public static void main(String[] args) {
		int i =1;
		while(i<12) {
			if(i==5) {
				//break;
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
