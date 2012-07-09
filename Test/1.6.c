#include <stdio.h>

void rotateImage(int **a, int size)
{
	int tmp, n, i, j;

	int image[4][4] = { { 1, 1, 1, 1 }, { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 1} };
	for(i=0;i<size;i++){
		for(j=0;j<size;j++)
			printf("%d ",image[i][j]);
		printf("\n");
	}
	printf("\n");

	n = size - 1;

	for (i = 0; i < size/2; ++i)
	{
		int last = size - 1 - i;
		for (j = i; j < last; j++)
		{
			int offset = j - i;
			tmp = image[i][j];
			image[i][j] = image[last - offset][i];
			image[last - offset][i] = image[last][last - offset];
			image[last][last - offset] = image[j][last];
			image[j][last] = tmp;
		}
	}

	for(i=0;i<size;i++){
		for(j=0;j<size;j++)
			printf("%d ",image[i][j]);
		printf("\n");
	}

	return ;
}
