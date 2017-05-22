import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by suyamayutaro on 2017/05/21.
 */
public enum CardBrand {
    VISA() {
        public String getNumber(long cardNumber)
        {
            StringBuilder number = new StringBuilder();
            Matcher m = Pattern.compile("[\\s\\S]{1,4}").matcher(String.valueOf(cardNumber));
            while (m.find()) {
                number.append(String.format("%s ", m.group()));
            }
            String num = new String(number);
            num = num.substring(0, num.length()-1);

            return num;
        }
    };

    abstract public String getNumber(long cardNumber);

    public static CardBrand getCardBrand(String str)
    {
        CardBrand[] cardBrands = CardBrand.values();

        for (CardBrand cardBrand : cardBrands) {
            if (str.equals(cardBrand.toString())) {
                return cardBrand;
            }
        }

        return null;
    }
}