import { WebPlugin } from '@capacitor/core';

import type { AppListPluginPlugin } from './definitions';

export class AppListPluginWeb extends WebPlugin implements AppListPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
