let arr=[1,2,3,4,5];
		function square(x){
			return x*x;
		}
		function map(arr,square){
			for(var i=0;i<arr.length;i++){
				arr[i]=square(arr[i]);
			}
			return arr;
		}
		console.log(map(arr,square));

        console.log(map(arr,Math.sqrt));
