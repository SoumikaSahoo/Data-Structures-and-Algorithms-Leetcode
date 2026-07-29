class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int len1 = s.length();
        int len2 = p.length();

        if (len2 > len1)
            return result;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < len2; i++) {
            s1Count[s.charAt(i) - 'a']++;
            s2Count[p.charAt(i) - 'a']++;
        }

        if (matches(s1Count, s2Count)) {
            result.add(0);
        }

        for (int i = len2; i < len1; i++) {

            s1Count[s.charAt(i) - 'a']++;
            s1Count[s.charAt(i - len2) - 'a']--;

            if (matches(s1Count, s2Count)) {
                result.add(i - len2 + 1);
            }
        }

        return result;
    }

    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}