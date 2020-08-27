#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
node*head=NULL;
void del(int d)
{
  node*newnode;
  newnode= new node;
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
int delet()
{
  if(head==NULL)
    return 0;
  cout<<endl<<"Deleted element is "<<head->data;
  head=head->next;
  return 1;
}

  
int main()
{
  int d;
  do{
    cin>>d;
    if(d<0)
      break;
    else
      del(d);
  }while(1);
  
    cout<<"Before deleting:"<<endl;
 
    display();
  while(delet());
  {
  }
   
   cout<<endl<<"Stack is empty";
  //type your code
  return 0;
}