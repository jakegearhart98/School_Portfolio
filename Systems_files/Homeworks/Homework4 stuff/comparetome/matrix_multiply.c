#include <stdio.h>
#include <stdlib.h>
#include "matrix.h"

  Matrix matrix_multiply(Matrix A, Matrix B){
  Matrix C = create_matrix(A.rows, B.columns);
  for(int i = 0; i < A.rows; i++){
    for(int j = 0; j < B.columns; j++){
	for(int k =0;k<A.columns; k++){
	  C.data[i][j] += A.data[i][k] * B.data[k][j];
	} 
    }
  }
  return C;
}

/*int main(){
  Matrix in1 = create_matrix(2,2);
//printf("test2\n");
  in1.data[0][0] = 1;
  in1.data[0][1] = 2;
//  in1.data[0][2] = 3;
  in1.data[1][0] = 4;
  in1.data[1][1] = 5;
//  in1.data[1][2] = 6;
  Matrix in2 = create_matrix(3,2);
  in2.data[0][0] = 10;
  in2.data[0][1] = 11;
  in2.data[1][0] = 20;
  in2.data[1][1] = 21;
  in2.data[2][0] = 30;
  in2.data[2][1] = 31;
//printf("test3\n");

  Matrix out = matrix_multiply(in1, in2);
  print_matrix(out);
}*/
