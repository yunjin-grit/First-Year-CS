//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int get_cycle_number(int n)
{
	int count = 0;

	while (1) {
		printf("%d ", n);
		count++;

		if (n == 1) {
			break;
		}

		if (n % 2 == 0) {
			n /= 2;
		}
		else {
			n = n * 3 + 1;
		}
	}

	return count;
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