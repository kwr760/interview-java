#include "stdafx.h"

#include "3.2.h"

void testStackMin() {
	Stack *stack = new Stack();
	stack->Print();
	stack->push(2);
	stack->push(4);
	stack->push(-2);
	stack->push(6);
	stack->push(0);
	stack->Print();
	stack->pop();
	stack->pop();
	stack->pop();
	stack->Print();
}

int Stack::top() {
	if (NULL != stack)
		return stack->GetData();

	return NULL;
}

int Stack::pop() {
	if (NULL != stack) {
		Node *node = stack;
		int data = node->GetData();
		stack = node->GetNext();
		delete node;
		if (m_Min == data)
			SetMin();
		return data;
	}
	return -1;
}

void Stack::push(int data) {
	if (m_Min > data)
		m_Min = data;

	Node *node = new Node(data);
	node->SetNext(stack);
	stack = node;
}

int Stack::min() {
	return m_Min;
}

void Stack::SetMin(){
	m_Min = ((1 << 31) - 1);

	Node *node = stack;

	while (node) {
		if (m_Min > node->GetData())
			m_Min = node->GetData();
		node = node->GetNext();
	}
}

void Stack::Print(){

	printf("min:  %d -  ", m_Min);

	Node *node = stack;

	while (node) {
		printf("%d ", node->GetData());
		node = node->GetNext();
	}
	printf("\n");
}
