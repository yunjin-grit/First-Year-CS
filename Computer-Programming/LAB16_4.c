//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int test[4][3] = { {8, 7}, {6, 5}, {1, 2}, {3, 4} };
	printf("배열 test의 엘리먼트를 출력합니다.\n");
	for (int i = 0; i < 4; i++) {
		printf("\n%d번째 row: ", i + 1);
		for (int j = 0; j < 3; j++) {
			printf("%d ", test[i][j]);
		}
	}
	for (int i = 0; i < 4; i++) {
		test[i][2] = -1;
	}

	printf("\n\n다>\n배열 test의 엘리먼트를 출력합니다.\n");
	int i, j;
	int total = 0;
	for (i = 0; i < 4; i++) {
		printf("\n%d번째 row: ", i + 1);
		for (j = 0; j < 3; j++) {
			printf("%d ", test[i][j]);
			total += test[i][j];
		}
	}

	printf("\n\n라>\nTotal is %d", total);
	printf("\nAverage is %.2f", total / (double)12);

	printf("\n\n마>");
	int sum = 0;
	for (int i = 0; i < 4; i++) {
		int max = -2;
		for (int j = 0; j < 3; j++) {
			if (max < test[i][j]) {
				max = test[i][j];
			}
		}
		sum += max;
		printf("\n%d번째 row에서의 최대값: %d", i + 1, max);
	}
	printf("\n최대값의 합: %d", sum);

	return 0;
}