var arrow = function (names) {
    var resArray = [];
    for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
        var name_1 = names_1[_i];
        var row = {};
        row.name = name_1;
        row.length = name_1.length;
        resArray.push(row);
    }
    return resArray;
};
var names = ['Tom', 'Ivan', 'Jerry'];
console.log(arrow(names));
