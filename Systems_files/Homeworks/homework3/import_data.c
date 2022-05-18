#include <stdio.h>
#include <stdlib.h>
#include "import_data.h"

Matrix import_data(char* string){
  FILE *fp;
  fp = fopen(string, "r");
  Matrix mat;
  double val = 0;
  int rowcount = 0, colcount = 1;
  unsigned rows, columns;
  char c;
  while((c = getc(fp)) != EOF){//get length and rows
   if(rowcount < 1){
     if(c == ' '){
      colcount++;
    }
   }
   if(c == '\n'){
    rowcount++;
   }
  }
  rows = rowcount;
  columns = colcount;

  //Create matrix
  Matrix matx;
  matx = create_matrix(rows, columns);
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
        fscanf(fp, "%lf", &val);
	matx.data[i][j] = val;
      }
    }
  fclose(fp);
  return matx;
}
