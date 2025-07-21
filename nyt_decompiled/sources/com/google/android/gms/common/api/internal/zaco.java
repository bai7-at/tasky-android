package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import defpackage.fp9;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zaco {
    private static final ExecutorService zaa = fp9.a().c(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService zaa() {
        return zaa;
    }
}
