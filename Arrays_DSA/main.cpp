
#include<iostream>
using namespace std;

void subPrint(int s){
    if(s == 0){
        return ;
    }

    cout<<s<<" ";
    subPrint(s-1);
}

void print(int  n){
    if(n == 0){
        return ;
    }

    cout<<n<<" ";
    subPrint(n-1) ;
    cout<<endl;
    print(n-1) ;
}

int main(){
    int n ;
    cin>> n  ;
    print(n);
}