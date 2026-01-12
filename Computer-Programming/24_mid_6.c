//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

// 코드 작성
void reverse(char *s) {
	int len = strlen(s);

	for (int i = 0; i <= len / 2; i++) {
		char temp = s[i];
		s[i] = s[len - i - 1];
		s[len - i - 1] = temp;
	}
}

int main(void) // 변경하지 말라
{
	char src_s[100];
	char s[100];

	scanf("%s", s);
	reverse(s);
	printf("%s\n", s);
}