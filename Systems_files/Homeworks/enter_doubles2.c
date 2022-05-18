
#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include "mean_and_var.h"

#define SIZE 100
#define BUFSIZE 100

char buf[BUFSIZE];
int bufp=0;

int getch(void) /* get a (possibly pushed back) character */
{
    if (bufp > 0)
    {
        return buf[--bufp];
    }
    else
    {
        return getchar();
    }
}

void ungetch(int c) /* push character back on input */
{
    if (bufp >= BUFSIZE)
    {
        printf("ungetch: too many characters\n");
    }
    else
    {
        buf[bufp++] = c;
    }
    
}

/* getint: get next integer from input to *pn */
double getdouble(double *pn)
{
    int c, sign;
    double pow;//need this so you can "make" the decimals, mults by 10

    while (isspace(c = getch()))  // skip whitespace
        ;
    
    if (!isdigit(c) && c != EOF && c != '+' && c != '-' && c != '.') {
        ungetch(c);//input can be any digit or these ^^^^
        return 0;
    }
    sign = (c == '-') ? -1 : 1;//i still dont know what you do

    if (c == '+' || c == '-')
        c = getch();

    for (*pn = 0.0; isdigit(c); c = getch()) {
        *pn = 10 * *pn + (c - '0');
    }

    if(c == '.'){//if a decimal is found skip get next
      c = getch();
    }
	/*if(c == EOF){    EOF needs to be first check not this
	return EOF; 
	 }*/
    for(pow = 1.0; isdigit(c); c = getch()){
      *pn = 10 * *pn + (c - '0');
      pow = pow * 10;
    }

    *pn *= sign;
    *pn /= pow;//divides pn by power so the decimal gets put in the right spot
    if (c != EOF) {
        ungetch(c);
    }
    return c;
}
//Jacob Gearhart
int main() {
    int count, in;
    int n = 0;
    double* arr;
    int capacity = 2;
    arr = (double*)malloc(capacity * sizeof(double));
    //Found this outter loop in book
    for(int i = 0; n <= capacity && getdouble(&arr[i]) != EOF; i++){
      if(n >= capacity){
        capacity = capacity + capacity;
	arr = realloc(arr, capacity * sizeof(double));
      }
    n++;
    }

    printf("capacity=%i\n",capacity);
    printf("n=%i\n",n);

    for(int i = 0; i < n; i++){
      printf("array[%i]=%lf\n",i,arr[i]);
    }
    printf("mean=%lf\n",mean(arr, n));
    printf("variance=%lf\n",var(arr, n));
    free(arr);
}


