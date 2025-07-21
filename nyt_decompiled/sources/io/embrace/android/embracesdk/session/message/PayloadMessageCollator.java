package io.embrace.android.embracesdk.session.message;

import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.session.message.FinalEnvelopeParams;

/* loaded from: classes5.dex */
public interface PayloadMessageCollator {
    SessionMessage buildFinalBackgroundActivityMessage(FinalEnvelopeParams.BackgroundActivityParams backgroundActivityParams);

    SessionMessage buildFinalSessionMessage(FinalEnvelopeParams.SessionParams sessionParams);

    Session buildInitialSession(InitialEnvelopeParams initialEnvelopeParams);
}
