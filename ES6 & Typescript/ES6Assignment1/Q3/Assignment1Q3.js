
//    3.	Enhanced object properties: Create an ‘Order’ object having data members 
//    ‘id’, ‘title’, ‘price’. Add the methods printOrder() & getPrice(). Now, 
//    copy the order object using Object.assign().
  

 var Order={
    id:10,
    title:'order',
    price:100,
    printOrder(){
        console.log(id+" "+this.title+" "+this.price)
    },
    getPrice(){
        return this.prie;
    }
}

var CopyObject = Object.assign(Order);
console.log(CopyObject)
