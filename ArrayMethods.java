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
    boolean isEmpty = true;
    for (int i = 0; i < ary.length; i++){
      if (ary[i].length > 0){
        isEmpty = false;
      }
    }
    if (isEmpty == true){
      return 0;
    }
    int len = ary[0].length;
    for (int i = 0; i < ary.length; i++){
      if (ary[i].length > len){
      len = ary[i].length;
      }
    }
    if (y >= len || y < 0) throw new IndexOutOfBoundsException();
    int[] arr = new int[len];
    for (int i = 0; i < ary.length; i++){
      for (int j = 0; j < ary[i].length; j++){
        arr[j] += ary[i][j];
      }
    }
    return arr[y];
  }
  public static int[] allRowSums(int[][] ary){
    int[] arr = new int[ary.length];
    for (int i = 0; i < arr.length; i++){
      arr[i] = rowSum(ary, i);
    }
    return arr;
  }
  public static int[] allColSums(int[][] ary){
    boolean isEmpty = true;
    for (int i = 0; i < ary.length; i++){
      if (ary[i].length > 0){
        isEmpty = false;
      }
    }
    if (isEmpty == true){
      int[] arry = new int[1];
      arry[0] = 0;
      return arry;
    }
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
