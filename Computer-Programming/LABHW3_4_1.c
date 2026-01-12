//컴퓨터학과 20250492 이윤진
#define _CRT_SECURE_NO_WARNINGS
#define SIZE 5
#include <stdio.h>

void printSet(int size, int set[]);

int main(void)
{
	int multiset[SIZE];
	printSet(SIZE, multiset);

	return 0;
}

void printSet(int size, int set[]) {
	int n;
	for (int i = 0; i < size; i++) {
		printf("다중집합에 추가할 원소: ");
		scanf("%d", &n);
		set[i] = n;
		printf("{ ");
		for (int j = 0; j <= i; j++) {
			printf("%d", set[j]);
			if (j != i) {
				printf(", ");
			}
		}
		printf(" }\n");
	}
}