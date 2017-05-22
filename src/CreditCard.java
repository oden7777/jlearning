/**
 * Created by suyamayutaro on 2017/05/21.
 */
public class CreditCard {

    protected Member member;
    protected ExpirationDate date;
    protected CardBrand cardBrand;
    protected CardNumber cardNumber;

    CreditCard(Member member, ExpirationDate date, CardBrand cardBrand, CardNumber cardNumber)
    {
        this.member     = member;
        this.date       = date;
        this.cardBrand  = cardBrand;
        this.cardNumber = cardNumber;
    }

    public void show()
    {
        System.out.println("--------------------------------------");
        System.out.println(String.format("会員名：%s", this.member.getFullName()));
        System.out.println(String.format("有効期限：%s", this.date.getFormattedDate()));
        System.out.println(String.format("クレジットカード番号：%s", this.cardBrand.getNumber(this.cardNumber.getNumber())));
        System.out.println("--------------------------------------");
    }
}