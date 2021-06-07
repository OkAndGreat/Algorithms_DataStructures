import java.util.*;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S="123";
        solution.permutation(S);
    }

}

class Solution {
    ArrayList<String> res;
    int curLength=0;
    int[] vis;
    StringBuilder sb=new StringBuilder();
    public String[] permutation(String S) {
        res=new ArrayList<>();
        vis=new int[S.length()];
        dfs(0,S);
        String[] str=new String[res.size()];
        for(int i=0;i<res.size();i++) str[i]= res.get(i);
        return str;
    }

    void dfs(int i,String s){
        if(i==s.length()){
            res.add(sb.toString());
            return;
        }
        for(int j=0;j<s.length();j++){
            if(vis[j]==1) continue;
            vis[j]=1;
            sb.append(s.charAt(j));
            dfs(i+1,s);
            sb.deleteCharAt(sb.toString().length()-1);
            vis[j]=0;
        }
    }
}




