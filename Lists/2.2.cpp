#include "stdafx.h"

#include <list>

using namespace std;

int FindkthToLast(list<int> linked, size_t position)
{
	list<int>::iterator runner;
	list<int>::iterator iter;
	size_t i = 0;

	if (linked.size() < position)
		return -1;

	runner = linked.begin();
	while (runner  != linked.end() && i++ < position)
		runner++;

	iter = linked.begin();
	while (runner != linked.end()){
		runner++;
		iter++;
	}

	return *iter;
}

void testFindFromLast()
{
	list<int> linked;
	for (int i = 0; i < 10; i++)
		linked.push_back(i);

	printf("The 4th from the last is:  %d\n", FindkthToLast(linked, 4));
}

