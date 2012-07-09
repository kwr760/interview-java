#pragma once

class Node
{
	char data;
	Node *next;

public:
	Node (char value) { data = value; next = NULL;}
	int GetData() { return data; }
	void SetData(int value) { data = value; }
	Node *GetNext() { return next; }
	void SetNext(Node *node) { next = node; }
};
