package defpackage;

import androidx.paging.DiffingChangePayload;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class jl5 {
    public static final jl5 a = new jl5();

    private static final class a implements d64 {
        public static final C0491a i = new C0491a(null);
        private final zt5 a;
        private final zt5 b;
        private final d64 c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        /* renamed from: jl5$a$a, reason: collision with other inner class name */
        public static final class C0491a {
            public /* synthetic */ C0491a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0491a() {
            }
        }

        public a(zt5 zt5Var, zt5 zt5Var2, d64 d64Var) {
            zq3.h(zt5Var, "oldList");
            zq3.h(zt5Var2, "newList");
            zq3.h(d64Var, "callback");
            this.a = zt5Var;
            this.b = zt5Var2;
            this.c = d64Var;
            this.d = zt5Var.f();
            this.e = zt5Var.j();
            this.f = zt5Var.c();
            this.g = 1;
            this.h = 1;
        }

        private final boolean e(int i2, int i3) {
            if (i2 < this.f || this.h == 2) {
                return false;
            }
            int min = Math.min(i3, this.e);
            if (min > 0) {
                this.h = 3;
                this.c.c(this.d + i2, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.e -= min;
            }
            int i4 = i3 - min;
            if (i4 <= 0) {
                return true;
            }
            this.c.a(i2 + min + this.d, i4);
            return true;
        }

        private final boolean f(int i2, int i3) {
            if (i2 > 0 || this.g == 2) {
                return false;
            }
            int min = Math.min(i3, this.d);
            if (min > 0) {
                this.g = 3;
                this.c.c((0 - min) + this.d, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.d -= min;
            }
            int i4 = i3 - min;
            if (i4 <= 0) {
                return true;
            }
            this.c.a(this.d, i4);
            return true;
        }

        private final boolean g(int i2, int i3) {
            if (i2 + i3 < this.f || this.h == 3) {
                return false;
            }
            int d = uo6.d(Math.min(this.b.j() - this.e, i3), 0);
            int i4 = i3 - d;
            if (d > 0) {
                this.h = 2;
                this.c.c(this.d + i2, d, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.e += d;
            }
            if (i4 <= 0) {
                return true;
            }
            this.c.b(i2 + d + this.d, i4);
            return true;
        }

        private final boolean h(int i2, int i3) {
            if (i2 > 0 || this.g == 3) {
                return false;
            }
            int d = uo6.d(Math.min(this.b.f() - this.d, i3), 0);
            int i4 = i3 - d;
            if (i4 > 0) {
                this.c.b(this.d, i4);
            }
            if (d <= 0) {
                return true;
            }
            this.g = 2;
            this.c.c(this.d, d, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
            this.d += d;
            return true;
        }

        private final void i() {
            int min = Math.min(this.a.f(), this.d);
            int f = this.b.f() - this.d;
            if (f > 0) {
                if (min > 0) {
                    this.c.c(0, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                this.c.a(0, f);
            } else if (f < 0) {
                this.c.b(0, -f);
                int i2 = min + f;
                if (i2 > 0) {
                    this.c.c(0, i2, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.d = this.b.f();
        }

        private final void k() {
            int min = Math.min(this.a.j(), this.e);
            int j = this.b.j();
            int i2 = this.e;
            int i3 = j - i2;
            int i4 = this.d + this.f + i2;
            int i5 = i4 - min;
            boolean z = i5 != this.a.a() - min;
            if (i3 > 0) {
                this.c.a(i4, i3);
            } else if (i3 < 0) {
                this.c.b(i4 + i3, -i3);
                min += i3;
            }
            if (min > 0 && z) {
                this.c.c(i5, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            this.e = this.b.j();
        }

        @Override // defpackage.d64
        public void a(int i2, int i3) {
            if (!e(i2, i3) && !f(i2, i3)) {
                this.c.a(i2 + this.d, i3);
            }
            this.f += i3;
        }

        @Override // defpackage.d64
        public void b(int i2, int i3) {
            if (!g(i2, i3) && !h(i2, i3)) {
                this.c.b(i2 + this.d, i3);
            }
            this.f -= i3;
        }

        @Override // defpackage.d64
        public void c(int i2, int i3, Object obj) {
            this.c.c(i2 + this.d, i3, obj);
        }

        @Override // defpackage.d64
        public void d(int i2, int i3) {
            d64 d64Var = this.c;
            int i4 = this.d;
            d64Var.d(i2 + i4, i3 + i4);
        }

        public final void j() {
            i();
            k();
        }
    }

    private jl5() {
    }

    public final void a(zt5 zt5Var, zt5 zt5Var2, d64 d64Var, yt5 yt5Var) {
        zq3.h(zt5Var, "oldList");
        zq3.h(zt5Var2, "newList");
        zq3.h(d64Var, "callback");
        zq3.h(yt5Var, "diffResult");
        a aVar = new a(zt5Var, zt5Var2, d64Var);
        yt5Var.a().c(aVar);
        aVar.j();
    }
}
