#include <stdio.h>

int main(void){
    int T;
    scanf("%d", &T);

    while(T--){
        int R;
        char str[21];
        
        scanf("%d %s", &R, str);

        for(int i = 0; str[i] != '\0'; i++){
            for(int j = 0; j < R; j++){
                printf("%c", str[i]);
            }
        }
        printf("\n");
    }

    return 0;
}