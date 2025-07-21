package io.embrace.android.embracesdk.internal.logs;

import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.CacheableValue;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class LogCounter {
    private final CacheableValue<List<String>> cache;
    private final Clock clock;
    private final AtomicInteger count;
    private final qs2 getConfigLogLimit;
    private final NavigableMap<Long, String> logIds;
    private final InternalEmbraceLogger logger;
    private final String name;

    public LogCounter(String str, Clock clock, qs2 qs2Var, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(clock, "clock");
        zq3.h(qs2Var, "getConfigLogLimit");
        zq3.h(internalEmbraceLogger, "logger");
        this.name = str;
        this.clock = clock;
        this.getConfigLogLimit = qs2Var;
        this.logger = internalEmbraceLogger;
        this.count = new AtomicInteger(0);
        this.logIds = new ConcurrentSkipListMap();
        this.cache = new CacheableValue<>(new qs2() { // from class: io.embrace.android.embracesdk.internal.logs.LogCounter$cache$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                NavigableMap navigableMap;
                navigableMap = LogCounter.this.logIds;
                return Integer.valueOf(navigableMap.size());
            }
        });
    }

    public final boolean addIfAllowed(String str) {
        zq3.h(str, "logId");
        long now = this.clock.now();
        this.count.incrementAndGet();
        if (this.logIds.size() < ((Number) this.getConfigLogLimit.mo865invoke()).intValue()) {
            this.logIds.put(Long.valueOf(now), str);
            return true;
        }
        this.logger.log(this.name + " log limit has been reached.", InternalEmbraceLogger.Severity.WARNING, null, false);
        return false;
    }

    public final void clear() {
        this.count.set(0);
        this.logIds.clear();
    }

    public final List<String> findLogIds(final long j, final long j2) {
        return this.cache.value(new qs2() { // from class: io.embrace.android.embracesdk.internal.logs.LogCounter$findLogIds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<String> mo865invoke() {
                NavigableMap navigableMap;
                navigableMap = LogCounter.this.logIds;
                return new ArrayList(navigableMap.subMap(Long.valueOf(j), Long.valueOf(j2)).values());
            }
        });
    }

    public final int getCount() {
        return this.count.get();
    }
}
