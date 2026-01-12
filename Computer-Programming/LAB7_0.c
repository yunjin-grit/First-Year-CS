//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	char c = 'A';
	int n = 100;
	double d = 3.14;
	char* pC;
	int* pN;
	double* pD;
	pC = &c;
	pN = &n;
	pD = &d;
	// c, pC, *pC, n, pN, *pN, d, pD, *pD에 어떤 수가 들어가나 예상 후
	// 조사식창에 위의 이름들을 입력하여 확인
	// c: 'A' pC: fb54 *pC: 'A'
	// n: 100 pN: fb74 *pN: 100
	// d: 3.14 pD: f87c *pD: 3,14
	*pC = 'Z';
	*pN = 199;
	*pD = 3.1415;
	pC++;
	pN++;
	pD++;
	// pC, pN, pD의 값이 어떻게 바뀌었는가?
	// pC: fb55 pN:fb78 pD:f884
	pC = pC + 2;
	pN = pN + 2;
	pD = pD + 2;
	// pC, pN, pD의 값이 어떻게 바뀌었는가?
	// pC: fb57 pN:fb80 pD:f894
}