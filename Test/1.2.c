#include <stdio.h>
#include <string.h>

int reverse(char *toReverse)
{
	char str[256];
	int len, i;

	if (NULL == toReverse)
	{
		printf("The string which was used was NULL\n");
		return 0;
	}

	len = strlen(toReverse);

	if (256 < len)
	{
		printf("The string length is restricted to 256\n");
		return 0;
	}

	strcpy(str, toReverse);

	printf("Original:  %s\n", str);

	for (i = 0; i < len/2; i++)
	{
		char temp;
		temp = str[i];
		str[i] = str[len - i - 1];
		str[len - i - 1] = temp;
	}

	printf("Reversed:  %s\n", str);

	return 0;
}

int reverseBetter(char *toReverse)
{
	char *str, *end, *start;
	char temp;

	start = str = end = _strdup(toReverse);

	printf("Original:  %s\n", toReverse);

	if (str) 
	{
		while (*end) {
			++end;
		}
		--end;

		while (str < end) 
		{
			temp = *str;
			*str++ = *end;
			*end-- = temp;
		}
	}

	printf("Reversed:  %s\n", start);

	return 0;
}
