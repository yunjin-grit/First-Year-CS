//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
int main(void)
{
	FILE* fp1, * fp2;

	char ch;

	fp1 = fopen("hello.txt", "r");
	if (fp1 == NULL)
	{
		printf("파일 오픈 에러입니다!!!\n");
		return 1;
	}

	fp2 = fopen("hello.out", "w");
	if (fp2 == NULL)
	{
		printf("file open error!\n");
		return 1;
	}

	ch = getc(fp1);
	while (!feof(fp1)) {
		putc(ch, fp2);
		ch = getc(fp1);
	}

	fprintf(fp2, "Hi\n");
	fprintf(fp2, "Everybody");

	fclose(fp1);
	fclose(fp2);
	return 0;
}