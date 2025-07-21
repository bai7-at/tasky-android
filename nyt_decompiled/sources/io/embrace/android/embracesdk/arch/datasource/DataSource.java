package io.embrace.android.embracesdk.arch.datasource;

import defpackage.qs2;
import defpackage.ss2;

/* loaded from: classes5.dex */
public interface DataSource<T> {
    boolean alterSessionSpan(qs2 qs2Var, ss2 ss2Var);

    void disableDataCapture();

    void enableDataCapture();

    void resetDataCaptureLimits();
}
