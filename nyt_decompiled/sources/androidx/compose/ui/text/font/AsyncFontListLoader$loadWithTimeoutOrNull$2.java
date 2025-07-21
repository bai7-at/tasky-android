package androidx.compose.ui.text.font;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hu5;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ d $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, d dVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hu5 hu5Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            hu5Var = this.this$0.e;
            d dVar = this.$this_loadWithTimeoutOrNull;
            this.label = 1;
            obj = hu5Var.b(dVar, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
