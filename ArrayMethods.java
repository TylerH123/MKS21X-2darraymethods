public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    for (int i = 0; i < ary[x].length; i++){
      sum += ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int y){
    int sum = 0;
    for (int i = 0; i < ary.length; i++){
      sum += ary[i][y];
    }
    return sum;
  }
  public static int[] allRowSums(int[][] ary){
    int[] arr = new int[ary.length];
    for (int i = 0; i < arr.length; i++){
      arr[i] = rowSum(ary, i);
    }
    return arr;
  }
  public static int[] allColSums(int[][] ary){
    int len = ary[0].length;
    for (int i = 0; i < ary[i].length; i++){
      if (ary[i].length > len){
        len = ary[i].length;
      }
    }
    int[] arr = new int[len];
    for (int i = 0; i < ary.length; i++){
      for (int j = 0; j < ary[i].length; j++){
        arr[i] += ary[i][i];
      }
    }
    return arr;
  }
}
