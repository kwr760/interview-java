#include "stdafx.h"

#include "binaryNode.h"
#include "4.7.h"

BinaryNode *commonAncesterBad(BinaryNode *root, BinaryNode *p, BinaryNode *q)
{
	if (NULL == root)
		return NULL;
	if (root == p && root == q)
		return root;

	BinaryNode *x = commonAncesterBad(root->Left(), p, q);
	if (x != NULL && x != p && x != q)
		return x;

	BinaryNode *y = commonAncesterBad(root->Right(), p, q);
	if (y != NULL && y != p && y != q)
		return y;

	if (x != NULL && y != NULL) 
		return root;
	else if (root == p || root == q) 
		return root;
	else
		return x == NULL ? y : x;
}

void testCommonAnchester()
{
	BinaryNode *tree = new BinaryNode(10);

	BinaryNode *two = new BinaryNode(2);
	BinaryNode *twelve = new BinaryNode(12);
	tree->Insert(new BinaryNode(5));
	tree->Insert(new BinaryNode(15));
	tree->Insert(two);
	tree->Insert(new BinaryNode(7));
	tree->Insert(twelve);
	tree->Insert(new BinaryNode(17));

	BinaryNode *node = commonAncesterBad(tree, two, twelve);

	node->Print();
}
