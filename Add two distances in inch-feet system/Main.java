#include<iostream> 
using namespace std;
struct measure 
{
  int f1,f2;
  float i1,i2;
};
int main()
{
  struct measure m;
  int f;
  float i;
  cin>>m.f1>>m.i1>>m.f2>>m.i2;
  f=m.f1+m.f2;
  i=m.i1+m.i2;
  if(i>12)
  {
    i=i-12;
    f=f+1;
  }
  cout<<f<<"'-"<<i<<"\"";
}
