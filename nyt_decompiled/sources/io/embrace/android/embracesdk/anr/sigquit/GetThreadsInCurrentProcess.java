package io.embrace.android.embracesdk.anr.sigquit;

import defpackage.zq3;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class GetThreadsInCurrentProcess {
    private final FilesDelegate filesDelegate;

    public GetThreadsInCurrentProcess(FilesDelegate filesDelegate) {
        zq3.h(filesDelegate, "filesDelegate");
        this.filesDelegate = filesDelegate;
    }

    public final List<String> invoke() {
        try {
            File[] listFiles = this.filesDelegate.getThreadsFileForCurrentProcess().listFiles();
            if (listFiles == null) {
                return i.l();
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                zq3.g(file, "it");
                arrayList.add(file.getName());
            }
            return arrayList;
        } catch (Exception unused) {
            return i.l();
        }
    }
}
