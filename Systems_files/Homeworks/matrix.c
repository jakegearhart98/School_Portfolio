//Jacob Gearhart

//#include "matrix.h"
#include <stdio.h>
#include <stdlib.h>
#include "matrix.h"

Matrix create_matrix(unsigned rows, unsigned columns){
  double** data = malloc(rows * sizeof(double));
  for(int i = 0; i < columns; i++){
    data[i] = calloc(columns, sizeof(double));
  }
  Matrix mat;
//  mat = malloc(sizeof(Matrix));
  mat.rows = rows;
  mat.columns = columns;
  mat.data = data;
  return mat;
}

void print_matrix(Matrix input){
  for(int i = 0; i < input.rows; i++){//NEED to add check for last
    for(int j = 0; j < input.columns; j++){
      if(i == input.rows - 1 && j == input.columns - 1){
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
}
