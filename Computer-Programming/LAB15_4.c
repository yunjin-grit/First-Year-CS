//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <string.h>

int main(void) {
	char str[100];
	char target[100];

	scanf("%s", str);
	scanf("%s", target);

	char* p;
	int count = 0;

	p = str;
	while ((p = strstr(p, target)) != NULL) {
		count++;
		p++;
	}
		
	printf("%d", count);
	return 0;
}