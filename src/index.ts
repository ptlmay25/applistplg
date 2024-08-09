import { registerPlugin } from '@capacitor/core';
import type { AppListPluginPlugin } from './definitions';

const AppListPlugin = registerPlugin<AppListPluginPlugin>('AppListPlugin');

export * from './definitions';
export { AppListPlugin };
