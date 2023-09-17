
public class ValidParenthesis {
    public static boolean isValid(String s){
        char currentChar = '{';
        for(int i = 0; i < s.length(); i++){
            currentChar = s.charAt(i);
            if((currentChar==('(') && s.charAt(i+1) == (')'))|| (currentChar==('{') && s.charAt(i+1) == ('}'))|| (currentChar==('[') && s.charAt(i+1) == (']'))){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String parenthesis = "[]{}{}";
        System.out.println(isValid(parenthesis));
    }   
}
