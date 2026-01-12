//컴퓨터학과 20250492 이윤진
#define _CRT_SECURE_NO_WARNINGS
#define MAX 100
#include <stdio.h>

int isSameArray(int a[], int b[], int aSize, int bSize);

int main(void)
{
	int aSize, bSize;
	int a[MAX];
	int b[MAX];

	printf("첫번째 배열 크기(최대 %d): ", 100);
	scanf("%d", &aSize);

	printf("정수 입력");
	for (int i = 0; i < aSize; i++) {
		scanf("%d", &a[i]);
	}
	
	printf("두번째 배열 크기(최대 %d): ", 100);
	scanf("%d", &bSize);

	printf("정수 입력");
	for (int i = 0; i < bSize; i++) {
		scanf("%d", &b[i]);
	}
	
	if (isSameArray(a, b, aSize, bSize) == 0) {
		printf("두 배열은 다릅니다.");
	}
	else {
		printf("두 배열은 같습니다.");
	}

	return 0;
}

int isSameArray(int a[], int b[], int aSize, int bSize) {
	if (aSize != bSize) {
		return 0;
	}

	for (int i = 0; i < aSize; i++) {
		if (a[i] != b[i]) {
			return 0;
		}
	}

	return 1;
}