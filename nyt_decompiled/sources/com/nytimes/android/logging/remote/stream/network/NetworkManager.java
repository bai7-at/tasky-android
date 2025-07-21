package com.nytimes.android.logging.remote.stream.network;

import defpackage.b22;
import defpackage.by0;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class NetworkManager {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final RemoteStreamSocket a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RemoteStreamMessageSendResult {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ RemoteStreamMessageSendResult[] $VALUES;
        public static final RemoteStreamMessageSendResult Success = new RemoteStreamMessageSendResult("Success", 0);
        public static final RemoteStreamMessageSendResult ErrorInOutputStream = new RemoteStreamMessageSendResult("ErrorInOutputStream", 1);
        public static final RemoteStreamMessageSendResult ErrorConnectingToServer = new RemoteStreamMessageSendResult("ErrorConnectingToServer", 2);

        private static final /* synthetic */ RemoteStreamMessageSendResult[] $values() {
            return new RemoteStreamMessageSendResult[]{Success, ErrorInOutputStream, ErrorConnectingToServer};
        }

        static {
            RemoteStreamMessageSendResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private RemoteStreamMessageSendResult(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static RemoteStreamMessageSendResult valueOf(String str) {
            return (RemoteStreamMessageSendResult) Enum.valueOf(RemoteStreamMessageSendResult.class, str);
        }

        public static RemoteStreamMessageSendResult[] values() {
            return (RemoteStreamMessageSendResult[]) $VALUES.clone();
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NetworkManager(RemoteStreamSocket remoteStreamSocket) {
        zq3.h(remoteStreamSocket, "remoteStreamSocket");
        this.a = remoteStreamSocket;
    }

    public final Object b(List list, by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new NetworkManager$sendMessages$2(this, list, null), by0Var);
    }
}
