#include <stdio.h>

int main(void){
    char str[101];
    scanf("%s", str);

    int pos[26];

    for(int i = 0; i < 26; i++){
        pos[i] = -1;
    }

    for(int i = 0; str[i] != '\0'; i++){
        int idx = str[i] - 'a';   

        if(pos[idx] == -1){       
            pos[idx] = i;
        }
    }

    for(int i = 0; i < 26; i++){
        printf("%d ", pos[i]);
    }

    return 0;
}