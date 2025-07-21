package androidx.navigation;

import defpackage.zq3;

/* loaded from: classes.dex */
public final class h {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private String j;

    public static final class a {
        private boolean a;
        private boolean b;
        private String d;
        private boolean e;
        private boolean f;
        private int c = -1;
        private int g = -1;
        private int h = -1;
        private int i = -1;
        private int j = -1;

        public static /* synthetic */ a i(a aVar, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return aVar.g(i, z, z2);
        }

        public final h a() {
            String str = this.d;
            return str != null ? new h(this.a, this.b, str, this.e, this.f, this.g, this.h, this.i, this.j) : new h(this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public final a b(int i) {
            this.g = i;
            return this;
        }

        public final a c(int i) {
            this.h = i;
            return this;
        }

        public final a d(boolean z) {
            this.a = z;
            return this;
        }

        public final a e(int i) {
            this.i = i;
            return this;
        }

        public final a f(int i) {
            this.j = i;
            return this;
        }

        public final a g(int i, boolean z, boolean z2) {
            this.c = i;
            this.d = null;
            this.e = z;
            this.f = z2;
            return this;
        }

        public final a h(String str, boolean z, boolean z2) {
            this.d = str;
            this.c = -1;
            this.e = z;
            this.f = z2;
            return this;
        }

        public final a j(boolean z) {
            this.b = z;
            return this;
        }
    }

    public h(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.g;
    }

    public final int c() {
        return this.h;
    }

    public final int d() {
        return this.i;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && zq3.c(this.j, hVar.j) && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g && this.h == hVar.h && this.i == hVar.i;
    }

    public final String f() {
        return this.j;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.a;
    }

    public int hashCode() {
        int i = (((((h() ? 1 : 0) * 31) + (j() ? 1 : 0)) * 31) + this.c) * 31;
        String str = this.j;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + (g() ? 1 : 0)) * 31) + (i() ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        String str = this.j;
        if ((str != null || this.c != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.j;
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(this.c));
            }
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.f != -1 || this.g != -1 || this.h != -1 || this.i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.f));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.g));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.h));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.i));
            sb.append(")");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }

    public h(boolean z, boolean z2, String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, NavDestination.j.a(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.j = str;
    }
}
