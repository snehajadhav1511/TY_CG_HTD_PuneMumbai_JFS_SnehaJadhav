var x = [12344, 'xyz', true, { name: 'Naga Arjun' }];

console.log(x[3]);

for (var i = 0; i < x.length; i++) {
    console.log(x[i]);
}

var colors = ['yellow', 'green', 'white', 'red'];
console.log(colors);

colors.pop();
console.log(colors);
colors.push('violet', 'blue');
console.log(colors);
colors.shift();
console.log(colors);
colors.unshift('purple', 'black');
console.log(colors);
colors.splice(2, 2);
console.log(colors);
colors.splice(2, 1, 'indigo', 'orange', 'indigo black');
console.log(colors);


colors.forEach(function (value, index, array) {
    console.log(value, index, array);
});


var myArray = [1, 2, 3, 4, 5, 6, 1, 2, 2, 1, 4, 4, 5, 5, 8, 7, 6];

var x = myArray.filter(function (value) {
    return value > 3;
});

console.log(x);

//filter concept
var fillteredArray = myArray.filter(function (value, index, array) {
    return myArray.indexOf(value) === index;


});
console.log(fillteredArray);

// //for of loop
for (var x of myArray) {
    console.log(x);
}

//for in loop
console.log('for in output');
for (var index in colors) {
    console.log('the value is' + colors[index] + ' and the index is ' + index);
}

var movie = {
    name: 'Duniyadari',
    actor: 'Ankush Choudary',
    actress: 'Sai Tamhanta',
    director: 'Sanjat Jadhav'
};

for( var key in movie){
    console.log(key +":"+movie[key] );

}




// setTimeout(function(){
//     console.log('10 seconds done')

// },10000);

// var i=1;
// setInterval(function() {
//     console.log(i);
//     i++;

// }, 100);

// //callback concept
// function test(cb){
//     console.log('test function started');
//     cb();
//     console.log('test function ended');
// }
// test(function(){
//     console.log('callback function is being exexcuted');
// });