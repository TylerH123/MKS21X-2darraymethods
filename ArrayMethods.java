public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if (x > ary.length-1 || x < 0)  throw new IndexOutOfBoundsException();
    for (int i = 0; i < ary[x].length; i++){
      sum += ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int y){
    int sum = 0;
    for (int i = 0; i < ary.length; i++){
      if (y >= ary[i].length-1 || y < 0) throw new IndexOutOfBoundsException();
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
    for (int i = 0; i < ary.length; i++){
      if (ary[i].length > len){
        len = ary[i].length;
      }
    }
    int[] arr = new int[len];
    for (int i = 0; i < ary.length; i++){
      for (int j = 0; j < ary[i].length; j++){
        arr[j] += ary[i][j];
      }
    }
    return arr;
  }
  public static boolean isRowMagic(int[][] ary){
    int[] arr = allRowSums(ary);
    for (int i = 0; i < arr.length-1; i++){
      if (arr[i] != arr[i+1]){
        return false;
      }
    }
    return true;
  }
  public static boolean isColumnMagic(int[][] ary){
    int[] arr = allColSums(ary);
    for (int i = 0; i < arr.length-1; i++){
      if (arr[i] != arr[i+1]){
        return false;
      }
    }
    return true;
  }
}
