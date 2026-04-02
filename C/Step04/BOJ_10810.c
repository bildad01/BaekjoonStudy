#include <stdio.h>

int main() {
    int N, M;
    int baskets[101] = {0, }; 
    int i, j, k; 

    scanf("%d %d", &N, &M);

    for (int m = 0; m < M; m++) {
        scanf("%d %d %d", &i, &j, &k);

        for (int b = i; b <= j; b++) {
            baskets[b] = k;
        }
    }

    for (int b = 1; b <= N; b++) {
        printf("%d ", baskets[b]);
    }

    return 0;
}