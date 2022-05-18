#include <stdio.h>
#include <stdlib.h>

#include "matrix.h"
#include "write_pgm.h"

void write_pgm(Matrix matr, char* filename){
  int largest = -256, scale = 0;
  FILE *out;
  out = fopen(filename, "w");//w for write permissions
//  printf("testing test\n");
  fprintf(out, "P2\n");
  fprintf(out, "%i %i\n", matr.columns, matr.rows);//width height
  fprintf(out, "255\n");

/*  for(int i = 0; i < matr.rows; i++){//finds largest to get scale
    for(int j = 0; j < matr.columns; j++){
      if(matr.data[i][j] > largest){
printf("value: %c\n", i);
	largest = matr.data[i][j];
      }
    }
  }

  scale = (254 - largest);
*/
  for(int i = 0; i < matr.rows; i++){
    for(int j = 0; j < matr.columns; j++){
      fprintf(out, "%i ", (int)matr.data[i][j]);
    }
    fprintf(out, "\n");
  }
  fclose(out);
}
