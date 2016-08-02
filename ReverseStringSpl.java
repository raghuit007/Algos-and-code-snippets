
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ab,c,de!$a,b$c";
		char [] ch = s.toCharArray();
		
		// naive approach
		/*char [] res = new char[ch.length];
		int j=0;
		for(int i=ch.length-1;i>=0;i--) {
		   if(Character.isLetter(ch[i])==true) {
			   res[j] = ch[i];
			   j++;
		   }
		}
		int l=0;
		for(int k=0;k<ch.length;k++) {
			if(Character.isLetter(ch[l])==true) {
				ch[k]=res[k];
				l++;
			}
		}
		
		String result = new String(ch);
		System.out.println("result is-->"+result); */
		
		//advanced approach
		
		int l=0;
		int r = ch.length-1;
		
		while(l<r) {
			if(Character.isLetter(ch[l])==false) {
				l++;
			}
			 if (Character.isLetter(ch[r])==false)
			{
				r--;
			}
			if(Character.isLetter(ch[l])!=false && Character.isLetter(ch[r])!=false ) 
			{
				char temp = ch[l];
				ch[l] = s.charAt(r);
				ch[r]=temp;
				l++;
				r--;
				
			}
		}
		String result = new String(ch);
		System.out.println("result is:"+result);
	}

}
