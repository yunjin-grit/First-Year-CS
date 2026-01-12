//컴퓨터학과 20250492 이윤진
#define _CRT_SECURE_NO_WARNINGS
#define MAX 100
#include <stdio.h>

int searchKeyInArray(int a[], int size, int searchKey);

int main(void)
{
	printf("배열크기(최대 %d): ", MAX);
	int size;
	scanf("%d", &size);
	int array[MAX];

	printf("정수 입력: ");
	for (int i = 0; i < size; i++) {
		scanf("%d", &array[i]);
	}

	int key;
	printf("찾을 값 입력: ");
	scanf("%d", &key);

	if (searchKeyInArray(array, size, key) != -1) {
		printf("인덱스값: %d", searchKeyInArray(array, size, key) + 1);
	}
	else {
		printf("존재하지 않는다");
	}

	return 0;
}

int searchKeyInArray(int a[], int size, int searchKey) {
	for (int i = 0; i < size; i++) {
		if (a[i] == searchKey) {
			return i;
		}
	}
	return -1;
}