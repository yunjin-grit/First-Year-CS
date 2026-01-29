
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int solution1(char* s)
{
	// 코드 작성
	char n1[4];
	char n2[4];

	strncpy(n1, s, 3);
	n1[3] = '\0';

	strncpy(n2, s + 3, 3);
	n2[3] = '\0';

	int r1 = atoi(n1);
	int r2 = atoi(n2);

	return r1 + r2;
}

int main(void) // 변경하지 말라
{
	char s[50];

	scanf("%s", s);
	printf("%d\n", solution1(s));

	return 0;
}
