#include<iostream>
using namespace std;
int fib (int n);
int main()
{
  int n;
  cin>>n;
  fib(n);
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
}
 int fib (int n)
{
  if(n==1 || n==2)
  {
    return n-1;
  }
  else
  {
    return fib(n-1)+fib(n-2);
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  //Type your code here.
}