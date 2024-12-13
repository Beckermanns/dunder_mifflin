import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 13623,
  login: '06@9ayQPj',
};

export const sampleWithPartialData: IUser = {
  id: 31401,
  login: 'nB8c1',
};

export const sampleWithFullData: IUser = {
  id: 29895,
  login: '79qN',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
