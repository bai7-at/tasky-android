package io.embrace.android.embracesdk.session.lifecycle;

import defpackage.c44;
import java.io.Closeable;

/* loaded from: classes5.dex */
public interface ProcessStateService extends c44, Closeable {
    void addListener(ProcessStateListener processStateListener);

    boolean isInBackground();

    void onBackground();

    void onForeground();
}
