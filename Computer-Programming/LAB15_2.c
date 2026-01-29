//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
int main(void) {
    int year, month, day;
    char buf[20];

    scanf("%d %d %d", &year, &month, &day);

    // 월, 일이 한 자리면 0을 붙여 2자리로 출력: %02d를 사용 
    if (month < 10 && day < 10) {
        sprintf(buf, "%d-%02d-%02d", year, month, day);
    }
    else if (month < 10 && day >= 10) {
        sprintf(buf, "%d-%02d-%d", year, month, day);
    }
    else if (month >= 10 && day < 10) {
        sprintf(buf, "%d-%d-%02d", year, month, day);
    }
    else {
        sprintf(buf, "%d-%d-%d", year, month, day);
    }


    printf("%s\n", buf);
    return 0;
}