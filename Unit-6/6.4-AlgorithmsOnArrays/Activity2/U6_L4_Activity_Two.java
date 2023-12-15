public class U6_L4_Activity_Two
{
  public static void swap(int[] arr, int i, int j)
  {
    if (i >= 0 && j >= 0)
    {
      int[] tempNum = {arr[i], arr[j]};

      arr[i] = tempNum[1];
      arr[j] = tempNum[0];
    }
  }
  
  public static void allReverseSwap(int[] arr)
  {
    int[] tempArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++)
    {
      tempArr[i] = arr[(arr.length - 1) - i];
    }

    for (int i = 0; i < tempArr.length; i++)
    {
      arr[i] = tempArr[i];
    }
  }
}
