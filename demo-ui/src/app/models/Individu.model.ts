import { Contact } from './Contact.model';

export class Individu {
    
    public id:number;

    constructor(
        public nom: string,
        public prenom: string,
        public employe: Object,
        public contact: Contact[],
        public ville: string,
    ) {
    }
}