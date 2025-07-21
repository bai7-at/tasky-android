package com.datadog.android.core.internal.data.upload;

import com.datadog.android.core.internal.data.upload.UploadStatus;
import defpackage.na1;
import defpackage.ua1;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements na1 {
    @Override // defpackage.na1
    public UploadStatus a(ua1 ua1Var, List list, byte[] bArr, com.datadog.android.core.internal.persistence.a aVar) {
        zq3.h(ua1Var, "context");
        zq3.h(list, "batch");
        return UploadStatus.l.e;
    }
}
