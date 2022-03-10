var arrow = (names: String[] ) => {
     let resArray = [];
     for(let name of names ){
         var row : any={

         };
         row.name = name;
         row.length = name.length;
         resArray.push(row);
     }
     return resArray;
};

let names = ['Tom', 'Ivan', 'Jerry'];
console.log(arrow(names));
