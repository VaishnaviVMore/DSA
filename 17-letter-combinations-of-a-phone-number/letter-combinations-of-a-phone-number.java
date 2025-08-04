class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String>list=new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        dfs(digits,new StringBuilder(),0,list);
        return list;
    }
    public static String[] DigitToLetters={"",    // 0
    "",    // 1
    "abc", // 2
    "def", // 3
    "ghi", // 4
    "jkl", // 5
    "mno", // 6
    "pqrs",// 7
    "tuv", // 8
    "wxyz" // 9
  };
    public static void dfs(String digits, StringBuilder sb,int i,ArrayList<String>list){
//base
if(i==digits.length()){
    list.add(sb.toString());
    return;
}
String letters=DigitToLetters[digits.charAt(i)-'0'];
for(int j=0;j<letters.length();j++){
    char ch=letters.charAt(j);
    sb.append(ch);
    dfs(digits,sb,i+1,list);
    sb.deleteCharAt(sb.length()-1);
}
    }
}