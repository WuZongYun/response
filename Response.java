package myJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Response {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	List<Integer> list=new ArrayList<Integer>();
	String str=scan.next();
	String[] a=str.split("\\=")[1].split(",");
	
	for(int i=0;i<a.length;i++){
		int sum=1;
		for(int j=0;j<a.length;j++){
			if(i==j){
				continue;
			}
		    sum*=Integer.parseInt(a[j]);
		
		}
		list.add(sum);
	}
	for(int i=0;i<list.size();i++){
		if(i==list.size()-1){
			System.out.print(list.get(i));
		}else{
		System.out.print(list.get(i)+",");
		}
	}
}
}
