package com.nytimes.android.messaging.dock;

import android.content.Context;
import android.net.Uri;
import com.google.gson.Gson;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.messaging.api.UserStatus;
import com.nytimes.android.messaging.dock.DockPresenter;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.by0;
import defpackage.cc0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id9;
import defpackage.l19;
import defpackage.qv6;
import defpackage.s42;
import defpackage.ss2;
import defpackage.u32;
import defpackage.ww8;
import defpackage.y32;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.rx2.RxConvertKt;
import kotlinx.coroutines.rx2.RxSingleKt;

@ExperimentalCoroutinesApi
/* loaded from: classes4.dex */
public final class DockPresenter {
    public static final int $stable = 8;
    private final DeepLinkManager deepLinkManager;
    private final String dockLabel;
    private final String dockName;
    private final a ecommClient;
    private final ET2Scope et2Scope;
    private final qv6 remoteConfig;
    private final id9 webActivityNavigator;

    public DockPresenter(a aVar, qv6 qv6Var, DeepLinkManager deepLinkManager, id9 id9Var, ET2Scope eT2Scope) {
        zq3.h(aVar, "ecommClient");
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(deepLinkManager, "deepLinkManager");
        zq3.h(id9Var, "webActivityNavigator");
        zq3.h(eT2Scope, "et2Scope");
        this.ecommClient = aVar;
        this.remoteConfig = qv6Var;
        this.deepLinkManager = deepLinkManager;
        this.webActivityNavigator = id9Var;
        this.et2Scope = eT2Scope;
        this.dockName = "dock";
        this.dockLabel = "AND_DOCK_CORE";
    }

    private final Dock configureDock(Boolean bool, DockConfig dockConfig) {
        Dock config;
        String linkLocation;
        Dock dock = new Dock(false, null, null, 6, null);
        DockData dockData = (DockData) new Gson().fromJson(this.remoteConfig.k(), DockData.class);
        if (dockData == null || (config = DockDataKt.config(dockData, bool, dockConfig)) == null) {
            return dock;
        }
        String text = config.getText();
        if (text != null && !h.d0(text) && (linkLocation = config.getLinkLocation()) != null && !h.d0(linkLocation)) {
            return config;
        }
        NYTLogger.g("GMAX: unable to display dock with text: " + config.getText() + " and link: " + config.getLinkLocation(), new Object[0]);
        return dock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Dock dockMessage(UserStatus userStatus, Boolean bool, DockConfig dockConfig) {
        if ((userStatus != UserStatus.ANONYMOUS || dockConfig != DockConfig.PLAY_TAB) && userStatus != UserStatus.REGISTERED) {
            return new Dock(false, null, null, 6, null);
        }
        return configureDock(bool, dockConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserStatus observeDock$lambda$0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (UserStatus) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource observeDock$lambda$1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    public final Observable<Dock> observeDock(final DockConfig dockConfig) {
        zq3.h(dockConfig, "dockConfig");
        Observable asObservable$default = RxConvertKt.asObservable$default(this.ecommClient.h(), null, 1, null);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.messaging.dock.DockPresenter$observeDock$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final UserStatus invoke(NYTUser.StateChangeType stateChangeType) {
                a aVar;
                zq3.h(stateChangeType, "it");
                aVar = DockPresenter.this.ecommClient;
                return l19.a(aVar);
            }
        };
        Observable map = asObservable$default.map(new Function() { // from class: at1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                UserStatus observeDock$lambda$0;
                observeDock$lambda$0 = DockPresenter.observeDock$lambda$0(ss2.this, obj);
                return observeDock$lambda$0;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.messaging.dock.DockPresenter$observeDock$2

            @fc1(c = "com.nytimes.android.messaging.dock.DockPresenter$observeDock$2$1", f = "DockPresenter.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.messaging.dock.DockPresenter$observeDock$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ DockConfig $dockConfig;
                final /* synthetic */ UserStatus $it;
                int label;
                final /* synthetic */ DockPresenter this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DockPresenter dockPresenter, UserStatus userStatus, DockConfig dockConfig, by0<? super AnonymousClass1> by0Var) {
                    super(2, by0Var);
                    this.this$0 = dockPresenter;
                    this.$it = userStatus;
                    this.$dockConfig = dockConfig;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0<ww8> create(Object obj, by0<?> by0Var) {
                    return new AnonymousClass1(this.this$0, this.$it, this.$dockConfig, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    a aVar;
                    Dock dockMessage;
                    kotlin.coroutines.intrinsics.a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    DockPresenter dockPresenter = this.this$0;
                    UserStatus userStatus = this.$it;
                    zq3.g(userStatus, "$it");
                    aVar = this.this$0.ecommClient;
                    dockMessage = dockPresenter.dockMessage(userStatus, cc0.a(aVar.b()), this.$dockConfig);
                    return dockMessage;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0<? super Dock> by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final SingleSource<? extends Dock> invoke(UserStatus userStatus) {
                zq3.h(userStatus, "it");
                return RxSingleKt.rxSingle$default(null, new AnonymousClass1(DockPresenter.this, userStatus, dockConfig, null), 1, null);
            }
        };
        Observable<Dock> distinctUntilChanged = map.flatMapSingle(new Function() { // from class: bt1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource observeDock$lambda$1;
                observeDock$lambda$1 = DockPresenter.observeDock$lambda$1(ss2.this, obj);
                return observeDock$lambda$1;
            }
        }).distinctUntilChanged();
        zq3.g(distinctUntilChanged, "distinctUntilChanged(...)");
        return distinctUntilChanged;
    }

    public final void onClick(Context context, String str) {
        zq3.h(context, "context");
        if (str != null) {
            DeepLinkManager deepLinkManager = this.deepLinkManager;
            Uri parse = Uri.parse(str);
            zq3.g(parse, "parse(...)");
            if (deepLinkManager.h(parse)) {
                this.webActivityNavigator.c(context, str);
            }
        }
    }

    public final void sendDockImpressionET2Event(String str, String str2) {
        ET2PageScope.DefaultImpls.a(this.et2Scope, new e52.d(), new s42(this.dockName, this.dockLabel, null, null, str, str2, null, null, str, 204, null), new u32(null, "dock", null, 5, null), null, 8, null);
    }

    public final void sendDockInteractionET2Event(String str, String str2) {
        ET2PageScope.DefaultImpls.a(this.et2Scope, new e52.e(), new s42(this.dockName, this.dockLabel, null, null, str, str2, null, new y32(str, null, null, "button", null, null, 54, null), str, 76, null), new u32(null, "dock", "tap", 1, null), null, 8, null);
    }
}
