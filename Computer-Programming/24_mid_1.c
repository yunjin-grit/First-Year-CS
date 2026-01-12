//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    // 코드 작성
    int N, K;

    scanf("%d %d", &N, &K);

    int ai[10];
    for (int i = 0; i < N; i++) {
        scanf("%d", &ai[i]);
    }

    int total = 0;
    int i = N;
    while (K > 0) {
        if ((K / ai[i]) >= 1)
            total += (K / ai[i]);
        K %= ai[i];
        i--;
    }

    printf("%d", total);

    return 0;
}