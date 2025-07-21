package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;

/* loaded from: classes.dex */
public final class ph9 {
    private final e a;

    private static class a extends e {
        protected final Window a;
        private final gx7 b;

        a(Window window, gx7 gx7Var) {
            this.a = window;
            this.b = gx7Var;
        }

        private void h(int i) {
            if (i == 1) {
                i(4);
            } else if (i == 2) {
                i(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.b.a();
            }
        }

        private void k(int i) {
            if (i == 1) {
                l(4);
                m(1024);
            } else if (i == 2) {
                l(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.b.b();
            }
        }

        @Override // ph9.e
        void a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    h(i2);
                }
            }
        }

        @Override // ph9.e
        void f(int i) {
            if (i == 0) {
                l(6144);
                return;
            }
            if (i == 1) {
                l(ProgressEvent.PART_FAILED_EVENT_CODE);
                i(ProgressEvent.PART_COMPLETED_EVENT_CODE);
            } else {
                if (i != 2) {
                    return;
                }
                l(ProgressEvent.PART_COMPLETED_EVENT_CODE);
                i(ProgressEvent.PART_FAILED_EVENT_CODE);
            }
        }

        @Override // ph9.e
        void g(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    k(i2);
                }
            }
        }

        protected void i(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void j(int i) {
            this.a.addFlags(i);
        }

        protected void l(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void m(int i) {
            this.a.clearFlags(i);
        }
    }

    private static class b extends a {
        b(Window window, gx7 gx7Var) {
            super(window, gx7Var);
        }

        @Override // ph9.e
        public boolean c() {
            return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // ph9.e
        public void e(boolean z) {
            if (!z) {
                l(8192);
                return;
            }
            m(67108864);
            j(RecyclerView.UNDEFINED_DURATION);
            i(8192);
        }
    }

    private static class c extends b {
        c(Window window, gx7 gx7Var) {
            super(window, gx7Var);
        }

        @Override // ph9.e
        public boolean b() {
            return (this.a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // ph9.e
        public void d(boolean z) {
            if (!z) {
                l(16);
                return;
            }
            m(134217728);
            j(RecyclerView.UNDEFINED_DURATION);
            i(16);
        }
    }

    private static class e {
        e() {
        }

        abstract void a(int i);

        public abstract boolean b();

        public abstract boolean c();

        public abstract void d(boolean z);

        public abstract void e(boolean z);

        abstract void f(int i);

        abstract void g(int i);
    }

    private ph9(WindowInsetsController windowInsetsController) {
        this.a = new d(windowInsetsController, this, new gx7(windowInsetsController));
    }

    public static ph9 h(WindowInsetsController windowInsetsController) {
        return new ph9(windowInsetsController);
    }

    public void a(int i) {
        this.a.a(i);
    }

    public boolean b() {
        return this.a.b();
    }

    public boolean c() {
        return this.a.c();
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public void e(boolean z) {
        this.a.e(z);
    }

    public void f(int i) {
        this.a.f(i);
    }

    public void g(int i) {
        this.a.g(i);
    }

    private static class d extends e {
        final ph9 a;
        final WindowInsetsController b;
        final gx7 c;
        private final hs7 d;
        protected Window e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(android.view.Window r2, defpackage.ph9 r3, defpackage.gx7 r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = defpackage.sh9.a(r2)
                r1.<init>(r0, r3, r4)
                r1.e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ph9.d.<init>(android.view.Window, ph9, gx7):void");
        }

        @Override // ph9.e
        void a(int i) {
            if ((i & 8) != 0) {
                this.c.a();
            }
            this.b.hide(i & (-9));
        }

        @Override // ph9.e
        public boolean b() {
            int systemBarsAppearance;
            this.b.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.b.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // ph9.e
        public boolean c() {
            int systemBarsAppearance;
            this.b.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // ph9.e
        public void d(boolean z) {
            if (z) {
                if (this.e != null) {
                    h(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.e != null) {
                    i(16);
                }
                this.b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // ph9.e
        public void e(boolean z) {
            if (z) {
                if (this.e != null) {
                    h(8192);
                }
                this.b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.e != null) {
                    i(8192);
                }
                this.b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // ph9.e
        void f(int i) {
            this.b.setSystemBarsBehavior(i);
        }

        @Override // ph9.e
        void g(int i) {
            if ((i & 8) != 0) {
                this.c.b();
            }
            this.b.show(i & (-9));
        }

        protected void h(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void i(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, ph9 ph9Var, gx7 gx7Var) {
            this.d = new hs7();
            this.b = windowInsetsController;
            this.a = ph9Var;
            this.c = gx7Var;
        }
    }

    public ph9(Window window, View view) {
        gx7 gx7Var = new gx7(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(window, this, gx7Var);
        } else {
            this.a = new c(window, gx7Var);
        }
    }
}
