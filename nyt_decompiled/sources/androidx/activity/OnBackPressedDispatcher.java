package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import defpackage.ce5;
import defpackage.d44;
import defpackage.h30;
import defpackage.lh0;
import defpackage.lv0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final Runnable a;
    private final lv0 b;
    private final kotlin.collections.c c;
    private ce5 d;
    private OnBackInvokedCallback e;
    private OnBackInvokedDispatcher f;
    private boolean g;
    private boolean h;

    private final class LifecycleOnBackPressedCancellable implements g, lh0 {
        private final Lifecycle a;
        private final ce5 b;
        private lh0 c;
        final /* synthetic */ OnBackPressedDispatcher d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, ce5 ce5Var) {
            zq3.h(lifecycle, "lifecycle");
            zq3.h(ce5Var, "onBackPressedCallback");
            this.d = onBackPressedDispatcher;
            this.a = lifecycle;
            this.b = ce5Var;
            lifecycle.a(this);
        }

        @Override // defpackage.lh0
        public void cancel() {
            this.a.d(this);
            this.b.removeCancellable(this);
            lh0 lh0Var = this.c;
            if (lh0Var != null) {
                lh0Var.cancel();
            }
            this.c = null;
        }

        @Override // androidx.lifecycle.g
        public void h(d44 d44Var, Lifecycle.Event event) {
            zq3.h(d44Var, "source");
            zq3.h(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.c = this.d.j(this.b);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                lh0 lh0Var = this.c;
                if (lh0Var != null) {
                    lh0Var.cancel();
                }
            }
        }
    }

    public static final class a {
        public static final a a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(qs2 qs2Var) {
            zq3.h(qs2Var, "$onBackInvoked");
            qs2Var.mo865invoke();
        }

        public final OnBackInvokedCallback b(final qs2 qs2Var) {
            zq3.h(qs2Var, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: de5
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.a.c(qs2.this);
                }
            };
        }

        public final void d(Object obj, int i, Object obj2) {
            zq3.h(obj, "dispatcher");
            zq3.h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            zq3.h(obj, "dispatcher");
            zq3.h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class b {
        public static final b a = new b();

        public static final class a implements OnBackAnimationCallback {
            final /* synthetic */ ss2 a;
            final /* synthetic */ ss2 b;
            final /* synthetic */ qs2 c;
            final /* synthetic */ qs2 d;

            a(ss2 ss2Var, ss2 ss2Var2, qs2 qs2Var, qs2 qs2Var2) {
                this.a = ss2Var;
                this.b = ss2Var2;
                this.c = qs2Var;
                this.d = qs2Var2;
            }

            public void onBackCancelled() {
                this.d.mo865invoke();
            }

            public void onBackInvoked() {
                this.c.mo865invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                zq3.h(backEvent, "backEvent");
                this.b.invoke(new h30(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                zq3.h(backEvent, "backEvent");
                this.a.invoke(new h30(backEvent));
            }
        }

        private b() {
        }

        public final OnBackInvokedCallback a(ss2 ss2Var, ss2 ss2Var2, qs2 qs2Var, qs2 qs2Var2) {
            zq3.h(ss2Var, "onBackStarted");
            zq3.h(ss2Var2, "onBackProgressed");
            zq3.h(qs2Var, "onBackInvoked");
            zq3.h(qs2Var2, "onBackCancelled");
            return new a(ss2Var, ss2Var2, qs2Var, qs2Var2);
        }
    }

    private final class c implements lh0 {
        private final ce5 a;
        final /* synthetic */ OnBackPressedDispatcher b;

        public c(OnBackPressedDispatcher onBackPressedDispatcher, ce5 ce5Var) {
            zq3.h(ce5Var, "onBackPressedCallback");
            this.b = onBackPressedDispatcher;
            this.a = ce5Var;
        }

        @Override // defpackage.lh0
        public void cancel() {
            this.b.c.remove(this.a);
            if (zq3.c(this.b.d, this.a)) {
                this.a.handleOnBackCancelled();
                this.b.d = null;
            }
            this.a.removeCancellable(this);
            qs2 enabledChangedCallback$activity_release = this.a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.mo865invoke();
            }
            this.a.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void k() {
        ce5 ce5Var;
        ce5 ce5Var2 = this.d;
        if (ce5Var2 == null) {
            kotlin.collections.c cVar = this.c;
            ListIterator listIterator = cVar.listIterator(cVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    ce5Var = 0;
                    break;
                } else {
                    ce5Var = listIterator.previous();
                    if (((ce5) ce5Var).isEnabled()) {
                        break;
                    }
                }
            }
            ce5Var2 = ce5Var;
        }
        this.d = null;
        if (ce5Var2 != null) {
            ce5Var2.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(h30 h30Var) {
        Object obj;
        ce5 ce5Var = this.d;
        if (ce5Var == null) {
            kotlin.collections.c cVar = this.c;
            ListIterator<E> listIterator = cVar.listIterator(cVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((ce5) obj).isEnabled()) {
                        break;
                    }
                }
            }
            ce5Var = (ce5) obj;
        }
        if (ce5Var != null) {
            ce5Var.handleOnBackProgressed(h30Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(h30 h30Var) {
        Object obj;
        kotlin.collections.c cVar = this.c;
        ListIterator<E> listIterator = cVar.listIterator(cVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((ce5) obj).isEnabled()) {
                    break;
                }
            }
        }
        ce5 ce5Var = (ce5) obj;
        this.d = ce5Var;
        if (ce5Var != null) {
            ce5Var.handleOnBackStarted(h30Var);
        }
    }

    private final void p(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.g) {
            a.a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.g = true;
        } else {
            if (z || !this.g) {
                return;
            }
            a.a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z = this.h;
        kotlin.collections.c cVar = this.c;
        boolean z2 = false;
        if (cVar == null || !cVar.isEmpty()) {
            Iterator<E> it2 = cVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((ce5) it2.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.h = z2;
        if (z2 != z) {
            lv0 lv0Var = this.b;
            if (lv0Var != null) {
                lv0Var.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z2);
            }
        }
    }

    public final void h(d44 d44Var, ce5 ce5Var) {
        zq3.h(d44Var, "owner");
        zq3.h(ce5Var, "onBackPressedCallback");
        Lifecycle lifecycle = d44Var.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        ce5Var.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, ce5Var));
        q();
        ce5Var.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
    }

    public final void i(ce5 ce5Var) {
        zq3.h(ce5Var, "onBackPressedCallback");
        j(ce5Var);
    }

    public final lh0 j(ce5 ce5Var) {
        zq3.h(ce5Var, "onBackPressedCallback");
        this.c.add(ce5Var);
        c cVar = new c(this, ce5Var);
        ce5Var.addCancellable(cVar);
        q();
        ce5Var.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void l() {
        ce5 ce5Var;
        ce5 ce5Var2 = this.d;
        if (ce5Var2 == null) {
            kotlin.collections.c cVar = this.c;
            ListIterator listIterator = cVar.listIterator(cVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    ce5Var = 0;
                    break;
                } else {
                    ce5Var = listIterator.previous();
                    if (((ce5) ce5Var).isEnabled()) {
                        break;
                    }
                }
            }
            ce5Var2 = ce5Var;
        }
        this.d = null;
        if (ce5Var2 != null) {
            ce5Var2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        zq3.h(onBackInvokedDispatcher, "invoker");
        this.f = onBackInvokedDispatcher;
        p(this.h);
    }

    public OnBackPressedDispatcher(Runnable runnable, lv0 lv0Var) {
        this.a = runnable;
        this.b = lv0Var;
        this.c = new kotlin.collections.c();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.e = i >= 34 ? b.a.a(new ss2() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(1);
                }

                public final void b(h30 h30Var) {
                    zq3.h(h30Var, "backEvent");
                    OnBackPressedDispatcher.this.n(h30Var);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((h30) obj);
                    return ww8.a;
                }
            }, new ss2() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(1);
                }

                public final void b(h30 h30Var) {
                    zq3.h(h30Var, "backEvent");
                    OnBackPressedDispatcher.this.m(h30Var);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((h30) obj);
                    return ww8.a;
                }
            }, new qs2() { // from class: androidx.activity.OnBackPressedDispatcher.3
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m9invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m9invoke() {
                    OnBackPressedDispatcher.this.l();
                }
            }, new qs2() { // from class: androidx.activity.OnBackPressedDispatcher.4
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m10invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m10invoke() {
                    OnBackPressedDispatcher.this.k();
                }
            }) : a.a.b(new qs2() { // from class: androidx.activity.OnBackPressedDispatcher.5
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m11invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11invoke() {
                    OnBackPressedDispatcher.this.l();
                }
            });
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
