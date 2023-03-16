public class Workshop {
        public static void main(String[] args) {
            int [] arr = new int[]{1,8,7,4,5,1};
            int []fr = new int[arr.length];
            int visited =-1;
            for(int i = 0;i<arr.length;i++)
            {
                int count = 1;
                for(int j = i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        fr[j] = visited;
                    }
                }
                if(fr[i]!=visited)
                    fr[i]=count;
            }
            System.out.println("1,8,7,4,5,1");
            System.out.println("Element Frequency");
            for(int i=0;i<fr.length;i++)
            {
                if(fr[i]!=visited)
                    System.out.println(" "+arr[i]+ " "+fr[i]);
            }


        }
    }


