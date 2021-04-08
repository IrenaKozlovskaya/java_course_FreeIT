import abstractClases.СontactСard;

public class MagneticStripeCard extends СontactСard {
    public MagneticStripeCard(String pay_system, String id, String terminal_interaction) {
        super(pay_system, id, terminal_interaction);
    }

    @Override
    public void pay() {
        System.out.println("Проведите магнитной полосой карты через терминал");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
