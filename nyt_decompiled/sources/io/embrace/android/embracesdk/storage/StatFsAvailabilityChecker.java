package io.embrace.android.embracesdk.storage;

import android.content.Context;
import android.os.StatFs;
import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import java.io.File;
import kotlin.c;

/* loaded from: classes5.dex */
public final class StatFsAvailabilityChecker implements StorageAvailabilityChecker {
    private final c04 statFs$delegate;

    public StatFsAvailabilityChecker(final Context context) {
        zq3.h(context, "context");
        this.statFs$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.storage.StatFsAvailabilityChecker$statFs$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final StatFs mo865invoke() {
                File filesDir = context.getFilesDir();
                zq3.g(filesDir, "context.filesDir");
                return new StatFs(filesDir.getPath());
            }
        });
    }

    private final StatFs getStatFs() {
        return (StatFs) this.statFs$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.storage.StorageAvailabilityChecker
    public long getAvailableBytes() {
        return getStatFs().getAvailableBytes();
    }
}
