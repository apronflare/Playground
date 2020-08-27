#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
void push(int d);
void display();

node*head=NULL;
void push(int d)
{
  node*newnode;
  newnode=new node;
  newnode->data=d;
  newnode->next=head;
  head=newnode;
}
void display()
{
node*temp=head;
 while(temp!=NULL)
 {
   cout<<temp->data<<" ";
   temp=temp->next;
 }
}
int main()
{
  int d;
  do{
    cin>>d;
    if(d<0)
      break;
    else
     push(d);
  }
  while(1);
  display();
  
  //type your code
  return 0;
}