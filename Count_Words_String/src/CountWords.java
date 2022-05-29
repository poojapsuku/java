
public class CountWords {

	public static void main(String[] args) {
		String str ="I am Very Confident";
		int cd= str.hashCode();
		System.out.println(cd);
		System.out.println(str.valueOf(5));
		String[] word = str.trim().split(" ");
		System.out.println("No; of words in the string are--"+word.length);
		System.out.println("Words are :");
		for(int i=0;i<word.length;i++)
		 System.out.println(word[i]+"\n");		
	}
}
