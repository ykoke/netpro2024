class Renshu {

    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    //ここに続きを実装していく。
    public int sumUpToN(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public int sumFromPtoQ(int p, int q){
        int sum = 0;
        for(int i = p;  i<=q; i++){
            sum += i;
        }
        if(p>q){
            return -1;
        }
        return sum;
    }
    public int sumFromArrayIndex(int[] a, int index){
        int arraysum = 0;
        for(int i = index; i<a.length; i++){
            arraysum += a[i];
        }
        if(index>=a.length){
            return -1;
        }
        return arraysum;
    }
    public int selectMaxValue(int[] a){
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
        }
        }
        return max;
    }
    public int selectMinValue(int[] a){
        int min = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
        }
        }
        return min;
    }
    public int selectMaxIndex(int[] a){
        int max = a[0];
        int maxindex = 0;
        for(int i = 1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
                maxindex = i;
        }
        }
        return maxindex;
    }
    public int selectMinIndex(int[] a){
        int min = a[0];
        int minindex = 0;
        for(int i = 1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
                minindex = i;
        }
        }
        return minindex;
    }
    public void swapArrayElements(int[] p, int i, int j){
        int tmp = p[0];
        p[i]= p[j];
        p[j] = tmp;
    }
    public boolean swapTwoArrays(int[]a, int[]b){
        if(a.length!=b.length){
            return false;
        }
        for(int i = 0; i<a.length; i++){
            int tmp = a[i];
            a[i]=b[i];
            b[i]=tmp;
            
        }
        return true;
    }
    public void bubbleSort(int[] a){
        for (int i = a.length-1; i > 0; i-- ) {
            // j は交換する箇所の前からの番号を示している
            for (int j = 0; j < i; j++) {
                if(a[j]>a[j+1]){
                  //降順にしたい場合は不等号を逆に 
                  int box = a[j];
                  a[j] = a[j+1];
                  a[j+1] = box;
                  System.out.println(a[j] + ":" +a[j+1]);
                } else{
                  //そのまま
                }
            }
        }
    }
    
}
