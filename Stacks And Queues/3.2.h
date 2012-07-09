#pragma once

void testStackMin();

class Node {
	int data;
	Node *next;

public:
	Node (int value) { data = value; next = NULL; }
	int GetData() { return data; }
	void SetData(int value) { data = value; }
	Node *GetNext() { return next; }
	void SetNext(Node *next) { this->next = next; }
};

class Stack {
	Node *stack;
	int m_Min;

public:
	Stack () { m_Min = ((1 << 31) - 1); stack = NULL; }

	int top();
	int pop();
	void push(int data);
	int min();
	void SetMin();
	void Print();
};
