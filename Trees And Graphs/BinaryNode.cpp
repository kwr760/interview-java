#include "stdafx.h"

#include <iostream>
#include <stack>
#include <queue>

#include "BinaryNode.h"

using namespace std;

void testBinaryTree()
{
	BinaryNode *tree = new BinaryNode(10);

	tree->Insert(new BinaryNode(5));
	tree->Insert(new BinaryNode(15));
	tree->Insert(new BinaryNode(2));
	tree->Insert(new BinaryNode(7));
	tree->Insert(new BinaryNode(12));
	tree->Insert(new BinaryNode(17));
	cout << "PreOrder:   "; tree->PreOrder(); cout << endl;
	cout << "InOrder:    "; tree->InOrder(); cout << endl;
	cout << "PostOrder:  "; tree->PostOrder(); cout << endl;
	cout << "PreOrder:   "; tree->PreOrderIterative(); cout << endl;
	cout << "InOrder:    "; tree->InOrderIterative(); cout << endl;
	cout << "PostOrder:  "; tree->PostOrderIterative(); cout << endl;
	cout << "BFS:  "; tree->BFS(); cout << endl;
}

void BinaryNode::BFS() 
{
	queue<BinaryNode *> queue;

	queue.push(this);

	cout << GetData() << " ";

	while (!queue.empty()) {
		BinaryNode *node = queue.front();
		queue.pop();

//		cout << node->GetData() << " ";
		if (NULL != node->left) {
			cout << node->left->GetData() << " ";
			queue.push(node->left);
		}
		if (NULL != node->right) {
			cout << node->right->GetData() << " ";
			queue.push(node->right);
		}
	}
}
void BinaryNode::PreOrder()
{
	printf ("%d ", GetData());
	if (NULL != left)
		left->PreOrder();
	if (NULL != right)
		right->PreOrder();
}
void BinaryNode::InOrder()
{
	if (NULL != left)
		left->InOrder();
	printf ("%d ", GetData());
	if (NULL != right)
		right->InOrder();
}

void BinaryNode::PostOrder()
{
	if (NULL != left)
		left->PostOrder();
	if (NULL != right)
		right->PostOrder();
	printf ("%d ", GetData());
}

void BinaryNode::PostOrderIterative()
{
    stack<BinaryNode*> nodeStack;

    BinaryNode* curr = this;
    while (true) {
        if (curr) {
            if (curr->right)
               nodeStack.push(curr->right);

			nodeStack.push(curr);
            curr = curr->left;
            continue;
        }

        if (nodeStack.empty())
            return;

        curr = nodeStack.top(); 
        nodeStack.pop();

        if (curr->right && !nodeStack.empty() && curr->right == nodeStack.top()) {
            nodeStack.pop();
            nodeStack.push(curr);
            curr = curr->right;
        } else {
            cout << curr->GetData() << " ";
            curr = NULL;
        }
    }
}
void BinaryNode::InOrderIterative()
{
	stack<BinaryNode *> nodeStack;
	BinaryNode *curr = this;
	while (true) {
		if (curr) {
			nodeStack.push(curr);
			curr = curr->left;
			continue;
		}   
		if (!nodeStack.size())
			return;

		curr = nodeStack.top();
		nodeStack.pop();
		cout << curr->data << " ";
		curr = curr->right;
	}
}

void BinaryNode::PreOrderIterative()
{
	stack<BinaryNode *> nodeStack;
	nodeStack.push(this);

	BinaryNode *curr;

	while (!nodeStack.empty()) {
		curr = nodeStack.top();
		nodeStack.pop();
		if (curr->right != NULL)
			nodeStack.push(curr->right);

		if (curr->left != NULL)
			nodeStack.push(curr->left);
		cout << curr->GetData() << " ";
	}
}

bool BinaryNode::Insert(BinaryNode *node)
{
	bool result;

	if (NULL == node)
		return false;

	if (node->GetData() < GetData()) {
		if (NULL == left) {
			left = node;
			result = true;
		}
		else
			result = left->Insert(node);

		if (true == result)
			leftSize++;
	}
	else if (node->GetData() > GetData())
	{
		if (NULL == right) {
			right = node;
			result = true;
		}
		else
			result = right->Insert(node);

		if (true == result)
			rightSize++;
	}
	else
	{
		result = false;
	}

	return result;

}
BinaryNode *BinaryNode::Find(int value)
{
	if (value < GetData()) {
		if (NULL != left)
			return left->Find(value);
		else
			return NULL;
	} else if (value > GetData()) {
		if (NULL != right)
			return right->Find(value);
		else
			return NULL;
	} else
		return this;
}

bool BinaryNode::IsBalanced()
{
	return false;
}

void BinaryNode::Print()
{
	printf("%d\n", GetData());
}