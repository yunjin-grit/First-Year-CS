#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <ctype.h>

int digits(char* p1, char* p2) // 이 함수를 작성
{
	int sum = 0;
	// 코드 작성
	while (*p1 != '\0') {
		if (*p1 >= '0' && *p1 <= '9') {
			sum += *p1 - '0';
			*p2 = *p1;
			p2++;
		}
		p1++;
	}
	*p2 = '\0';	
	return sum;
}
int main(void) // 변경하지 말라
{
	char str1[20], str2[20];

	scanf("%s", str1);

	printf("%d\n", digits(str1, str2));
	printf("%send\n", str2);
}