//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

// 코드 작성
void reverse(char n[]) {
	int len = strlen(n);

	for (int i = 0; i <= len / 2; i++) {
		char temp = n[i];
		n[i] = n[len - i - 1];
		n[len - i - 1] = temp;
	}
}

int add_carry(char n1[], char n2[], char r[]) {
	int len1 = str(n1);
	int len2 = str(n2);
	char max;

	if (len1 > len2)
		max = len1;
	else
		max = len2;

	int carry = 0;
	for (int i = 0; i < strlen(max); i++) {
		if ((n1[i] + n2[i]) >= 10) {
			carry++;
			r[i] -= 10;
		}
	}
	
}

int main(void) // 변경하지 말라
{
	char result[101];
	char num1[101] = { 0 };
	char num2[101] = { 0 };

	scanf("%s %s", num1, num2);
	reverse(num1);
	reverse(num2);

	printf("%d\n", add_carry(num1, num2, result));
	reverse(result);
	printf("%s\n", result);
}