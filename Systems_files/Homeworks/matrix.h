#ifndef H_G
#define H_G

typedef struct matrix{
  unsigned rows;
  unsigned columns;
  double** data;
}Matrix;

Matrix create_matrix(unsigned rows, unsigned columns);
void print_matrix(Matrix input);
void free_matrix(Matrix input);

#endif
