package test;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelyMessage implements Delayed {
    private String content;
    private long time;
    @Override
    public long getDelay(@NotNull TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(@NotNull Delayed o) {
        return 0;
    }
}
