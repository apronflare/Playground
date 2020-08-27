#include<bits/stdc++.h>
#include<string.h>
using namespace std;
int main()
{
  char a[50];
  cin>>a;
  int l=strlen(a);

  for(int i=0;i<=l;i++)
  {
    if(a[i]>=97 && a[i]<=122)
  {
     a[i]=a[i]-32;
      
    }
  }
  
     cout<<"String in uppercase is "<<a;
   
    
  
  
  return 0;
  
  //Type your code here.
}