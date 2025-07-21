package com.nytimes.navigation.deeplink;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.o98;
import defpackage.oa4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.navigation.deeplink.MagicLinkManager$login$1", f = "MagicLinkManager.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MagicLinkManager$login$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ MagicLinkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MagicLinkManager$login$1(MagicLinkManager magicLinkManager, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = magicLinkManager;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MagicLinkManager$login$1(this.this$0, this.$code, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            f.b(obj);
            o98 p = this.this$0.b().p();
            String str = this.$code;
            this.label = 1;
            obj = p.h(str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        if (((oa4) obj) instanceof oa4.b) {
            z = false;
            NYTLogger.g("Problem trying to magic link with " + this.$code, new Object[0]);
        }
        return cc0.a(z);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MagicLinkManager$login$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
