export interface AppInfo {
  packageName: string;
  appName: string;
  versionName: string;
  versionCode: number;
}

export interface AppListPluginPlugin {
  getInstalledApps(): Promise<{ apps: AppInfo[] }>;
}
