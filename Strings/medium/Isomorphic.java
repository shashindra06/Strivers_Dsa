package Strings.medium;

//Input: s = "egg", t = "add"

//Output: true

//Input: s = "f11", t = "b23"

//Output: false

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int[] m = new int[256];
        int[] n = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (m[s.charAt(i)] != n[t.charAt(i)])
                return false;
            m[s.charAt(i)] = i + 1;
            n[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
