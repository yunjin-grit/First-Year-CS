//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#define NUMBER 10 

int main(void)
{
	int a[NUMBER], b[NUMBER] = { 0 };
	int i;

	for (i = 0; i < NUMBER; i++)
		scanf("%d", &a[i]);

	// 여기에 코드 작성 b에 이웃 원소의 합을 넣는다 

	for (int i = 0; i < NUMBER; i++) {
		if (i == 0) {
			b[i] = a[i + 1];
		}
		else if (i == NUMBER - 1) {
			b[i] = a[i - 1];
		}
		else {
			b[i] = a[i - 1] + a[i + 1];
		}
	}


	for (i = 0; i < NUMBER; i++)
		printf("%d ", b[i]);
	printf("\n");
}