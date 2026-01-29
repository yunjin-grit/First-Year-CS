//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <conio.h> 
#include <ctype.h> 
int main(void)
{
	char ch;
	while (1)
	{
		scanf("%c", &ch); // 예1) 
		ch = getchar(); // 예2) 
		ch = fgetc(stdin); // 예3) 
		ch = _getch(); // 예4)  
		ch = _getche(); // 예5) 
		if (ch == 'q') break;
		putchar(toupper(ch)); // printf("%c", ch), _putch(ch), fputc(ch, stdout)나 모두 같은 결과 
	}
}