import { BaseEntity, User } from './../../shared';

export class Blog implements BaseEntity {
    constructor(
        public id?: number,
        public title?: string,
        public summary?: string,
        public content?: string,
        public create_at?: any,
        public written_by?: User,
    ) {
    }
}
