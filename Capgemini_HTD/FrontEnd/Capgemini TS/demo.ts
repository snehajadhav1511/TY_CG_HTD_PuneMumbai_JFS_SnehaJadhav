let myString ='Sneha';
//myString= 123;  error--We cannaot change the datatype here

let company;  //imlicitly it will be considered as any 
company = 123;
company = 'Cg';
company = true;

//union type
let age:string | number;

age = 22;
age = 'Twenty two';
//age =true;   //error--only string or number can be stored

//tuple
let details:[string,number,number] = ['sneha',2,5]

//array
let detail = ['iphone','Samsang',5050,true];
let mobiles: string[] = ['iphone','Samsang','5050','true'];

function add(a: number,b: number): number{
 return a+b;
}
