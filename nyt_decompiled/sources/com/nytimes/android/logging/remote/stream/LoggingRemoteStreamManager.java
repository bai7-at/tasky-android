package com.nytimes.android.logging.remote.stream;

import android.content.SharedPreferences;
import android.util.Log;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import com.nytimes.android.logging.remote.stream.network.NetworkManager;
import com.nytimes.android.logging.remote.stream.network.RemoteStreamSocket;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fw6;
import defpackage.gt2;
import defpackage.i55;
import defpackage.l52;
import defpackage.r42;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class LoggingRemoteStreamManager {
    public static final a Companion = new a(null);
    public static final int m = 8;
    private final SharedPreferences a;
    private final fw6 b;
    private final NetworkManager c;
    private final RemoteStreamSocket d;
    private final l52 e;
    private final i55 f;
    private boolean g;
    private CoroutineScope h;
    private final List i;
    private ss2 j;
    private final r42.c k;
    private final Interceptor l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements r42.c {
        b() {
        }

        @Override // r42.c
        public void a(r42.b bVar) {
            String a;
            zq3.h(bVar, "milestone");
            if (!LoggingRemoteStreamManager.this.j() || (a = LoggingRemoteStreamManager.this.e.a(bVar)) == null) {
                return;
            }
            LoggingRemoteStreamManager.this.h().invoke(a);
        }
    }

    public LoggingRemoteStreamManager(SharedPreferences sharedPreferences, fw6 fw6Var, NetworkManager networkManager, RemoteStreamSocket remoteStreamSocket, l52 l52Var, i55 i55Var) {
        zq3.h(sharedPreferences, "sharedPrefs");
        zq3.h(fw6Var, "debuggerLog");
        zq3.h(networkManager, "networkManager");
        zq3.h(remoteStreamSocket, "remoteStreamSocket");
        zq3.h(l52Var, "eventTrackerParser");
        zq3.h(i55Var, "networkTrackerParser");
        this.a = sharedPreferences;
        this.b = fw6Var;
        this.c = networkManager;
        this.d = remoteStreamSocket;
        this.e = l52Var;
        this.f = i55Var;
        this.i = new ArrayList();
        this.j = new ss2() { // from class: com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$sendNetworkMessage$1

            @fc1(c = "com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$sendNetworkMessage$1$1", f = "LoggingRemoteStreamManager.kt", l = {57}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$sendNetworkMessage$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ String $it;
                final /* synthetic */ List<String> $messagesToSend;
                int label;
                final /* synthetic */ LoggingRemoteStreamManager this$0;

                /* renamed from: com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$sendNetworkMessage$1$1$a */
                public /* synthetic */ class a {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[NetworkManager.RemoteStreamMessageSendResult.values().length];
                        try {
                            iArr[NetworkManager.RemoteStreamMessageSendResult.Success.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LoggingRemoteStreamManager loggingRemoteStreamManager, List list, String str, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = loggingRemoteStreamManager;
                    this.$messagesToSend = list;
                    this.$it = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, this.$messagesToSend, this.$it, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    NetworkManager networkManager;
                    RemoteStreamSocket remoteStreamSocket;
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        networkManager = this.this$0.c;
                        List<String> list = this.$messagesToSend;
                        this.label = 1;
                        obj = networkManager.b(list, this);
                        if (obj == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    if (a.a[((NetworkManager.RemoteStreamMessageSendResult) obj).ordinal()] == 1) {
                        this.this$0.i().clear();
                    } else {
                        this.this$0.i().add(this.$it);
                        remoteStreamSocket = this.this$0.d;
                        remoteStreamSocket.e();
                        Log.e("DevSetting", "Unable to send messages. Will retry at next message send.");
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                CoroutineScope g;
                zq3.h(str, "it");
                List G0 = i.G0(LoggingRemoteStreamManager.this.i(), str);
                if (LoggingRemoteStreamManager.this.j()) {
                    g = LoggingRemoteStreamManager.this.g();
                    BuildersKt__Builders_commonKt.launch$default(g, null, null, new AnonymousClass1(LoggingRemoteStreamManager.this, G0, str, null), 3, null);
                }
            }
        };
        this.k = new b();
        this.l = new Interceptor() { // from class: da4
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response k;
                k = LoggingRemoteStreamManager.k(LoggingRemoteStreamManager.this, chain);
                return k;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope g() {
        if (this.h == null) {
            this.h = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        }
        CoroutineScope coroutineScope = this.h;
        zq3.e(coroutineScope);
        return coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response k(LoggingRemoteStreamManager loggingRemoteStreamManager, Interceptor.Chain chain) {
        String a2;
        zq3.h(loggingRemoteStreamManager, "this$0");
        zq3.h(chain, "chain");
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        if (loggingRemoteStreamManager.g && (a2 = loggingRemoteStreamManager.f.a(request, proceed)) != null) {
            loggingRemoteStreamManager.j.invoke(a2);
        }
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r6, java.lang.Integer r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$setupRemoteStreamSocket$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$setupRemoteStreamSocket$1 r0 = (com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$setupRemoteStreamSocket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$setupRemoteStreamSocket$1 r0 = new com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$setupRemoteStreamSocket$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            java.lang.String r4 = "NYTLoggerDebuggerLog"
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r8)
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.f.b(r8)
            r8 = 0
            if (r6 != 0) goto L3f
            java.lang.String r5 = "Unable to setup logging remote stream. Invalid ip address."
            android.util.Log.e(r4, r5)
            goto L69
        L3f:
            if (r7 != 0) goto L47
            java.lang.String r5 = "Unable to setup logging remote stream. Invalid port."
            android.util.Log.e(r4, r5)
            goto L69
        L47:
            com.nytimes.android.logging.remote.stream.network.RemoteStreamSocket r5 = r5.d
            int r7 = r7.intValue()
            r0.label = r3
            java.lang.Object r8 = r5.d(r6, r7, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L64
            java.lang.String r5 = "Logging Remote Stream configuration to MobileLogViewer set up. Ready to start logging."
            android.util.Log.d(r4, r5)
            goto L69
        L64:
            java.lang.String r5 = "Configured Remote Stream Socket, but socket not connected."
            android.util.Log.e(r4, r5)
        L69:
            java.lang.Boolean r5 = defpackage.cc0.a(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager.m(java.lang.String, java.lang.Integer, by0):java.lang.Object");
    }

    public final ss2 h() {
        return this.j;
    }

    public final List i() {
        return this.i;
    }

    public final boolean j() {
        return this.g;
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(g(), null, null, new LoggingRemoteStreamManager$setup$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.by0 r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            boolean r2 = r8 instanceof com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$updateRemoteStreamLogger$1
            if (r2 == 0) goto L15
            r2 = r8
            com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$updateRemoteStreamLogger$1 r2 = (com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$updateRemoteStreamLogger$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.label = r3
            goto L1a
        L15:
            com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$updateRemoteStreamLogger$1 r2 = new com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager$updateRemoteStreamLogger$1
            r2.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            if (r4 == 0) goto L36
            if (r4 != r1) goto L2e
            java.lang.Object r7 = r2.L$0
            com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager r7 = (com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager) r7
            kotlin.f.b(r8)
            goto L8e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.f.b(r8)
            android.content.SharedPreferences r8 = r7.a
            java.lang.String r4 = "nyt_enable_logging_remote_stream"
            boolean r8 = r8.getBoolean(r4, r0)
            r7.g = r8
            android.content.SharedPreferences r8 = r7.a
            java.lang.String r4 = "nyt_remote_stream_ip_address"
            java.lang.String r5 = "192.168.1.44"
            java.lang.String r8 = r8.getString(r4, r5)
            r4 = 0
            if (r8 == 0) goto L59
            java.lang.CharSequence r8 = kotlin.text.h.c1(r8)
            java.lang.String r8 = r8.toString()
            goto L5a
        L59:
            r8 = r4
        L5a:
            android.content.SharedPreferences r5 = r7.a
            java.lang.String r6 = "nyt_remote_stream_port"
            java.lang.String r5 = r5.getString(r6, r4)
            if (r5 == 0) goto L79
            java.lang.CharSequence r5 = kotlin.text.h.c1(r5)
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L79
            java.lang.Integer r5 = kotlin.text.h.l(r5)
            if (r5 == 0) goto L79
            int r5 = r5.intValue()
            goto L7b
        L79:
            r5 = 9002(0x232a, float:1.2614E-41)
        L7b:
            boolean r6 = r7.g
            if (r6 == 0) goto La6
            java.lang.Integer r4 = defpackage.cc0.c(r5)
            r2.L$0 = r7
            r2.label = r1
            java.lang.Object r8 = r7.m(r8, r4, r2)
            if (r8 != r3) goto L8e
            return r3
        L8e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            fw6 r2 = r7.b
            ss2 r3 = r7.j
            r2.m(r3)
            fw6 r7 = r7.b
            i05[] r1 = new defpackage.i05[r1]
            r1[r0] = r7
            com.nytimes.android.logging.NYTLogger.o(r1)
            r0 = r8
            goto Lb9
        La6:
            fw6 r8 = r7.b
            com.nytimes.android.logging.NYTLogger.y(r8)
            kotlinx.coroutines.CoroutineScope r8 = r7.h
            if (r8 == 0) goto Lb2
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(r8, r4, r1, r4)
        Lb2:
            r7.h = r4
            com.nytimes.android.logging.remote.stream.network.RemoteStreamSocket r7 = r7.d
            r7.e()
        Lb9:
            java.lang.Boolean r7 = defpackage.cc0.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager.n(by0):java.lang.Object");
    }
}
