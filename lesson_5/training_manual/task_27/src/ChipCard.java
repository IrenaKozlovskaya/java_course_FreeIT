import abstractClases.СontactСard;

public class ChipCard extends СontactСard {
    public ChipCard(String pay_system, String id, String terminal_interaction) {
        super(pay_system, id, terminal_interaction);
    }

    @Override
    public void pay() {
        System.out.println("Вставьте карту с чипом в терминал");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
