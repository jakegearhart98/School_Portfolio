#include <stdio.h>
#include <stdlib.h>
#include "matrix.h"
#include "import_data.h"
#include "write_pgm.h"

void write_pgm(Matrix matx, char* filename);

int main(int argc, char *argv[]){
  Matrix matri = import_data(argv[1]);
  write_pgm(matri, argv[2]);
}
