//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	FILE* fp;
	char ch;
	fp = fopen("hello.out", "w");
	if (fp == NULL)
	{
		printf("file open error!\n");
		return 1;
	}
	fprintf(fp, "Hello\n");
	fprintf(fp, "World");
	fclose(fp);

	fp = fopen("hello.out", "r");
	if (fp == NULL)
	{
		printf("file open error!\n");
		return 1;
	}
	ch = getc(fp);
	while (!feof(fp)) {
		putc(ch, stdout);
		ch = getc(fp);
	}
	fclose(fp);

	return 0;
}