#include<iostream>
using namespace std;
int stack[100],top=-1,n=100;
void push(int v)
{
  if(top>=n-1)
  {
    cout<<"Stack Overflow";
  }
  else
  {
    top++;
    stack[top]=v;
  }
}
void display()
{
  if(top>=0)
  {
    cout<<"Stack elements are: "<<endl;
    for(int i=top;i>=0;i--)
    {
      cout<<stack[i]<<" ";
      
    }
  }
 else 
 {
   cout<<"Stack is empty";
 }
  }



int main()
{
  int n;
  cin>>n;
  int i,x;
  for(i=0;i<n;i++)
  {
    cin>>x;
    push(x);
  }
  display();
  //type your code
  return 0;
}