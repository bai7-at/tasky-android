package io.embrace.android.embracesdk.anr.sigquit;

import defpackage.zq3;
import java.io.File;

/* loaded from: classes5.dex */
public final class FilesDelegate {
    public final File getCommandFileForThread(String str) {
        zq3.h(str, "threadId");
        return new File("/proc/" + str + "/comm");
    }

    public final File getThreadsFileForCurrentProcess() {
        return new File("/proc/self/task");
    }
}
