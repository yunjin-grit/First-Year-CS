//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	FILE* fp1, * fp2;
	int ch;

	fp1 = fopen("input.txt", "r");
	if (fp1 == NULL)
	{
		printf("파일 오픈 에러… !!!\n");
		return 1;
	}

	fp2 = fopen("output.txt", "w");
	if (fp2 == NULL)
	{
		printf("파일 오픈 에러… !!!\n");
		return 1;
	}

	
	while ((ch = getc(fp1)) != EOF) {
		if (ch >= 'a' && ch <= 'z') 
			ch -= 32;
		fputc(ch, fp2);
	}
	fclose(fp1);

	fp1 = fopen("input.txt", "r");
	if (fp1 == NULL)
	{
		printf("파일 오픈 에러… !!!\n");
		return 1;
	}

	fputc('\n', fp2);

	while ((ch = getc(fp1)) != EOF){
		if (ch >= 'A' && ch <= 'Z')
			ch += 32;
		fputc(ch, fp2);
	}

	fclose(fp1);
	fclose(fp2);
	
	return 0;
}