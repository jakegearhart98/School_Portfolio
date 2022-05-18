
#include <stdio.h>

int main(){
  int in;
  int count;
  int size = 5;
  int vals[5] = {0,0,0,0,0};
  count = 0;
  printf("Enter five digits, one at a time:\n");
  in = getchar();
  while(count < size && in != EOF){
//    vals[count] = in;

    if(in >= '1' && in <= '9'){
      vals[count] = in;
    } else {
      vals[count] = '0';
    }
    if (in != '\n'){
      ++count;
    }
   in = getchar();
  }
  printf("vals contains:\n");
  for(int i=0; i<size; i++){
    printf("vals[%i]=%i, square=%u\n",i,vals[i]-48,(vals[i]-48)*(vals[i]-48));
  }
//    printf("\n");
}
