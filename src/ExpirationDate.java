import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by suyamayutaro on 2017/05/21.
 */
public class ExpirationDate {

    private ZonedDateTime date;
    private static final ZoneId ASIA_TOKYO = ZoneId.of("Asia/Tokyo");


    ExpirationDate(String targetDate)
    {
        if (!isValid(targetDate)) {
            throw new IllegalArgumentException("不正な値");
        }
        // タイムゾーンあり日時
        this.date = LocalDateTime.parse(String.format("%sT00:00:00.000", targetDate)).atZone(ASIA_TOKYO);
    }

    private boolean isValid(String targetDate)
    {
        // フォーマットチェック
        try {
            ZonedDateTime date = LocalDateTime.parse(String.format("%sT00:00:00.000", targetDate)).atZone(ASIA_TOKYO);
            // 現在より未来かどうか
            if (date.compareTo(ZonedDateTime.now(ASIA_TOKYO)) == -1) {
                return false;
            }
        } catch (DateTimeException ex) {
            return false;
        }

        return true;
    }

    public String getFormattedDate()
    {
        return this.date.format(DateTimeFormatter.ofPattern("MM / yy"));
    }
}