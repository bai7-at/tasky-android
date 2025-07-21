package com.nytimes.android.media.audio.hybrid;

import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.rb3;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$2", f = "PlayAudioCommand.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayAudioCommand$run$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ NYTMediaItem $mediaItem;
    int label;
    final /* synthetic */ PlayAudioCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayAudioCommand$run$2(PlayAudioCommand playAudioCommand, NYTMediaItem nYTMediaItem, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = playAudioCommand;
        this.$mediaItem = nYTMediaItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PlayAudioCommand$run$2(this.this$0, this.$mediaItem, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rb3 rb3Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        rb3Var = this.this$0.b;
        rb3Var.c(this.$mediaItem);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PlayAudioCommand$run$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
