package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class np5 {
    public static final a a = new a(null);
    private static final int b = c(0);
    private static final int c = c(1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return np5.c;
        }

        public final int b() {
            return np5.b;
        }

        private a() {
        }
    }

    public static int c(int i) {
        return i;
    }

    public static final boolean d(int i, int i2) {
        return i == i2;
    }

    public static int e(int i) {
        return Integer.hashCode(i);
    }
}
