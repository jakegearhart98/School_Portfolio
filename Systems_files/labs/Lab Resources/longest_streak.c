//Jacob Gearhart
#include "longest_streak.h"
//#include <stdio.h>
unsigned longest_streak(int arr[], unsigned size){
  int count = 1;
  int streak = 1;

  if(size == 0){
    return 0;
  }

  for(int i=1;i< size;i++){
    if(arr[i] == arr[i-1]){
      count = count + 1;
    }
    if(arr[i] != arr[i-1]){
      count = 1;
    }
    if(count > streak){
      streak = count;
    }
  }//end for
  return streak;
}
/*int main(){
  int arr[] = {1,2,3,2,1,1,1,1,1,1};
  printf("%u\n",longest_streak(arr,10));
}*/
