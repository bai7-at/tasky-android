package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class lb2 {
    public static final a e = new a(null);
    private static final lb2 f = new lb2(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 500, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED, 64800000);
    private final long a;
    private final int b;
    private final long c;
    private final long d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lb2 a() {
            return lb2.f;
        }

        private a() {
        }
    }

    public lb2(long j, int i, long j2, long j3) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb2)) {
            return false;
        }
        lb2 lb2Var = (lb2) obj;
        return this.a == lb2Var.a && this.b == lb2Var.b && this.c == lb2Var.c && this.d == lb2Var.d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.d);
    }

    public String toString() {
        return "FeatureStorageConfiguration(maxItemSize=" + this.a + ", maxItemsPerBatch=" + this.b + ", maxBatchSize=" + this.c + ", oldBatchThreshold=" + this.d + ")";
    }
}
