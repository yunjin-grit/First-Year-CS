//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int isPrime(int num) {
	for (int i = 2; i < num; i++) {
		if (num % i == 0) 
			return 0;
	}
	return 1;
}

int main(void)
{
	int a[20][20];
	int i, j;
	int n, m;

	scanf("%d", &n);
	scanf("%d", &m);

	for (i = 0; i < n; i++)
		for (j = 0; j < m; j++)
			scanf("%d", &a[i][j]);
	// 코드 작성
	int count;
	for (int j = 0; j < m; j++) {
		count = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i][j]))
				count++;
		}
		a[n][j] = count;
	}

	for (j = 0; j < m; j++)
		printf("%d ", a[n][j]);
}