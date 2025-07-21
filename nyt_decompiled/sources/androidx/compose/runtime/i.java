package androidx.compose.runtime;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
abstract class i {
    public static final a a = new a(null);
    private static final int b = d(0);
    private static final int c = d(1);
    private static final int d = d(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i.b;
        }

        public final int b() {
            return i.c;
        }

        public final int c() {
            return i.d;
        }

        private a() {
        }
    }

    private static int d(int i) {
        return i;
    }
}
