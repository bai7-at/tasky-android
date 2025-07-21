package com.nytimes.android.subauth.core.purr.model;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class PurrLocationKt {
    public static final PurrLocation toPurrLocation(String str) {
        PurrLocation purrLocation;
        zq3.h(str, "<this>");
        PurrLocation[] values = PurrLocation.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                purrLocation = null;
                break;
            }
            purrLocation = values[i];
            if (zq3.c(purrLocation.name(), str)) {
                break;
            }
            i++;
        }
        return purrLocation == null ? PurrLocation.NO_OVERRIDE : purrLocation;
    }
}
