class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> dict = new HashMap<>();

        for(List<String> l: knowledge){
            dict.put(l.get(0), l.get(1));
        }

        StringBuilder builder = new StringBuilder();
        int i=0;

        while(i<s.length()){
            if(s.charAt(i) == '('){
                int j = i+1;
                while(s.charAt(j) != ')'){
                    j++;
                }
                String k = s.substring(i+1, j);
                builder.append(dict.getOrDefault(k, "?"));
                i = j+1;
            } else {
                builder.append(s.charAt(i));
                i++;
            }
        }

        return builder.toString();
    }
}