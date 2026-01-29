//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void) {
    int a, b, c;
    char buf[100];

    scanf("%d %d %d", &a, &b, &c);

    sprintf(buf, "%d, %d, %d", a, b, c);

    printf("%s\n", buf);

    return 0;
}