package com.nytimes.android.share.sheet;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.share.sheet.NYTShareBottomSheetKt$NYTShareBottomSheet$1$1", f = "NYTShareBottomSheet.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NYTShareBottomSheetKt$NYTShareBottomSheet$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $isLinkCopied$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTShareBottomSheetKt$NYTShareBottomSheet$1$1(sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$isLinkCopied$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NYTShareBottomSheetKt$NYTShareBottomSheet$1$1(this.$isLinkCopied$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.label = 1;
            if (DelayKt.delay(3000L, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        NYTShareBottomSheetKt.e(this.$isLinkCopied$delegate, false);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NYTShareBottomSheetKt$NYTShareBottomSheet$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
