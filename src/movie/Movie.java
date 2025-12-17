package movie;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DisCountPolicy disCountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DisCountPolicy disCountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.disCountPolicy = disCountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screeing screeing) {
        return fee.minus(disCountPolicy.calculateDiscountAmonunt(screeing));
    }
}
