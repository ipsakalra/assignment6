import java.util.*;
class Subarray{
public static int Longarray(int arr[],int n){
int max=1;
int length=1;
for(int i=1;i<n;i++)
{
if(arr[i]>arr[i-1])
{
length++;
}
else{
if(max<length){
max=length;
length=1;
}
}
}
if(max<length)
{
max=length;
}
return(max);
}
public static void main(String[] args){
int arr[]={5,6,3,5,7,8,9,1};
int n=arr.length;
System.out.println("length: " +
                    Longarray(arr,n));
}
}
