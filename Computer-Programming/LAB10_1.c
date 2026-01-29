//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <string.h> 

struct customer {
	char name[40];
	int age;
};

int main(void)
{
	// 변수 선언 부분 
	struct customer aCustomer;
	strcpy(aCustomer.name, "박수희");
	aCustomer.age = 36;
	printf("Name = %s, Age = %d\n", aCustomer.name, aCustomer.age);

	struct customer cArray[2] = {
		{"장동건", 38},
		{"고소영", 36}
	};

	for (int i = 0; i < 2; i++) {
		printf("Name = %s, Age = %d\n", cArray[i].name, cArray[i].age);
	}
}