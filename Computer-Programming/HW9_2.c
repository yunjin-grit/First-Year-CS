//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	printf("주민등록번호 입력: ");
	char str[50];

	fgets(str, sizeof(str), stdin);
	char yearStr[3];
	strncpy(yearStr, str, 2);
	yearStr[2] = '\0';
	int year = atoi(yearStr) + 1900;

	printf("당신 %d년도 생이군요.\n", year);

	if (str[7] == '1') {
		printf("당신은 남자\n");
		printf("평균 수명 더하면 당신은 %d까지 살아", 77 + year);
	}
	if (str[7] == '2') {
		printf("당신은 여자\n");
		printf("평균 수명 더하면 당신은 %d까지 살아", 84 + year);
	}
}

/*
strcat(dest, src) 는
dest에서 '\0'을 찾은 위치부터 src를 이어 붙여.

//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	char str[50];
	char yearStr[3];
	printf("주민등록번호 입력<'-'포함>:");
	fgets(str, sizeof(str), stdin);

	strncpy(yearStr, str, 2);

	yearStr[2] = '\0';
	int year = 1900 + atoi(yearStr);

	printf("당신은 %d년도 생이군요\n", year);
	if (str[7] == '1') {
		printf("남자분이시군요.\n");
		printf("평균 수명 77를 더하면 %d까지 산다고 계산됩니다.", year + 77);
	}
	else {
		printf("여자분이시군요.\n");
		printf("평균 수명 84를 더하면 %d까지 산다고 계산됩니다.", year + 84);
	}

}
*/