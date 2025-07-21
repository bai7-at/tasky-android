package com.nytimes.android.logging.remote.stream.network;

import android.util.Log;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.io.PrintWriter;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.logging.remote.stream.network.RemoteStreamSocket$isRemoteStreamSocketConnected$2", f = "RemoteStreamSocket.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RemoteStreamSocket$isRemoteStreamSocketConnected$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ RemoteStreamSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteStreamSocket$isRemoteStreamSocketConnected$2(RemoteStreamSocket remoteStreamSocket, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = remoteStreamSocket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RemoteStreamSocket$isRemoteStreamSocketConnected$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        boolean z = false;
        try {
            PrintWriter b = this.this$0.b();
            if (b != null) {
                if (!b.checkError()) {
                    z = true;
                }
            }
        } catch (Exception e) {
            Log.e("NYTLoggerDebuggerLog", "Unable to connect to remote stream socket: " + e.getLocalizedMessage(), e);
        }
        return cc0.a(z);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((RemoteStreamSocket$isRemoteStreamSocketConnected$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
