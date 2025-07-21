package io.embrace.android.embracesdk.capture.envelope.session;

import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;

/* loaded from: classes5.dex */
public interface SessionPayloadSource {
    SessionPayload getSessionPayload(SessionSnapshotType sessionSnapshotType);
}
