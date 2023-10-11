import { registerPlugin } from '@capacitor/core';

import type { CapacitorEnvPlugin } from './definitions';

const CapacitorEnv = registerPlugin<CapacitorEnvPlugin>('CapacitorEnv', {
  web: () => import('./web').then(m => new m.CapacitorEnvWeb()),
});

export * from './definitions';
export { CapacitorEnv };
