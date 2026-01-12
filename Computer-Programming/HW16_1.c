//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int table[8][9];
	printf("--구구단 표는 다음과 같습니다.\n");
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 9; j++) {
			table[i][j] = (i + 2) * (j + 1);
			printf("%2d ", table[i][j]);
		}
		printf("\n");
	}

	int num;
	printf("--원하는 구구단은? ");
	scanf("%d", &num);
	for (int j = 0; j < 9; j++) {
		printf("%2d ", table[num - 2][j]);
	}

	return 0;
}