//컴퓨터학과 20250492 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
	int count[10];
	int num;

	for (int i = 0; i < 10; i++) {
		count[i] = 0;
	}

	printf("Enter the number of random numbers:<<=100>: ");
	scanf("%d", &num);
	srand(time(NULL));

	int data[100];
	for (int i = 0; i < num; i++) {
		data[i] = rand() % 10;
		for (int j = 0; j < 10; j++) {
			if (data[i] == j) {
				count[j]++;
			}
		}
	}

	for (int k = 0; k < 10; k++) {
		printf("%d의 개수는 %d\n", k, count[k]);
	}

	printf("----------------------------------------\n");

	printf("발생된 난수는\n");
	for (int z = 0; z < num; z++) {
		printf("%5d", data[z]);
		if ((z + 1) % 5 == 0) {
			printf("\n");
		}
	}
	
	return 0;
}