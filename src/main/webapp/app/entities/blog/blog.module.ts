import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JHipsterSharedModule } from '../../shared';
import { JHipsterAdminModule } from '../../admin/admin.module';
import {
    BlogService,
    BlogPopupService,
    BlogComponent,
    BlogDetailComponent,
    BlogDialogComponent,
    BlogPopupComponent,
    BlogDeletePopupComponent,
    BlogDeleteDialogComponent,
    blogRoute,
    blogPopupRoute,
    BlogResolvePagingParams,
} from './';

const ENTITY_STATES = [
    ...blogRoute,
    ...blogPopupRoute,
];

@NgModule({
    imports: [
        JHipsterSharedModule,
        JHipsterAdminModule,
        RouterModule.forChild(ENTITY_STATES)
    ],
    declarations: [
        BlogComponent,
        BlogDetailComponent,
        BlogDialogComponent,
        BlogDeleteDialogComponent,
        BlogPopupComponent,
        BlogDeletePopupComponent,
    ],
    entryComponents: [
        BlogComponent,
        BlogDialogComponent,
        BlogPopupComponent,
        BlogDeleteDialogComponent,
        BlogDeletePopupComponent,
    ],
    providers: [
        BlogService,
        BlogPopupService,
        BlogResolvePagingParams,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JHipsterBlogModule {}
