#pragma once

#include <stdlib.h>

#include "BinaryNode.h"

extern void	testCommonAnchester();

class Result {
	BinaryNode *node;
	bool isAnchester;

	Result(BinaryNode *n, bool isAnc) { node = n; isAnchester = isAnc; }
};
