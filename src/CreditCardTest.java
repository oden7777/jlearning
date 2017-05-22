/**
 * Created by suyamayutaro on 2017/05/21.
 */
public class CreditCardTest {

    public static void main(String[] args) {
        Member member = new Member("Yutaro", "Suyama");
        ExpirationDate date = new ExpirationDate("2020-08-01");
        CardBrand cardBrand = CardBrand.getCardBrand("VISA");
        CardNumber cardNumber = new CardNumber(4123456789101234L);

        CreditCard creditCard = new CreditCard(member, date, cardBrand, cardNumber);
        creditCard.show();
    }
}