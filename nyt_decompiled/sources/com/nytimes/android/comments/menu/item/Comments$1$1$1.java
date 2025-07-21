package com.nytimes.android.comments.menu.item;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.comments.menu.view.MenuCommentsView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.menu.item.Comments$1$1$1", f = "Comments.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class Comments$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Asset $asset;
    int label;
    final /* synthetic */ Comments this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Comments$1$1$1(Comments comments, Asset asset, by0<? super Comments$1$1$1> by0Var) {
        super(2, by0Var);
        this.this$0 = comments;
        this.$asset = asset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new Comments$1$1$1(this.this$0, this.$asset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            MenuCommentsView menuCommentsView = this.this$0.menuCommentsView;
            Asset asset = this.$asset;
            this.label = 1;
            if (menuCommentsView.loadCommentCount(asset, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((Comments$1$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
