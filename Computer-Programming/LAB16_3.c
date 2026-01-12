//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int a[5];
	int n;
	for (int i = 0; i < 5; i++) {
		printf("다중 집합에 추가할 원소: ");
		scanf("%d", &n);
		a[i] = n;
		printf("{ ");
		for (int j = 0; j <= i; j++) {
			printf("%d ", a[j]);
			if (j != i) {
				printf(", ");
			}
		}
		printf("}");
	}
	


	return 0;
}