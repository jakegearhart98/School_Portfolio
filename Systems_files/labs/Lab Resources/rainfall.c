
#include <stdio.h>
#include <stdlib.h>

#define MAX 5//size of array

int main(){
  int c,i = 0;
  char str[MAX];
  double val = 0, total = 0;
  printf("Enter daily rainfall totals, one per line, use \'T\', one per line, use \'-1\' to quit:\n");
  while(val != -1 &&(c = getchar()) != EOF){

    if(c == '-'){
       if((c = getchar()) == '1'){
         val = -1;
       }

    } else if (c == '\n'){
        str[i] ='\0';
        i = 0;
        val = atof(str);
        total = total + val;
        str[0] = '\0';
    } else if (c == 'T'){
        str[i] ='\0';
        i = 0;
        val = 0.0;
        total = total + val;
        str[0] = '\0';
    } else {
        str[i] = c;
        i++;
    }
  }//end while
  printf("Total rainfall: %.2f\n",total);
}
