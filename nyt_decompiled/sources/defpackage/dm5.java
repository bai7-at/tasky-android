package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class dm5 {
    private final String a;

    public static final class a extends dm5 {
        public static final a b = new a();

        private a() {
            super("InvalidReceipt", null);
        }
    }

    public static final class b extends dm5 {
        public static final b b = new b();

        private b() {
            super("ServerError", null);
        }
    }

    public static final class c extends dm5 {
        public static final c b = new c();

        private c() {
            super("Mock Success (Creates Temp Entitlement)", null);
        }
    }

    public /* synthetic */ dm5(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private dm5(String str) {
        this.a = str;
    }
}
