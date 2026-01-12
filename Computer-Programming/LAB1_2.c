//컴퓨터학과 20250492 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
	int data[100];
	int num, i;

	srand(time(NULL));

	printf("Enter the number of random numbers:(<<=50) : ");
	scanf("%d", &num);

	int max;
	max = -1;

	for (int i = 0; i < num; i++) {
		data[i] = rand() % 100;
		if (data[i] > max) {
			max = data[i];
		}
	}

	printf("최대값은 %d\n", max);
	printf("---------------------------------------------\n");
	printf("발생된 난수는\n");
	for (int j = 0; j < num; j++) {
		printf("%5d", data[j]);
		if ((j + 1) % 5 == 0) {
			printf("\n");
		}
	}

	return 0;
}