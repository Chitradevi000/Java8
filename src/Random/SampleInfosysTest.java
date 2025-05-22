package Random;

import java.util.HashMap;

public class SampleInfosysTest {
    public static void main(String[] args) {
        String[] arr= {"a","b","uuu","zzzzz","ertyu","swivi","mgxx"};
        //how many strings are good
        int finalcount = 0;
        for(int i=0;i<arr.length;i++)
        {
            String singleStr=arr[i];
            int singleStrLen=singleStr.length();
            int checkpoint=singleStrLen/2;

            if(singleStrLen>1)
            {
                boolean booResult=countOccurances(singleStr,checkpoint);
                if (booResult)
                {
                    finalcount++;
                }
            }
        }
        System.out.println(finalcount);

    }

    static boolean countOccurances(String str, int checkpoint)
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
                if(map.get(c)>checkpoint)
                {
                    return false;
                }
            }
            else
            {
                map.put(c,1);
            }
        }
        return true;
    }
}
