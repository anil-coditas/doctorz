import { BaseEntity, User } from './../../shared';

export class School implements BaseEntity {
    constructor(
        public id?: number,
        public schoolName?: string,
        public area?: string,
        public city?: string,
        public pin?: string,
        public state?: string,
        public address?: string,
        public country?: string,
        public email?: string,
        public user_school_mappings?: User[],
    ) {
    }
}
