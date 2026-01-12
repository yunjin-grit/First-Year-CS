//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int addEachEvenRec(int n) // 이 함수를 작성 
{
	if (n == 0) return 0;
	else {
		int digit = n % 10;
		if (digit % 2 == 0) {
			return digit + addEachEvenRec(n / 10);
		}
		else {
			return addEachEvenRec(n / 10);
		}
	}
		
}

int main(void) // 변경하지 말라 
{
	int num;
	scanf("%d", &num);
	printf("%d\n", addEachEvenRec(num));
}