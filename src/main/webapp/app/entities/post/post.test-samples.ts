import dayjs from 'dayjs/esm';

import { IPost, NewPost } from './post.model';

export const sampleWithRequiredData: IPost = {
  id: 1344,
  title: 'concerning hmph',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-12-22T23:16'),
};

export const sampleWithPartialData: IPost = {
  id: 31648,
  title: 'decent',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-12-23T03:29'),
};

export const sampleWithFullData: IPost = {
  id: 17087,
  title: 'plus',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-12-22T18:56'),
};

export const sampleWithNewData: NewPost = {
  title: 'programme rich',
  content: '../fake-data/blob/hipster.txt',
  date: dayjs('2024-12-22T16:12'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
