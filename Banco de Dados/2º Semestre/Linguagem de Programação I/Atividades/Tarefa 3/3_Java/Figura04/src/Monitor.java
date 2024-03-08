public class Monitor {

    private int hz;
    private float polegadas;
    private String tipoTela;
    private boolean ligarTela;

    public void Monitor(int hz, double d, String tipoTela, boolean ligarTela) {

        this.hz = hz;
        this.polegadas = polegadas;
        this.tipoTela = tipoTela;
        this.ligarTela = ligarTela;
    }

    public void AumentarVol(int v, boolean s) {
        if (ligarTela) {
            if (s) {
                System.out.println("Você aumentou mais " + v + " de volume");
            } else {
                System.out.println("Você diminuiu menos " + v + " de volume") ;
            }
        }
        System.out.println("A tela está desligada");

    }

    public void DarZoom() {
        if (ligarTela) {
            System.out.println("Zoom aumentado com sucesso");

        } else {
            System.out.println("A tela está desligada");
        }

    }

    public void AumentarBrilho(boolean s) {
        if (ligarTela) {
            if (s) {
                System.out.println("Brilho aumentado");
            } else {
                System.out.println("Brilho diminuido");

            }

        } else {
            System.out.println("Tela desligada");
        }
    }

    public int getHz() {
        return hz;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }

    public float getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(float polegadas) {
        this.polegadas = polegadas;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }
    public boolean isLigarTela() {
        return ligarTela;
    }
    public void setLigarTela(boolean ligarTela) {
        this.ligarTela = ligarTela;
    }

    public void status() {
        System.out.println("A tela tem: " + getHz() + "Hz");
        System.out.println("A tela tem " + getPolegadas() +"'' polegadas");
        System.out.println("A tela está ligada?: " + isLigarTela() );
    }

}
