package com.nytimes.android.messaging.truncator;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.messaging.truncator.TruncatorCard;
import com.nytimes.android.utils.AppPreferences;
import defpackage.e52;
import defpackage.f57;
import defpackage.kw2;
import defpackage.nt8;
import defpackage.qs2;
import defpackage.s42;
import defpackage.ss2;
import defpackage.t27;
import defpackage.tg6;
import defpackage.ww8;
import defpackage.y32;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class TruncatorCard {
    public static final int $stable = 8;
    private float animationDistanceTranslationY;
    private final AppPreferences appPreferences;
    private final CompositeDisposable compositeDisposable;
    private kw2 gatewayCardListener;
    private boolean hasSentImpressionEvent;
    private View meterGatewayCardContainer;
    private PageContext pageContext;
    private final nt8 presenter;
    private View truncatorLayout;

    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            TruncatorCard truncatorCard = TruncatorCard.this;
            View view2 = truncatorCard.truncatorLayout;
            if (view2 == null) {
                zq3.z("truncatorLayout");
                view2 = null;
            }
            truncatorCard.animationDistanceTranslationY = view2.getHeight() * 0.25f;
        }
    }

    public TruncatorCard(nt8 nt8Var, AppPreferences appPreferences) {
        zq3.h(nt8Var, "presenter");
        zq3.h(appPreferences, "appPreferences");
        this.presenter = nt8Var;
        this.appPreferences = appPreferences;
        this.compositeDisposable = new CompositeDisposable();
    }

    private final void animateFadeIn() {
        View view = this.meterGatewayCardContainer;
        View view2 = null;
        if (view == null) {
            zq3.z("meterGatewayCardContainer");
            view = null;
        }
        if (view.getVisibility() == 0) {
            return;
        }
        View view3 = this.meterGatewayCardContainer;
        if (view3 == null) {
            zq3.z("meterGatewayCardContainer");
            view3 = null;
        }
        view3.setAlpha(0.0f);
        View view4 = this.meterGatewayCardContainer;
        if (view4 == null) {
            zq3.z("meterGatewayCardContainer");
            view4 = null;
        }
        view4.animate().withStartAction(new Runnable() { // from class: it8
            @Override // java.lang.Runnable
            public final void run() {
                TruncatorCard.animateFadeIn$lambda$3(TruncatorCard.this);
            }
        }).setDuration(150L).alpha(1.0f);
        View view5 = this.truncatorLayout;
        if (view5 == null) {
            zq3.z("truncatorLayout");
            view5 = null;
        }
        view5.setTranslationY(this.animationDistanceTranslationY);
        View view6 = this.truncatorLayout;
        if (view6 == null) {
            zq3.z("truncatorLayout");
        } else {
            view2 = view6;
        }
        view2.animate().withStartAction(new Runnable() { // from class: jt8
            @Override // java.lang.Runnable
            public final void run() {
                TruncatorCard.animateFadeIn$lambda$4(TruncatorCard.this);
            }
        }).setDuration(150L).translationY(0.0f).withEndAction(new Runnable() { // from class: kt8
            @Override // java.lang.Runnable
            public final void run() {
                TruncatorCard.animateFadeIn$lambda$5(TruncatorCard.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFadeIn$lambda$3(TruncatorCard truncatorCard) {
        zq3.h(truncatorCard, "this$0");
        View view = truncatorCard.meterGatewayCardContainer;
        if (view == null) {
            zq3.z("meterGatewayCardContainer");
            view = null;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFadeIn$lambda$4(TruncatorCard truncatorCard) {
        zq3.h(truncatorCard, "this$0");
        View view = truncatorCard.truncatorLayout;
        if (view == null) {
            zq3.z("truncatorLayout");
            view = null;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFadeIn$lambda$5(TruncatorCard truncatorCard) {
        zq3.h(truncatorCard, "this$0");
        truncatorCard.appPreferences.g("PREF_TRUNCATOR_LAST_SEEN", Calendar.getInstance().getTimeInMillis());
    }

    private final void animateFadeOut(final qs2 qs2Var) {
        View view = this.meterGatewayCardContainer;
        View view2 = null;
        if (view == null) {
            zq3.z("meterGatewayCardContainer");
            view = null;
        }
        if (view.getVisibility() != 0) {
            qs2Var.mo865invoke();
            return;
        }
        View view3 = this.meterGatewayCardContainer;
        if (view3 == null) {
            zq3.z("meterGatewayCardContainer");
            view3 = null;
        }
        view3.animate().setDuration(150L).alpha(0.0f).withEndAction(new Runnable() { // from class: lt8
            @Override // java.lang.Runnable
            public final void run() {
                TruncatorCard.animateFadeOut$lambda$6(TruncatorCard.this);
            }
        });
        View view4 = this.truncatorLayout;
        if (view4 == null) {
            zq3.z("truncatorLayout");
        } else {
            view2 = view4;
        }
        view2.animate().setDuration(150L).translationY(this.animationDistanceTranslationY).withEndAction(new Runnable() { // from class: mt8
            @Override // java.lang.Runnable
            public final void run() {
                TruncatorCard.animateFadeOut$lambda$7(qs2.this);
            }
        });
    }

    static /* synthetic */ void animateFadeOut$default(TruncatorCard truncatorCard, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qs2Var = new qs2() { // from class: com.nytimes.android.messaging.truncator.TruncatorCard$animateFadeOut$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m615invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m615invoke();
                    return ww8.a;
                }
            };
        }
        truncatorCard.animateFadeOut(qs2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFadeOut$lambda$6(TruncatorCard truncatorCard) {
        zq3.h(truncatorCard, "this$0");
        View view = truncatorCard.meterGatewayCardContainer;
        if (view == null) {
            zq3.z("meterGatewayCardContainer");
            view = null;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFadeOut$lambda$7(qs2 qs2Var) {
        zq3.h(qs2Var, "$endAction");
        qs2Var.mo865invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateCardClicked(TruncatorData truncatorData) {
        kw2 kw2Var = this.gatewayCardListener;
        PageContext pageContext = null;
        if (kw2Var == null) {
            zq3.z("gatewayCardListener");
            kw2Var = null;
        }
        kw2Var.p0(truncatorData.c());
        t27 t27Var = new t27(new s42("truncator", "AND_GRACE_CORE", null, null, truncatorData.d(), truncatorData.c(), null, new y32(truncatorData.f(), null, null, null, null, null, 62, null), null, 332, null), null);
        EventTracker eventTracker = EventTracker.a;
        PageContext pageContext2 = this.pageContext;
        if (pageContext2 == null) {
            zq3.z("pageContext");
        } else {
            pageContext = pageContext2;
        }
        eventTracker.h(pageContext, new e52.e(), t27Var.a());
    }

    private final void sendDismissInteractionEvent(TruncatorData truncatorData) {
        PageContext pageContext = null;
        t27 t27Var = new t27(new s42("truncator", "AND_GRACE_CORE", null, null, truncatorData.d(), truncatorData.c(), null, new y32(truncatorData.f(), null, null, null, null, null, 62, null), null, 332, null), null);
        EventTracker eventTracker = EventTracker.a;
        PageContext pageContext2 = this.pageContext;
        if (pageContext2 == null) {
            zq3.z("pageContext");
        } else {
            pageContext = pageContext2;
        }
        eventTracker.h(pageContext, new e52.e(), t27Var.a());
    }

    private final void updateUI(final TruncatorData truncatorData) {
        View view = this.truncatorLayout;
        View view2 = null;
        if (view == null) {
            zq3.z("truncatorLayout");
            view = null;
        }
        TextView textView = (TextView) view.findViewById(tg6.truncator_header);
        View view3 = this.truncatorLayout;
        if (view3 == null) {
            zq3.z("truncatorLayout");
            view3 = null;
        }
        TextView textView2 = (TextView) view3.findViewById(tg6.truncator_subheader);
        View view4 = this.truncatorLayout;
        if (view4 == null) {
            zq3.z("truncatorLayout");
            view4 = null;
        }
        Button button = (Button) view4.findViewById(tg6.update_card_button);
        View view5 = this.truncatorLayout;
        if (view5 == null) {
            zq3.z("truncatorLayout");
            view5 = null;
        }
        Button button2 = (Button) view5.findViewById(tg6.dimiss_card_button);
        textView.setText(truncatorData.f());
        textView2.setText(truncatorData.a());
        button.setText(truncatorData.d());
        if (!this.hasSentImpressionEvent) {
            t27 t27Var = new t27(new s42("truncator", "AND_GRACE_CORE", null, null, truncatorData.d(), truncatorData.c(), null, new y32(truncatorData.f(), null, null, null, null, null, 62, null), null, 332, null), null);
            EventTracker eventTracker = EventTracker.a;
            PageContext pageContext = this.pageContext;
            if (pageContext == null) {
                zq3.z("pageContext");
                pageContext = null;
            }
            eventTracker.h(pageContext, new e52.d(), t27Var.a());
            this.hasSentImpressionEvent = true;
        }
        zq3.e(button2);
        button2.setVisibility(truncatorData.h() ? 0 : 8);
        if (button2.getVisibility() == 0) {
            button2.setText(truncatorData.e());
            button2.setOnClickListener(new View.OnClickListener() { // from class: gt8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    TruncatorCard.updateUI$lambda$1(TruncatorCard.this, truncatorData, view6);
                }
            });
        }
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        View view6 = this.truncatorLayout;
        if (view6 == null) {
            zq3.z("truncatorLayout");
        } else {
            view2 = view6;
        }
        View findViewById = view2.findViewById(tg6.update_card_button);
        zq3.g(findViewById, "findViewById(...)");
        Observable a2 = f57.a(findViewById);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.messaging.truncator.TruncatorCard$updateUI$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ww8 ww8Var) {
                TruncatorCard.this.onUpdateCardClicked(truncatorData);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ww8) obj);
                return ww8.a;
            }
        };
        compositeDisposable.add(a2.subscribe(new Consumer() { // from class: ht8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TruncatorCard.updateUI$lambda$2(ss2.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUI$lambda$1(TruncatorCard truncatorCard, TruncatorData truncatorData, View view) {
        zq3.h(truncatorCard, "this$0");
        zq3.h(truncatorData, "$truncator");
        truncatorCard.sendDismissInteractionEvent(truncatorData);
        truncatorCard.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUI$lambda$2(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final void hide() {
        unsubscribe();
        animateFadeOut(new qs2() { // from class: com.nytimes.android.messaging.truncator.TruncatorCard$hide$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m616invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m616invoke() {
                kw2 kw2Var;
                kw2Var = TruncatorCard.this.gatewayCardListener;
                if (kw2Var == null) {
                    zq3.z("gatewayCardListener");
                    kw2Var = null;
                }
                kw2Var.A();
            }
        });
    }

    public final void init(kw2 kw2Var, View view, PageContext pageContext) {
        zq3.h(kw2Var, "gatewayCardListener");
        zq3.h(pageContext, "pageContext");
        this.gatewayCardListener = kw2Var;
        zq3.e(view);
        this.meterGatewayCardContainer = view;
        View view2 = null;
        if (view == null) {
            zq3.z("meterGatewayCardContainer");
            view = null;
        }
        view.setVisibility(4);
        View view3 = this.meterGatewayCardContainer;
        if (view3 == null) {
            zq3.z("meterGatewayCardContainer");
            view3 = null;
        }
        View findViewById = view3.findViewById(tg6.truncator_card);
        zq3.g(findViewById, "findViewById(...)");
        this.truncatorLayout = findViewById;
        if (findViewById == null) {
            zq3.z("truncatorLayout");
            findViewById = null;
        }
        if (!findViewById.isLaidOut() || findViewById.isLayoutRequested()) {
            findViewById.addOnLayoutChangeListener(new a());
        } else {
            View view4 = this.truncatorLayout;
            if (view4 == null) {
                zq3.z("truncatorLayout");
            } else {
                view2 = view4;
            }
            this.animationDistanceTranslationY = view2.getHeight() * 0.25f;
        }
        this.pageContext = pageContext;
    }

    public final void show() {
        TruncatorData a2 = this.presenter.a();
        boolean z = this.appPreferences.k("PREF_TRUNCATOR_LAST_SEEN", 0L) + TimeUnit.HOURS.toMillis((long) a2.b()) <= Calendar.getInstance().getTimeInMillis();
        if (!a2.g() || !z) {
            hide();
        } else {
            updateUI(a2);
            animateFadeIn();
        }
    }

    public final void unsubscribe() {
        this.compositeDisposable.clear();
    }
}
