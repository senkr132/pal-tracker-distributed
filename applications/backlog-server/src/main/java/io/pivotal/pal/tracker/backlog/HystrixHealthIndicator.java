package io.pivotal.pal.tracker.backlog;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HystrixHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        Health.Builder builder = new Health.Builder();

        builder.up();

        return builder.build();
    }
}
