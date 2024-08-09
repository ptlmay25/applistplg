import { registerPlugin } from '@capacitor/core';

import type { AppListPluginPlugin } from './definitions';

const AppListPlugin = registerPlugin<AppListPluginPlugin>('AppListPlugin', {
  web: () => import('./web').then(m => new m.AppListPluginWeb()),
});

export * from './definitions';
export { AppListPlugin };
