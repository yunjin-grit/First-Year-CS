//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

// 필요한 함수(들)의 정의를 작성한다
int isDrunkenPasswd(char passwd[20], char userPasswd[20]) {
	int check;
	for (int i = 0; passwd[i] != '\0'; i++) {
		check = 0;
		for (int j = 0; userPasswd[j]; j++) {
			if (passwd[i] == userPasswd[j]){
				check = 1;
				break;
			}
		}
		if (check == 0) {
			return 0;
		}
	}
	return 1;
}

int main(void) // 변경하지 말라
{
	char passwd[20], userPasswd[20];
	scanf("%s", passwd);

	for (int i = 0; i < 5; i++) {
		scanf("%s", userPasswd);
		printf("%d\n", isDrunkenPasswd(passwd, userPasswd));
	}
}