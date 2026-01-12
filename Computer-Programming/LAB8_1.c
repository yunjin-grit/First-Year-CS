//컴퓨터학과 1학년 이윤진
#define _CRT_SEUCRE_NO_WARNINGS
#include <stdio.h> 

void add_two(int x, int y, int *s)
{
	*s = x + y;
}

void main()
{
	int a = 20, b = 30;
	int sum;
	add_two(a, b, &sum);
	printf("a = %d b = %d sum = %d\n", a, b, sum);
}