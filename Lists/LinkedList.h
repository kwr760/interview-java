#pragma once

#include "Node.h"

class LinkedList 
{
	Node *head;
	Node *tail;

public:
	LinkedList() { head = NULL; tail = NULL;}
	~LinkedList();

	void Add(Node *node);
	void RemoveDuplicateNodes();
	void Print();
};