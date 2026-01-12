//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int isPrime(int n);

int main(void)
{
	int num;
	scanf("%d", &num);

	while (num != -1) {
		if (isPrime(num) == 1) {
			printf("소수입니다");
		}
		else {
			printf("소수가아닙니다");
		}
		printf("\n");
		scanf("%d", &num);
	}
	
	return 0;
}

int isPrime(int n) {
	if (n < 2) {
		return 0;
	}

	for (int i = 2; i < n; i++) {
		if (n % i == 0) {
			return 0;
		}
	}
	return 1;
}