package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContent$1", f = "WriteNewCommentScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentScreenKt$WriteNewCommentScreenContent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ ScrollState $verticalScrollState;
    int label;

    @fc1(c = "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContent$1$1", f = "WriteNewCommentScreen.kt", l = {143}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContent$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ ScrollState $verticalScrollState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScrollState scrollState, by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
            this.$verticalScrollState = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            return new AnonymousClass1(this.$verticalScrollState, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                ScrollState scrollState = this.$verticalScrollState;
                float m = scrollState.m() - this.$verticalScrollState.n();
                this.label = 1;
                if (ScrollExtensionsKt.c(scrollState, m, this) == h) {
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
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentScreenKt$WriteNewCommentScreenContent$1(CoroutineScope coroutineScope, ScrollState scrollState, by0<? super WriteNewCommentScreenKt$WriteNewCommentScreenContent$1> by0Var) {
        super(2, by0Var);
        this.$coroutineScope = coroutineScope;
        this.$verticalScrollState = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new WriteNewCommentScreenKt$WriteNewCommentScreenContent$1(this.$coroutineScope, this.$verticalScrollState, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$verticalScrollState, null), 3, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((WriteNewCommentScreenKt$WriteNewCommentScreenContent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
