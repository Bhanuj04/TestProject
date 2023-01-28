package Revisonn;

import java.util.ArrayList;
import java.util.Scanner;
public class revv {
	public static final char alphabets[]= {
			' ','a','b','c','d','e','f','g','h','i','j',
			'k','l','m','n','o','p','q','r','s','t','u',
			'v','w','x','y','z'
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start value :-");
		int sval=sc.nextInt();
		int eval=sc.nextInt();
		if(sval>eval||sval<0||eval<0) {
			System.out.println("invalid values");
			return;
		}
//		int[] primeno=new int[eval-sval];
		ArrayList<Integer> arr=new ArrayList<>();
		int k=0;
		for(int n=sval+1;n<eval;++n) {
			int flag=1;
			for(int i=2;i<(n/2);++i) {
				
				if(n%i==0) {
					
					flag=-1;
					break;
				}
				
			}
			if(flag==1) {
//				primeno[k]=n;
				arr.add(n);
				
				++k;
			}
		}
//	System.out.println(arr);
		ArrayList<StringBuffer> result=new ArrayList<>(k);
			try {
				for(int i=0;i<k;++i) {
					
//					int firstno=(primeno[i]/10);
//					int secondno=primeno[i]%10;
					int firstno=arr.get(i)/10;
					int secondno=arr.get(i)%10;
					StringBuffer s;
					if(firstno!=0) {
						s=new StringBuffer(""+alphabets[firstno]);
                         int num=secondno;
						
						for(int j=1;j<=num;++j) {
//							
//							s.append(""+alphabets[secondno]);
//							
//							secondno=secondno+1;
							s.append(""+alphabets[secondno]);
							secondno+=1;
							
						}
					}
					else {
//						 s=new StringBuffer(""+alphabets[primeno[i]]);
						 s=new StringBuffer(""+alphabets[arr.get(i)]);
					}
//		           System.out.println(firstno+""+secondno);
					
					
				
					result.add(s);
					System.out.println(arr.get(i)+" -> "+s);
					
				}
				
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}
}