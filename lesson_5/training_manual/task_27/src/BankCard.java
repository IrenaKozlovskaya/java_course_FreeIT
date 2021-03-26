/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class BankCard {

}

class MultilateralCard extends BankCard {

}

class CreditCard extends MultilateralCard {

}

class DebitCard extends MultilateralCard {

}

class DoubleSidedCard extends BankCard {

}

class PrivateCardWithBankParticipation extends DoubleSidedCard {

}
