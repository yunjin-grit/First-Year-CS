//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void save(int money);

int main(void)
{
	save(0);

	return 0;
}

void save(int money) {
	static int total = 0;

	printf("저금할 금액<-1 for exit>:");
	scanf("%d", &money);

	while (money != -1) {
		total += money;
		printf("현재까지의 입금액 %d\n", total);
		printf("저금할 금액<-1 for exit>:");
		scanf("%d", &money);
	}
	printf("입금 완료");
}