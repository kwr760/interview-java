#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef int bool; 

int **Crossify(int **array, int m, int n, int a, int b)
{
	int i, j;
	bool *row = (bool *)malloc(sizeof(bool)*m);
	bool *col = (bool *)malloc(sizeof(bool)*n);

	memset(row, 0, sizeof(bool)*m);
	memset(col, 0, sizeof(bool)*n);
	for (i = 0; i < m; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (0 == array[i][j])
			{
				row[i] = 1;
				col[j] = 1;
			}
		}
	}
	for (i = 0; i < m; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (1 == row[i] || 1 ==  col[j])
			{
				array[i][j] = 0;
			}
		}
	}

	return array;
}

void printArray(int **array, int m, int n)
{
	int i, j;
	for(i=0;i<m;i++){
		for(j=0;j<n;j++)
			printf("%d ",array[i][j]);
		printf("\n");
	}
}

void testCrossify()
{
	int i, j;
	int m = 5, n = 6;
	int **array = (int **)malloc(m*sizeof(int *));
	for (i=0; i<m; i++) array[i] = (int *)malloc(n*sizeof(int));
	for (i=0; i<m; i++)for (j=0; j<n; j++) array[i][j] = j+1;
	array[1][5] = 0;
	array[4][2] = 0;
	printArray(array, m, n);
	printf("\n");
	Crossify(array, m, n, 4, 2);
	printArray(array, m, n);
	for (i=0; i<m; i++) free(array[i]);
	free (array);

}
