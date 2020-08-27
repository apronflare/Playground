#include<iostream>
int product (int n);
using namespace std;
int main()
{
  int n,m=0;
  cin>>n;
  m=product(n);
  cout<<"The factorial of "<<n<<" is "<<m;
  return 0;
}
int product (int n)
{
  if (n!=0)
    return n*product (n-1);
  else 
    return 1;
}
  
  //Type your code here.
