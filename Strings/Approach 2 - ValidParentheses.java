class Solution {
    private boolean compareOpeningAndClosing(char openingBracket , char         closingBracket){
        return ( (openingBracket == '{'  && closingBracket == '}') ||
            (openingBracket == '('  && closingBracket == ')' )|| 
         (openingBracket == '['  && closingBracket == ']' ) );    
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char [] ch = s.toCharArray();
        for(int i=0; i < ch.length; i++){
            if(ch[i] == '{' || ch[i] == '(' || ch[i] == '['){
                st.push(ch[i]);
            }else if(!st.empty() && compareOpeningAndClosing(st.peek(), ch[i] )){
                st.pop(); 
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}
