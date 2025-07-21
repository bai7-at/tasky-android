package io.embrace.android.embracesdk.comms.delivery;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.j;
import defpackage.gm0;
import defpackage.ss2;
import defpackage.tf0;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.compression.ConditionalGzipOutputStream;
import io.embrace.android.embracesdk.internal.serialization.PlatformSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.storage.StorageService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceCacheService implements CacheService {
    public static final Companion Companion = new Companion(null);
    public static final String EMBRACE_PREFIX = "emb_";
    public static final String NEW_COPY_SUFFIX = "-new";
    public static final String OLD_COPY_SUFFIX = "-old";
    private static final String OLD_VERSION_FILE_NAME = "last_session.json";
    public static final String SESSION_FILE_PREFIX = "last_session";
    public static final String TEMP_COPY_SUFFIX = "-tmp";
    private final ConcurrentHashMap<String, ReentrantReadWriteLock> fileLocks;
    private final InternalEmbraceLogger logger;
    private final PlatformSerializer serializer;
    private final StorageService storageService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceCacheService(StorageService storageService, PlatformSerializer platformSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(storageService, "storageService");
        zq3.h(platformSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        this.storageService = storageService;
        this.serializer = platformSerializer;
        this.logger = internalEmbraceLogger;
        this.fileLocks = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReentrantReadWriteLock findLock(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        ReentrantReadWriteLock putIfAbsent;
        ReentrantReadWriteLock reentrantReadWriteLock2 = this.fileLocks.get(str);
        if (reentrantReadWriteLock2 != null) {
            return reentrantReadWriteLock2;
        }
        synchronized (this.fileLocks) {
            try {
                ConcurrentHashMap<String, ReentrantReadWriteLock> concurrentHashMap = this.fileLocks;
                ReentrantReadWriteLock reentrantReadWriteLock3 = concurrentHashMap.get(str);
                if (reentrantReadWriteLock3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (reentrantReadWriteLock3 = new ReentrantReadWriteLock()))) != null) {
                    reentrantReadWriteLock3 = putIfAbsent;
                }
                reentrantReadWriteLock = reentrantReadWriteLock3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return reentrantReadWriteLock;
    }

    private final boolean replaceFile(String str, String str2) {
        try {
            File fileForWrite = this.storageService.getFileForWrite(EMBRACE_PREFIX + str);
            File fileForWrite2 = this.storageService.getFileForWrite(fileForWrite.getName() + OLD_COPY_SUFFIX);
            if (fileForWrite.exists()) {
                fileForWrite.renameTo(fileForWrite2);
                fileForWrite2.delete();
            }
            this.storageService.getFileForWrite(EMBRACE_PREFIX + str2).renameTo(fileForWrite);
            return true;
        } catch (Exception e) {
            this.logger.log("Failed to replace session file ", InternalEmbraceLogger.Severity.ERROR, e, false);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[LOOP:1: B:19:0x00ca->B:20:0x00cc, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void safeFileWrite(java.lang.String r13, defpackage.ss2 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "-new"
            java.lang.String r1 = "-tmp"
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r12.findLock(r13)
            java.lang.String r3 = "findLock(name)"
            defpackage.zq3.g(r2, r3)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            int r4 = r2.getWriteHoldCount()
            r5 = 0
            if (r4 != 0) goto L1d
            int r4 = r2.getReadHoldCount()
            goto L1e
        L1d:
            r4 = r5
        L1e:
            r6 = r5
        L1f:
            if (r6 >= r4) goto L27
            r3.unlock()
            int r6 = r6 + 1
            goto L1f
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.lock()
            r6 = 0
            io.embrace.android.embracesdk.storage.StorageService r7 = r12.storageService     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            r8.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            java.lang.String r9 = "emb_"
            r8.append(r9)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            r8.append(r13)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            java.io.File r7 = r7.getFileForWrite(r8)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            boolean r8 = r7.exists()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L9d
            io.embrace.android.embracesdk.storage.StorageService r9 = r12.storageService     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r10.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r11 = r7.getName()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r10.append(r11)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r10.append(r1)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.io.File r6 = r9.getFileForWrite(r10)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r14.invoke(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            if (r8 == 0) goto L89
            io.embrace.android.embracesdk.storage.StorageService r14 = r12.storageService     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.append(r7)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.append(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.io.File r14 = r14.getFileForWrite(r1)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r6.renameTo(r14)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            goto L8a
        L85:
            r12 = move-exception
            goto Ld6
        L87:
            r13 = move-exception
            goto L9f
        L89:
            r0 = r1
        L8a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r14.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r14.append(r13)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r14.append(r0)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r12.replaceFile(r13, r14)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            goto Lca
        L9d:
            r13 = move-exception
            r8 = r5
        L9f:
            if (r6 == 0) goto La4
            r6.delete()     // Catch: java.lang.Throwable -> L85
        La4:
            if (r8 == 0) goto La9
            java.lang.String r14 = "overwrite"
            goto Lab
        La9:
            java.lang.String r14 = "write new"
        Lab:
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger r12 = r12.logger     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "Failed to "
            r0.append(r1)     // Catch: java.lang.Throwable -> L85
            r0.append(r14)     // Catch: java.lang.Throwable -> L85
            java.lang.String r14 = " session object "
            r0.append(r14)     // Catch: java.lang.Throwable -> L85
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> L85
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger$Severity r0 = io.embrace.android.embracesdk.logging.InternalEmbraceLogger.Severity.ERROR     // Catch: java.lang.Throwable -> L85
            r12.log(r14, r0, r13, r5)     // Catch: java.lang.Throwable -> L85
            ww8 r12 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L85
        Lca:
            if (r5 >= r4) goto Ld2
            r3.lock()
            int r5 = r5 + 1
            goto Lca
        Ld2:
            r2.unlock()
            return
        Ld6:
            if (r5 >= r4) goto Lde
            r3.lock()
            int r5 = r5 + 1
            goto Ld6
        Lde:
            r2.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.comms.delivery.EmbraceCacheService.safeFileWrite(java.lang.String, ss2):void");
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public <T> void cacheObject(String str, final T t, final Class<T> cls) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(cls, "clazz");
        safeFileWrite(str, new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceCacheService$cacheObject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((File) obj);
                return ww8.a;
            }

            public final void invoke(File file) {
                PlatformSerializer platformSerializer;
                zq3.h(file, "tempFile");
                platformSerializer = EmbraceCacheService.this.serializer;
                platformSerializer.toJson((PlatformSerializer) t, (Class<PlatformSerializer>) cls, (OutputStream) new FileOutputStream(file));
            }
        });
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public void cachePayload(String str, final ss2 ss2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(ss2Var, "action");
        safeFileWrite(str, new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceCacheService$cachePayload$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((File) obj);
                return ww8.a;
            }

            public final void invoke(File file) {
                zq3.h(file, "tempFile");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
                try {
                    ss2.this.invoke(bufferedOutputStream);
                    gm0.a(bufferedOutputStream, null);
                } finally {
                }
            }
        });
    }

    /* JADX WARN: Finally extract failed */
    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public boolean deleteFile(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        ReentrantReadWriteLock findLock = findLock(str);
        zq3.g(findLock, "findLock(name)");
        ReentrantReadWriteLock.ReadLock readLock = findLock.readLock();
        int readHoldCount = findLock.getWriteHoldCount() == 0 ? findLock.getReadHoldCount() : 0;
        for (int i = 0; i < readHoldCount; i++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = findLock.writeLock();
        writeLock.lock();
        try {
            File fileForRead = this.storageService.getFileForRead(EMBRACE_PREFIX + str);
            try {
                fileForRead.delete();
            } catch (Exception unused) {
                this.logger.log("Failed to delete cache object " + fileForRead.getPath(), InternalEmbraceLogger.Severity.DEBUG, null, true);
            }
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.lock();
            }
            writeLock.unlock();
            this.fileLocks.remove(str);
            return false;
        } catch (Throwable th) {
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public <T> T loadObject(String str, Class<T> cls) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(cls, "clazz");
        ReentrantReadWriteLock findLock = findLock(str);
        zq3.g(findLock, "findLock(name)");
        ReentrantReadWriteLock.ReadLock readLock = findLock.readLock();
        readLock.lock();
        try {
            File fileForRead = this.storageService.getFileForRead(EMBRACE_PREFIX + str);
            try {
                try {
                    return (T) this.serializer.fromJson((InputStream) new FileInputStream(fileForRead), (Class) cls);
                } catch (FileNotFoundException unused) {
                    this.logger.log("Cache file cannot be found " + fileForRead.getPath(), InternalEmbraceLogger.Severity.DEBUG, null, true);
                    return null;
                }
            } catch (Exception e) {
                this.logger.log("Failed to read cache object " + fileForRead.getPath(), InternalEmbraceLogger.Severity.DEBUG, e, true);
                return null;
            }
        } finally {
            readLock.unlock();
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public List<PendingApiCall> loadOldPendingApiCalls(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        ReentrantReadWriteLock findLock = findLock(str);
        zq3.g(findLock, "findLock(name)");
        ReentrantReadWriteLock.ReadLock readLock = findLock.readLock();
        readLock.lock();
        try {
            File fileForRead = this.storageService.getFileForRead(EMBRACE_PREFIX + str);
            try {
                try {
                    ParameterizedType j = j.j(List.class, PendingApiCall.class);
                    PlatformSerializer platformSerializer = this.serializer;
                    FileInputStream fileInputStream = new FileInputStream(fileForRead);
                    zq3.g(j, TransferTable.COLUMN_TYPE);
                    List<PendingApiCall> list = (List) platformSerializer.fromJson(fileInputStream, j);
                    if (list == null) {
                        list = i.l();
                    }
                    return list;
                } catch (FileNotFoundException unused) {
                    this.logger.log("Cache file cannot be found " + fileForRead.getPath(), InternalEmbraceLogger.Severity.DEBUG, null, true);
                    return null;
                }
            } catch (Exception e) {
                this.logger.log("Failed to read cache object " + fileForRead.getPath(), InternalEmbraceLogger.Severity.DEBUG, e, true);
                return null;
            }
        } finally {
            readLock.unlock();
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public ss2 loadPayload(final String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceCacheService$loadPayload$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OutputStream) obj);
                return ww8.a;
            }

            public final void invoke(OutputStream outputStream) {
                ReentrantReadWriteLock findLock;
                StorageService storageService;
                InternalEmbraceLogger internalEmbraceLogger;
                InternalEmbraceLogger internalEmbraceLogger2;
                zq3.h(outputStream, "stream");
                findLock = EmbraceCacheService.this.findLock(str);
                zq3.g(findLock, "findLock(name)");
                ReentrantReadWriteLock.ReadLock readLock = findLock.readLock();
                readLock.lock();
                try {
                    storageService = EmbraceCacheService.this.storageService;
                    File fileForRead = storageService.getFileForRead(EmbraceCacheService.EMBRACE_PREFIX + str);
                    try {
                        try {
                            ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileForRead), 8192);
                                try {
                                    tf0.b(bufferedInputStream, conditionalGzipOutputStream, 0, 2, null);
                                    gm0.a(bufferedInputStream, null);
                                    gm0.a(conditionalGzipOutputStream, null);
                                } finally {
                                }
                            } finally {
                            }
                        } catch (FileNotFoundException unused) {
                            internalEmbraceLogger2 = EmbraceCacheService.this.logger;
                            internalEmbraceLogger2.log("Cache file cannot be found " + fileForRead.getPath(), InternalEmbraceLogger.Severity.WARNING, null, false);
                        }
                    } catch (Exception e) {
                        internalEmbraceLogger = EmbraceCacheService.this.logger;
                        internalEmbraceLogger.log("Failed to read cache object " + fileForRead.getPath(), InternalEmbraceLogger.Severity.WARNING, e, false);
                    }
                    ww8 ww8Var = ww8.a;
                } finally {
                    readLock.unlock();
                }
            }
        };
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public List<String> normalizeCacheAndGetSessionFileIds() {
        List<File> listFiles = this.storageService.listFiles(new FilenameFilter() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceCacheService$normalizeCacheAndGetSessionFileIds$sessionFileNames$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                zq3.g(str, AuthenticationTokenClaims.JSON_KEY_NAME);
                return h.K(str, "emb_last_session", false, 2, null);
            }
        });
        ArrayList<String> arrayList = new ArrayList(i.w(listFiles, 10));
        Iterator<T> it2 = listFiles.iterator();
        while (it2.hasNext()) {
            String name = ((File) it2.next()).getName();
            zq3.g(name, "file.name");
            if (name == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = name.substring(4);
            zq3.g(substring, "(this as java.lang.String).substring(startIndex)");
            arrayList.add(substring);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : arrayList) {
            if (h.v(str, OLD_COPY_SUFFIX, false, 2, null) || h.v(str, TEMP_COPY_SUFFIX, false, 2, null)) {
                if (!deleteFile(str)) {
                    this.logger.log("Temporary session file for " + str + " not deleted on startup", InternalEmbraceLogger.Severity.WARNING, null, false);
                }
            } else if (zq3.c(str, OLD_VERSION_FILE_NAME)) {
                SessionMessage sessionMessage = (SessionMessage) loadObject(str, SessionMessage.class);
                if (sessionMessage != null) {
                    try {
                        Result.a aVar = Result.a;
                        Session session = sessionMessage.getSession();
                        String filename = CachedSession.Companion.create(session.getSessionId(), session.getStartTime(), false).getFilename();
                        if (!arrayList.contains(filename)) {
                            replaceFile(filename, str);
                            linkedHashSet.add(filename);
                        }
                        Result.b(ww8.a);
                    } catch (Throwable th) {
                        Result.a aVar2 = Result.a;
                        Result.b(f.a(th));
                    }
                }
            } else {
                boolean v = h.v(str, NEW_COPY_SUFFIX, false, 2, null);
                String w0 = v ? h.w0(str, NEW_COPY_SUFFIX) : str;
                if (!v || replaceFile(w0, str)) {
                    linkedHashSet.add(w0);
                }
            }
        }
        return i.X0(linkedHashSet);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public void transformSession(String str, ss2 ss2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(ss2Var, "transformer");
        ReentrantReadWriteLock findLock = findLock(str);
        zq3.g(findLock, "findLock(name)");
        ReentrantReadWriteLock.ReadLock readLock = findLock.readLock();
        int i = 0;
        int readHoldCount = findLock.getWriteHoldCount() == 0 ? findLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = findLock.writeLock();
        writeLock.lock();
        try {
            try {
                SessionMessage sessionMessage = (SessionMessage) loadObject(str, SessionMessage.class);
                if (sessionMessage != null) {
                    writeSession(str, (SessionMessage) ss2Var.invoke(sessionMessage));
                }
            } catch (Exception e) {
                this.logger.log("Failed to transform session object ", InternalEmbraceLogger.Severity.ERROR, e, false);
            }
            ww8 ww8Var = ww8.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.CacheService
    public void writeSession(String str, SessionMessage sessionMessage) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(sessionMessage, "sessionMessage");
        cacheObject(str, sessionMessage, SessionMessage.class);
    }
}
