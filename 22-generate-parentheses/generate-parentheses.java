class Solution {
    public void dfs(int left, int right, int len, StringBuffer sb, List<String> ans){
        if(left == right && left == len){
            ans.add(sb.toString());
            return;
        }
        if(left<len){
            sb.append('(');
            dfs(left+1, right, len, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(right<left){
            sb.append(')');
            dfs(left, right+1, len, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(0,0,n,new StringBuffer(), ans);
        return ans; 
    }
}