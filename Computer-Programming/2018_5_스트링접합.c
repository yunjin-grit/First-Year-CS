//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int mergeString(char c[], char a[], char b[])
{
	int i = 0;
	int j = 0;
	int k = 0;

	while (a[i] != '\0' && b[j] != '\0') {
		if (a[i] < b[j]) {
			c[k++] = a[i++];
		}
		else {
			c[k++] = b[j++];
		}
	}

	while (a[i] != '\0') {
		c[k++] = a[i++];
	}
	while (b[j] != '\0') {
		c[k++] = b[j++];
	}

	c[k] = '\0';

	return 0;
}

int main(void)
{
	char word1[10], word2[10];
	char mergedWord[20];

	scanf("%s", word1);
	scanf("%s", word2);
	mergeString(mergedWord, word1, word2);
	printf("%s\n", mergedWord);
}