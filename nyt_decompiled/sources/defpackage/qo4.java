package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class qo4 {
    public static final a Companion = new a(null);
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qo4 a(boolean z, boolean z2) {
            return new qo4(z, z2, false, 4, null);
        }

        public final qo4 b() {
            return new qo4(false, false, false, 6, null);
        }

        public final qo4 c(boolean z) {
            return new qo4(false, false, z, 3, null);
        }

        private a() {
        }
    }

    public qo4(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static final qo4 a() {
        return Companion.b();
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo4)) {
            return false;
        }
        qo4 qo4Var = (qo4) obj;
        return this.a == qo4Var.a && this.b == qo4Var.b && this.c == qo4Var.c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "MediaStartParams(shouldPlayVideoAd=" + this.a + ", playOnStart=" + this.b + ", shouldRequestAudioFocus=" + this.c + ")";
    }

    public /* synthetic */ qo4(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
