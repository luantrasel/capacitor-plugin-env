import { WebPlugin } from '@capacitor/core';

import type { CapacitorEnvPlugin } from './definitions';

export class CapacitorEnvWeb extends WebPlugin implements CapacitorEnvPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
