import { BaseEntity } from './../../shared';

export class Student implements BaseEntity {
    constructor(
        public id?: number,
        public firstName?: string,
        public lastName?: string,
        public dob?: any,
        public gender?: string,
        public contactNo?: string,
        public age?: number,
        public parentFirstName?: string,
        public parentLastName?: string,
        public highRiskTag?: string,
        public studentClass?: string,
        public division?: string,
        public status?: string,
        public school?: BaseEntity,
    ) {
    }
}
