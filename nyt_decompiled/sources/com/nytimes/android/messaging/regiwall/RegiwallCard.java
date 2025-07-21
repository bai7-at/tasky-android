package com.nytimes.android.messaging.regiwall;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.messaging.regiwall.RegiwallCard;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.d05;
import defpackage.e52;
import defpackage.f57;
import defpackage.kw2;
import defpackage.lf6;
import defpackage.m07;
import defpackage.qv6;
import defpackage.s42;
import defpackage.ss2;
import defpackage.tg6;
import defpackage.ww8;
import defpackage.y32;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class RegiwallCard {
    private kw2 a;
    private View b;
    private final CompositeDisposable c = new CompositeDisposable();
    public ET2Scope et2Scope;
    public qv6 remoteConfig;

    public static final class a extends d05 {
        final /* synthetic */ RegiwallCard b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, RegiwallCard regiwallCard) {
            super(cls);
            this.b = regiwallCard;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, QueryKeys.TOKEN);
            if (this.b.a != null) {
                kw2 kw2Var = this.b.a;
                zq3.e(kw2Var);
                kw2Var.Z();
                this.b.l();
            }
        }
    }

    private final void e(RegiwallData regiwallData, boolean z) {
        View view = this.b;
        TextView textView = view != null ? (TextView) view.findViewById(tg6.cardTitle) : null;
        if (textView != null) {
            textView.setText(regiwallData.d());
        }
        View view2 = this.b;
        TextView textView2 = view2 != null ? (TextView) view2.findViewById(tg6.cardDescription) : null;
        if (!h.d0(regiwallData.a())) {
            if (textView2 != null) {
                textView2.setText(regiwallData.a());
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        View view3 = this.b;
        Button button = view3 != null ? (Button) view3.findViewById(tg6.cardButton) : null;
        if (button != null) {
            button.setTypeface(m07.g(button.getContext().getApplicationContext(), lf6.font_franklin_medium));
            button.setPaintFlags(button.getPaintFlags() | 128);
            button.setText(regiwallData.b());
            CompositeDisposable compositeDisposable = this.c;
            a aVar = (a) f57.a(button).subscribeWith(new a(Class.class, this));
            zq3.e(aVar);
            compositeDisposable.add(aVar);
        }
        if (z) {
            View view4 = this.b;
            TextView textView3 = view4 != null ? (TextView) view4.findViewById(tg6.login) : null;
            if (textView3 != null) {
                textView3.setText(regiwallData.c());
            }
            CompositeDisposable compositeDisposable2 = this.c;
            View view5 = this.b;
            zq3.e(view5);
            View findViewById = view5.findViewById(tg6.loginContainer);
            zq3.g(findViewById, "findViewById(...)");
            Observable a2 = f57.a(findViewById);
            final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.messaging.regiwall.RegiwallCard$displayRegiwallMessage$2
                {
                    super(1);
                }

                public final void b(ww8 ww8Var) {
                    if (RegiwallCard.this.a != null) {
                        kw2 kw2Var = RegiwallCard.this.a;
                        zq3.e(kw2Var);
                        kw2Var.K0(false);
                    }
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((ww8) obj);
                    return ww8.a;
                }
            };
            compositeDisposable2.add(a2.subscribe(new Consumer() { // from class: dv6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RegiwallCard.f(ss2.this, obj);
                }
            }));
            View view6 = this.b;
            View findViewById2 = view6 != null ? view6.findViewById(tg6.loginContainer) : null;
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else {
            View view7 = this.b;
            View findViewById3 = view7 != null ? view7.findViewById(tg6.loginContainer) : null;
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
        }
        View view8 = this.b;
        View findViewById4 = view8 != null ? view8.findViewById(tg6.gatewayBottomSpace) : null;
        if (findViewById4 == null) {
            return;
        }
        findViewById4.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final RegiwallData h() {
        RegiwallData regiwallData;
        i d = new i.b().d();
        zq3.g(d, "build(...)");
        JsonAdapter c = d.c(RegiwallData.class);
        zq3.g(c, "adapter(...)");
        String E = i().E();
        return (E.length() <= 0 || (regiwallData = (RegiwallData) c.fromJson(E)) == null) ? new RegiwallData(false, null, null, null, null, 31, null) : regiwallData;
    }

    private final void k() {
        ET2PageScope.DefaultImpls.a(g(), new e52.d(), new s42("gateway", "AND_REGIWALL_CORE", null, null, null, null, null, null, "regiwall", 252, null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        ET2PageScope.DefaultImpls.a(g(), new e52.e(), new s42("gateway", "AND_REGIWALL_CORE", null, null, null, null, null, new y32("create account", null, null, null, null, null, 62, null), null, 380, null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(View view, MotionEvent motionEvent) {
        return true;
    }

    public final ET2Scope g() {
        ET2Scope eT2Scope = this.et2Scope;
        if (eT2Scope != null) {
            return eT2Scope;
        }
        zq3.z("et2Scope");
        return null;
    }

    public final qv6 i() {
        qv6 qv6Var = this.remoteConfig;
        if (qv6Var != null) {
            return qv6Var;
        }
        zq3.z("remoteConfig");
        return null;
    }

    public final void j(kw2 kw2Var, View view) {
        zq3.h(kw2Var, "gatewayCardListener");
        this.a = kw2Var;
        this.b = view;
    }

    public final void m(boolean z) {
        kw2 kw2Var = this.a;
        if (kw2Var != null) {
            kw2Var.w0();
        }
        e(h(), z);
        k();
        View view = this.b;
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: cv6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean n;
                    n = RegiwallCard.n(view2, motionEvent);
                    return n;
                }
            });
            view.setVisibility(0);
        }
    }

    public final void o() {
        this.c.clear();
    }
}
