import { ITag, NewTag } from './tag.model';

export const sampleWithRequiredData: ITag = {
  id: 31833,
  name: 'meh tooth',
};

export const sampleWithPartialData: ITag = {
  id: 19895,
  name: 'duh consequently',
};

export const sampleWithFullData: ITag = {
  id: 10004,
  name: 'regarding candid',
};

export const sampleWithNewData: NewTag = {
  name: 'pessimistic before',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
