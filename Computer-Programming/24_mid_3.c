//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int toBinary(int n) // 이 함수를 *재귀적*으로 제출
{
	// 코드 작성
	if (n == 0 || n == 1) {
		printf("%d", n);
		return 1;
	}

	int len = 1+toBinary(n / 2);
	printf("%d", n % 2);

	return len;
}
int main(void) // 변경하지 말라
{
	int n;
	scanf("%d", &n);

	printf("\n%d\n", toBinary(n));
}