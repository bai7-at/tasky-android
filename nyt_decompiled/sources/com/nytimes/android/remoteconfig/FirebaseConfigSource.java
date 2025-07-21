package com.nytimes.android.remoteconfig;

import android.app.Application;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.a;
import com.google.firebase.remoteconfig.internal.c;
import com.nytimes.android.remoteconfig.FirebaseConfigSource;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.TimeDuration;
import defpackage.ai2;
import defpackage.aw6;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ij2;
import defpackage.io6;
import defpackage.jj2;
import defpackage.og8;
import defpackage.pg8;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes4.dex */
public class FirebaseConfigSource implements aw6 {
    private final a a;
    private final BehaviorSubject b;
    private final Application c;
    private final pg8 d;
    private final CoroutineDispatcher e;
    private final TimeDuration f;
    private final AppPreferences g;
    private final CoroutineScope h;

    @fc1(c = "com.nytimes.android.remoteconfig.FirebaseConfigSource$1", f = "FirebaseConfigSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.remoteconfig.FirebaseConfigSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return FirebaseConfigSource.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            pg8 pg8Var = FirebaseConfigSource.this.d;
            og8 r = FirebaseConfigSource.this.a.r(new ij2.b().e(DeviceUtils.z(FirebaseConfigSource.this.c) ? ai2.a().c() : c.j).c());
            zq3.g(r, "setConfigSettingsAsync(...)");
            pg8Var.a(r);
            pg8 pg8Var2 = FirebaseConfigSource.this.d;
            og8 s = FirebaseConfigSource.this.a.s(io6.remote_config_defaults);
            zq3.g(s, "setDefaultsAsync(...)");
            pg8Var2.a(s);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public FirebaseConfigSource(a aVar, BehaviorSubject behaviorSubject, Application application, pg8 pg8Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(aVar, "fbConfig");
        zq3.h(behaviorSubject, "remoteConfigReadySubject");
        zq3.h(application, "context");
        zq3.h(pg8Var, "taskAwaiter");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = aVar;
        this.b = behaviorSubject;
        this.c = application;
        this.d = pg8Var;
        this.e = coroutineDispatcher;
        this.g = new AppPreferences(application);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.h = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, coroutineDispatcher, null, new AnonymousClass1(null), 2, null);
        this.f = DeviceUtils.z(application) ? ai2.b() : ai2.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(FirebaseConfigSource firebaseConfigSource, CompletableEmitter completableEmitter) {
        zq3.h(firebaseConfigSource, "this$0");
        zq3.h(completableEmitter, "emitter");
        BuildersKt__Builders_commonKt.launch$default(firebaseConfigSource.h, firebaseConfigSource.e, null, new FirebaseConfigSource$doRefresh$1$1(firebaseConfigSource, firebaseConfigSource.m() ? ai2.d() : firebaseConfigSource.f, System.currentTimeMillis(), completableEmitter, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        return this.g.j("FIREBASE_FETCH_VERSION_CODE", 0) != DeviceUtils.w(this.c);
    }

    private final jj2 n(String str) {
        jj2 k = this.a.k(str);
        zq3.g(k, "getValue(...)");
        if (k.a() == 0) {
            return null;
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z, boolean z2) {
        if (z) {
            this.g.b("FIREBASE_FETCH_VERSION_CODE", DeviceUtils.w(this.c));
        }
        if (z2) {
            this.g.c("FIREBASE_REMOTE_CONFIG_REFRESH_TS_MS", this.a.h().a());
        }
    }

    @Override // defpackage.aw6
    public Boolean a(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            jj2 n = n(str);
            if (n != null) {
                return Boolean.valueOf(n.c());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.aw6
    public Completable b() {
        Completable create = Completable.create(new CompletableOnSubscribe() { // from class: zh2
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                FirebaseConfigSource.l(FirebaseConfigSource.this, completableEmitter);
            }
        });
        zq3.g(create, "create(...)");
        return create;
    }

    @Override // defpackage.aw6
    public Number c(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            jj2 n = n(str);
            if (n != null) {
                return Long.valueOf(n.b());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.aw6
    public String d(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        jj2 n = n(str);
        if (n != null) {
            return n.asString();
        }
        return null;
    }
}
