package ChapterEleven.AtmbankValidation;

public class User {
    private CardType card=CardType.VISA_CARD;
    public CardType getCardTypeState() {
        return card;
    }

    public void setCard(CardType card) {
        this.card = card;
    }
}
