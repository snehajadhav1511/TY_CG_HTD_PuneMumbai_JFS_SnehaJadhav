var Student = /** @class */ (function () {
    function Student(name, age, marks, degree, id) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
        this.id = id;
    }
    Student.prototype.printDetails = function () {
        console.log("Name is " + this.name + " age is " + this.age + " and marks are " + this.marks);
    };
    return Student;
}());
var student1 = new Student('Sneha', 22, 87);
console.log(student1);
student1.printDetails();
var student2 = {
    name: 'Nisha',
    age: 22,
    degree: 'BE',
    id: '1234'
};
console.log(student2);
