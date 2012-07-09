#include <stdio.h>
#include <stdlib.h>

#include <string.h>

typedef enum bool { false, true }; 

void hasUniqueChars(char *testString)
{
	int found[256];
	unsigned int i;

	memset(found, sizeof(int) *256, 0);

	if (256 < strlen(testString))
	{
		printf("The string doesn't have all unique chars\n");
		return;
	}

	for (i = 0; i < strlen(testString); i++)
	{
		char value;
		value = testString[i];
		if (true == found[value])
		{
			printf("The string doesn't have all unique chars\n");
			return;
		}

		found[value] = true;
	}

	printf("The string has all unique chars\n");
}
