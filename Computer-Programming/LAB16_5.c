//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void initTable(int a[][5], int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 5; j++) {
			a[i][j] = rand() % 100;
		}
	}
}

int totalTable(int a[][5], int n) {
	int total = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 5; j++) {
			total += a[i][j];
		}
	}
	return total;
}

void printTable(int a[][5], int n) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 5; j++) {
			printf("%4d ", a[i][j]);
		}
		printf("\n");
	}
}

int main(void)
{
	int table[3][5];
	int i, j;
	int total = 0;

	srand(time(NULL));

	initTable(table, 3);
	printf("발생된 난수의 평균은 %d입니다\n", totalTable(table, 3) / 15);

	printTable(table, 3);

	return 0;
}