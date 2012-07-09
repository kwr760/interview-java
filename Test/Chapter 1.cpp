// Test.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include "stdlib.h"

extern "C" {
extern void hasUniqueChars(char *testString);
extern int reverse(char *toReverse);
extern int reverseBetter(char *toReverse);
extern bool IsPermutation(const char *first, const char *second);

extern char *compressString(const char *string);
extern void rotateImage(int **a, int size);
extern int **Crossify(int **array, int m, int n, int a, int b);
extern void testCrossify();
extern bool isSubString(const char *s1, const char *s2);
extern bool isRotation(const char *s1, const char *s2);
}

int main(int argc, char ** argv)
{
//	hasUniqueChars("abcedsdf");
//	hasUniqueChars("abced");
//	reverseBetter("a");
//	reverseBetter("ab");
//	reverseBetter("abcedsdf");
//	reverseBetter("abced");
//	printf("%s\n", addURLSpace("This is Kevin    "));
//	printf("%s\n", compressString("abc"));
//	printf("%s\n", compressString("aaabbbbbccde"));
//	int **a=(int **)malloc(m*sizeof(int *));
//	for(i=0;i<m;i++)a[i]=(int *)malloc(n*sizeof(int));
//	for(i=0;i<m;i++)for(j=0;j<n;j++){k++; a[i][j]=k;}
//	rotateImage(NULL, 4);
//	testCrossify();
	isRotation("waterbottle","erbottlewat");
	system("PAUSE");
	return 0;
}