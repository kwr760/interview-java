#include "stdafx.h"

#include "LinkedList.h"
#include "Node.h"

LinkedList::~LinkedList()
{
	Node *node = head;
	while (node)
	{
		Node *t = node;
		node = node->GetNext();
		delete t;
	}
}
void LinkedList::Print()
{
	Node *node = head;
	while (node)
	{
		printf("%c", node->GetData());
		node = node->GetNext();
	}
	printf("\n");
}

void LinkedList::Add(Node *node)
{
	if (NULL == head)
	{
		head = node;
		tail = node;
	}
	else
	{
		tail->SetNext(node);
		tail = node;
	}
}

void LinkedList::RemoveDuplicateNodes()
{
	Node *node;

	node = head;

	while (node)
	{
		Node *run = node;
		while (run->GetNext())
		{
			if (node->GetData() == run->GetNext()->GetData())
			{
				Node *del = run->GetNext();
				run->SetNext(del->GetNext());
				delete del;
			}
			run = run->GetNext();
		}
		node = node->GetNext();
	}
}
