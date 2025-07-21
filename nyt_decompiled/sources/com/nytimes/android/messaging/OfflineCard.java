package com.nytimes.android.messaging;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.messaging.OfflineCard;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.utils.AppPreferences;
import defpackage.d05;
import defpackage.f57;
import defpackage.kw2;
import defpackage.lf6;
import defpackage.m07;
import defpackage.ol6;
import defpackage.qv6;
import defpackage.tg6;
import defpackage.wm6;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class OfflineCard {
    public static final int $stable = 8;
    public AppPreferences appPreferences;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    public com.nytimes.android.entitlements.a ecommClient;
    private kw2 gatewayCardListener;
    private View meterGatewayCardContainer;
    public qv6 remoteConfig;
    public Resources resources;
    public SavedManager savedManager;

    public static final class a extends d05 {
        final /* synthetic */ OfflineCard b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, OfflineCard offlineCard) {
            super(cls);
            this.b = offlineCard;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, QueryKeys.TOKEN);
            kw2 kw2Var = this.b.gatewayCardListener;
            if (kw2Var != null) {
                kw2Var.s0();
            }
        }
    }

    private final void formatArticleLeftVerbiage() {
        View view = this.meterGatewayCardContainer;
        if (view == null || view.getContext() == null) {
            return;
        }
        String v = getRemoteConfig().v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) v);
        View view2 = this.meterGatewayCardContainer;
        TextView textView = view2 != null ? (TextView) view2.findViewById(tg6.cardTitle) : null;
        zq3.f(textView, "null cannot be cast to non-null type android.widget.TextView");
        spannableStringBuilder.setSpan(new TextAppearanceSpan(textView.getContext(), wm6.TextView_Meter_ArticleLeft), 0, h.V(spannableStringBuilder), 33);
        textView.setText(spannableStringBuilder);
    }

    public static /* synthetic */ void show$default(OfflineCard offlineCard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        offlineCard.show(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean show$lambda$5$lambda$4(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void wireUi() {
        formatArticleLeftVerbiage();
        View view = this.meterGatewayCardContainer;
        Button button = view != null ? (Button) view.findViewById(tg6.cardButton) : null;
        if (button != null) {
            button.setTypeface(m07.g(button.getContext().getApplicationContext(), lf6.font_franklin_medium));
            button.setPaintFlags(button.getPaintFlags() | 128);
            button.setText(button.getContext().getString(ol6.offline_dialog_btn_ok));
        }
        if (button != null) {
            CompositeDisposable compositeDisposable = this.compositeDisposable;
            a aVar = (a) f57.a(button).subscribeWith(new a(Class.class, this));
            zq3.e(aVar);
            compositeDisposable.add(aVar);
        }
    }

    public final AppPreferences getAppPreferences() {
        AppPreferences appPreferences = this.appPreferences;
        if (appPreferences != null) {
            return appPreferences;
        }
        zq3.z("appPreferences");
        return null;
    }

    public final com.nytimes.android.entitlements.a getEcommClient() {
        com.nytimes.android.entitlements.a aVar = this.ecommClient;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("ecommClient");
        return null;
    }

    public final qv6 getRemoteConfig() {
        qv6 qv6Var = this.remoteConfig;
        if (qv6Var != null) {
            return qv6Var;
        }
        zq3.z("remoteConfig");
        return null;
    }

    public final Resources getResources() {
        Resources resources = this.resources;
        if (resources != null) {
            return resources;
        }
        zq3.z("resources");
        return null;
    }

    public final SavedManager getSavedManager() {
        SavedManager savedManager = this.savedManager;
        if (savedManager != null) {
            return savedManager;
        }
        zq3.z("savedManager");
        return null;
    }

    public final void hide() {
        View view = this.meterGatewayCardContainer;
        if (view != null) {
            view.setVisibility(8);
            view.setOnTouchListener(null);
        }
    }

    public final void init(kw2 kw2Var, View view) {
        zq3.h(kw2Var, "gatewayCardListener");
        this.gatewayCardListener = kw2Var;
        this.meterGatewayCardContainer = view;
        wireUi();
    }

    public final void setAppPreferences(AppPreferences appPreferences) {
        zq3.h(appPreferences, "<set-?>");
        this.appPreferences = appPreferences;
    }

    public final void setEcommClient(com.nytimes.android.entitlements.a aVar) {
        zq3.h(aVar, "<set-?>");
        this.ecommClient = aVar;
    }

    public final void setRemoteConfig(qv6 qv6Var) {
        zq3.h(qv6Var, "<set-?>");
        this.remoteConfig = qv6Var;
    }

    public final void setResources(Resources resources) {
        zq3.h(resources, "<set-?>");
        this.resources = resources;
    }

    public final void setSavedManager(SavedManager savedManager) {
        zq3.h(savedManager, "<set-?>");
        this.savedManager = savedManager;
    }

    public final void show(String str) {
        zq3.h(str, "assetUrl");
        if (getSavedManager().isSaved(str) && getEcommClient().q()) {
            kw2 kw2Var = this.gatewayCardListener;
            if (kw2Var != null) {
                kw2Var.g0();
                return;
            }
            return;
        }
        kw2 kw2Var2 = this.gatewayCardListener;
        if (kw2Var2 != null) {
            kw2Var2.w0();
        }
        View view = this.meterGatewayCardContainer;
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: cd5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean show$lambda$5$lambda$4;
                    show$lambda$5$lambda$4 = OfflineCard.show$lambda$5$lambda$4(view2, motionEvent);
                    return show$lambda$5$lambda$4;
                }
            });
            view.setVisibility(0);
        }
    }

    public final void unsubscribe() {
        this.compositeDisposable.clear();
    }
}
