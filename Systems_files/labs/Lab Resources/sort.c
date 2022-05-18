
#include <stdio.h>

void swap(int *px, int *py){
  int temp;//swaps pointers so you can switch items inclusively(Found in book, chapter on pointers)
  temp = *px;
  *px = *py;
  *py = temp;
}

void selection_sort(int arr[], int size){
  int min = 0;
  for(int i=0;i < size-1;i++){//counter and redifines bounds || Call swap after comparison made
    min = i;//redefines bounds from sorted/unsorted
    for(int j= i+1; j < size; j++){//redifines bounds and runs comparison
      if(arr[j] < arr[min]){//first unsorted being checked and compared with other items in array
	min = j;
      }
    }//in
    swap(&arr[min], &arr[i]);//swaps found min with arr[i] index
  }//out
}

void printarr(int arr[],int size){
  for(int i=0;i<size;i++){
    printf("%d  ",arr[i]);
  }
  printf("\n");
}

int main(){
  int arr[] = {1,5,98,4,75,23,76,55,99,234,7865,8786};//11
  int arr2[] = {2,576,234,97689,233,645,123,8867,456,234,568,3465,3333,2,1,9};//14
  int arr3[] = {5,4,2,3,1};//4
  printarr(arr,11);
  selection_sort(arr,11);
  printarr(arr,11);
  printarr(arr2,14);
  selection_sort(arr2,14);
  printarr(arr2,14);
  printarr(arr3,5);
  selection_sort(arr3,5);
  printarr(arr3,5);
}
