export interface IJefe {
  id: number;
  nombreJefe?: string | null;
  apellidoJefe?: string | null;
  telefonoJefe?: number | null;
  correoJefe?: string | null;
}

export type NewJefe = Omit<IJefe, 'id'> & { id: null };
