//literal way of object Creation
var student = {
    name:'Sneha Jadhav',    //use comma not semicolon in object
    age: 22,
    degree: 'BE',
    phoneNumber: 8692954488
};
console.log(student.name);
console.log(student);

student.phoneNumber = 123456789
console.log(student.phoneNumber);

student.selectedCompany = 'Capgemini';
console.log(student.selectedCompany);

//using object Constructor
var laptop = new Object();
laptop.brand = 'Acer';
laptop.ram = 'GB';
laptop.processor = 'core i3';
laptop.price = 36999;

console.log(laptop.processor);
console.log(Object.keys(laptop));
console.log(Object.keys(laptop).length);
