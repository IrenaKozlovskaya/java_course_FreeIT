package abstractClases;

public abstract class СontactlessСard extends BankCard {
    private String contactless_card_sign;
    private String technologies;

    public СontactlessСard(String pay_system, String id, String terminal_interaction, String contactless_card_sign, String technologies) {
        super(pay_system, id, terminal_interaction);
        this.contactless_card_sign = contactless_card_sign;
        this.technologies = technologies;
    }

    public String getContactless_card_sign() {
        return contactless_card_sign;
    }

    public void setContactless_card_sign(String contactless_card_sign) {
        this.contactless_card_sign = contactless_card_sign;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    @Override
    public void pay() {
        System.out.println("Приложите карточку к терминалу");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", знак бесконтактной карты на лицевой стороне - \"" + contactless_card_sign +
                "\", используемые технологии - " + technologies;
    }
}
