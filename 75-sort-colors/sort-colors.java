class Solution {
    public void sortColors(int[] a) {
        //test
        int zeros=0,ones=0,twos=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            zeros++;
            else if(a[i]==1)
            ones++;
            else if(a[i]==2)
            twos++;
        }
        int i=0;
        while(zeros>0)
        {
            a[i]=0;
            zeros--;
            i++;
        }
        while(ones>0)
        {
            a[i]=1;
            ones--;
            i++;
        }
        while(twos>0)
        {
            a[i]=2;
            twos--;
            i++;
        }
    }
}