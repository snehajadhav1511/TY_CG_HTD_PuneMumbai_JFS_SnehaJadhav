class Student{
    constructor(
        public name: string,
        public age: number,
        public marks: number,
        public degree ?: string, 
        public id ?: string ){   //we are optional parameter at the last

    }
    printDetails(){
        console.log(`Name is ${this.name} age is ${this.age} and marks are ${this.marks} degree is ${this.degree}`);
    }
}

let student1 = new Student('Sneha',22,87);
console.log(student1);
student1.printDetails();

let student2 = { 
    name: 'Nisha',
    age: 22,
    marks: 97,
    degree: 'BE',
    id: '1234'
};
console.log(student2);

let Students: Student[]=[
    new Student('Saumya',20,98),
    student1
];