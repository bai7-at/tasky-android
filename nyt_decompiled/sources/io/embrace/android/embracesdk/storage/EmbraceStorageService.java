package io.embrace.android.embracesdk.storage;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import defpackage.c04;
import defpackage.du8;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.telemetry.TelemetryService;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.c;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes5.dex */
public final class EmbraceStorageService implements StorageService {
    private final c04 cacheDirectory$delegate;
    private final Context context;
    private final c04 filesDirectory$delegate;
    private final StorageAvailabilityChecker storageAvailabilityChecker;
    private final TelemetryService telemetryService;

    public EmbraceStorageService(Context context, TelemetryService telemetryService, StorageAvailabilityChecker storageAvailabilityChecker) {
        zq3.h(context, "context");
        zq3.h(telemetryService, "telemetryService");
        zq3.h(storageAvailabilityChecker, "storageAvailabilityChecker");
        this.context = context;
        this.telemetryService = telemetryService;
        this.storageAvailabilityChecker = storageAvailabilityChecker;
        this.cacheDirectory$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.storage.EmbraceStorageService$cacheDirectory$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                Context context2;
                context2 = EmbraceStorageService.this.context;
                return context2.getCacheDir();
            }
        });
        this.filesDirectory$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.storage.EmbraceStorageService$filesDirectory$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                File orCreateEmbraceFilesDir;
                File cacheDirectory;
                orCreateEmbraceFilesDir = EmbraceStorageService.this.getOrCreateEmbraceFilesDir();
                if (orCreateEmbraceFilesDir != null) {
                    return orCreateEmbraceFilesDir;
                }
                cacheDirectory = EmbraceStorageService.this.getCacheDirectory();
                return cacheDirectory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return (File) this.cacheDirectory$delegate.getValue();
    }

    private final File getFilesDirectory() {
        return (File) this.filesDirectory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getOrCreateEmbraceFilesDir() {
        File file = new File(this.context.getFilesDir(), "embrace");
        try {
            file.mkdirs();
            if (!file.exists()) {
                file = null;
            }
            return file;
        } catch (SecurityException unused) {
            return null;
        }
    }

    @Override // io.embrace.android.embracesdk.storage.StorageService
    public File getConfigCacheDir() {
        return new File(getCacheDirectory(), "emb_config_cache");
    }

    @Override // io.embrace.android.embracesdk.storage.StorageService
    public File getFileForRead(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        File file = new File(getFilesDirectory(), str);
        if (!file.exists()) {
            File file2 = new File(getCacheDirectory(), str);
            if (file2.exists()) {
                return file2;
            }
        }
        return file;
    }

    @Override // io.embrace.android.embracesdk.storage.StorageService
    public File getFileForWrite(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return new File(getFilesDirectory(), str);
    }

    @Override // io.embrace.android.embracesdk.storage.StorageService
    public File getNativeCrashDir() {
        return new File(getFilesDirectory(), EmbraceStorageServiceKt.NATIVE_CRASH_FILE_FOLDER);
    }

    @Override // io.embrace.android.embracesdk.storage.StorageService
    public List<File> listFiles(FilenameFilter filenameFilter) {
        zq3.h(filenameFilter, "filter");
        File[] listFiles = getFilesDirectory().listFiles(filenameFilter);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        File[] listFiles2 = getCacheDirectory().listFiles(filenameFilter);
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        return i.F0(d.C0(listFiles), d.C0(listFiles2));
    }

    @Override // io.embrace.android.embracesdk.storage.StorageService
    public void logStorageTelemetry() {
        long availableBytes = this.storageAvailabilityChecker.getAvailableBytes();
        List<File> listFiles = listFiles(new FilenameFilter() { // from class: io.embrace.android.embracesdk.storage.EmbraceStorageService$logStorageTelemetry$storageUsed$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return true;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFiles) {
            if (((File) obj).isFile()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((File) it2.next()).length();
        }
        this.telemetryService.logStorageTelemetry(t.m(du8.a("emb.storage.used", String.valueOf(j)), du8.a("emb.storage.available", String.valueOf(availableBytes))));
    }
}
