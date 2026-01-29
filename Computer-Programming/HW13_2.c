//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

struct student {
	char name[20];
	int midterm;
	int final;
	int average;
};
// typedef사용하여 Student 정의 
typedef struct {
	char name[20];
	int midterm;
	int final;
	int average;
}Student;

struct cClass {
	int num;
	Student s[40];
};
// typedef사용하여 CClass 정의 
typedef struct {
	int num;
	Student s[40];
}CClass;

void printStudent(Student* sp)
{
	printf("%s\t", sp->name);
	printf("%d\t%d\t%d\n", sp->midterm, sp->final, sp->average);
}

void readStudentScore(Student* sp) {
	printf("Enter student name: ");
	scanf("%s", sp->name);
	printf("Enter midterm and final score: ");
	scanf("%d %d", &sp->midterm, &sp->final);
}

void calculateStudentAverage(Student* sp) {
	sp->average = (sp->midterm + sp->final) / 2;
}

void readClass(CClass* cp) {
	for (int i = 0; i < cp->num; i++) 
		readStudentScore(&cp->s[i]);
}

void calculateClassAverage(CClass* cp) {
	for (int i = 0; i < cp->num; i++) 
		calculateStudentAverage(&cp->s[i]);
}

void printClass(CClass* cp) {
	for (int i = 0; i < cp->num; i++) 
		printStudent(&cp->s[i]);
}

int main(void)
{
	CClass cp;
	Student all = { "Total", 0, 0, 0 };
	printf("Enter a number of student:");
	scanf("%d", &cp.num);
	readClass(&cp); // 앞 코드의 a)부분 대치 
	calculateClassAverage(&cp); // 앞 코드의 b)부분 대치 
	printf("\n이름\t중간\t학기말\t평균\n");
	printClass(&cp);
}