#pragma once

extern void testBinaryTree();

class BinaryNode
{
	BinaryNode *right;
	BinaryNode *left;

	int rightSize;
	int leftSize;

	int data;

public:
	BinaryNode(int value) {
		right = NULL;
		left = NULL;

		rightSize = 0;
		leftSize = 0;

		data = value;
	}

	BinaryNode *Left() { return left; }
	BinaryNode *Right() { return right; }

	int GetData() { return data; }
	void SetData(int value) { data = value; }

	bool Insert(BinaryNode *node);
	BinaryNode *Find(int value);

	void PreOrder();
	void InOrder();
	void PostOrder();

	void PreOrderIterative();
	void InOrderIterative();
	void PostOrderIterative();

	void BFS();

	bool IsBalanced();

	void Print();

};
