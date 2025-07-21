package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class i77 {
    private final String a;

    public static final class a extends i77 {
        public static final a b = new a();

        private a() {
            super("Facebook", null);
        }
    }

    public static final class b extends i77 {
        public static final b b = new b();

        private b() {
            super("Google", null);
        }
    }

    public /* synthetic */ i77(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private i77(String str) {
        this.a = str;
    }
}
