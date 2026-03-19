#include <stdio.h>

int main(void){
    int A,B,C;
    scanf("%d %d %d", &A, &B, &C);

    int max = A;
    if (B>max){
        max = B;
    }
    if (C>max){
        max = C;
    }
    


    if (A==B && B==C){
        printf("%d", 10000+A*1000);}
    else if (A==B || A==C){
        printf("%d", 1000+A*100);}
    else if (B==C){
        printf("%d", 1000+B*100);}
    else {
        printf("%d", max*100);
    }
    return 0;
}