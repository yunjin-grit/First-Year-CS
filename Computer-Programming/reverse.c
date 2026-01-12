//컴퓨터학과 20250492 이윤진
#define _CRT_SECURE_NO_WARNINGS
#define MAX 100
#include <stdio.h>

void reverse(int a[], int size);
void inputArray(int a[], int size);
void printArray(int a[], int size);

int main(void)
{
	int arr[MAX];
	int size;

	printf("배열 크기(최대 %d): ", MAX);
	scanf("%d", &size);

	printf("정수 입력: ");
	inputArray(arr, size);
	reverse(arr, size);
	printArray(arr, size);

	return 0;
}

void reverse(int a[], int size) {
	for (int i = 0; i < size / 2; i++) {
		int temp = a[i];
		a[i] = a[size - i - 1];
		a[size - i - 1] = temp;
	}
}

void inputArray(int a[], int size) {
	for (int i = 0; i < size; i++) {
		scanf("%d", &a[i]);
	}
}

void printArray(int a[], int size) {
	for (int i = 0; i < size; i++) {
		printf("%d ", a[i]);
	}
	printf("\n");
}