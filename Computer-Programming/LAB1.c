//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int sum(int n) {
	if (n == 0)
		return 0;
	int s = sum(n - 1);
	printf("%d ", n * 10 + 2);
	return s + (n * 10 + 2);
}

int print(int n) {

}

int main(void)
{
	int n;
	scanf("%d", &n);

	int s = sum(n);
	printf("\n");
	printf("%d", s);

	return 0;
}