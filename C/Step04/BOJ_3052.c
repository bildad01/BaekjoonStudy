#include <stdio.h>

int main(void) {
    int arr[42] = {0};
    int num, remainder;
    int count = 0;

    for (int i = 0; i < 10; i++) {
        scanf("%d", &num);
        remainder = num % 42;

        if (arr[remainder] == 0) {
            arr[remainder] = 1;
            count++;
        }
    }

    printf("%d\n", count);

    return 0;
}