import java.util.ArrayList;
import java.util.List;

public class decoding
{

    static void solve(String input,int i , List<String> list)
    {
    if(i>input.length()) return;


    if(i == input.length())
    {
        System.out.println(list);
        return;
    }

    list.add(Character.toString(input.charAt(i)));
    solve(input,i+1,list);
    list.remove(list.size() - 1);

    if(i+2<=input.length() ) {
        int val = Integer.parseInt(Character.toString(input.charAt(i)) + Character.toString(input.charAt(i + 1)));
        if(val<26){
        list.add(Character.toString(input.charAt(i)) + Character.toString(input.charAt(i + 1)));
        solve(input, i + 2, list);
        list.remove(list.size() - 1);
    }}
    }


    public static void main(String[] args) {
        String str = "314";
        solve(str,0,new ArrayList<>());
    }


}
