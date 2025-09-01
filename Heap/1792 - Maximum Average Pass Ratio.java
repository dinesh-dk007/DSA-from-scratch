class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double []> maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b[0],a[0]));
        for(int arr[] : classes){
            int p = arr[0];
            int t= arr[1];
            double gain = 0.0;
            if(p != t){
                gain = (double)(p+1)/(t+1) - ((double)p/t);
            }
            maxHeap.offer(new double[]{gain,p,t});
        }
        for(int i = 0;i<extraStudents;i++){
            double [] arr = maxHeap.poll();
            int p = (int)arr[1];
            int t = (int)arr[2];
            p++;t++;
            double newGain = 0.0;
            if(p != t){
                newGain = (double)(p+1)/(t+1) - ((double)p/t);
            }
            maxHeap.offer(new double[]{newGain,p,t});
        }
        double totalAvg = 0.0;
        while(!maxHeap.isEmpty()){
            double [] arr = maxHeap.poll();
            int p = (int)arr[1];
            int t = (int)arr[2];
            totalAvg += ((double)p/t);
        }
        return totalAvg/classes.length;
    }
}