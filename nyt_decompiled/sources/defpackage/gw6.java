package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class gw6 {
    private final String a;

    public static final class a extends gw6 {
        public static final a b = new a();

        private a() {
            super("event", null);
        }
    }

    public static final class b extends gw6 {
        public static final b b = new b();

        private b() {
            super("log", null);
        }
    }

    public static final class c extends gw6 {
        public static final c b = new c();

        private c() {
            super("http", null);
        }
    }

    public /* synthetic */ gw6(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private gw6(String str) {
        this.a = str;
    }
}
