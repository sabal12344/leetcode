#include<iostream>
#include<string>
using namespace std;

class Solution {
public:
    int minDeletion(string s, int k) {
        int i,j,len=0,del=0,ind=0,repi=1;
        int rep[16];
        for(i=0;s[i];i++){
            len++;
            
        }

        for(i=0;i<len-1;i++){
            for(j=i+1;j<len;j++){
                if(s[i]>s[j]){
                    char temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;

                }
            }
        }
        
        for(i=0,j=1;i<len-1;i++,j++){
        
           
            if(s[i]!=s[j]){
                
                rep[ind]=repi;
                ind++;
                repi=1;
               
                
            }
            else
             repi++;
          
        }
        rep[ind]=repi;
        ind++;
        
    
        
  
    
    for(i=0;i<ind-1;i++){
        for(j=i+1;j<ind;j++){
            if(rep[j]>rep[i]){
                int temp=rep[j];
                rep[j]=rep[i];
                rep[i]=temp;
                
            }
        }
    }
        
        for(i=k;i<ind;i++){
            del+=rep[i];
        }

        if(ind<=k){
            return 0;
        }
        
        
        return del;
    }
        
};
int main(){
    Solution s;
    string str;

    int k;
    cout<<"Enter your  string : ";
    while(true){
    
    cin>>str;
    if(str.length()<=16){
        break;

    }
    cout<<"Too long! make it 16 or less :";

}


    cout<<"Now enter maximum number of distinct characters : ";
    cin>>k;


    cout<<endl<<s.minDeletion(str,k)<<" deletions required.";
    return 0;
}
