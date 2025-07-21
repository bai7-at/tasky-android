package io.embrace.android.embracesdk.anr.detection;

import com.facebook.AuthenticationTokenClaims;
import defpackage.ku8;
import defpackage.uo6;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.payload.ResponsivenessOutlier;
import io.embrace.android.embracesdk.payload.ResponsivenessSnapshot;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ResponsivenessMonitor {
    public static final Companion Companion = new Companion(null);
    public static final int defaultOutlierLimit = 100;
    public static final long defaultOutlierThreshold = 500;
    private static final long unsetPingTime = -1;
    private final Clock clock;
    private final AtomicLong errors;
    private final AtomicLong firstPing;
    private final Map<Bucket, Long> gaps;
    private final AtomicLong latestPing;
    private final String name;
    private final long outlierThreshold;
    private final List<ResponsivenessOutlier> outliers;
    private final int outliersLimit;

    public enum Bucket {
        B1(120),
        B2(250),
        B3(500),
        B4(1000),
        B5(2000),
        B6(Long.MAX_VALUE);

        private final long max;

        Bucket(long j) {
            this.max = j;
        }

        public final long getMax() {
            return this.max;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ResponsivenessMonitor(Clock clock, String str, int i, long j) {
        zq3.h(clock, "clock");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.clock = clock;
        this.name = str;
        this.outliersLimit = i;
        this.outlierThreshold = j;
        this.outliers = new ArrayList();
        Bucket[] values = Bucket.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(values.length), 16));
        for (Bucket bucket : values) {
            linkedHashMap.put(bucket, 0L);
        }
        this.gaps = ku8.d(linkedHashMap);
        this.firstPing = new AtomicLong(-1L);
        this.latestPing = new AtomicLong(-1L);
        this.errors = new AtomicLong(0L);
    }

    private final boolean recordGap(long j, long j2) {
        Bucket bucket;
        long j3 = j - j2;
        if (j3 >= 0) {
            Bucket[] values = Bucket.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bucket = null;
                    break;
                }
                bucket = values[i];
                if (bucket.getMax() > j3) {
                    break;
                }
                i++;
            }
            if (bucket != null && this.gaps.containsKey(bucket)) {
                Map<Bucket, Long> map = this.gaps;
                Long l = map.get(bucket);
                map.put(bucket, Long.valueOf(l != null ? 1 + l.longValue() : 1L));
                if (bucket.getMax() <= this.outlierThreshold || this.outliers.size() >= this.outliersLimit) {
                    return true;
                }
                this.outliers.add(new ResponsivenessOutlier(j2, j));
                return true;
            }
        }
        return false;
    }

    public final synchronized void ping() {
        try {
            long andSet = this.latestPing.getAndSet(this.clock.now());
            if (andSet == -1) {
                this.firstPing.set(this.latestPing.get());
            } else if (!recordGap(this.latestPing.get(), andSet)) {
                this.errors.incrementAndGet();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void reset() {
        try {
            this.firstPing.set(-1L);
            this.latestPing.set(-1L);
            Map<Bucket, Long> map = this.gaps;
            Set<Bucket> keySet = map.keySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(keySet, 10)), 16));
            for (Object obj : keySet) {
                linkedHashMap.put(obj, 0L);
            }
            map.putAll(linkedHashMap);
            this.outliers.clear();
            this.errors.set(0L);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ResponsivenessSnapshot snapshot() {
        String str;
        long j;
        long j2;
        LinkedHashMap linkedHashMap;
        try {
            str = this.name;
            j = this.firstPing.get();
            j2 = this.latestPing.get();
            Map<Bucket, Long> map = this.gaps;
            linkedHashMap = new LinkedHashMap(t.e(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Bucket) ((Map.Entry) obj).getKey()).name(), ((Map.Entry) obj).getValue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return new ResponsivenessSnapshot(str, j, j2, linkedHashMap, i.X0(this.outliers), this.errors.get());
    }

    public /* synthetic */ ResponsivenessMonitor(Clock clock, String str, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(clock, str, (i2 & 4) != 0 ? 100 : i, (i2 & 8) != 0 ? 500L : j);
    }
}
