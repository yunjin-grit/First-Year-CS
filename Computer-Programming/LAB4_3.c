//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

void swap(int* a, int* b) {
    // 여기에 코드를 작성하세요
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int x = 3, y = 7;
    swap(&x, &y);
    printf("%d %d\n", x, y); // 출력: 7 3
}