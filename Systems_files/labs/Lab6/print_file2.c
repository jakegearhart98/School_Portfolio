#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
  FILE *fp;
  if(argv[2] == NULL){
    fprintf(stderr, "No file name provided\n");
    exit(1);
  }
  fp = fopen(argv[2], "r");

  if(fp == NULL){
    fprintf(stderr, "Not a valid file name\n");
    exit(1);
  } else {
    char c;
    while((c = getc(fp)) != EOF){
      printf("%c",c);
   }
   fclose(fp);
  }

 /* char c;
//  if(argc == 1){
  while((c = getc(fp)) != EOF){
    printf("%c",c);
  }
//  }*/
//  fclose(fp);
  exit(0);
}
