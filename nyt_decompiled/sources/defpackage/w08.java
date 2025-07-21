package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class w08 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return w08.b(null, 1, null);
        }

        private a() {
        }
    }

    public static String a(String str) {
        return str;
    }

    public static /* synthetic */ String b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = null;
        }
        return a(str);
    }

    public static final boolean c(String str, String str2) {
        return zq3.c(str, str2);
    }
}
