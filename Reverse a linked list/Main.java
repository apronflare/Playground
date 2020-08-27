#include<iostream>
using namespace std;
struct node
{
  int data;
  node*prev;
  node*next;
};
void append(int d);
void display();
void reverse();
node*head=NULL;
node*tail=NULL;

void reverse()
{
  node*current = head;
  node*next=NULL;
  node*prev=NULL;
        while (current != NULL) 
        { 
            next= current->next; 
            current->next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
}

void display()
{
  node*temp;
  temp=head;
  if(temp==NULL)
  {
    cout<<"List is empty"<<endl;
  }
  while(temp!=NULL)
  {
    cout<<temp->data<<endl;
    temp=temp->next;
  }
}
void append(int d)
{
  node*newnode;
  newnode= new node;
  newnode->data=d;
  newnode->next=NULL;
  if(head==NULL)
  {
    head=newnode;
    tail=newnode;
  }
  else
  {
    tail->next=newnode;
    tail=newnode;
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
     append(d);
  }
  while(1);
  {
  cout<<"Before Reversing the list:"<<endl;
  display();
  reverse();
  cout<<"After Reversing the list:"<<endl;
  display();
  //type your code here
  return 0;
    }

}
