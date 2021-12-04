package dayfiveassignment;

public class VowelConsonant {

	public static void main(String[] args) {
		
		//If else
		char cr = 'a';
		if(cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u' )
			System.out.println(cr + " is vowel");
		else
			System.out.println(cr + " is consonant");
		
		//Switch
		switch (cr) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(cr + " is vowel");
            break;
        default:
            System.out.println(cr + " is consonant");
    }

	}

}
