//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>  
#include <ctype.h> //문자처리 함수 사용을 위해 



void main()
{
	char ch;

	while ((ch = fgetc(stdin)) != EOF){
		if (islower(ch))
			ch = toupper(ch);
		else if (isupper(ch))
			ch = tolower(ch);

		fputc(ch, stdout);
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

	while ((c=fgetc(stdin)) != EOF)
	{
		if (islower(c))
			c = toupper(c);
		else if (isupper(c))
			c = tolower(c);

		fputc(c, stdout);
	}
}
*/