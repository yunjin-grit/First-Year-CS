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
	int count;
	int i = 0;
	while (i < size) {
		count = 0;
		printf("집합에 추가할 원소: ");
		scanf("%d", &n);
		for (int z = 0; z < i; z++) {
			if (n == set[z]) {
				count = 1;
				printf("%d는 이미 집합에 있음\n", n);
				break;
			}
		}
		if (count == 0) {
			set[i] = n;
			i++;
			printf("{ ");
			for (int j = 0; j < i; j++) {
				printf("%d", set[j]);
				if (j != i-1) {
					printf(", ");
				}
			}
			printf(" }\n");
		}
	}
}