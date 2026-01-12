//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <stdlib.h> 
void generateData() {
	int* p = data;
	for (int i = 0; i < 10; i++) {
		data[i] = rand() % 100;
	}
}
void printData() {
	int* p = data;
	for (int i = 0; i < 10; i++) {
		printf("%d ", *p++);
	}
	printf("\n");
}
int totalData() {
	int* p = data;
	int total = 0;
	for (int i = 0; i < 10; i++) {
		total += *p++;
	}
	printf("%d\n", total);

}
int maxData() {
	int* p = data;
	int max = *p;
	for (int i = 1; i < 10; i++) {
		if (max < *++p) {
			max = *p;
		}
	}
	return max;
}
int data[10];  // 계산 수행에 사용할 전역 변수 
int main(void)
{
	srand(200);
	generateData();
	printf("발생된 10개의 난수:\n");
	printData();
	printf("10개 난수의 합 = %d \n", totalData());
	printf("10개 난수중 가장 큰 수 = %d \n", maxData());
}