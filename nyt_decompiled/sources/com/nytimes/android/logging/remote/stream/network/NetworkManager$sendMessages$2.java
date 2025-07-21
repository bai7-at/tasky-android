package com.nytimes.android.logging.remote.stream.network;

import android.util.Log;
import com.nytimes.android.logging.remote.stream.network.NetworkManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.logging.remote.stream.network.NetworkManager$sendMessages$2", f = "NetworkManager.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NetworkManager$sendMessages$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<String> $messages;
    int label;
    final /* synthetic */ NetworkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkManager$sendMessages$2(NetworkManager networkManager, List list, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = networkManager;
        this.$messages = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NetworkManager$sendMessages$2(this.this$0, this.$messages, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RemoteStreamSocket remoteStreamSocket;
        RemoteStreamSocket remoteStreamSocket2;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                remoteStreamSocket = this.this$0.a;
                this.label = 1;
                obj = remoteStreamSocket.c(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return NetworkManager.RemoteStreamMessageSendResult.ErrorInOutputStream;
            }
            remoteStreamSocket2 = this.this$0.a;
            PrintWriter b = remoteStreamSocket2.b();
            StringBuilder sb = new StringBuilder();
            Iterator<T> it2 = this.$messages.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
                sb.append("\r\n\r\n");
            }
            if (b != null) {
                b.write(sb.toString());
            }
            if (b != null) {
                b.flush();
            }
            return NetworkManager.RemoteStreamMessageSendResult.Success;
        } catch (Exception e) {
            Log.e("NYTLoggerDebuggerLog", "ERROR: Unable to connect to MobileLogViewer!", e);
            return NetworkManager.RemoteStreamMessageSendResult.ErrorConnectingToServer;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NetworkManager$sendMessages$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
