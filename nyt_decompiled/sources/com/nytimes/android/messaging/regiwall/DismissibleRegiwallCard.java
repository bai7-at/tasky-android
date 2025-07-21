package com.nytimes.android.messaging.regiwall;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.messaging.regiwall.DismissibleRegiwallCard;
import defpackage.d05;
import defpackage.e52;
import defpackage.f57;
import defpackage.jk;
import defpackage.kw2;
import defpackage.s42;
import defpackage.ss2;
import defpackage.tg6;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public final class DismissibleRegiwallCard {
    private kw2 b;
    private View c;
    private jk d;
    public ET2Scope et2Scope;
    private final CompositeDisposable a = new CompositeDisposable();
    private final String e = "dismissible regiwall";
    private final String f = "You have access to this article thanks to someone you know.";
    private final String g = "Create a free account";
    private final String h = "Already have an account? Log in.";
    private final String i = "Not now";

    public static final class a extends d05 {
        final /* synthetic */ DismissibleRegiwallCard b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, DismissibleRegiwallCard dismissibleRegiwallCard) {
            super(cls);
            this.b = dismissibleRegiwallCard;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, QueryKeys.TOKEN);
            if (this.b.b != null) {
                this.b.j();
                kw2 kw2Var = this.b.b;
                zq3.e(kw2Var);
                kw2Var.Z();
            }
        }
    }

    public static final class b extends d05 {
        final /* synthetic */ DismissibleRegiwallCard b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class cls, DismissibleRegiwallCard dismissibleRegiwallCard) {
            super(cls);
            this.b = dismissibleRegiwallCard;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, QueryKeys.TOKEN);
            if (this.b.b != null) {
                this.b.i();
                kw2 kw2Var = this.b.b;
                if (kw2Var != null) {
                    kw2Var.A();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        ET2PageScope.DefaultImpls.a(g(), new e52.e(), new s42(this.e, this.i, null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        ET2PageScope.DefaultImpls.a(g(), new e52.e(), new s42(this.e, this.g, null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    private final void k() {
        ET2PageScope.DefaultImpls.a(g(), new e52.d(), new s42(this.e, this.f, null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        ET2PageScope.DefaultImpls.a(g(), new e52.e(), new s42(this.e, this.h, null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void p() {
        View view = this.c;
        Button button = view != null ? (Button) view.findViewById(tg6.cardButton) : null;
        View view2 = this.c;
        Button button2 = view2 != null ? (Button) view2.findViewById(tg6.notNowButton) : null;
        if (button != null) {
            CompositeDisposable compositeDisposable = this.a;
            a aVar = (a) f57.a(button).subscribeWith(new a(Class.class, this));
            zq3.e(aVar);
            compositeDisposable.add(aVar);
        }
        if (button2 != null) {
            CompositeDisposable compositeDisposable2 = this.a;
            b bVar = (b) f57.a(button2).subscribeWith(new b(Class.class, this));
            zq3.e(bVar);
            compositeDisposable2.add(bVar);
        }
        CompositeDisposable compositeDisposable3 = this.a;
        View view3 = this.c;
        zq3.e(view3);
        View findViewById = view3.findViewById(tg6.loginContainer);
        zq3.g(findViewById, "findViewById(...)");
        Observable a2 = f57.a(findViewById);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.messaging.regiwall.DismissibleRegiwallCard$wireUi$3
            {
                super(1);
            }

            public final void b(ww8 ww8Var) {
                if (DismissibleRegiwallCard.this.b != null) {
                    DismissibleRegiwallCard.this.l();
                    kw2 kw2Var = DismissibleRegiwallCard.this.b;
                    zq3.e(kw2Var);
                    kw2Var.z0();
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ww8) obj);
                return ww8.a;
            }
        };
        compositeDisposable3.add(a2.subscribe(new Consumer() { // from class: as1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DismissibleRegiwallCard.q(ss2.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final ET2Scope g() {
        ET2Scope eT2Scope = this.et2Scope;
        if (eT2Scope != null) {
            return eT2Scope;
        }
        zq3.z("et2Scope");
        return null;
    }

    public final void h(kw2 kw2Var, View view, jk jkVar) {
        zq3.h(kw2Var, "gatewayCardListener");
        zq3.h(jkVar, "activity");
        this.d = jkVar;
        this.b = kw2Var;
        this.c = view;
    }

    public final void m() {
        View view = this.c;
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: zr1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean n;
                    n = DismissibleRegiwallCard.n(view2, motionEvent);
                    return n;
                }
            });
            view.setVisibility(0);
        }
        k();
        p();
    }

    public final void o() {
        this.a.clear();
    }
}
