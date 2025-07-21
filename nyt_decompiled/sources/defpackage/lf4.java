package defpackage;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class lf4 {
    private final d a = a();
    private final kf4 b;
    private final View c;

    private static class b implements d {
        private OnBackInvokedCallback a;

        private b() {
        }

        @Override // lf4.d
        public void a(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        
            r3 = r3.findOnBackInvokedDispatcher();
         */
        @Override // lf4.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(defpackage.kf4 r2, android.view.View r3, boolean r4) {
            /*
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.a
                if (r0 == 0) goto L5
                return
            L5:
                android.window.OnBackInvokedDispatcher r3 = defpackage.mf4.a(r3)
                if (r3 != 0) goto Lc
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.c(r2)
                r1.a = r2
                if (r4 == 0) goto L18
                r1 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r1 = 0
            L19:
                defpackage.sk.a(r3, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lf4.b.b(kf4, android.view.View, boolean):void");
        }

        OnBackInvokedCallback c(final kf4 kf4Var) {
            Objects.requireNonNull(kf4Var);
            return new OnBackInvokedCallback() { // from class: nf4
                public final void onBackInvoked() {
                    kf4.this.c();
                }
            };
        }

        boolean d() {
            return this.a != null;
        }
    }

    private static class c extends b {

        class a implements OnBackAnimationCallback {
            final /* synthetic */ kf4 a;

            a(kf4 kf4Var) {
                this.a = kf4Var;
            }

            public void onBackCancelled() {
                if (c.this.d()) {
                    this.a.b();
                }
            }

            public void onBackInvoked() {
                this.a.c();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (c.this.d()) {
                    this.a.d(new h30(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (c.this.d()) {
                    this.a.a(new h30(backEvent));
                }
            }
        }

        private c() {
            super();
        }

        @Override // lf4.b
        OnBackInvokedCallback c(kf4 kf4Var) {
            return new a(kf4Var);
        }
    }

    private interface d {
        void a(View view);

        void b(kf4 kf4Var, View view, boolean z);
    }

    public lf4(kf4 kf4Var, View view) {
        this.b = kf4Var;
        this.c = view;
    }

    private static d a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new c();
        }
        if (i >= 33) {
            return new b();
        }
        return null;
    }

    private void c(boolean z) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.b(this.b, this.c, z);
        }
    }

    public void b() {
        c(false);
    }

    public void d() {
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(this.c);
        }
    }
}
