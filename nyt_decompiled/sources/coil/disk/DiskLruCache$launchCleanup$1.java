package coil.disk;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.wd5;
import defpackage.ww8;
import java.io.IOException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = diskLruCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DiskLruCache$launchCleanup$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean w0;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            z = diskLruCache.n;
            if (z) {
                z2 = diskLruCache.r;
                if (!z2) {
                    try {
                        diskLruCache.h1();
                    } catch (IOException unused) {
                        diskLruCache.s = true;
                    }
                    try {
                        w0 = diskLruCache.w0();
                        if (w0) {
                            diskLruCache.v1();
                        }
                    } catch (IOException unused2) {
                        diskLruCache.t = true;
                        diskLruCache.l = wd5.c(wd5.b());
                    }
                    return ww8.a;
                }
            }
            return ww8.a;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DiskLruCache$launchCleanup$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
