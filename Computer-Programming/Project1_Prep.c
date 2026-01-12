//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#define MAX_SET_SIZE 10 
#define HAVE_ELEMENT 1 
#define DO_NOT_HAVE_ELEMENT 0 
#include <stdio.h>

int hasElement(int set[], int size, int element)
{
	int i;
	for (i = 0; i < size; i++)
		if (set[i] == element)
			return HAVE_ELEMENT;
	return DO_NOT_HAVE_ELEMENT;
}


void printSet(int set[], int size)
{
	printf("{ ");
	for (int i = 0; i < size; i++) {
		printf("%d", set[i]);
		if (i != size - 1) {
			printf(", ");
		}
	}
	printf(" }\n");
}

int isSetEqual(int set1[], int size1, int set2[], int size2)
{
	for (int i = 0; i < size1; i++) {
		if (hasElement(set2, size2, set1[i]) == DO_NOT_HAVE_ELEMENT) {
			return 0;
		}
	}

	for (int i = 0; i < size2; i++) {
		if (hasElement(set1, size1, set2[i]) == DO_NOT_HAVE_ELEMENT) {
			return 0;
		}
	}

	return 1;
}

int addOneElement(int set[], int size, int element)
{
	if (hasElement(set, size, element) == DO_NOT_HAVE_ELEMENT) {
		set[size] = element;
		size++;
	}
	else {
		printf("It is redundant. Please retry.\n");
		return size;
	}
}

int main(void)
{
	int setA[MAX_SET_SIZE] = { 1, 2, 3 };
	int setB[MAX_SET_SIZE] = { 3, 2, 1, 4 };
	int num;
	int sizeA = 3, sizeB = 4;
	printf("A:"); printSet(setA, sizeA);
	printf("B:"); printSet(setB, sizeB);
	if (isSetEqual(setA, sizeA, setB, sizeB))
		printf("집합 A와 B는 같다\n");
	else
		printf("집합 A와 B는 다르다\n\n");
	printf("A 에 3을 추가하면\n");
	sizeA = addOneElement(setA, sizeA, 3); // 3을 SetA에 추가한다 
	printf("집합 A:"); printSet(setA, sizeA);
	printf("A 에 4를 추가하면\n");
	sizeA = addOneElement(setA, sizeA, 4); // 4를 SetA에 추가한다 
	printf("집합 A:"); printSet(setA, sizeA);
	if (isSetEqual(setA, sizeA, setB, sizeB))
		printf("집합 A와 B는 같다\n");
	else
		printf("집합 A와 B는 다르다\n");
}