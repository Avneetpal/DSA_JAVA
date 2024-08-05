class spiral
{
    public void spirall(int num[][])
    {
        int startrow=0;
        int endrow=num.length-1;
        int startcol=0;
        int endcol=num[0].length-1;

        while (startrow<=endrow  && startcol<=endcol) 
        {
            // top
            for(int i=startcol;i<=endcol;i++)
            {
                System.out.print(" "+num[startrow][i]);
            }
            // right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(" "+num[i][endcol]);
            }
            // bottom
            
            for(int i=endcol-1;i>=startrow;i--)
            {
                System.out.print(" "+num[endrow][i]);
            }
            // left
            for(int i=endrow-1;i>=endcol+1;i--)
            {
                System.out.print(" "+num[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
            
        }

    }
}

class MAIN 
{
    public static void main(String[] args) {
        int num[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral s=new spiral();
        s.spirall(num);
    }
}