
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int solution0(char* s)
{
	// 코드 작성
	char s2[4];
	int r;
	strncpy(s2, s, 3);
	s2[3] = '\0';
	r = atoi(s2);

	return r * 9;
}

int main(void)
{
	char s[50];

	scanf("%s", s);
	printf("%d\n", solution0(s));

	return 0;
}