import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { DoctorzSchoolModule } from './school/school.module';
import { DoctorzStudentModule } from './student/student.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        DoctorzSchoolModule,
        DoctorzStudentModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class DoctorzEntityModule {}
