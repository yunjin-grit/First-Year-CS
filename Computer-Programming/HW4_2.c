//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int fibo(int n);

int main(void)
{
	int n, idx;
	printf("몇개의 피보나치 수열값을 출력할까요?(3보다 큰 정수):");
	scanf("%d", &n);
	for (idx = 0; idx < n; idx++)
	{
		printf("%d ", fibo(idx));
		if ((idx + 1) % 5 == 0)
			printf("\n");
	}
	printf("\n");
}

int fibo(int n) {
	int a = 1;
	int b = 1;
	int temp;

	if (n == 0 || n == 1) {
		return 1;
	}

	for (int i = 2; i <= n; i++) {
		temp = a + b;
		a = b;
		b = temp;
	}

	return b;
}