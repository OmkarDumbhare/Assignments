function isEven(num){
    if (num % 2 == 0) {
        return true;
    }
    else{
        return false;
    }
}

    const arr = [1, 3, 5, 4, 2];
    function find(arr,isEven){
        for(i=0;i<arr.length;i++){
            if (isEven(arr[i])==true) {
                return arr[i];
            }
        }
    }

console.log(isEven(3));
console.log(isEven(4));
console.log(find(arr,isEven));


