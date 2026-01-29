//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int main(void) {
	char s[100];
	char p[100];

	scanf("%s", s);
	scanf("%s", p);

	char* n;
	n = strstr(s, p);
	if (n == NULL)
		printf("NO");
	printf("YES %d", n - s);
}