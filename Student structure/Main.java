#include<iostream>
using namespace std;
struct student
{
  int rn,s1,s2,s3,s4,s5;
};
int main()
{
  int n,avg=0,grade=0;
  cin>>n;
  struct student s[n];
  int i;
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl<<"Enter the no of students"<<
    endl<<"rn"<<" "<<"s1"<<" "<<"s2"<<" "<<"s3"<<" "<<"s4"<<" "<<
    "s5"<<" "<<"avg"<<" "<<"grade"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>s[i].rn>>s[i].s1>>s[i].s2>>s[i].s3>>s[i].s4>>s[i].s5;
  }
  for(i=0;i<n;i++)
  {
    avg=(s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5)/5;
    if (avg>70)
    {
      grade=1;
    }
    else if(avg <=70 && avg>=50)
    {
      grade=2;
    }
    else if(avg <50)
    {
      grade-3;
    }
    cout<<s[i].rn<<" "<<s[i].s1<<" "<<s[i].s2<<" "<<s[i].s3<<" "<<
      s[i].s4<<" "<<s[i].s5<<" "<<avg<<" " <<grade<<endl;
  }
  return 0;
      

  
}