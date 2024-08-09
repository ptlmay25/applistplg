export interface AppListPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
