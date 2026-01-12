//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
//version 3
int sumUp(int* pa, int size)
{
	int i, sum = 0;
	for (i = 0; i < size; i++)
		sum += *pa++;
	return sum;
}
int main(void)
{
	int arr[5] = { 10, 20, 30, 40, 50 };
	printf("arr의 합은 %d\n", sumUp(arr, 5)); 
	// arr = &arr[0] 
}