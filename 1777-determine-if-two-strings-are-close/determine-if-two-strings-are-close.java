class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> freq1 = new HashMap<>();
HashMap<Character, Integer> freq2 = new HashMap<>();
for (char ch : word1.toCharArray()) {
    freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
}
for (char ch : word2.toCharArray()) {
    freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
}
for(char ch:freq1.keySet()){
    if(!freq2.containsKey(ch)){
        return false;
    }
}
ArrayList<Integer>list1=new ArrayList<>(freq1.values());
ArrayList<Integer>list2=new ArrayList<>(freq2.values());
Collections.sort(list1);
Collections.sort(list2);
if(!list1.equals(list2)){
    return false;
}
        return true;
    }
}