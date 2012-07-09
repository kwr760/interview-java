#include <stdio.h>
#include <string.h>

typedef int bool; 

bool IsPermutation(const char *first, const char *second)
{
	int f, s;
	int lf = strlen(first);
	int ls = strlen(second);

	if (lf < ls)
	{
		return 0;
	}

	for (f = 0; f < lf - ls; f++)
	{
		for (s = 0; s < ls; s++)
		{
			if (first[f] != second[s])
			{
				break;
			}
			else
			{
				f++;
				if (s == ls - 1)
				{
					return 1;
				}
			}
		}
	}
	return 0;
}

