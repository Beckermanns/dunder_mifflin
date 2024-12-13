import { IEmpleado, NewEmpleado } from './empleado.model';

export const sampleWithRequiredData: IEmpleado = {
  id: 10731,
};

export const sampleWithPartialData: IEmpleado = {
  id: 1371,
  apellidoEmpleado: 'unfortunately across',
  correo: 'separately against',
};

export const sampleWithFullData: IEmpleado = {
  id: 10592,
  nombreEmpleado: 'furthermore',
  apellidoEmpleado: 'ick farm wheel',
  telefono: 333,
  correo: 'inquisitively woot indeed',
};

export const sampleWithNewData: NewEmpleado = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
