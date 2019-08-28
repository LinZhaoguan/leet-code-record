package com.puboot.$5;

class Solution {

    int start;
    String maxLengthStr = "";

    // 超时
    public String longestPalindrome_1(String s) {

        while (start < s.length()) {
            for (int end = start + 1; end <= s.length(); end++) {
                String sb = s.substring(start, end);
                if (isPalindrome(sb)) {
                    maxLengthStr = maxLengthStr.length() > sb.length() ? maxLengthStr : sb;
                }
            }
            start++;
        }
        return maxLengthStr;
    }

    private static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }

    // 马拉车法
    public String longestPalindrome_2(String s) {
        String max = "";

        if (s == null || s.length() == 0) {
            return max;
        }

        StringBuilder sb = new StringBuilder("#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append('#');
        }
        s = sb.toString();

        for (int i = 0; i < s.length(); i++) {

            int k = 0;
            while (k <= i && k < s.length() - i && s.charAt(i - k) == s.charAt(i + k)) {
                k++;
            }
            String b = s.substring(i - k + 1, i + k);
            StringBuilder w = new StringBuilder();
            for (int v = 0; v < b.length(); v++) {
                if (b.charAt(v) != '#') {
                    w.append(b.charAt(v));
                }
            }
            b = w.toString();
            max = b.length() > max.length() ? b : max;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome_2("kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv"));
    }
}