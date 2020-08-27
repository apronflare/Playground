#include<iostream>
using namespace std;
int main()
{
  int n,a=3,b=8,t=0;
  cin>>n;
  for(int i=2;i<n+2;i++)
  {
  cout<<a<<" ";
    t=a;
    a=b;
    b=t+a+i;
  }
}