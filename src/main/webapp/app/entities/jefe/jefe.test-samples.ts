import { IJefe, NewJefe } from './jefe.model';

export const sampleWithRequiredData: IJefe = {
  id: 30135,
};

export const sampleWithPartialData: IJefe = {
  id: 7715,
  correoJefe: 'revoke fooey',
};

export const sampleWithFullData: IJefe = {
  id: 31389,
  nombreJefe: 'hypothesise yippee',
  apellidoJefe: 'pish queasily mobilise',
  telefonoJefe: 19531,
  correoJefe: 'uh-huh lest',
};

export const sampleWithNewData: NewJefe = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
