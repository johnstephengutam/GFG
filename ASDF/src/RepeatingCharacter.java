
public class RepeatingCharacter {
	final static int CHARS = 256;
	static char[] count = new char[CHARS];
	
	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		int index = findIndex(str);
		System.out.println(index == -1? "empty String" : "found char is "+ str.charAt(index));
	}
	
	public static void getCharCountArray(String str){
		for(int i= 0; i < str.length(); i++){
			count[str.charAt(i)]++;
		}
	}
	public static int findIndex(String str){
		int index = -1;
		getCharCountArray(str);
		for(int i= 0; i < str.length(); i++){
			if(count[str.charAt(i)] == 1){
				index = i;
				break;
			}
		}
		
		return index;
	}

}
