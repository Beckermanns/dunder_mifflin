import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'dunderMifflinApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'empleado',
    data: { pageTitle: 'dunderMifflinApp.empleado.home.title' },
    loadChildren: () => import('./empleado/empleado.routes'),
  },
  {
    path: 'departamento',
    data: { pageTitle: 'dunderMifflinApp.departamento.home.title' },
    loadChildren: () => import('./departamento/departamento.routes'),
  },
  {
    path: 'jefe',
    data: { pageTitle: 'dunderMifflinApp.jefe.home.title' },
    loadChildren: () => import('./jefe/jefe.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
