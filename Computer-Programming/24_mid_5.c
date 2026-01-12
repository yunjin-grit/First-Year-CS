//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

// 필요하면 새로운 함수를 추가한다

int isPrime(int n) {
	for (int i = 2; i < n; i++) {
		if (n % i == 0) 
			return 0;
	}
	return 1;
}

int processPrime(int* p, int size) // 이 함수를 작성
{
	// 코드를 작성: 포인터 p를 사용하여
	int sum = 0;

	for (int i = 0; i < size; i++) {
		if (isPrime(*p)) {
			printf("%d ", *p);
			sum += *p;
		}
		p++;
	}

	return sum;
}

int main(void) // 변경하지 마라. 
{
	int i;
	int n;
	int data[50];

	scanf("%d", &n);
	for (i = 0; i < n; i++)
		scanf("%d", &data[i]);
	printf("end\n%d\n", processPrime(data, n));
}