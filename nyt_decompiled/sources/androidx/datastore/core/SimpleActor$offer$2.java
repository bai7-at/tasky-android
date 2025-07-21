package androidx.datastore.core;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SimpleActor$offer$2 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleActor$offer$2(SimpleActor simpleActor, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SimpleActor$offer$2(this.this$0, by0Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r6)
            goto L62
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1a:
            java.lang.Object r1 = r5.L$0
            gt2 r1 = (defpackage.gt2) r1
            kotlin.f.b(r6)
            goto L56
        L22:
            kotlin.f.b(r6)
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.c(r6)
            int r6 = r6.get()
            if (r6 <= 0) goto L33
            r6 = r3
            goto L34
        L33:
            r6 = 0
        L34:
            if (r6 == 0) goto L71
        L36:
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            kotlinx.coroutines.CoroutineScope r6 = androidx.datastore.core.SimpleActor.d(r6)
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            gt2 r1 = androidx.datastore.core.SimpleActor.a(r6)
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            kotlinx.coroutines.channels.Channel r6 = androidx.datastore.core.SimpleActor.b(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.receive(r5)
            if (r6 != r0) goto L56
            return r0
        L56:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L62
            return r0
        L62:
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.c(r6)
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L36
            ww8 r5 = defpackage.ww8.a
            return r5
        L71:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Check failed."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SimpleActor$offer$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
