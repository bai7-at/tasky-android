package com.nytimes.android.crashlytics;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.crashlytics.CrashlyticsConfig;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.AppPreferences;
import defpackage.i21;
import defpackage.m98;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import java.util.UUID;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final class CrashlyticsConfig {
    private final i21 a;
    private final AppPreferences b;
    private final CompositeDisposable c;
    private String d;

    /* renamed from: com.nytimes.android.crashlytics.CrashlyticsConfig$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements ss2 {
        AnonymousClass2(Object obj) {
            super(1, obj, NYTLogger.class, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return ww8.a;
        }

        public final void invoke(Throwable th) {
            zq3.h(th, "p0");
            NYTLogger.h(th);
        }
    }

    public CrashlyticsConfig(i21 i21Var, AppPreferences appPreferences, BehaviorSubject behaviorSubject) {
        zq3.h(i21Var, "crashlytics");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(behaviorSubject, "cachedSubauthUserAnalyticsHelperSubject");
        this.a = i21Var;
        this.b = appPreferences;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.c = compositeDisposable;
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        this.d = uuid;
        i21Var.a(g());
        i21Var.b("sessionId", this.d);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.crashlytics.CrashlyticsConfig.1
            {
                super(1);
            }

            public final void b(m98 m98Var) {
                CrashlyticsConfig.this.a.b("isSubscribed", CrashlyticsAttributes$UserState.Companion.a(m98Var.a(), m98Var.b()).toString());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((m98) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: f11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrashlyticsConfig.c(ss2.this, obj);
            }
        };
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2(NYTLogger.a);
        compositeDisposable.add(behaviorSubject.subscribe(consumer, new Consumer() { // from class: g11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrashlyticsConfig.d(ss2.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        String l = this.b.l("crashlytics_user_id", "");
        if (l.length() != 0) {
            return l;
        }
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        this.b.d("crashlytics_user_id", uuid);
        return uuid;
    }
}
