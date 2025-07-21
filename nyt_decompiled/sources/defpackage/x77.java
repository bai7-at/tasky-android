package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class x77 {
    public static final a Companion = new a(null);
    private final Object a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x77 a(Throwable th) {
            zq3.h(th, "exception");
            return new x77(new b(th), null);
        }

        public final x77 b(Object obj) {
            return new x77(obj, null);
        }

        private a() {
        }
    }

    private static final class b {
        private final Throwable a;

        public b(Throwable th) {
            zq3.h(th, "exception");
            this.a = th;
        }

        public final Throwable a() {
            return this.a;
        }
    }

    public /* synthetic */ x77(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    public final Object a() {
        Object obj = this.a;
        if (obj instanceof b) {
            throw ((b) obj).a();
        }
        return obj;
    }

    private x77(Object obj) {
        this.a = obj;
    }
}
