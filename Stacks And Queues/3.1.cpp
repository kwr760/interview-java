#include "stdafx.h"

#include "3.1.h"

void testTriStack()
{
	TriStack *tri = new TriStack(5);

	try {
		for (int i = 0; i < 5; i++)
			tri->push(0, i + 1);

		tri->push(1, 1);
		tri->push(1, 3);
		tri->push(2, 1);

		printf("2 - %d\n", tri->pop(2));
		printf("1 - %d\n", tri->pop(1));
		printf("0 - %d\n", tri->pop(0));
		printf("0 - %d\n", tri->pop(0));
		printf("0 - %d\n", tri->pop(0));
		printf("0 - %d\n", tri->pop(0));
		printf("0 - %d\n", tri->pop(0));
		printf("0 - %d\n", tri->pop(0));
	}
	catch (char *err)
	{
		printf("%s\n", err);
	}
}

