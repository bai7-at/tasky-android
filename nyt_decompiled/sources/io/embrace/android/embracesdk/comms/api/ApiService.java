package io.embrace.android.embracesdk.comms.api;

import defpackage.ss2;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import io.embrace.android.embracesdk.payload.BlobMessage;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.NetworkEvent;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public interface ApiService {
    CachedConfig getCachedConfig();

    RemoteConfig getConfig();

    void saveLogEnvelope(Envelope<LogPayload> envelope);

    void sendAEIBlob(BlobMessage blobMessage);

    Future<?> sendCrash(EventMessage eventMessage);

    void sendEvent(EventMessage eventMessage);

    void sendLog(EventMessage eventMessage);

    void sendLogEnvelope(Envelope<LogPayload> envelope);

    void sendNetworkCall(NetworkEvent networkEvent);

    Future<?> sendSession(boolean z, ss2 ss2Var, ss2 ss2Var2);
}
