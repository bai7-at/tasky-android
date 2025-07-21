package com.nytimes.android.fragment.article;

import com.comscore.android.util.AndroidTcfDataLoader;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.article.WebContentLoader$reloadData$1", f = "WebContentLoader.kt", l = {AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebContentLoader$reloadData$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $urlToLoad;
    int label;
    final /* synthetic */ WebContentLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebContentLoader$reloadData$1(WebContentLoader webContentLoader, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = webContentLoader;
        this.$urlToLoad = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebContentLoader$reloadData$1(this.this$0, this.$urlToLoad, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            WebContentLoader webContentLoader = this.this$0;
            String str = this.$urlToLoad;
            this.label = 1;
            e = webContentLoader.e(str, this);
            if (e == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebContentLoader$reloadData$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
