#include<iostream>
using namespace std;
struct node
{
  int data;
  node *next;
};
node*head = NULL;
node *tail = NULL;
void append(int d)
{
    node *newnode;
    newnode=new node();
    newnode->data = d;
    newnode->next = NULL;
    if(head == NULL)
    {
      head = newnode;
      tail=newnode;
    }
  else
  {
    newnode->next = head;
    head=newnode;
  }
}
void display()
{
    node *temp;
    temp = head;
    
        while(temp != NULL)
        {
            cout<<temp->data<<endl;
  

            temp = temp -> next;
        }
    
}
int main()
{
    int d;
    do{
        cin>>d;
        if(d>0)
            append(d);     
    }while(d>0);
display();
return 0;
}