//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int get_cycle_number(int n)
{
	printf("%d ", n);

	if (n == 1) return 1;
	else {
		if (n % 2 == 0) {
			return 1 + get_cycle_number(n /= 2);
		}
		else {
			return 1 + get_cycle_number(n * 3 + 1);
		}
	}
}


int main(void)
{
	printf("정수를 입력하세요: ");
	int n;
	scanf("%d", &n);

	int result = get_cycle_number(n);
	printf("\n사이클 길이: %d", result);

	return 0;
}