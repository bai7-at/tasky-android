package androidx.compose.ui.graphics;

import defpackage.vq8;
import defpackage.wk2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e {
    public static final a b = new a(null);
    private static final long c = vq8.a(0.5f, 0.5f);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return e.c;
        }

        private a() {
        }
    }

    private /* synthetic */ e(long j) {
        this.a = j;
    }

    public static final /* synthetic */ e b(long j) {
        return new e(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof e) && j == ((e) obj).j();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final float f(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float g(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ long j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }
}
