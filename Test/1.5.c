#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *compressString(const char *string)
{
	char *head;
	char *compressed = _strdup(string);
	char number[32];
	char ch = *string;
	int count = 1;

	head = (char *)string;
	memset(compressed, 0, strlen(compressed));
	string++;

	while (*string)
	{
		if (ch != *string)
		{
			sprintf(number, "%d", count);
			if (strlen(head) < strlen(compressed) + 1 + strlen(number))
			{
				free(compressed);
				return (head);
			}
			else
			{
				sprintf(compressed, "%s%c%s", compressed, ch, number);
			}
			ch = *string;
			count = 1;
		}
		else
		{
			count++;
		}
		string++;
	}
	sprintf(number, "%d", count);
	if (strlen(head) < strlen(compressed) + 1 + strlen(number))
	{
		free(compressed);
		return (head);
	}
	else
	{
		sprintf(compressed, "%s%c%s", compressed, ch, number);
	}

	return compressed;
}
