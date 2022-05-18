
#include <stdio.h>

int is_palindrome(char str[]){
  int size = 0, count = 0;//decrement by one when max value, use for loop iteraror for 1 and up
  while(str[count] != '\0'){//determine size
    count++;
  }
  size = count;
  char opp[size];

  for(int i=0;i<size;i++){//copies str[] backwards
    opp[i] = str[count - 1];
    count--;
  }

  opp[size]='\0';//appends end to opp

  for(int i = 0; i<size+1;i++){
    if(opp[i] != str[i]) {
      return 0;
    }
    if(opp[i] == '\0' && str[i] == '\0') {
      return 1;
    }
}
/*  for(int i=0;i<size+1;i++){
    printf("%c",opp[i]);
}*/
  return 0;
}

int main(){
  char str1[] = {'m','o','m','\0'};
  char str2[] = {'f','a','t','h','e','r','\0'};
  char str3[] = {'y','e','s','\0'};
  char str4[] = {'p','e','a','c','e','\0'};
  char str5[] = {'t','a','t','t','a','r','r','a','t','t','a','t','\0'};
}
