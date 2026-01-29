
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

// 한명의 학생에 대한 정보를 읽어 배열 Student에 넣는 함수, 학생수도 1 증가시킨다
void readNewStudent(Student* m, int* snPtr) // 작성해야
{
	// 코드 작성
	scanf("%s %d %d", m[*snPtr].name, &m[*snPtr].mid, &m[*snPtr].final);
	(*snPtr)++;
}

void calculateGrade(Student* m, int size) // 앞의 문제 답 코드 사용
{
	// 앞의 문제 답
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
		readNewStudent(Students, &StudentNum);
		scanf("%d", &choice);
	}

	calculateGrade(Students, StudentNum);
	for (i = 0; i < StudentNum; i++)
		printStudent(&Students[i]);
}