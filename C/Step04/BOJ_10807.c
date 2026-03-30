#include <stdio.h>

int main(void){
    int N, V, x, count = 0;

    scanf("%d", &N);

    int arr[100];
    for(int i = 0; i < N; i++){
        scanf("%d", &arr[i]);
    }

    scanf("%d", &V);

    for(int i = 0; i < N; i++){
        if(arr[i] == V){
            count++;
        }
    }

    printf("%d\n", count);

    return 0;
}