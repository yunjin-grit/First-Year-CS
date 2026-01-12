//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void printTable(int t[][5], int size);

int main(void)
{
	int table1[3][5] = { {1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500} };
	int table2[2][5] = { {1, 2, 3}, {10} };

	printTable(table1, 3);
	printTable(table2, 2);

	return 0;
}

void printTable(int t[][5], int size) {
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < 5; j++) {
			printf("%4d ", t[i][j]);
		}
		printf("\n");
	}
}