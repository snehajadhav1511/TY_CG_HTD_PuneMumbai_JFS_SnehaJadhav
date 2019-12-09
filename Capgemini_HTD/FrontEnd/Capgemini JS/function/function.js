//anonymous function with expression
var x = function(){
    console.log('Hello from anonymous function')
}//calling a function
x();

//naming function
function add(a,d){
    console.log(a+d);
}
//calling a function
add(2345,678);

//immediately invite function
(function(x,y){
    console.log('the value is ',x*y)
})(12,12);

//understanding return statement
function division(a,b){
    return a/b;
}

console.log(division(1464352174,12))
