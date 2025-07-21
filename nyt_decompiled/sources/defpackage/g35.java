package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class g35 {
    public static final a a = new a(null);
    private static final int b = d(1);
    private static final int c = d(2);
    private static final int d = d(3);
    private static final int e = d(4);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return g35.b;
        }

        public final int b() {
            return g35.c;
        }

        public final int c() {
            return g35.e;
        }

        private a() {
        }
    }

    public static int d(int i) {
        return i;
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }
}
