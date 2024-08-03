class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            map.add(sentence.charAt(i));
        }
        for(char i='a';i<='z';i++){
            if(!map.contains(i)){
                return false;
            } 
        }
        return true;
    }
}