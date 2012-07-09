#include <stdlib.h>
#include <string.h>

typedef int bool; 

bool isSubString(const char *s1, const char *s2)
{
	const char *head = s2;

	while (s1)
	{
		if (*s1 == *s2)
		{
			s1++;
			s2++;
			if ('\0' == *s2)
			{
				return 1;
			}
		}
		else
		{
			s1++;
			s2 = head;
		}
	}
	return 0;
}

bool isRotation(const char *s1, const char *s2)
{
	bool rotation;
	char *dup = strcat(_strdup(s1), _strdup(s1));

	if (strlen(s1) != strlen(s2))
	{
		return 0;
	}

	rotation = isSubString(dup, s2);
	free(dup);

	return rotation;
}