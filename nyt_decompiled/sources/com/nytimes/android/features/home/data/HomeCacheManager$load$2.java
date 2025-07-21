package com.nytimes.android.features.home.data;

import com.nytimes.android.coroutinesutils.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j91;
import defpackage.l93;
import defpackage.lm;
import defpackage.sd0;
import defpackage.ve2;
import defpackage.ww8;
import java.io.FileNotFoundException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.home.data.HomeCacheManager$load$2", f = "HomeCacheManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeCacheManager$load$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ HomeCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeCacheManager$load$2(HomeCacheManager homeCacheManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = homeCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HomeCacheManager$load$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        sd0 sd0Var;
        lm lmVar;
        j91 j91Var;
        ve2 ve2Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        bVar = this.this$0.e;
        HomeCacheManager homeCacheManager = this.this$0;
        b c = bVar.c("CacheLoad");
        c.b(false, (Pair[]) Arrays.copyOf(new Pair[0], 0));
        l93 l93Var = null;
        try {
            try {
                try {
                    ve2Var = homeCacheManager.b;
                    sd0Var = ve2Var.c("home-content");
                } finally {
                    c.a();
                }
            } catch (FileNotFoundException unused) {
                sd0Var = null;
            }
            if (sd0Var != null) {
                String i1 = sd0Var.i1();
                j91Var = homeCacheManager.a;
                l93Var = new l93(i1, j91Var.d());
            }
            if (sd0Var != null) {
                sd0Var.close();
            }
            lmVar = homeCacheManager.d;
            lmVar.q(true);
            return l93Var;
        } catch (Exception e) {
            c.error(e);
            throw e;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HomeCacheManager$load$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
