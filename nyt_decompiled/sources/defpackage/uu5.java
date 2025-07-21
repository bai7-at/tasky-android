package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class uu5 {
    public static final a c = new a(null);
    private static final uu5 d = new uu5();
    private final boolean a;
    private final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final uu5 a() {
            return uu5.d;
        }

        private a() {
        }
    }

    public /* synthetic */ uu5(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final uu5 d(uu5 uu5Var) {
        return uu5Var == null ? this : uu5Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu5)) {
            return false;
        }
        uu5 uu5Var = (uu5) obj;
        return this.a == uu5Var.a && b02.f(this.b, uu5Var.b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.a) * 31) + b02.g(this.b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) b02.h(this.b)) + ')';
    }

    public uu5(boolean z) {
        this.a = z;
        this.b = b02.b.a();
    }

    private uu5(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public uu5() {
        this(b02.b.a(), false, null);
    }
}
