import { WebPlugin } from '@capacitor/core';
import type { AppListPluginPlugin, AppInfo } from './definitions';

export class AppListPluginWeb extends WebPlugin implements AppListPluginPlugin {
  async getInstalledApps(): Promise<{ apps: AppInfo[] }> {
    console.warn('getInstalledApps is not available in the browser');
    return { apps: [] };
  }
}
