#include <stdio.h>
#include <stdlib.h>
#include "matrix.h"

Matrix create_matrix(unsigned rows, unsigned columns){
  Matrix mat;
  mat.rows = rows;
  mat.columns = columns;
  mat.data = malloc(rows * sizeof(double*));
  for(int i = 0; i < columns; i++){
   mat.data[i] = calloc(columns, sizeof(double));
  }
  return mat;
}

void print_matrix(Matrix input){
  for(int i = 0; i < input.rows; i++){
    for(int j = 0; j < input.columns; j++){
      if(i == input.rows && j == input.columns){
	printf("%lf", input.data[i][j]);
      } else {
      printf("%lf ", input.data[i][j]);
      }
    }//end inner for
  printf("\n");
  }//end outter for
}

void free_matrix(Matrix input){
  for(int i = 0; i < input.rows; i++){
    free(input.data[i]);
  }
  free(input.data);
}
