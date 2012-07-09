#pragma once

#include <vector>

using namespace std;

class TriStack
{
	int size;
	int stackPointer[3];
	vector<int>	triStack;

public:
	TriStack(int stackSize) {
		size = stackSize;
		stackPointer[0] = -1;
		stackPointer[1] = -1;
		stackPointer[2] = -1;
		triStack.resize(3 * size);
	}

	int peek(int stack) {
		if (-1 == stackPointer[stack])
			throw "The stack is empty";

		return triStack[top(stack)];
	}

	int pop(int stack) {
		if (-1 == stackPointer[stack])
			throw "The stack is empty";
		
		stackPointer[stack]--;
		return triStack[top(stack) + 1];
	}

	void push(int stack, int value) {
		if (size == stackPointer[stack])
			throw "The stack is full";

		stackPointer[stack]++;
		triStack[top(stack)] = value;
	}

private:
	int top(int stack) {
		return stackPointer[stack] + (stack * size);
	}
};

extern void testTriStack();

