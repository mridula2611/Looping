public class CA5{
    public static void main(String[] args){
        System.out.println("Vowels:");
        for(char a = 'a'; a<='z';a++){
           if(a == 'a'||a=='e'||a=='i'||a=='o'||a == 'u'){
               System.out.print(a + " ");
           }
        }
        System.out.println("Consonants: ");
        for(char a = 'a'; a<='z';a++){
           if(!(a == 'a'||a=='e'||a=='i'||a=='o'||a == 'u')){
               System.out.print(a + " ");
           }
     }
    }
}