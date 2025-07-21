package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ch3 {
    public static final b k = new b(null);
    private static int l;
    private final String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final b49 f;
    private final long g;
    private final int h;
    private final boolean i;
    private final int j;

    public static final class a {
        private final String a;
        private final float b;
        private final float c;
        private final float d;
        private final float e;
        private final long f;
        private final int g;
        private final boolean h;
        private final ArrayList i;
        private C0133a j;
        private boolean k;

        public /* synthetic */ a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        private final b49 e(C0133a c0133a) {
            return new b49(c0133a.c(), c0133a.f(), c0133a.d(), c0133a.e(), c0133a.g(), c0133a.h(), c0133a.i(), c0133a.j(), c0133a.b(), c0133a.a());
        }

        private final void h() {
            if (this.k) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final C0133a i() {
            Object d;
            d = eh3.d(this.i);
            return (C0133a) d;
        }

        public final a a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            h();
            eh3.f(this.i, new C0133a(str, f, f2, f3, f4, f5, f6, f7, list, null, 512, null));
            return this;
        }

        public final a c(List list, int i, String str, yc0 yc0Var, float f, yc0 yc0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            h();
            i().a().add(new f49(str, list, i, yc0Var, f, yc0Var2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        public final ch3 f() {
            h();
            while (this.i.size() > 1) {
                g();
            }
            ch3 ch3Var = new ch3(this.a, this.b, this.c, this.d, this.e, e(this.j), this.f, this.g, this.h, 0, 512, null);
            this.k = true;
            return ch3Var;
        }

        public final a g() {
            Object e;
            h();
            e = eh3.e(this.i);
            i().a().add(e((C0133a) e));
            return this;
        }

        private a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j;
            this.g = i;
            this.h = z;
            ArrayList arrayList = new ArrayList();
            this.i = arrayList;
            C0133a c0133a = new C0133a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.j = c0133a;
            eh3.f(arrayList, c0133a);
        }

        /* renamed from: ch3$a$a, reason: collision with other inner class name */
        private static final class C0133a {
            private String a;
            private float b;
            private float c;
            private float d;
            private float e;
            private float f;
            private float g;
            private float h;
            private List i;
            private List j;

            public C0133a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = list2;
            }

            public final List a() {
                return this.j;
            }

            public final List b() {
                return this.i;
            }

            public final String c() {
                return this.a;
            }

            public final float d() {
                return this.c;
            }

            public final float e() {
                return this.d;
            }

            public final float f() {
                return this.b;
            }

            public final float g() {
                return this.e;
            }

            public final float h() {
                return this.f;
            }

            public final float i() {
                return this.g;
            }

            public final float j() {
                return this.h;
            }

            public /* synthetic */ C0133a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c49.e() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? nn0.b.g() : j, (i2 & 64) != 0 ? b90.a.z() : i, (i2 & 128) != 0 ? false : z, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int i;
            synchronized (this) {
                i = ch3.l;
                ch3.l = i + 1;
            }
            return i;
        }

        private b() {
        }
    }

    public /* synthetic */ ch3(String str, float f, float f2, float f3, float f4, b49 b49Var, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, b49Var, j, i, z, i2);
    }

    public final boolean c() {
        return this.i;
    }

    public final float d() {
        return this.c;
    }

    public final float e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch3)) {
            return false;
        }
        ch3 ch3Var = (ch3) obj;
        return zq3.c(this.a, ch3Var.a) && bu1.j(this.b, ch3Var.b) && bu1.j(this.c, ch3Var.c) && this.d == ch3Var.d && this.e == ch3Var.e && zq3.c(this.f, ch3Var.f) && nn0.t(this.g, ch3Var.g) && b90.E(this.h, ch3Var.h) && this.i == ch3Var.i;
    }

    public final int f() {
        return this.j;
    }

    public final String g() {
        return this.a;
    }

    public final b49 h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + bu1.k(this.b)) * 31) + bu1.k(this.c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + this.f.hashCode()) * 31) + nn0.z(this.g)) * 31) + b90.F(this.h)) * 31) + Boolean.hashCode(this.i);
    }

    public final int i() {
        return this.h;
    }

    public final long j() {
        return this.g;
    }

    public final float k() {
        return this.e;
    }

    public final float l() {
        return this.d;
    }

    private ch3(String str, float f, float f2, float f3, float f4, b49 b49Var, long j, int i, boolean z, int i2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = b49Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public /* synthetic */ ch3(String str, float f, float f2, float f3, float f4, b49 b49Var, long j, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, b49Var, j, i, z, (i3 & 512) != 0 ? k.a() : i2, null);
    }
}
