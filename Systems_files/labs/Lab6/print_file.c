#include <stdio.h>

int main(){
  FILE *fp;
  fp = fopen("lab6.txt", "r");
  char c;
  while((c = getc(fp)) != EOF){
    printf("%c",c);
  }
  fclose(fp);
}
