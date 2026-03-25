#include <stdio.h>

int main() {
    int T;
    scanf("%d", &T);

    int A, B;
    while (T--) {
        scanf("%d %d", &A, &B);
        printf("%d\n", A + B);
    }

    return 0;
}