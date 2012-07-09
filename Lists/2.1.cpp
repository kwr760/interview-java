#include "stdafx.h"

#include <list>
#include <iostream>

#include "LinkedList.h"

using namespace std;

void testRemoveDups()
{
	LinkedList *ll = new LinkedList();
	Node *a = new Node('F');
	ll->Add(a);
	a = new Node('O');
	ll->Add(a);
	a = new Node('L');
	ll->Add(a);
	a = new Node('L');
	ll->Add(a);
	a = new Node('O');
	ll->Add(a);
	a = new Node('W');
	ll->Add(a);
	a = new Node(' ');
	ll->Add(a);
	a = new Node(' ');
	ll->Add(a);
	a = new Node('U');
	ll->Add(a);
	a = new Node('P');
	ll->Add(a);
	ll->Print();
	ll->RemoveDuplicateNodes();
	ll->Print();
}

void RemoveDuplicateNodes(list<char> *l)
{
	list<char>::iterator i;
	list<char>::iterator run;

	for (i = l->begin(); i != l->end(); ++i)
	{
		for (run = i, ++run; run != l->end(); ++run)
		{
			if (*i == *run)
			{
				run = l->erase(run);
				run--;
			}
		}
	}
	for(i = l->begin(); i != l->end(); i++) cout << *i;
}

void testRemoveDups2()
{
	list<char> ll;
	list<char>::iterator i;
	ll.push_front('F');
	ll.push_back('O');
	ll.push_back('L');
	ll.push_back('L');
	ll.push_back('O');
	ll.push_back('W');
	ll.push_back(' ');
	ll.push_back('U');
	ll.push_back('P');

	for(i = ll.begin(); i != ll.end(); i++) cout << *i;
	cout << endl;
	RemoveDuplicateNodes(&ll);
	for(i = ll.begin(); i != ll.end(); i++) cout << *i;
	cout << endl;
}
