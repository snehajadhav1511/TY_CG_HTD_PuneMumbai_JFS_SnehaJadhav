
let person = {
    name: 'Saumya',
    age: 20
};

let student = {
    ...person,
    id: 1234,
    percentage: 89.90
};

console.log(student);

let thaneCR = ['Sneha', 'Nisha'];
let mumbaiCR = ['Saumya', 'Shubham'];
let panvelCR = ['Varsha', 'Namdev'];
let CRS = [
    ...mumbaiCR,
    ...panvelCR,
    ...thaneCR,
    'Anu'
];
console.log(CRS);

let [name1, name2, name3, ...restvalues] = CRS;

console.log(name1);
console.log(name2);
console.log(name3);
console.log(restvalues);

