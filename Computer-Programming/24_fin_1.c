
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <ctype.h>

int countDigits(char* p) // 이 함수를 작성
{
	int count = 0;
	// 이를 작성
	while (*p != '\0') {
		if (*p >= '0' && *p <= '9') {
			count++;
		}
		p++;
	}
	return count;
}
int main(void) // 변경하지 말라
{
	char str[20];

	scanf("%s", str);

	printf("%d\n", countDigits(str));
}