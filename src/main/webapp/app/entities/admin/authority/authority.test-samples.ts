import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '6f599a68-f3dd-498f-a85e-5c30fa58584f',
};

export const sampleWithPartialData: IAuthority = {
  name: 'bcf085ee-352b-4db7-b230-9919324e45b1',
};

export const sampleWithFullData: IAuthority = {
  name: 'e618df46-0057-42ba-a71e-6f6be07c1946',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
