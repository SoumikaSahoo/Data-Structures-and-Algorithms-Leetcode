class Solution {
    public String reorganizeString(String s) {
               class Pair {
           int first;
          String second;
           Pair(int f, String s) {
               first=f;
               second=s;
           }
       }
       PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
           if (b.first != a.first)
               return b.first - a.first;
           return b.second.compareTo(a.second);
       });
        int[] freq = new int[26];
         for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
         for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new Pair(freq[i], "" + (char)(i + 'a')));
            }
        }
         StringBuilder ans = new StringBuilder();

 Pair prev = null;
       while(!pq.isEmpty()){
Pair curr = pq.poll();
 ans.append(curr.second);
 curr.first--;
 if(prev!=null && prev.first>0){
    pq.offer(prev);
 }
 prev=curr;
       }
       if(ans.length()!=s.length()){
        return"";
       }
       return ans.toString();

    }
}