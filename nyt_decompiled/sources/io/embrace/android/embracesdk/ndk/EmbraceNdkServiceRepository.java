package io.embrace.android.embracesdk.ndk;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.NativeCrashData;
import io.embrace.android.embracesdk.storage.EmbraceStorageServiceKt;
import io.embrace.android.embracesdk.storage.StorageService;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceNdkServiceRepository {
    private final InternalEmbraceLogger logger;
    private final StorageService storageService;

    public EmbraceNdkServiceRepository(StorageService storageService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(storageService, "storageService");
        zq3.h(internalEmbraceLogger, "logger");
        this.storageService = storageService;
        this.logger = internalEmbraceLogger;
    }

    private final File companionFileForCrash(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        zq3.g(absolutePath, "crashFilename");
        int g0 = h.g0(absolutePath, '.', 0, false, 6, null);
        if (absolutePath == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = absolutePath.substring(0, g0);
        zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(str);
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private final File[] getNativeCrashFiles() {
        return getNativeFiles(new FilenameFilter() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkServiceRepository$getNativeCrashFiles$nativeCrashFilter$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
                return h.K(str, "emb_ndk", false, 2, null) && h.v(str, ".crash", false, 2, null);
            }
        });
    }

    private final File[] getNativeFiles(FilenameFilter filenameFilter) {
        List l;
        List<File> listFiles = this.storageService.listFiles(new FilenameFilter() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkServiceRepository$getNativeFiles$ndkDirs$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                zq3.g(file, TransferTable.COLUMN_FILE);
                return file.isDirectory() && zq3.c(str, EmbraceStorageServiceKt.NATIVE_CRASH_FILE_FOLDER);
            }
        });
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listFiles.iterator();
        while (it2.hasNext()) {
            File[] listFiles2 = ((File) it2.next()).listFiles(filenameFilter);
            if (listFiles2 == null || (l = d.C0(listFiles2)) == null) {
                l = i.l();
            }
            i.B(arrayList, l);
        }
        Object[] array = arrayList.toArray(new File[0]);
        if (array != null) {
            return (File[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void deleteFiles(File file, File file2, File file3, NativeCrashData nativeCrashData) {
        String str;
        zq3.h(file, "crashFile");
        if (file.delete()) {
            this.logger.log("Deleted processed crash file at " + file.getAbsolutePath(), InternalEmbraceLogger.Severity.DEBUG, null, true);
        } else {
            if (nativeCrashData != null) {
                str = "Failed to delete native crash file {sessionId=" + nativeCrashData.getSessionId() + ", crashId=" + nativeCrashData.getNativeCrashId() + ", crashFilePath=" + file.getAbsolutePath() + "}";
            } else {
                str = "Failed to delete native crash file {crashFilePath=" + file.getAbsolutePath() + "}";
            }
            this.logger.log(str, InternalEmbraceLogger.Severity.WARNING, null, false);
        }
        if (file2 != null) {
            file2.delete();
        }
        if (file3 != null) {
            file3.delete();
        }
    }

    public final File errorFileForCrash(File file) {
        zq3.h(file, "crashFile");
        return companionFileForCrash(file, ".error");
    }

    public final File mapFileForCrash(File file) {
        zq3.h(file, "crashFile");
        return companionFileForCrash(file, ".map");
    }

    public final List<File> sortNativeCrashes(boolean z) {
        File[] nativeCrashFiles = getNativeCrashFiles();
        ArrayList<File> arrayList = new ArrayList();
        i.C(arrayList, nativeCrashFiles);
        final HashMap hashMap = new HashMap();
        try {
            for (File file : arrayList) {
                hashMap.put(file, Long.valueOf(file.lastModified()));
            }
            return i.N0(arrayList, z ? new Comparator() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkServiceRepository$sortNativeCrashes$comparator$1
                @Override // java.util.Comparator
                public final int compare(File file2, File file3) {
                    Integer num;
                    zq3.h(file2, "first");
                    zq3.h(file3, "next");
                    Long l = (Long) hashMap.get(file2);
                    if (l != null) {
                        long longValue = l.longValue();
                        Object obj = hashMap.get(file3);
                        if (obj == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        num = Integer.valueOf((longValue > ((Number) obj).longValue() ? 1 : (longValue == ((Number) obj).longValue() ? 0 : -1)));
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        return num.intValue();
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            } : new Comparator() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkServiceRepository$sortNativeCrashes$comparator$2
                @Override // java.util.Comparator
                public final int compare(File file2, File file3) {
                    Integer num;
                    zq3.h(file2, "first");
                    zq3.h(file3, "next");
                    Long l = (Long) hashMap.get(file3);
                    if (l != null) {
                        long longValue = l.longValue();
                        Object obj = hashMap.get(file2);
                        if (obj == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        num = Integer.valueOf((longValue > ((Number) obj).longValue() ? 1 : (longValue == ((Number) obj).longValue() ? 0 : -1)));
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        return num.intValue();
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            });
        } catch (Exception e) {
            this.logger.log("Failed sorting native crashes.", InternalEmbraceLogger.Severity.ERROR, e, false);
            return arrayList;
        }
    }
}
