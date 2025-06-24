class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email: emails){
            String[] s = email.split("@");
            // StringBuffer sb = new StringBuffer(s[0]);
            if(s[0].contains("+")) s[0] = s[0].substring(0,s[0].indexOf('+'));
            if(s[0].contains(".")) s[0] = s[0].replaceAll("\\.", "");
            // System.out.println(s[0]);
            set.add(s[0]+"@"+s[1]);
        }
        return set.size();
    }
}