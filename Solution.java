public class Solution {
    public static int solution(int[] l) {
        
        int length = l.length;
        int counter =0;
        for (int i=0; i<=length-3;i++)
        {
            for (int j=i+1; j<=length-2;j++)
            {
                for (int k=j+1; k<=length-1; k++)
                {
                    int[] temp = {l[i],l[j],l[k]};
                    int is = validate(temp);
                    counter += is;
                }
            }
        }
        
        return counter;
    }
    
    public static int validate (int[] temp)
    {
        if (temp[1]%temp[0]==0)
        {
            if (temp[2]%temp[1]==0)
            {
                return 1;
            }
        }
        
        return 0;
    }
}