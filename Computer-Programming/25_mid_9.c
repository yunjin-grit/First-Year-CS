//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int isPalindrome(char* w, int start, int end)
{
	// 문자열 w의 인덱스 start부터 end까지의 부분문자열이 
	// Palindrome인 경우 1을 아닌 경우 0을 반환한다
	while (start < end) {
		if (w[start] != w[end])
			return 0;
		start++;
		end--;
	}
	return 1;
}

void makeString(char subString[], char w[], int s, int e)
{
	// 문자열 w의 인덱스 start부터 end까지의 부분문자열을 만들어 subString에 넣는다
	int k = 0;
	for (int i = s; i <= e; i++) {
		subString[k++] = w[i];
	}
	subString[k] = '\0';
}
// int longestPalindrome(char w[], char subString[]) // 이 함수를 작성 문제 #9
/*
int longestPalindrome(char w[]) // 이 함수를 작성 문제 #8
{
	int max = -1;
	int len;
	//for (len = 0; w[len] != '\0'; len++);
	len = strlen(w);

	for (int i = 0; w[i] != '\0'; i++)
		for (int j = len - 1; j >= i; j--)
			if (isPalindrome(w, i, j)) {
				// 이부분을 작성
				int c = j - i + 1;
				if (c > max)
					max = c;
			}
	return max;
}
*/
int longestPalindrome(char w[], char subString[])
{
	int max = -1;
	int len = strlen(w);
	int start = 0, end = 0;

	for (int i = 0; w[i] != '\0'; i++)
		for (int j = len - 1; j >= i; j--)
			if (isPalindrome(w, i, j)) {
				int c = j - i + 1;
				if (c > max) {
					max = c;
					start = i;
					end = j;
				}
			}

	makeString(subString, w, start, end);
	return max;
}


int main(void)
{
	char s[30];
	char subS[30];

	scanf("%s", s);

	//printf("%d\n", longestPalindrome(s)); // 문제 #8
	printf("%d\n", longestPalindrome(s, subS)); // 문제 #9
	printf("%s\n", subS);// 문제 #9
}