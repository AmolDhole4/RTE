package program;

import java.util.ArrayList;
import java.util.List;

public class Move_0_on_onside_Then1_another_side {
	public static void main(String[] args) {
		
		
int [] a= {0, 1,5, 0, 0, 1, 2, 0,7,};

List<Integer> li=new ArrayList<Integer>();

for(Integer ar:a) {
	if(ar==0) {
		li.add(ar);
	
}
}
for(Integer ar:a) {
	if(ar!=0) {
		li.add(ar);
	}
	
}
System.out.println(li);
}
}
