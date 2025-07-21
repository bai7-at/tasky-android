package com.nytimes.android.eventtracker.pagetracker;

import com.nytimes.android.eventtracker.AppLifecycleObserver;
import com.nytimes.android.eventtracker.context.PageContext;
import defpackage.by0;
import defpackage.e32;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.na2;
import defpackage.q52;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.wt6;
import defpackage.ww8;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

@fc1(c = "com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$job$1", f = "ET2SinglePageClient.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ET2SinglePageClient$trackPage$job$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ e32 $asset;
    final /* synthetic */ qs2 $extraData;
    final /* synthetic */ na2 $fastlyHeaders;
    final /* synthetic */ ss2 $onPageEnter;
    final /* synthetic */ ss2 $onPageExit;
    final /* synthetic */ Deferred $pageEnterWaiter;
    final /* synthetic */ wt6 $referringSource;
    final /* synthetic */ String $uri;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ ET2SinglePageClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ET2SinglePageClient$trackPage$job$1(ET2SinglePageClient eT2SinglePageClient, e32 e32Var, String str, String str2, wt6 wt6Var, na2 na2Var, qs2 qs2Var, ss2 ss2Var, Deferred deferred, ss2 ss2Var2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = eT2SinglePageClient;
        this.$asset = e32Var;
        this.$url = str;
        this.$uri = str2;
        this.$referringSource = wt6Var;
        this.$fastlyHeaders = na2Var;
        this.$extraData = qs2Var;
        this.$onPageEnter = ss2Var;
        this.$pageEnterWaiter = deferred;
        this.$onPageExit = ss2Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ET2SinglePageClient$trackPage$job$1(this.this$0, this.$asset, this.$url, this.$uri, this.$referringSource, this.$fastlyHeaders, this.$extraData, this.$onPageEnter, this.$pageEnterWaiter, this.$onPageExit, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppLifecycleObserver appLifecycleObserver;
        q52 q52Var;
        Object h = a.h();
        tx1 tx1Var = this.label;
        try {
            if (tx1Var == 0) {
                f.b(obj);
                PageContext pageContext = new PageContext(null, null, null, null, 0, 31, null);
                appLifecycleObserver = this.this$0.a;
                q52Var = this.this$0.b;
                tx1 tx1Var2 = r15;
                tx1 tx1Var3 = new tx1(pageContext, appLifecycleObserver, q52Var, this.$asset, this.$url, this.$uri, this.$referringSource, this.$fastlyHeaders, this.$extraData);
                tx1 tx1Var4 = (tx1) i.y0((List) this.this$0.d().getValue());
                if (tx1Var4 != null) {
                    tx1Var4.o();
                }
                this.this$0.d().setValue(i.G0((Collection) this.this$0.d().getValue(), tx1Var2));
                tx1.n(tx1Var2, false, 1, null);
                this.$onPageEnter.invoke(tx1Var2);
                Job.DefaultImpls.cancel$default((Job) this.$pageEnterWaiter, (CancellationException) null, 1, (Object) null);
                this.L$0 = tx1Var2;
                this.label = 1;
                tx1Var = tx1Var2;
                if (DelayKt.awaitCancellation(this) == h) {
                    return h;
                }
            } else {
                if (tx1Var != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tx1 tx1Var5 = (tx1) this.L$0;
                f.b(obj);
                tx1Var = tx1Var5;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.this$0.d().setValue(i.E0((Iterable) this.this$0.d().getValue(), tx1Var));
            tx1Var.p();
            this.$onPageExit.invoke(tx1Var);
            tx1 tx1Var6 = (tx1) i.y0((List) this.this$0.d().getValue());
            if (tx1Var6 != null) {
                tx1.n(tx1Var6, false, 1, null);
            }
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ET2SinglePageClient$trackPage$job$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
