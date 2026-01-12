//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int table[5][3] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

	int total = 0;
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
			total += i + j;
		}
	}
	
	printf("Total is %d", total);

	return 0;
}