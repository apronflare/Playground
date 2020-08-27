#include<iostream>
using namespace std;
struct node
{
  int data;
  struct node*prev;
  struct node*next;
};
node*head=NULL;
node*tail=NULL;
void append(int d)
{
node*newnode;
newnode=new node;
newnode->data=d;
newnode->prev=NULL;
newnode->next=NULL;
  if(head==	NULL)
  {
    head=newnode;
    tail=newnode;
  }
    else
    {
      tail->next=newnode;
      newnode->prev=tail;
      tail=newnode;
    }
}
void display()
{
  node*temp;
  temp=head;
  while(temp!=NULL)
  {
    cout<<temp->data<<endl;
    temp=temp->next;
  }
}
int main()
{
  int data;
  do{
    cin>>data;
    if(data<0)
      break;
    else
      append(data);
  }
    while(1);
  display();
  return 0;
}
  //type your code here
  