export interface CapacitorEnvPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
