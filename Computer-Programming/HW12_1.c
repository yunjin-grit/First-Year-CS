//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h> 
#include <time.h>

int main(void)
{
	FILE* fp1, * fp2;

	fp1 = fopen("random.txt", "w");
	if (fp1 == NULL)
	{
		printf("파일 오픈 에러… !!!\n");
		return 1;
	}

	int num;
	for (int i = 0; i < 10; i++) {
		num = rand() % 100;
		fprintf(fp1, "%d\n", num); 
	}

	fclose(fp1);

	fp1 = fopen("random.txt", "r");
	if (fp1 == NULL)
	{
		printf("파일 오픈 에러… !!!\n");
		return 1;
	}

	int sum = 0;
	while (!feof(fp1))
	{
		if (fscanf(fp1, "%d", &num) == 1) {
		printf("\t%d", num);
		sum += num;
		}
	}
	printf("\n합은 %d", sum);
	fclose(fp1);

	fp2 = fopen("output.txt", "w");
	if (fp2 == NULL)
	{
		printf("파일 오픈 에러… !!!\n");
		return 1;
	}

	fp1 = fopen("random.txt", "r");
	if (fp1 == NULL)
	{
		printf("파일 오픈 에러… !!!\n");
		return 1;
	}

	while (!feof(fp1)) {
		if (fscanf(fp1, "%d", &num) == 1) {
			fprintf(fp2, "%d\n", num);
		}
	}

	fprintf(fp2, "합은 %d", sum);

	fclose(fp1);
	fclose(fp2);
	return 0;
}