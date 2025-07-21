package com.nytimes.android.preference;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import defpackage.a46;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$commentCount$1", f = "SavedForLaterPreferenceLayout.kt", l = {352}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedForLaterPreferenceLayoutKt$commentCount$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CommentsStore $commentsStore;
    final /* synthetic */ Asset $this_commentCount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedForLaterPreferenceLayoutKt$commentCount$1(Asset asset, CommentsStore commentsStore, by0 by0Var) {
        super(2, by0Var);
        this.$this_commentCount = asset;
        this.$commentsStore = commentsStore;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(a46 a46Var, by0 by0Var) {
        return ((SavedForLaterPreferenceLayoutKt$commentCount$1) create(a46Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SavedForLaterPreferenceLayoutKt$commentCount$1 savedForLaterPreferenceLayoutKt$commentCount$1 = new SavedForLaterPreferenceLayoutKt$commentCount$1(this.$this_commentCount, this.$commentsStore, by0Var);
        savedForLaterPreferenceLayoutKt$commentCount$1.L$0 = obj;
        return savedForLaterPreferenceLayoutKt$commentCount$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a46 a46Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            a46 a46Var2 = (a46) this.L$0;
            String url = this.$this_commentCount.getUrl();
            if (url != null) {
                CommentsStore commentsStore = this.$commentsStore;
                this.L$0 = a46Var2;
                this.label = 1;
                Object commentCount = commentsStore.getCommentCount(url, this);
                if (commentCount == h) {
                    return h;
                }
                obj = commentCount;
                a46Var = a46Var2;
            }
            return ww8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a46Var = (a46) this.L$0;
        f.b(obj);
        a46Var.setValue(cc0.c(((Number) obj).intValue()));
        return ww8.a;
    }
}
