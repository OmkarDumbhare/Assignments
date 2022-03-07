function isEven(num){
    if(num%2==0){
        return true;
    }
    else
        return false;
}
let arr=[1,3,5,4,2];
function find(arr,isEven){
    for(var i=0;i,arr.length;i++){
        if(isEven(arr[i])==true)
            return arr[i];
        else{
            arr.shift();
            return(find(arr,isEven));
        }
    }
}

console.log(isEven(3));
console.log(isEven(4));
console.log(find(arr,isEven));