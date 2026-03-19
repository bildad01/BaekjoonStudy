#include <stdio.h>

int main (void) {
    int A,B,C, total;
    scanf("%d %d", &A ,&B);
    scanf("%d",&C);

    total = A*60 +B+C;

    A= (total/60)%24;
    B= total%60;

    printf("%d %d", A,B);

    return 0;
}