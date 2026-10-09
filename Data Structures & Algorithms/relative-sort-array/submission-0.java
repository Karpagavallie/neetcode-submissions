class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            int n=map.get(arr2[i]);
            for(int j=0;j<n;j++)
            {
                list.add(arr2[i]);
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            if(!list.contains(arr1[i]))
            {
                int n=map.get(arr1[i]);
                for(int j=0;j<n;j++)
                {
                    list.add(arr1[i]);
                }
            }
        }
        int arr[]=new int[list.size()];
        int ind=0;
        for(int i:list)
        {
            arr[ind]=i;
            ind++;
        }
        return arr;
        
    }
}