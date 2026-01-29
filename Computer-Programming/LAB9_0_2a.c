//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>  
#include <ctype.h> //문자처리 함수 사용을 위해 

void main() {
	printf("Enter: ");
	char c;
	c = getchar();
	while (c != EOF) {
		if (islower(c))
			c = toupper(c);
		else if (isupper(c))
			c = tolower(c);
		putchar(c);
		c = getchar();
	}
}

/*
//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <ctype.h> //문자처리 함수 사용을 위해



void main()
{
	int c;
	printf("Enter characters(^Z for exit):\n");
	c = getchar();

	while (c != EOF)
	{
		if (islower(c))
			c = toupper(c);
		else if (isupper(c))
			c = tolower(c);

		putchar(c);
		c = getchar();
	}
}
*/