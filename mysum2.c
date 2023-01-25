#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main(int argc, char *argv[]) {
    int i, sum = 0;
    for(i=1; i < argc; i++){
        sum = atoi(argv[1]) + atoi(argv[2]);
    }
    sum = sum * 5;

printf("%s + ... + %s  = %d\n", argv[1],argv[2], sum);

}