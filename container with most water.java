int maxArea(int* arr, int N){
int min,max=0,i=0,j=N-1,area;
while(i<j){

min=arr[i];
if(min>arr[j])
 min=arr[j];
min=(j-i)*min;
if(max<min)
max=min;
if(arr[j]>arr[i])
i++;
else
j--;
}
return max;
}
