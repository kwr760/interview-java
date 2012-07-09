#include "stdafx.h"

#include "print.h"

int setTheBits(int m, int n, int start, int end)
{
	int left = ~0 << (end + 1);
	int right = ((1 << start) - 1);
	int mask = left | right;
	m = m & mask;
	return m | (n << start);
}

void testBits()
{
	int m = 1084;
	int n = 19;
	printf("%d = %s\n", m, byte_to_binary(m));
	printf("%d = %s\n", n, byte_to_binary(n));
	int result = setTheBits(m, n, 2, 6);
	printf("%d = %s\n", result, byte_to_binary(result));

	return;
}
