package com.nytimes.android.features.home.data;

import com.nytimes.android.coroutinesutils.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ve2;
import defpackage.wd5;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zq3;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.home.data.HomeCacheManager$save$2", f = "HomeCacheManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeCacheManager$save$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $html;
    int label;
    final /* synthetic */ HomeCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeCacheManager$save$2(HomeCacheManager homeCacheManager, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = homeCacheManager;
        this.$html = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HomeCacheManager$save$2(this.this$0, this.$html, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        ve2 ve2Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        bVar = this.this$0.e;
        HomeCacheManager homeCacheManager = this.this$0;
        String str = this.$html;
        b c = bVar.c("CacheSave");
        c.b(false, (Pair[]) Arrays.copyOf(new Pair[0], 0));
        try {
            try {
                ve2Var = homeCacheManager.b;
                byte[] bytes = str.getBytes(yj0.b);
                zq3.g(bytes, "getBytes(...)");
                ve2Var.e("home-content", wd5.d(wd5.l(new ByteArrayInputStream(bytes))));
                ww8 ww8Var = ww8.a;
                c.a();
                return ww8.a;
            } catch (Exception e) {
                c.error(e);
                throw e;
            }
        } catch (Throwable th) {
            c.a();
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HomeCacheManager$save$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
