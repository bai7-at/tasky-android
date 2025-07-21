package com.nytimes.android.media.audio.hybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.media.audio.hybrid.PlayAudioCommand", f = "PlayAudioCommand.kt", l = {24}, m = "run")
/* loaded from: classes4.dex */
final class PlayAudioCommand$run$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayAudioCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayAudioCommand$run$1(PlayAudioCommand playAudioCommand, by0 by0Var) {
        super(by0Var);
        this.this$0 = playAudioCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, 0, null, this);
    }
}
