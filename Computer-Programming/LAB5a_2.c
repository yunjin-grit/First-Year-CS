//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define SIZE 4

void fillArray(int array[][SIZE]);
void printArray(int array[][SIZE]);
void rotate(int array1[][SIZE], int array2[][SIZE]);

int main(void)
{
	int A[SIZE][SIZE];
	int B[SIZE][SIZE];

	fillArray(A);
	printArray(A);

	printf("\n");

	rotate(A, B);
	printArray(B);

	return 0;
}

void fillArray(int array[][SIZE]) {
	int num = 1;
	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			array[i][j] = num;
			num++;
		}
	}
}

void printArray(int array[][SIZE]) {
	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			printf("%2d ", array[i][j]);
		}
		printf("\n");
	}
}

void rotate(int array1[][SIZE], int array2[][SIZE]) {
	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			array2[j][SIZE - 1 - i] = array1[i][j];
		}
	}
}