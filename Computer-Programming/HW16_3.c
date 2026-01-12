//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int gradeTable[5][4] = { {10, 15, 20, 0}, {30, 35, 20, 0}, {60, 65, 20, 0}, {90, 95, 20, 0}, {0, 0, 0, 0} };
	int i, j;

	printf("a)\n");
	for (i = 0; i < 5; i++) {
		for (j = 0; j < 4; j++) {
			printf("%4d", gradeTable[i][j]);
		}
		printf("\n");
	}

	printf("\nb)\n");
	for (i = 0; i < 4; i++) {
		int total = 0;
		for (j = 0; j < 3; j++) {
			total += gradeTable[i][j];
		}
		gradeTable[i][3] = total;
	}
	for (j = 0; j < 3; j++) {
		int total = 0;
		for (i = 0; i < 4; i++) {
			total += gradeTable[i][j];
		}
		gradeTable[4][j] = total;
	}
	
	for (i = 0; i < 5; i++) {
		for (j = 0; j < 4; j++) {
			printf("%4d ", gradeTable[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}