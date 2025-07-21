package com.nytimes.android.messaging.dock;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.compose.runtime.b0;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.messaging.dock.DockView;
import com.nytimes.android.utils.AppPreferences;
import defpackage.fb9;
import defpackage.fd6;
import defpackage.la2;
import defpackage.mx0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.xv0;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DockView extends Hilt_DockView {
    private static final long ANIMATION_DURATION = 250;
    private static final float INITIAL_Y_TRANSLATION_VALUE = 250.0f;
    private static final long IN_ANIMATION_DURATION = 500;
    private static final String PROPERTY_BACKGROUND_COLOR = "backgroundColor";
    private static final String PROPERTY_TEXT_COLOR = "textColor";
    public AppPreferences appPreferences;
    private final xv0 binding;
    private final CompositeDisposable compositeDisposable;
    private String cta;
    private String locationLink;
    private qs2 onDockVisibleListener;
    public DockPresenter presenter;
    private final sy4 visible$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final la2 ANIMATION_INTERPOLATOR = new la2();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DockView(Context context) {
        this(context, null, 0, 6, null);
        zq3.h(context, "context");
    }

    private final ObjectAnimator animateColor(View view, String str, int i, int i2) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(view, str, mx0.c(getContext(), i), mx0.c(getContext(), i2));
        ofInt.setDuration(ANIMATION_DURATION);
        ofInt.setInterpolator(ANIMATION_INTERPOLATOR);
        ofInt.setEvaluator(new ArgbEvaluator());
        zq3.g(ofInt, "apply(...)");
        return ofInt;
    }

    private final void animateIn() {
        setAlpha(1.0f);
        setTranslationY(INITIAL_Y_TRANSLATION_VALUE);
        ViewPropertyAnimator translationY = animate().setDuration(500L).setInterpolator(ANIMATION_INTERPOLATOR).translationY(0.0f);
        zq3.g(translationY, "translationY(...)");
        fb9.b(translationY, null, new ss2() { // from class: com.nytimes.android.messaging.dock.DockView$animateIn$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Animator) obj);
                return ww8.a;
            }

            public final void invoke(Animator animator) {
                zq3.h(animator, "it");
                DockView.this.setVisibility(0);
            }
        }, null, null, 13, null).start();
    }

    private final void animateOut() {
        ViewPropertyAnimator alpha = animate().alpha(0.0f);
        zq3.g(alpha, "alpha(...)");
        fb9.b(alpha, new ss2() { // from class: com.nytimes.android.messaging.dock.DockView$animateOut$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Animator) obj);
                return ww8.a;
            }

            public final void invoke(Animator animator) {
                zq3.h(animator, "it");
                DockView.this.setVisibility(8);
            }
        }, null, null, null, 14, null).start();
    }

    private final void setVisible(boolean z) {
        this.visible$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final Spanned toHtmlSpan(String str) {
        Spanned fromHtml = Html.fromHtml(str, 0);
        zq3.g(fromHtml, "fromHtml(...)");
        return fromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void update(Dock dock) {
        if (!dock.isActive()) {
            show(false);
            return;
        }
        show(true);
        TextView textView = this.binding.g;
        String text = dock.getText();
        textView.setText(text != null ? toHtmlSpan(text) : null);
        this.cta = dock.getText();
        this.locationLink = dock.getLinkLocation();
        this.onDockVisibleListener.mo865invoke();
        getPresenter().sendDockImpressionET2Event(dock.getText(), dock.getLinkLocation());
    }

    public final void activate() {
        if (isActivated()) {
            return;
        }
        setActivated(true);
        View view = this.binding.c;
        zq3.g(view, "messagingDockBody");
        ObjectAnimator animateColor = animateColor(view, PROPERTY_BACKGROUND_COLOR, fd6.dock_background, fd6.dock_background_activated);
        TextView textView = this.binding.g;
        zq3.g(textView, "messagingDockTitle");
        ObjectAnimator animateColor2 = animateColor(textView, PROPERTY_TEXT_COLOR, fd6.dock_text, fd6.dock_text_activated);
        View view2 = this.binding.d;
        zq3.g(view2, "messagingDockDivider");
        ObjectAnimator animateColor3 = animateColor(view2, PROPERTY_BACKGROUND_COLOR, fd6.dock_divider, fd6.dock_divider_activated);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animateColor).with(animateColor2).with(animateColor3);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.nytimes.android.messaging.dock.DockView$activate$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                zq3.h(animator, "animation");
                DockView.this.getBinding().e.setActivated(true);
            }
        });
        animatorSet.start();
    }

    public final AppPreferences getAppPreferences() {
        AppPreferences appPreferences = this.appPreferences;
        if (appPreferences != null) {
            return appPreferences;
        }
        zq3.z("appPreferences");
        return null;
    }

    public final xv0 getBinding() {
        return this.binding;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getLocationLink() {
        return this.locationLink;
    }

    public final DockPresenter getPresenter() {
        DockPresenter dockPresenter = this.presenter;
        if (dockPresenter != null) {
            return dockPresenter;
        }
        zq3.z("presenter");
        return null;
    }

    public final boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final void onClick() {
        getPresenter().sendDockInteractionET2Event(this.cta, this.locationLink);
        DockPresenter presenter = getPresenter();
        Context context = getContext();
        zq3.g(context, "getContext(...)");
        presenter.onClick(context, this.locationLink);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.compositeDisposable.clear();
        this.onDockVisibleListener = new qs2() { // from class: com.nytimes.android.messaging.dock.DockView$onDetachedFromWindow$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m595invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m595invoke();
                return ww8.a;
            }
        };
    }

    public final void setAppPreferences(AppPreferences appPreferences) {
        zq3.h(appPreferences, "<set-?>");
        this.appPreferences = appPreferences;
    }

    public final void setPresenter(DockPresenter dockPresenter) {
        zq3.h(dockPresenter, "<set-?>");
        this.presenter = dockPresenter;
    }

    public final void show(boolean z) {
        if (getVisible() == z) {
            return;
        }
        setVisible(z);
        if (z) {
            animateIn();
        } else {
            animateOut();
        }
    }

    public final void showMessage(qs2 qs2Var, DockConfig dockConfig) {
        zq3.h(qs2Var, "onDockVisible");
        zq3.h(dockConfig, "dockConfig");
        this.onDockVisibleListener = qs2Var;
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Observable<Dock> observeOn = getPresenter().observeDock(dockConfig).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final DockView$showMessage$1 dockView$showMessage$1 = new DockView$showMessage$1(this);
        Consumer<? super Dock> consumer = new Consumer() { // from class: dt1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DockView.showMessage$lambda$0(ss2.this, obj);
            }
        };
        final DockView$showMessage$2 dockView$showMessage$2 = new DockView$showMessage$2(NYTLogger.a);
        compositeDisposable.add(observeOn.subscribe(consumer, new Consumer() { // from class: et1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DockView.showMessage$lambda$1(ss2.this, obj);
            }
        }));
    }

    public final void toggleVisibilityInDebugMode() {
        if (getVisible()) {
            update(new Dock(false, null, null, 6, null));
        } else {
            update(new Dock(true, null, null, 6, null));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    public /* synthetic */ DockView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        this.compositeDisposable = new CompositeDisposable();
        this.onDockVisibleListener = new qs2() { // from class: com.nytimes.android.messaging.dock.DockView$onDockVisibleListener$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m596invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m596invoke();
                return ww8.a;
            }
        };
        this.visible$delegate = b0.e(Boolean.FALSE, null, 2, null);
        xv0 b = xv0.b(LayoutInflater.from(context), this);
        zq3.g(b, "inflate(...)");
        this.binding = b;
    }
}
