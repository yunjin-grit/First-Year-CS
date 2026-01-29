#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int solution2(char* s)
{
	// 코드 작성
	int len = strlen(s);
	int sum = 0;
	int count = 1;

	while (len > 0) {
		char temp[50];
		int k = count;

		if (k > len) {
			k = len;
		}

		strncpy(temp, s, k);
		temp[k] = '\0';
		sum += atoi(temp);

		s += k;
		len -= k;
		count++;
	}
	return sum;
}
int main(void)
{
	char s[50];

	scanf("%s", s);
	printf("%d\n", solution2(s));

	return 0;
}
