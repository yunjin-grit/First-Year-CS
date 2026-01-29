//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

// 문자열 w2가 문자열 w1의 start위치에 있으면 1을, 아니면 0을 반환하는 함수 
int is_word_in_word(char w1[], int start, char w2[]) {
	int i = 0;
	while (w2[i] != '\0') {
		if (w1[start + i] == '\0') {
			return 0;
		}
		if (w1[start + i] != w2[i]) {
			return 0;
		}

		i++;
	}

	return 1;
}

int main(void) // main은 변경하지 말고 사용한다. 변경시 감점 
{
	char s1[20], s2[20];
	int i, j;

	scanf("%s", s1);
	scanf("%s", s2);

	for (i = 0; s1[i] != '\0'; i++)
		printf("%d", is_word_in_word(s1, i, s2));
}