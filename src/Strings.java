
class Strings {

    public static int countWords (String s) {
        int idx = 0;
        int cnt = 0;
        while (idx < s.length()) {
            if (s.charAt(idx) == ' ') {
                cnt++;
                while (s.charAt(idx) == ' ') {
                	idx++;
                }
            }
            idx++;
        }
        if (idx > 0) {
            cnt += 1;
        }
        return cnt;
    }
    
    
    public static void main(String[] args) {
		int v = countWords("sdfdf sdfdf      dfd");
		System.out.println(v);
	}

}
