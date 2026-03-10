class Solution {
public int scoreOfString(String s) {
int count= 0;
for(int i = 1;i<s.length();i++){
count+=Math.abs(s.charAt(i)-s.charAt(i-1));
}
return count;
}
}



//check this Link https://neetcode.io/problems/score-of-a-string/question
