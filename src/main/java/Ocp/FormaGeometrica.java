package Ocp;

public class FormaGeometrica {
    private TipoForma tipoForma;

    public FormaGeometrica(String tipoForma) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Ocp." + tipoForma);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            this.tipoForma = null;
        }
        if (!(objeto instanceof TipoForma)) {
            this.tipoForma = null;
        }
        this.tipoForma = (TipoForma) objeto;
    }

    public void exibir() {
        this.tipoForma.exibir();
    }

}
