package com.nytimes.android.ribbon.destinations.audio;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.mz;
import defpackage.pz;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.audio.AudioViewModel$refreshAudioAssets$1", f = "AudioViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AudioViewModel$refreshAudioAssets$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ pz $data;
    int label;
    final /* synthetic */ AudioViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioViewModel$refreshAudioAssets$1(AudioViewModel audioViewModel, pz pzVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = audioViewModel;
        this.$data = pzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AudioViewModel$refreshAudioAssets$1(this.this$0, this.$data, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        mz mzVar;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        mutableStateFlow = this.this$0.f;
        pz pzVar = this.$data;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, pzVar != null ? new DownloadState.d(pzVar) : DownloadState.c.b));
        mutableStateFlow2 = this.this$0.f;
        AudioViewModel audioViewModel = this.this$0;
        do {
            value2 = mutableStateFlow2.getValue();
            mzVar = audioViewModel.b;
        } while (!mutableStateFlow2.compareAndSet(value2, new DownloadState.e(mzVar.a())));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AudioViewModel$refreshAudioAssets$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
