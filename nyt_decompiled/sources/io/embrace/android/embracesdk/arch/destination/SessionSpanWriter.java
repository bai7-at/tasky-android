package io.embrace.android.embracesdk.arch.destination;

import defpackage.ss2;

/* loaded from: classes5.dex */
public interface SessionSpanWriter {
    boolean addCustomAttribute(SpanAttributeData spanAttributeData);

    <T> boolean addEvent(T t, ss2 ss2Var);

    boolean removeCustomAttribute(String str);
}
