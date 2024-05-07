public class Hospede extends Thread {
    private int idHospede;
    private Quarto quartoAlocado; // Referência ao objeto Quarto
    private boolean emPasseio;

    public Hospede(int idHospede) {
        super("Hospede-" + idHospede); // Dando um nome mais descritivo à thread
        this.idHospede = idHospede;
        this.quartoAlocado = null; // Inicialmente, não está alocado em nenhum quarto
        this.emPasseio = false;    // Inicialmente, não está em passeio
    }

    //Setter e Getter do Quarto
    public void setQuartoAlocado(Quarto quartoAlocado) {
        this.quartoAlocado = quartoAlocado;
    }

    public Quarto getQuartoAlocado() {
        return quartoAlocado;
    }

    //Setter e getter do emPasseio
    public void setEmPasseio(boolean emPasseio) {
        this.emPasseio = emPasseio;
    }

    public boolean isEmPasseio() {
        return emPasseio;

    }

    //    getter e setter do idHospede
    public int getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }

    @Override
    public String toString() {
        String quartoInfo = (quartoAlocado != null) ? String.valueOf(quartoAlocado.getNumeroDoQuarto()) : "Nenhum";
        return String.format("Hospede[ID=%d, Quarto=%s, Em Passeio=%s]",
                idHospede, quartoInfo, emPasseio ? "Sim" : "Não");
    }

    @Override
    public void run() {
        while (true) {
            // Tentar alocar um quarto se ainda não tiver um
            if (quartoAlocado == null) {
                // Simular interação com recepcionista para alocar quarto
                // (Você precisará de uma maneira de acessar os recepcionistas aqui)
            }

            // Simular o hóspede saindo para passear
            try {
                Thread.sleep(1000); // Representa o tempo passeando
                setEmPasseio(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Simular hóspede voltando do passeio
            setEmPasseio(false);

            // Implementar outras lógicas de comportamento conforme necessário
        }
    }


}
