//컴퓨터학과 1학년 이윤진
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define BOARD_SIZE 10
int winCheck(char b[][BOARD_SIZE], int r, int c)
{
	int i, j;
	int sum = 1;
	char player = b[r][c];
	// 여기에 오목 성사 여부를 판단하는 코드를 삽입
	i = c - 1;
	while (i >= 0 && b[r][i] == player) {
		sum++;
		i--;
	}
	i = c + 1;
	while (i <= 9 && b[r][i] == player) {
		sum++;
		i++;
	}
	if (sum == 5) {
		return 1;
	}

	sum = 1;
	i = r - 1;
	while (i >= 0 && b[i][c] == player) {
		sum++;
		i--;
	}
	i = r + 1;
	while (i <= 9 && b[i][c] == player) {
		sum++;
		i++;
	}
	if (sum == 5) {
		return 1;
	}

	return 0;
}
void display(char b[][BOARD_SIZE])
{
	char ch;
	int i, j;
	printf("     ");
		for (i = 0; i < BOARD_SIZE; i++)
			printf("%2d", i);
	printf("\n     ---------------------\n");
	for (i = 0; i < BOARD_SIZE; i++) {
		printf("%3d |", i);
		for (j = 0; j < BOARD_SIZE; j++)
			printf(" %c", b[i][j]);
		printf("\n");
	}
}

int main(void)
{
	char board[BOARD_SIZE][BOARD_SIZE];
	char turn = 'X';
	int r, c;
	int i, j;
	int count;
	int win;
	for (i = 0; i < BOARD_SIZE; i++)
		for (j = 0; j < BOARD_SIZE; j++)
			board[i][j] = ' ';
	count = 1;
	display(board);
	do
	{
		printf("Player %c(행 열):", turn);
		scanf("%d %d", &r, &c);
		if (board[r][c] != ' ') continue; // 이미 말이 놓인 자리
		board[r][c] = turn;
		display(board);
		if (win = winCheck(board, r, c))
			printf("Player %c wins!\n", turn);
		turn = (turn == 'X' ? 'O' : 'X');
		count++;
	} while (!win && count <= BOARD_SIZE * BOARD_SIZE);
	if (!win && count == BOARD_SIZE * BOARD_SIZE)
		printf("Nobody win!\n");
}