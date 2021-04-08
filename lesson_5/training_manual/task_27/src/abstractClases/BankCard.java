package abstractClases;

public abstract class BankCard {
    private String pay_system;
    private String id;
    private String terminal_interaction;

    public BankCard(String pay_system, String id, String terminal_interaction) {
        this.pay_system = pay_system;
        this.id = id;
        this.terminal_interaction = terminal_interaction;
    }

    public String getTerminal_interaction() {
        return terminal_interaction;
    }

    public void setTerminal_interaction(String terminal_interaction) {
        this.terminal_interaction = terminal_interaction;
    }

    public String getPay_system() {
        return pay_system;
    }

    public void setPay_system(String pay_system) {
        this.pay_system = pay_system;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Банковская карта:" +
                "платёжная система - " + pay_system +
                ", номер карты - " + id +
                ", взаимодействует с терминалом - " + terminal_interaction;
    }

    public abstract void pay();

}

