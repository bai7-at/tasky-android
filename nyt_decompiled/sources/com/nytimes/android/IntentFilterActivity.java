package com.nytimes.android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.nytimes.android.IntentFilterActivity;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import com.nytimes.navigation.deeplink.MagicLinkManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.rb5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.StartupActivity;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StartupActivity
/* loaded from: classes2.dex */
public final class IntentFilterActivity extends d {
    public DeepLinkManager deepLinkManager;
    public com.nytimes.android.entitlements.a eCommClient;
    public MagicLinkManager magicLinkManager;

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(Throwable th) {
        NYTLogger.i(th, "Error occurred with deep link intent", new Object[0]);
        SnackbarUtil.z(getSnackbarUtil(), "Could not load content", 0, false, 6, null);
    }

    private final boolean Y(Intent intent) {
        return !rb5.l(String.valueOf(intent.getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z(Intent intent) {
        String action;
        return (intent == null || (((action = intent.getAction()) == null || action.length() == 0) && intent.getData() == null && intent.getComponent() == null)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource a0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (MaybeSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent b0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Intent) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final DeepLinkManager V() {
        DeepLinkManager deepLinkManager = this.deepLinkManager;
        if (deepLinkManager != null) {
            return deepLinkManager;
        }
        zq3.z("deepLinkManager");
        return null;
    }

    public final com.nytimes.android.entitlements.a W() {
        com.nytimes.android.entitlements.a aVar = this.eCommClient;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("eCommClient");
        return null;
    }

    public final MagicLinkManager X() {
        MagicLinkManager magicLinkManager = this.magicLinkManager;
        if (magicLinkManager != null) {
            return magicLinkManager;
        }
        zq3.z("magicLinkManager");
        return null;
    }

    @Override // com.nytimes.android.d, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        Intent intent = getIntent();
        zq3.g(intent, "getIntent(...)");
        if (Y(intent)) {
            NYTLogger.g("Malicious App Intent with data: " + getIntent().getData(), new Object[0]);
            Toast.makeText(this, "Could not open NYTimes link", 0).show();
            finish();
        }
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        super.onPause();
        getCompositeDisposable().clear();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (isFinishing()) {
            return;
        }
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        MagicLinkManager X = X();
        Intent intent = getIntent();
        zq3.g(intent, "getIntent(...)");
        Single observeOn = X.d(intent).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.IntentFilterActivity$onResume$1

            @fc1(c = "com.nytimes.android.IntentFilterActivity$onResume$1$1", f = "IntentFilterActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.IntentFilterActivity$onResume$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                int label;
                final /* synthetic */ IntentFilterActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IntentFilterActivity intentFilterActivity, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = intentFilterActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return this.this$0.W().g();
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MaybeSource invoke(Boolean bool) {
                Object runBlocking$default;
                DeepLinkManager V = IntentFilterActivity.this.V();
                IntentFilterActivity intentFilterActivity = IntentFilterActivity.this;
                Intent intent2 = intentFilterActivity.getIntent();
                zq3.g(intent2, "getIntent(...)");
                zq3.e(bool);
                boolean booleanValue = bool.booleanValue();
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(IntentFilterActivity.this, null), 1, null);
                return V.g(intentFilterActivity, intent2, booleanValue, (String) runBlocking$default);
            }
        };
        Maybe flatMapMaybe = observeOn.flatMapMaybe(new Function() { // from class: tn3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource a0;
                a0 = IntentFilterActivity.a0(ss2.this, obj);
                return a0;
            }
        });
        final IntentFilterActivity$onResume$2 intentFilterActivity$onResume$2 = new ss2() { // from class: com.nytimes.android.IntentFilterActivity$onResume$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Intent invoke(Intent intent2) {
                zq3.h(intent2, "intent");
                intent2.putExtra("et2_referring_source_type", "deeplink");
                return intent2;
            }
        };
        Maybe map = flatMapMaybe.map(new Function() { // from class: un3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Intent b0;
                b0 = IntentFilterActivity.b0(ss2.this, obj);
                return b0;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.IntentFilterActivity$onResume$3
            {
                super(1);
            }

            public final void b(Intent intent2) {
                boolean Z;
                Z = IntentFilterActivity.this.Z(intent2);
                if (Z) {
                    IntentFilterActivity.this.startActivity(intent2);
                }
                IntentFilterActivity.this.finish();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Intent) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: vn3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IntentFilterActivity.c0(ss2.this, obj);
            }
        };
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.IntentFilterActivity$onResume$4
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                boolean Z;
                zq3.h(th, "error");
                IntentFilterActivity intentFilterActivity = IntentFilterActivity.this;
                Z = intentFilterActivity.Z(intentFilterActivity.getIntent());
                if (Z) {
                    IntentFilterActivity.this.U(th);
                } else {
                    IntentFilterActivity.this.finish();
                }
            }
        };
        compositeDisposable.add(map.subscribe(consumer, new Consumer() { // from class: wn3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IntentFilterActivity.d0(ss2.this, obj);
            }
        }));
    }
}
