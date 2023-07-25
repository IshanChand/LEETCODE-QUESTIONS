class Solution {
    public String reverseWords(String s) {
String w="";
String[] st=s.split(" ");
        for(int i=st.length-1;i>=0;i--)
        {
            
            w=w+st[i]+" ";
        }
        w=w.replaceAll("\s+"," ");
        return w.trim();
    }
}