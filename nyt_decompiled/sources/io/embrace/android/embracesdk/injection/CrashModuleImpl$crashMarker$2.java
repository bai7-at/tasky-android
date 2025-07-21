package io.embrace.android.embracesdk.injection;

import defpackage.qs2;
import io.embrace.android.embracesdk.internal.crash.CrashFileMarkerImpl;
import java.io.File;
import kotlin.c;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class CrashModuleImpl$crashMarker$2 extends Lambda implements qs2 {
    final /* synthetic */ InitModule $initModule;
    final /* synthetic */ StorageModule $storageModule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrashModuleImpl$crashMarker$2(StorageModule storageModule, InitModule initModule) {
        super(0);
        this.$storageModule = storageModule;
        this.$initModule = initModule;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final CrashFileMarkerImpl mo865invoke() {
        return new CrashFileMarkerImpl(c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$crashMarker$2$markerFile$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                return CrashModuleImpl$crashMarker$2.this.$storageModule.getStorageService().getFileForWrite(CrashFileMarkerImpl.CRASH_MARKER_FILE_NAME);
            }
        }), this.$initModule.getLogger());
    }
}
