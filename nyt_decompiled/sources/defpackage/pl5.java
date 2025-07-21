package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class pl5 {
    private final String a;
    private final Long b;

    public static final class a extends pl5 {
        public static final a c = new a();

        private a() {
            super("30 Seconds", 30000L, null);
        }
    }

    public static final class b extends pl5 {
        public static final b c = new b();

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            super("No Override", null, 0 == true ? 1 : 0);
        }
    }

    public static final class c extends pl5 {
        public static final c c = new c();

        private c() {
            super("1 minute", 60000L, null);
        }
    }

    public static final class d extends pl5 {
        public static final d c = new d();

        private d() {
            super("2 minutes", 120000L, null);
        }
    }

    public /* synthetic */ pl5(String str, Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l);
    }

    public final Long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    private pl5(String str, Long l) {
        this.a = str;
        this.b = l;
    }
}
