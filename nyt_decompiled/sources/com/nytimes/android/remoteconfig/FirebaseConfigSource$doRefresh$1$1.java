package com.nytimes.android.remoteconfig;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.TimeDuration;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.og8;
import defpackage.pg8;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.CompletableEmitter;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.remoteconfig.FirebaseConfigSource$doRefresh$1$1", f = "FirebaseConfigSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FirebaseConfigSource$doRefresh$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ TimeDuration $effectiveCacheTTL;
    final /* synthetic */ CompletableEmitter $emitter;
    final /* synthetic */ long $startedTS;
    int label;
    final /* synthetic */ FirebaseConfigSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FirebaseConfigSource$doRefresh$1$1(FirebaseConfigSource firebaseConfigSource, TimeDuration timeDuration, long j, CompletableEmitter completableEmitter, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = firebaseConfigSource;
        this.$effectiveCacheTTL = timeDuration;
        this.$startedTS = j;
        this.$emitter = completableEmitter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FirebaseConfigSource$doRefresh$1$1(this.this$0, this.$effectiveCacheTTL, this.$startedTS, this.$emitter, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BehaviorSubject behaviorSubject;
        boolean m;
        BehaviorSubject behaviorSubject2;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        try {
            try {
                pg8 pg8Var = this.this$0.d;
                og8 g = this.this$0.a.g(this.$effectiveCacheTTL.d(TimeUnit.SECONDS));
                zq3.g(g, "fetch(...)");
                pg8Var.a(g);
                pg8 pg8Var2 = this.this$0.d;
                og8 f = this.this$0.a.f();
                zq3.g(f, "activate(...)");
                Object a = pg8Var2.a(f);
                zq3.g(a, "await(...)");
                boolean booleanValue = ((Boolean) a).booleanValue();
                FirebaseConfigSource firebaseConfigSource = this.this$0;
                m = firebaseConfigSource.m();
                firebaseConfigSource.o(m, booleanValue);
                NYTLogger.l("Firebase RemoteConfig successfully activated (" + (System.currentTimeMillis() - this.$startedTS) + "ms)", new Object[0]);
                behaviorSubject2 = this.this$0.b;
                behaviorSubject2.onNext(cc0.a(true));
            } catch (Exception e) {
                NYTLogger.i(e, "Firebase RemoteConfig unable to activate (" + (System.currentTimeMillis() - this.$startedTS) + ")ms using defaults", new Object[0]);
                behaviorSubject = this.this$0.b;
                behaviorSubject.onError(e);
            }
            return ww8.a;
        } finally {
            this.$emitter.onComplete();
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FirebaseConfigSource$doRefresh$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
