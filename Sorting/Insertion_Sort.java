class Insertion_Sort{

  void sort(int arr[]){
    int n = arr.length;
    for(int i = 1; i<n; i++){
      int key = arr[i];
      int j = i - 1;

      while(j>=0 && key < arr[j]){
        arr[j+1] = arr[j];
        j = j - 1;
      }
      arr[j+1] = key;
    }
  }

  void printArray(int arr[]){
    int n = arr.length;
    for(int i = 0; i<n; i++){
      System.out.println(arr[i] + " ");
    }
  }

  public static void main(String args[]){
    //instantiate Insertion_Sort class
    int numbers[] = new int[] {26, 17, 0, 12, 99, 56, 2, 87, 97, 4, 90, 7};
    Insertion_Sort obj = new Insertion_Sort();
    obj.sort(numbers);
    obj.printArray(numbers);
  }
}
