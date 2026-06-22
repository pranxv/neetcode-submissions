class Solution {
    public boolean isAnagram(String s, String t) {
        char [] chars1 = s.toCharArray();
        char [] chars2 = t.toCharArray();
       if (s.length() != t.length()) return false;

        Arrays.sort(chars1);
Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
