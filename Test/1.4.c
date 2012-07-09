#include <stdio.h>
#include <string.h>

typedef int bool; 

char *addURLSpace(const char *string)
{
	bool started = 0;
	char *s = _strdup(string);
	char *head = s;
	char *end;

	while (*s)
	{
		s++;
	}
	end = --s;

	while (s != head)
	{
		if (0 == started)
		{
			if (*s == ' ')
			{
				s--;
			}
			else
			{
				*end-- = *s--;
				started = 1;
			}
		}
		else
		{
			if (*s == ' ')
			{
				s--;
				*end-- = '0';
				*end-- = '2';
				*end-- = '%';
			}
			else
			{
				*end-- = *s--;
			}
		}
	}

	return head;
}
