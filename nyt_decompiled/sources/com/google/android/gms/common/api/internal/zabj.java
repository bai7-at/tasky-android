package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import defpackage.fp9;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zabj {
    private static final ExecutorService zaa = fp9.a().a(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService zaa() {
        return zaa;
    }
}
