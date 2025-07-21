package io.embrace.android.embracesdk.anr.sigquit;

import defpackage.lf2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class GetThreadCommand {
    private final FilesDelegate filesDelegate;

    public GetThreadCommand(FilesDelegate filesDelegate) {
        zq3.h(filesDelegate, "filesDelegate");
        this.filesDelegate = filesDelegate;
    }

    public final String invoke(String str) {
        zq3.h(str, "threadId");
        try {
            return lf2.g(this.filesDelegate.getCommandFileForThread(str), null, 1, null);
        } catch (Exception unused) {
            return "";
        }
    }
}
