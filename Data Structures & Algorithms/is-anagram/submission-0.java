class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> stringOne = new HashMap<>();
        HashMap<Character, Integer> stringTwo = new HashMap<>();

        s.chars().forEach(c -> stringOne.put((char) c, stringOne.getOrDefault((char) c, 0) + 1));
        t.chars().forEach(c -> stringTwo.put((char) c, stringTwo.getOrDefault((char) c,0)+1));
    

        return stringOne.equals(stringTwo);
    }
}
