#include "stdafx.h"

#include "Node.h"
#include "LinkedList.h"

void deleteNode(Node *node)
{
	Node *next;

	next = node->GetNext();
	node->SetData(next->GetData());
	node->SetNext(next->GetNext());
	delete next;
}

void testDeleteNode()
{
	LinkedList *ll = new LinkedList();
	Node *a = new Node('a');
	ll->Add(a);
	Node *b = new Node('b');
	ll->Add(b);
	Node *c = new Node('c');
	ll->Add(c);
	Node *d = new Node('d');
	ll->Add(d);
	Node *e = new Node('e');
	ll->Add(e);

	ll->Print();
	deleteNode(c);
	ll->Print();
}

