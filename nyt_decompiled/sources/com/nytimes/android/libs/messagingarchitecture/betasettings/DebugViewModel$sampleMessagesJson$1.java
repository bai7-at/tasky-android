package com.nytimes.android.libs.messagingarchitecture.betasettings;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.at3;
import defpackage.by0;
import defpackage.ec1;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.tu4;
import defpackage.u14;
import defpackage.ww8;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.internal.http2.Http2;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$sampleMessagesJson$1", f = "DebugViewModel.kt", l = {85, 86}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DebugViewModel$sampleMessagesJson$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugViewModel$sampleMessagesJson$1(DebugViewModel debugViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = debugViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DebugViewModel$sampleMessagesJson$1 debugViewModel$sampleMessagesJson$1 = new DebugViewModel$sampleMessagesJson$1(this.this$0, by0Var);
        debugViewModel$sampleMessagesJson$1.L$0 = obj;
        return debugViewModel$sampleMessagesJson$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        ec1 ec1Var;
        Object j;
        at3 at3Var;
        Message e;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            ec1Var = this.this$0.a;
            this.L$0 = flowCollector;
            this.label = 1;
            j = ec1Var.j(this);
            if (j == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
            j = obj;
        }
        Message message = (Message) i.y0((List) j);
        if (message == null) {
            message = tu4.a();
        }
        at3Var = this.this$0.g;
        e = r5.e((r32 & 1) != 0 ? r5.a : null, (r32 & 2) != 0 ? r5.b : null, (r32 & 4) != 0 ? r5.c : null, (r32 & 8) != 0 ? r5.d : 0, (r32 & 16) != 0 ? r5.e : null, (r32 & 32) != 0 ? r5.f : null, (r32 & 64) != 0 ? r5.g : null, (r32 & 128) != 0 ? r5.h : 0, (r32 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r5.i : null, (r32 & 512) != 0 ? r5.j : false, (r32 & 1024) != 0 ? r5.k : null, (r32 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r5.l : null, (r32 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r5.m : null, (r32 & 8192) != 0 ? r5.n : null, (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? message.o : null);
        at3Var.a();
        u14.c cVar = new u14.c(at3Var.b(Message.Companion.serializer(), e));
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(cVar, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((DebugViewModel$sampleMessagesJson$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
