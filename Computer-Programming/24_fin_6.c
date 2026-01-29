
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define MAX 20

typedef struct {
	char name[MAX];
	int mid;
	int final;
	char grade;
} Student;

void printStudent(Student* m)
{
	printf("%s %d %d %c\n", m->name, m->mid, m->final, m->grade);
}

void calculateGrade(Student* m, int size) // 작성해야
{
	for (int i = 0; i < size; i++) {
		if ((m->mid + m->final) > 100) {
			m->grade = 'A';
		}
		else {
			m->grade = 'F';
		}
		m++;
	}
}

int main(void) // 변경하지 말라
{
	Student Students[MAX] = { {"aaa", 11, 22}, {"bbb", 88, 99}, {"ccc", 33, 44} };
	int i;
	int StudentNum = 3; // aaa, bbb, ccc 학생 3명
	int choice;

	scanf("%d", &choice);
	while (choice != -1) {
		scanf("%s %d %d", Students[StudentNum].name, &Students[StudentNum].mid, &Students[StudentNum].final);
		StudentNum++;
		scanf("%d", &choice);
	}

	calculateGrade(Students, StudentNum);
	for (i = 0; i < StudentNum; i++)
		printStudent(&Students[i]);
}