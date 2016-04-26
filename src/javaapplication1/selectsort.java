package javaapplication1;


class selectsort {
static int Y1[] = {112,103,32,92,47,28,63,97,84,19,55,80,4,39,14}; static int lenY1 = 15;


public static void main(String[] args) {
for(int i = 0; i<lenY1; i++) System.out.print(select(Y1,i,0,lenY1-1) + " ");
      System.out.println("\n");
}


public static int select(int[] x, int k, int left, int right) { int pivot, pivotindex;
      pivot = x[left];
      pivotindex = partition(x,left,right);
      if (k == pivotindex)
            return x[k];
      else if (k < pivotindex)
      return select(x,k,left,pivotindex-1);
      else

return select(x,k,pivotindex+1,right);
}

public static int partition(int x[], int left, int right) { 
      int pivot, l, r, temp;
      pivot = x[left];
      l = left-1 ;
      r = right+1 ;
      while (true) {
            do {r--;} while (x[r] > pivot);
            do {l++;} while ((x[l] <= pivot)&(l<right));
            if (l < r) {
                temp = x[l];
                x[l] = x[r];
                x[r]= temp;
            }
            else {
                x[left]=x[r];
                x[r]=pivot;
                return r; 
            }
} 
}
}