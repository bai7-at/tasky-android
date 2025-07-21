package com.nytimes.android.comments.writenewcomment.data.local;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.s16;
import defpackage.t16;
import defpackage.ww8;
import java.io.IOException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$commenterPreferencesFlow$1", f = "WriteNewCommentPreferencesDataStore.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentPreferencesDataStore$commenterPreferencesFlow$1 extends SuspendLambda implements it2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    WriteNewCommentPreferencesDataStore$commenterPreferencesFlow$1(by0<? super WriteNewCommentPreferencesDataStore$commenterPreferencesFlow$1> by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (!(th instanceof IOException)) {
                throw th;
            }
            s16 a = t16.a();
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(a, this) == h) {
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

    @Override // defpackage.it2
    public final Object invoke(FlowCollector<? super s16> flowCollector, Throwable th, by0<? super ww8> by0Var) {
        WriteNewCommentPreferencesDataStore$commenterPreferencesFlow$1 writeNewCommentPreferencesDataStore$commenterPreferencesFlow$1 = new WriteNewCommentPreferencesDataStore$commenterPreferencesFlow$1(by0Var);
        writeNewCommentPreferencesDataStore$commenterPreferencesFlow$1.L$0 = flowCollector;
        writeNewCommentPreferencesDataStore$commenterPreferencesFlow$1.L$1 = th;
        return writeNewCommentPreferencesDataStore$commenterPreferencesFlow$1.invokeSuspend(ww8.a);
    }
}
