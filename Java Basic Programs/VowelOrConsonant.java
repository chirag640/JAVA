public class VowelOrConsonant {
    public static void main(String[] args) {
        char character = 'a';

        simpleWay(character);
        usingArray(character);
    }
    public static void simpleWay(char character){
        if(character == 'a' || character == 'e' || character=='i' || character=='o' || character=='u'){
            System.out.println(character + " is vowel");
        }else{
            System.out.println(character+" is Consonant");
        }
    }
    public static void usingArray(char character){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        boolean isVowel=false;
        for (char d : vowels) {
            if(character == d){
                isVowel = true;
                break;
            }
        }
        if (isVowel) {
            System.out.println(character + " is a vowel");
        } else if (Character.isLetter(character)) {
            System.out.println(character + " is a consonant");
        } else {
            System.out.println(character + " is not a valid alphabet letter");
        }
    }
}
