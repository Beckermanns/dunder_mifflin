import { IDepartamento, NewDepartamento } from './departamento.model';

export const sampleWithRequiredData: IDepartamento = {
  id: 14436,
};

export const sampleWithPartialData: IDepartamento = {
  id: 16809,
  nombreDepartamento: 'responsible',
  presupuestoDepartamento: 29908.57,
};

export const sampleWithFullData: IDepartamento = {
  id: 11553,
  nombreDepartamento: 'indeed',
  ubicacionDepartamento: 'quit',
  presupuestoDepartamento: 24271.32,
};

export const sampleWithNewData: NewDepartamento = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
