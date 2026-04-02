#include <stdio.h>

int main() {
    int N, M;
    int baskets[101];
    int i, j, temp;

    scanf("%d %d", &N, &M);

    for (int b = 1; b <= N; b++) {
        baskets[b] = b;
    }

    for (int m = 0; m < M; m++) {
        scanf("%d %d", &i, &j);

        temp = baskets[i];
        baskets[i] = baskets[j];
        baskets[j] = temp;
    }

    for (int b = 1; b <= N; b++) {
        printf("%d ", baskets[b]);
    }

    return 0;
}