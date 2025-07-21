package io.embrace.android.embracesdk.ndk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.AuthenticationTokenClaims;
import defpackage.c04;
import defpackage.gm0;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import io.embrace.android.embracesdk.internal.DeviceArchitecture;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.crash.CrashFileMarkerImpl;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.ndk.NdkServiceDelegate;
import io.embrace.android.embracesdk.payload.Event;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.NativeCrashData;
import io.embrace.android.embracesdk.payload.NativeCrashDataError;
import io.embrace.android.embracesdk.payload.NativeCrashMetadata;
import io.embrace.android.embracesdk.payload.NativeSymbols;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.storage.EmbraceStorageServiceKt;
import io.embrace.android.embracesdk.storage.StorageService;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.c;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceNdkService implements NdkService, ProcessStateListener {
    private static final String APPLICATION_STATE_BACKGROUND = "background";
    private static final String APPLICATION_STATE_FOREGROUND = "foreground";
    private static final String CRASH_REPORT_EVENT_NAME = "_crash_report";
    public static final Companion Companion = new Companion(null);
    private static final int EMB_DEVICE_META_DATA_SIZE = 2048;
    private static final int HANDLER_CHECK_DELAY_MS = 5000;
    private static final String KEY_NDK_SYMBOLS = "emb_ndk_symbols";
    private static final int MAX_NATIVE_CRASH_FILES_ALLOWED = 4;
    private static final String NATIVE_CRASH_ERROR_FILE_SUFFIX = ".error";
    private static final String NATIVE_CRASH_FILE_PREFIX = "emb_ndk";
    private static final String NATIVE_CRASH_FILE_SUFFIX = ".crash";
    private static final String NATIVE_CRASH_MAP_FILE_SUFFIX = ".map";
    private final BackgroundWorker backgroundWorker;
    private final ConfigService configService;
    private final Context context;
    private final NdkServiceDelegate.NdkDelegate delegate;
    private final DeliveryService deliveryService;
    private final DeviceArchitecture deviceArchitecture;
    private boolean isInstalled;
    private final Object lock;
    private final InternalEmbraceLogger logger;
    private final MetadataService metadataService;
    private final PreferencesService preferencesService;
    private final EmbraceNdkServiceRepository repository;
    private final EmbraceSerializer serializer;
    private final EmbraceSessionProperties sessionProperties;
    private final SharedObjectLoader sharedObjectLoader;
    private final StorageService storageService;
    private final c04 symbolsForArch;
    private String unityCrashId;
    private final UserService userService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceNdkService(Context context, StorageService storageService, MetadataService metadataService, final ProcessStateService processStateService, ConfigService configService, DeliveryService deliveryService, UserService userService, PreferencesService preferencesService, EmbraceSessionProperties embraceSessionProperties, final Embrace.AppFramework appFramework, SharedObjectLoader sharedObjectLoader, InternalEmbraceLogger internalEmbraceLogger, EmbraceNdkServiceRepository embraceNdkServiceRepository, NdkServiceDelegate.NdkDelegate ndkDelegate, BackgroundWorker backgroundWorker, BackgroundWorker backgroundWorker2, DeviceArchitecture deviceArchitecture, EmbraceSerializer embraceSerializer) {
        zq3.h(context, "context");
        zq3.h(storageService, "storageService");
        zq3.h(metadataService, "metadataService");
        zq3.h(processStateService, "processStateService");
        zq3.h(configService, "configService");
        zq3.h(deliveryService, "deliveryService");
        zq3.h(userService, "userService");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(appFramework, "appFramework");
        zq3.h(sharedObjectLoader, "sharedObjectLoader");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(embraceNdkServiceRepository, "repository");
        zq3.h(ndkDelegate, "delegate");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(backgroundWorker2, "highPriorityWorker");
        zq3.h(deviceArchitecture, "deviceArchitecture");
        zq3.h(embraceSerializer, "serializer");
        this.context = context;
        this.storageService = storageService;
        this.metadataService = metadataService;
        this.configService = configService;
        this.deliveryService = deliveryService;
        this.userService = userService;
        this.preferencesService = preferencesService;
        this.sessionProperties = embraceSessionProperties;
        this.sharedObjectLoader = sharedObjectLoader;
        this.logger = internalEmbraceLogger;
        this.repository = embraceNdkServiceRepository;
        this.delegate = ndkDelegate;
        this.backgroundWorker = backgroundWorker;
        this.deviceArchitecture = deviceArchitecture;
        this.serializer = embraceSerializer;
        this.lock = new Object();
        this.symbolsForArch = c.a(new qs2() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService.1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map<String, String> mo865invoke() {
                NativeSymbols nativeSymbols = EmbraceNdkService.this.getNativeSymbols();
                if (nativeSymbols != null) {
                    return nativeSymbols.getSymbolByArchitecture(EmbraceNdkService.this.deviceArchitecture.getArchitecture());
                }
                return null;
            }
        });
        if (configService.getAutoDataCaptureBehavior().isNdkEnabled()) {
            sharedObjectLoader.loadEmbraceNative();
            if (configService.getSdkModeBehavior().isServiceInitDeferred()) {
                BackgroundWorker.submit$default(backgroundWorker2, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbraceNdkService.this.initializeService(processStateService, appFramework);
                    }
                }, 1, (Object) null);
            } else {
                initializeService(processStateService, appFramework);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSignalHandlersOverwritten() {
        String _checkForOverwrittenHandlers;
        if (!this.configService.getAutoDataCaptureBehavior().isSigHandlerDetectionEnabled() || (_checkForOverwrittenHandlers = this.delegate._checkForOverwrittenHandlers()) == null || shouldIgnoreOverriddenHandler(_checkForOverwrittenHandlers)) {
            return;
        }
        String f = h.f("\n                    Embrace detected that another signal handler has replaced our signal handler.\n                    This may lead to unexpected behaviour and lost NDK crashes.\n                    We will attempt to reinstall our signal handler but please consider disabling\n                    other signal handlers if you observed unexpected behaviour.\n                    If you believe this is a false positive, please contact support@embrace.io.\n                    Handler origin: " + _checkForOverwrittenHandlers + "\n                ");
        RuntimeException runtimeException = new RuntimeException(f);
        runtimeException.setStackTrace(new StackTraceElement[0]);
        this.logger.log(f, InternalEmbraceLogger.Severity.WARNING, runtimeException, false);
        this.delegate._reinstallSignalHandlers();
    }

    private final void cleanOldCrashFiles() {
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService$cleanOldCrashFiles$1
            @Override // java.lang.Runnable
            public final void run() {
                EmbraceNdkServiceRepository embraceNdkServiceRepository;
                File[] nativeErrorFiles;
                File[] nativeMapFiles;
                boolean hasNativeCrashFile;
                boolean hasNativeCrashFile2;
                InternalEmbraceLogger internalEmbraceLogger;
                InternalEmbraceLogger internalEmbraceLogger2;
                embraceNdkServiceRepository = EmbraceNdkService.this.repository;
                List<File> sortNativeCrashes = embraceNdkServiceRepository.sortNativeCrashes(true);
                int size = sortNativeCrashes.size() - 4;
                if (size > 0) {
                    LinkedList linkedList = new LinkedList(sortNativeCrashes);
                    for (int i = 0; i < size; i++) {
                        try {
                            File file = (File) linkedList.get(i);
                            if (((File) linkedList.get(i)).delete()) {
                                internalEmbraceLogger2 = EmbraceNdkService.this.logger;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Native crash file ");
                                zq3.g(file, "removed");
                                sb.append(file.getName());
                                sb.append(" removed from cache");
                                internalEmbraceLogger2.log(sb.toString(), InternalEmbraceLogger.Severity.DEBUG, null, true);
                            }
                        } catch (Exception e) {
                            internalEmbraceLogger = EmbraceNdkService.this.logger;
                            internalEmbraceLogger.log("Failed to delete native crash from cache.", InternalEmbraceLogger.Severity.ERROR, e, false);
                        }
                    }
                }
                nativeErrorFiles = EmbraceNdkService.this.getNativeErrorFiles();
                for (File file2 : nativeErrorFiles) {
                    hasNativeCrashFile2 = EmbraceNdkService.this.hasNativeCrashFile(file2);
                    if (!hasNativeCrashFile2) {
                        file2.delete();
                    }
                }
                nativeMapFiles = EmbraceNdkService.this.getNativeMapFiles();
                for (File file3 : nativeMapFiles) {
                    hasNativeCrashFile = EmbraceNdkService.this.hasNativeCrashFile(file3);
                    if (!hasNativeCrashFile) {
                        file3.delete();
                    }
                }
            }
        }, 1, (Object) null);
    }

    private final void createCrashReportDirectory() {
        File nativeCrashDir = this.storageService.getNativeCrashDir();
        if (nativeCrashDir.exists() || nativeCrashDir.mkdirs()) {
            return;
        }
        this.logger.log("Failed to create crash report directory {crashDirPath=" + nativeCrashDir.getAbsolutePath() + "}", InternalEmbraceLogger.Severity.ERROR, null, false);
    }

    private final String getMapFileContent(File file) {
        String readMapFile;
        if (file == null || (readMapFile = readMapFile(file)) == null) {
            return null;
        }
        return readMapFile;
    }

    private final String getMetaData(boolean z) {
        return this.serializer.toJson(new NativeCrashMetadata(this.metadataService.getAppInfo(), this.metadataService.getDeviceInfo(), this.userService.getUserInfo(), z ? t.v(this.sessionProperties.get()) : null));
    }

    private final List<NativeCrashDataError> getNativeCrashErrors(NativeCrashData nativeCrashData, File file) {
        String absolutePath;
        String _getErrors;
        if (file != null && (_getErrors = this.delegate._getErrors((absolutePath = file.getAbsolutePath()))) != null) {
            try {
                Object fromJson = this.serializer.getImpl().c(ArrayList.class).fromJson(_getErrors);
                if (fromJson != null) {
                    return (List) fromJson;
                }
                throw new IllegalStateException("JSON conversion failed.");
            } catch (Exception unused) {
                this.logger.log("Failed to parse native crash error file {crashId=" + nativeCrashData.getNativeCrashId() + ", errorFilePath=" + absolutePath + "}", InternalEmbraceLogger.Severity.ERROR, null, false);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File[] getNativeErrorFiles() {
        return getNativeFiles(new FilenameFilter() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService$getNativeErrorFiles$nativeCrashFilter$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
                return h.K(str, "emb_ndk", false, 2, null) && h.v(str, ".error", false, 2, null);
            }
        });
    }

    private final File[] getNativeFiles(FilenameFilter filenameFilter) {
        List l;
        List<File> listFiles = this.storageService.listFiles(new FilenameFilter() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService$getNativeFiles$ndkDirs$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public final File[] getNativeMapFiles() {
        return getNativeFiles(new FilenameFilter() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService$getNativeMapFiles$nativeCrashFilter$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
                return h.K(str, "emb_ndk", false, 2, null) && h.v(str, ".map", false, 2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DiscouragedApi"})
    public final NativeSymbols getNativeSymbols() {
        int identifier = this.context.getResources().getIdentifier(KEY_NDK_SYMBOLS, "string", this.context.getPackageName());
        if (identifier != 0) {
            try {
                byte[] decode = Base64.decode(this.context.getResources().getString(identifier), 0);
                zq3.g(decode, "Base64.decode(context.re…ourceId), Base64.DEFAULT)");
                return (NativeSymbols) this.serializer.fromJson(h.r(decode), NativeSymbols.class);
            } catch (Exception e) {
                InternalEmbraceLogger internalEmbraceLogger = this.logger;
                z38 z38Var = z38.a;
                String format = String.format(Locale.getDefault(), "Failed to decode symbols from resources {resourceId=%d}.", Arrays.copyOf(new Object[]{Integer.valueOf(identifier)}, 1));
                zq3.g(format, "java.lang.String.format(locale, format, *args)");
                internalEmbraceLogger.log(format, InternalEmbraceLogger.Severity.ERROR, e, false);
            }
        } else {
            InternalEmbraceLogger internalEmbraceLogger2 = this.logger;
            z38 z38Var2 = z38.a;
            String format2 = String.format(Locale.getDefault(), "Failed to find symbols in resources {resourceId=%d}.", Arrays.copyOf(new Object[]{Integer.valueOf(identifier)}, 1));
            zq3.g(format2, "java.lang.String.format(locale, format, *args)");
            internalEmbraceLogger2.log(format2, InternalEmbraceLogger.Severity.ERROR, null, false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasNativeCrashFile(File file) {
        String absolutePath = file.getAbsolutePath();
        zq3.g(absolutePath, "filename");
        if (!h.P(absolutePath, InstructionFileId.DOT, false, 2, null)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        String substring = absolutePath.substring(0, h.g0(absolutePath, '.', 0, false, 6, null));
        zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(NATIVE_CRASH_FILE_SUFFIX);
        return new File(sb.toString()).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeService(ProcessStateService processStateService, Embrace.AppFramework appFramework) {
        try {
            Systrace.startSynchronous("init-ndk-service");
            processStateService.addListener(this);
            if (appFramework == Embrace.AppFramework.UNITY) {
                this.unityCrashId = Uuid.getEmbUuid$default(null, 1, null);
            }
            startNativeCrashMonitoring();
            cleanOldCrashFiles();
            ww8 ww8Var = ww8.a;
        } finally {
        }
    }

    private final void installSignals() {
        String absolutePath = this.storageService.getNativeCrashDir().getAbsolutePath();
        String absolutePath2 = this.storageService.getFileForWrite(CrashFileMarkerImpl.CRASH_MARKER_FILE_NAME).getAbsolutePath();
        String str = this.unityCrashId;
        if (str == null) {
            str = Uuid.getEmbUuid$default(null, 1, null);
        }
        String str2 = str;
        boolean is32BitDevice = this.deviceArchitecture.is32BitDevice();
        try {
            Systrace.startSynchronous("init-native-crash-metadata");
            String json = this.serializer.toJson(new NativeCrashMetadata(this.metadataService.getLightweightAppInfo(), this.metadataService.getLightweightDeviceInfo(), this.userService.getUserInfo(), t.v(this.sessionProperties.get())));
            Systrace.endSynchronous();
            try {
                Systrace.startSynchronous("native-install-handlers");
                this.delegate._installSignalHandlers(absolutePath, absolutePath2, json, Constants.NULL_VERSION_ID, this.metadataService.getAppState(), str2, Build.VERSION.SDK_INT, is32BitDevice, ApkToolsConfig.IS_DEVELOPER_LOGGING_ENABLED);
                ww8 ww8Var = ww8.a;
                Systrace.endSynchronous();
                try {
                    Systrace.startSynchronous("update-metadata");
                    updateDeviceMetaData();
                    Systrace.endSynchronous();
                    this.isInstalled = true;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    private final String readMapFile(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            String sb2 = sb.toString();
                            gm0.a(bufferedReader, null);
                            gm0.a(fileInputStream, null);
                            return sb2;
                        }
                        sb.append(readLine);
                        sb.append("\n");
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private final void sendNativeCrash(NativeCrashData nativeCrashData) {
        NativeCrashMetadata metadata = nativeCrashData.getMetadata();
        try {
            this.deliveryService.sendCrash(new EventMessage(new Event(CRASH_REPORT_EVENT_NAME, null, Uuid.getEmbUuid$default(null, 1, null), nativeCrashData.getSessionId(), EventType.CRASH, Long.valueOf(nativeCrashData.getTimestamp()), null, Boolean.FALSE, null, nativeCrashData.getAppState(), null, metadata != null ? metadata.getSessionProperties() : null, null, null, null, null, null), null, metadata != null ? metadata.getDeviceInfo() : null, metadata != null ? metadata.getAppInfo() : null, metadata != null ? metadata.getUserInfo() : null, null, null, 13, nativeCrashData.getCrash(this.preferencesService.incrementAndGetNativeCrashNumber())), false);
        } catch (Exception e) {
            this.logger.log("Failed to report native crash to the api {sessionId=" + nativeCrashData.getSessionId() + ", crashId=" + nativeCrashData.getNativeCrashId(), InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }

    private final boolean shouldIgnoreOverriddenHandler(String str) {
        List e = i.e("libwebviewchromium.so");
        if ((e instanceof Collection) && e.isEmpty()) {
            return false;
        }
        Iterator it2 = e.iterator();
        while (it2.hasNext()) {
            if (h.P(str, (CharSequence) it2.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private final void startNativeCrashMonitoring() {
        try {
            if (this.sharedObjectLoader.loadEmbraceNative()) {
                installSignals();
                createCrashReportDirectory();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Handler handler = new Handler(myLooper);
                final EmbraceNdkService$startNativeCrashMonitoring$1 embraceNdkService$startNativeCrashMonitoring$1 = new EmbraceNdkService$startNativeCrashMonitoring$1(this);
                handler.postDelayed(new Runnable() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService$sam$java_lang_Runnable$0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zq3.g(qs2.this.mo865invoke(), "invoke(...)");
                    }
                }, 5000);
            }
        } catch (Exception e) {
            this.logger.log("Failed to start native crash monitoring", InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }

    private final void uninstallSignals() {
        this.delegate._uninstallSignals();
    }

    private final void updateAppState(String str) {
        this.delegate._updateAppState(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDeviceMetaData() {
        String metaData = getMetaData(true);
        if (metaData.length() >= 2048) {
            this.logger.log("Removing session properties from metadata to avoid exceeding size limitation for NDK metadata.", InternalEmbraceLogger.Severity.DEBUG, null, true);
            metaData = getMetaData(false);
        }
        this.delegate._updateMetaData(metaData);
    }

    @Override // io.embrace.android.embracesdk.ndk.NativeCrashService
    public NativeCrashData getAndSendNativeCrash() {
        NativeCrashData nativeCrash = getNativeCrash();
        if (nativeCrash == null) {
            return null;
        }
        sendNativeCrash(nativeCrash);
        return nativeCrash;
    }

    @Override // io.embrace.android.embracesdk.ndk.NdkService
    public NativeCrashData getNativeCrash() {
        List<NativeCrashDataError> nativeCrashErrors;
        NativeCrashData nativeCrashData = null;
        for (File file : this.repository.sortNativeCrashes(false)) {
            try {
                String path = file.getPath();
                String _getCrashReport = this.delegate._getCrashReport(path);
                if (_getCrashReport != null) {
                    nativeCrashData = (NativeCrashData) this.serializer.fromJson(_getCrashReport, NativeCrashData.class);
                } else {
                    this.logger.log("Failed to load crash report at " + path, InternalEmbraceLogger.Severity.ERROR, null, false);
                }
                File errorFileForCrash = this.repository.errorFileForCrash(file);
                if (nativeCrashData != null && (nativeCrashErrors = getNativeCrashErrors(nativeCrashData, errorFileForCrash)) != null) {
                    nativeCrashData.setErrors(nativeCrashErrors);
                }
                File mapFileForCrash = this.repository.mapFileForCrash(file);
                if (mapFileForCrash != null && nativeCrashData != null) {
                    nativeCrashData.setMap(getMapFileContent(mapFileForCrash));
                }
                if (nativeCrashData != null) {
                    Map<String, String> symbolsForCurrentArch = getSymbolsForCurrentArch();
                    if (symbolsForCurrentArch == null) {
                        this.logger.log("Failed to find symbols for native crash - stacktraces will not symbolicate correctly.", InternalEmbraceLogger.Severity.ERROR, null, false);
                    } else {
                        nativeCrashData.setSymbols(t.v(symbolsForCurrentArch));
                    }
                }
                this.repository.deleteFiles(file, errorFileForCrash, mapFileForCrash, nativeCrashData);
            } catch (Exception e) {
                file.delete();
                this.logger.log("Failed to read native crash file {crashFilePath=" + file.getAbsolutePath() + "}.", InternalEmbraceLogger.Severity.ERROR, e, true);
            }
        }
        return nativeCrashData;
    }

    @Override // io.embrace.android.embracesdk.ndk.NdkService
    public Map<String, String> getSymbolsForCurrentArch() {
        return (Map) this.symbolsForArch.getValue();
    }

    @Override // io.embrace.android.embracesdk.ndk.NdkService
    public String getUnityCrashId() {
        return this.unityCrashId;
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onBackground(long j) {
        synchronized (this.lock) {
            try {
                if (this.isInstalled) {
                    updateAppState("background");
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onForeground(boolean z, long j) {
        synchronized (this.lock) {
            try {
                if (this.isInstalled) {
                    updateAppState("foreground");
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.embrace.android.embracesdk.ndk.NdkService
    public void onSessionPropertiesUpdate(Map<String, String> map) {
        zq3.h(map, "properties");
        if (this.isInstalled) {
            BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService$onSessionPropertiesUpdate$1
                @Override // java.lang.Runnable
                public final void run() {
                    EmbraceNdkService.this.updateDeviceMetaData();
                }
            }, 1, (Object) null);
        }
    }

    @Override // io.embrace.android.embracesdk.ndk.NdkService
    public void onUserInfoUpdate() {
        if (this.isInstalled) {
            BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.ndk.EmbraceNdkService$onUserInfoUpdate$1
                @Override // java.lang.Runnable
                public final void run() {
                    EmbraceNdkService.this.updateDeviceMetaData();
                }
            }, 1, (Object) null);
        }
    }

    @Override // io.embrace.android.embracesdk.ndk.NdkService
    public void updateSessionId(String str) {
        zq3.h(str, "newSessionId");
        if (this.isInstalled) {
            this.delegate._updateSessionId(str);
        }
    }
}
