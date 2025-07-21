package io.embrace.android.embracesdk.session.message;

import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.session.lifecycle.ProcessState;

/* loaded from: classes5.dex */
public interface PayloadFactory {
    SessionMessage endPayloadWithCrash(ProcessState processState, long j, Session session, String str);

    SessionMessage endPayloadWithState(ProcessState processState, long j, Session session);

    SessionMessage endSessionWithManual(long j, Session session);

    SessionMessage snapshotPayload(ProcessState processState, long j, Session session);

    Session startPayloadWithState(ProcessState processState, long j, boolean z);

    Session startSessionWithManual(long j);
}
