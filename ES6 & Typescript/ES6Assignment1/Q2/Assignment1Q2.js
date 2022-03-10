// 2.	Scoping: Declare a variable inside if condition & make sure that it is not 
//     accessible outside if condition

function test(num) {
    if (num % 2 == 0) {
        let x = num;
        console.log(x);
    }
    else {
        console.log(x);
    }
}

test(20);
test(13);