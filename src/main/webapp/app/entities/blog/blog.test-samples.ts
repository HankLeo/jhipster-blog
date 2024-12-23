import { IBlog, NewBlog } from './blog.model';

export const sampleWithRequiredData: IBlog = {
  id: 8698,
  name: 'pant ecliptic lox',
  handle: 'safeguard',
};

export const sampleWithPartialData: IBlog = {
  id: 27485,
  name: 'oh shush',
  handle: 'digestive',
};

export const sampleWithFullData: IBlog = {
  id: 24632,
  name: 'that',
  handle: 'excepting boo stark',
};

export const sampleWithNewData: NewBlog = {
  name: 'pace',
  handle: 'known courteous',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
