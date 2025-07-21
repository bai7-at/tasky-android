package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class pe2 {
    public static final a h = new a(null);
    private final long a;
    private final long b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public pe2(long j, long j2, long j3, int i, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = j4;
        this.f = j5;
        this.g = j6;
    }

    public final pe2 a(long j, long j2, long j3, int i, long j4, long j5, long j6) {
        return new pe2(j, j2, j3, i, j4, j5, j6);
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.b;
    }

    public final long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe2)) {
            return false;
        }
        pe2 pe2Var = (pe2) obj;
        return this.a == pe2Var.a && this.b == pe2Var.b && this.c == pe2Var.c && this.d == pe2Var.d && this.e == pe2Var.e && this.f == pe2Var.f && this.g == pe2Var.g;
    }

    public final long f() {
        return this.c;
    }

    public final int g() {
        return this.d;
    }

    public final long h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Long.hashCode(this.f)) * 31) + Long.hashCode(this.g);
    }

    public final long i() {
        return this.a;
    }

    public String toString() {
        return "FilePersistenceConfig(recentDelayMs=" + this.a + ", maxBatchSize=" + this.b + ", maxItemSize=" + this.c + ", maxItemsPerBatch=" + this.d + ", oldFileThreshold=" + this.e + ", maxDiskSpace=" + this.f + ", cleanupFrequencyThreshold=" + this.g + ")";
    }

    public /* synthetic */ pe2(long j, long j2, long j3, int i, long j4, long j5, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5000L : j, (i2 & 2) != 0 ? PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED : j2, (i2 & 4) != 0 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : j3, (i2 & 8) != 0 ? 500 : i, (i2 & 16) != 0 ? 64800000L : j4, (i2 & 32) != 0 ? 536870912L : j5, (i2 & 64) == 0 ? j6 : BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
    }
}
