public class Hash {
    public double item;
    public Estado estado;

    public enum Estado {
        LIVRE, OCUPADO, REMOVIDO
    }

    public Hash() {
        estado = Estado.LIVRE;
    }
}