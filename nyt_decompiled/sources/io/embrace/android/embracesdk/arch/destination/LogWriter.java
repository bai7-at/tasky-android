package io.embrace.android.embracesdk.arch.destination;

import defpackage.ss2;

/* loaded from: classes5.dex */
public interface LogWriter {

    public static final class DefaultImpls {
        public static /* synthetic */ void addLog$default(LogWriter logWriter, Object obj, ss2 ss2Var, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addLog");
            }
            if ((i & 2) != 0) {
                ss2Var = null;
            }
            logWriter.addLog(obj, ss2Var);
        }
    }

    <T> void addLog(T t, ss2 ss2Var);
}
