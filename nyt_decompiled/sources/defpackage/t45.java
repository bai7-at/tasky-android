package defpackage;

import android.net.NetworkRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t45 {
    public static final a b = new a(null);
    private static final String c;
    private final Object a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return t45.c;
        }

        private a() {
        }
    }

    static {
        String i = h94.i("NetworkRequestCompat");
        zq3.g(i, "tagWithPrefix(\"NetworkRequestCompat\")");
        c = i;
    }

    public t45(Object obj) {
        this.a = obj;
    }

    public final NetworkRequest b() {
        return (NetworkRequest) this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t45) && zq3.c(this.a, ((t45) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }

    public /* synthetic */ t45(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
