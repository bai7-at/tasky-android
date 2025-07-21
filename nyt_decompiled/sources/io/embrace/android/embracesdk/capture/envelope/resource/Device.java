package io.embrace.android.embracesdk.capture.envelope.resource;

import defpackage.c04;
import io.embrace.android.embracesdk.internal.SystemInfo;

/* loaded from: classes5.dex */
public interface Device {
    String getCpuName();

    String getEglInfo();

    c04 getInternalStorageTotalCapacity();

    int getNumberOfCores();

    String getScreenResolution();

    SystemInfo getSystemInfo();

    Boolean isJailbroken();

    void setJailbroken(Boolean bool);

    void setScreenResolution(String str);
}
