package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class bt4 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final a e = new a(null);
    private static final Map f = new HashMap();
    private final Set a;
    private final Handler b;
    private final WeakReference c;
    private final AtomicBoolean d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2) {
            return zq3.c("r2", str) ? new Regex("[^\\d.]").e(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r6.equals("r5") == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            r7 = new kotlin.text.Regex("[^a-z]+").e(r7, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r6.equals("r4") == false) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(java.util.Map r5, java.lang.String r6, java.lang.String r7) {
            /*
                r4 = this;
                int r4 = r6.hashCode()
                r0 = 0
                r1 = 2
                r2 = 0
                switch(r4) {
                    case 3585: goto L5e;
                    case 3586: goto L47;
                    case 3587: goto L3e;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L83
            Lc:
                java.lang.String r4 = "r6"
                boolean r4 = r6.equals(r4)
                if (r4 != 0) goto L16
                goto L83
            L16:
                java.lang.String r4 = "-"
                boolean r0 = kotlin.text.h.P(r7, r4, r2, r1, r0)
                if (r0 == 0) goto L83
                kotlin.text.Regex r0 = new kotlin.text.Regex
                r0.<init>(r4)
                java.util.List r4 = r0.g(r7, r2)
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.String[] r7 = new java.lang.String[r2]
                java.lang.Object[] r4 = r4.toArray(r7)
                if (r4 == 0) goto L36
                java.lang.String[] r4 = (java.lang.String[]) r4
                r7 = r4[r2]
                goto L83
            L36:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
                r4.<init>(r5)
                throw r4
            L3e:
                java.lang.String r4 = "r5"
                boolean r4 = r6.equals(r4)
                if (r4 != 0) goto L50
                goto L83
            L47:
                java.lang.String r4 = "r4"
                boolean r4 = r6.equals(r4)
                if (r4 != 0) goto L50
                goto L83
            L50:
                kotlin.text.Regex r4 = new kotlin.text.Regex
                java.lang.String r0 = "[^a-z]+"
                r4.<init>(r0)
                java.lang.String r0 = ""
                java.lang.String r7 = r4.e(r7, r0)
                goto L83
            L5e:
                java.lang.String r4 = "r3"
                boolean r4 = r6.equals(r4)
                if (r4 != 0) goto L67
                goto L83
            L67:
                java.lang.String r4 = "m"
                boolean r3 = kotlin.text.h.K(r7, r4, r2, r1, r0)
                if (r3 != 0) goto L82
                java.lang.String r3 = "b"
                boolean r3 = kotlin.text.h.K(r7, r3, r2, r1, r0)
                if (r3 != 0) goto L82
                java.lang.String r3 = "ge"
                boolean r7 = kotlin.text.h.K(r7, r3, r2, r1, r0)
                if (r7 == 0) goto L80
                goto L82
            L80:
                java.lang.String r4 = "f"
            L82:
                r7 = r4
            L83:
                r5.put(r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bt4.a.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void e(Activity activity) {
            zq3.h(activity, "activity");
            int hashCode = activity.hashCode();
            Map b = bt4.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b.get(valueOf);
            if (obj == null) {
                obj = new bt4(activity, null);
                b.put(valueOf, obj);
            }
            bt4.c((bt4) obj);
        }

        private a() {
        }
    }

    public /* synthetic */ bt4(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (c11.d(bt4.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            c11.b(th, bt4.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(bt4 bt4Var) {
        if (c11.d(bt4.class)) {
            return;
        }
        try {
            bt4Var.h();
        } catch (Throwable th) {
            c11.b(th, bt4.class);
        }
    }

    private final void d(final View view) {
        if (c11.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: at4
                @Override // java.lang.Runnable
                public final void run() {
                    bt4.e(view, this);
                }
            });
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, bt4 bt4Var) {
        if (c11.d(bt4.class)) {
            return;
        }
        try {
            zq3.h(view, "$view");
            zq3.h(bt4Var, "this$0");
            if (view instanceof EditText) {
                bt4Var.f(view);
            }
        } catch (Throwable th) {
            c11.b(th, bt4.class);
        }
    }

    private final void f(View view) {
        if (c11.d(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = h.c1(obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            zq3.g(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.a.add(lowerCase);
                HashMap hashMap = new HashMap();
                List b = ws4.b(view);
                List list = null;
                for (ys4 ys4Var : ys4.d.c()) {
                    a aVar = e;
                    String c = aVar.c(ys4Var.c(), lowerCase);
                    if (ys4Var.d().length() > 0) {
                        ws4 ws4Var = ws4.a;
                        if (!ws4.f(c, ys4Var.d())) {
                        }
                    }
                    ws4 ws4Var2 = ws4.a;
                    if (ws4.e(b, ys4Var.b())) {
                        aVar.d(hashMap, ys4Var.c(), c);
                    } else {
                        if (list == null) {
                            list = ws4.a(view);
                        }
                        if (ws4.e(list, ys4Var.b())) {
                            aVar.d(hashMap, ys4Var.c(), c);
                        }
                    }
                }
                kq3.b.f(hashMap);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void g(Runnable runnable) {
        if (c11.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void h() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (this.d.getAndSet(true)) {
                return;
            }
            sl slVar = sl.a;
            View e2 = sl.e((Activity) this.c.get());
            if (e2 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (c11.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th) {
                c11.b(th, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }

    private bt4(Activity activity) {
        this.a = new LinkedHashSet();
        this.b = new Handler(Looper.getMainLooper());
        this.c = new WeakReference(activity);
        this.d = new AtomicBoolean(false);
    }
}
