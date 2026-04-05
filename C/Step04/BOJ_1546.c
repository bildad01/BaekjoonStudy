#include <stdio.h>

int main(void) {
    int n;
    scanf("%d", &n);

    int score[1000];
    int max = 0;
    double sum = 0;

    for (int i = 0; i < n; i++) {
        scanf("%d", &score[i]);
        if (score[i] > max) {
            max = score[i];
        }
    }

    for (int i = 0; i < n; i++) {
        sum += (double)score[i] / max * 100;
    }

    printf("%.6f\n", sum / n);

    return 0;
}