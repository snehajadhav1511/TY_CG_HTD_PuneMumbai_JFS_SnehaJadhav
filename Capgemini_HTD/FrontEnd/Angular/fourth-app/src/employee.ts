export class Employee {
    constructor(
        public name: string,
        public empId: number,
        public email: string,
        public status: string,
        public phone: number,
        public pk ?: string
    ) {}
}