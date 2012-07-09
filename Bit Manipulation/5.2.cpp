#include "stdafx.h"

#include "5.2.h"

void testReal()
{
	double d = .72;
	printf("%f - %s\n", d, testRealBinary(d));
	d = .12;
	printf("%f - %s\n", d, testRealBinary(d));
	d = .5;
	printf("%f - %s\n", d, testRealBinary(d));
}

char *testRealBinary(double num)
{
	static char b[34];
	b[0] = '\0';

	if (num >= 1 || num <= 0)
		return "ERROR";

	strcat_s(b, ".");
	while (num > 0) {
		if (strlen(b) >= 32)
			return "ERROR";

		double r = num * 2;
		if (r >= 1)
		{
			strcat_s(b, "1");
			num = r - 1;
		}
		else 
		{
			strcat_s(b, "0");
			num = r;
		}
	}

	return b;
}