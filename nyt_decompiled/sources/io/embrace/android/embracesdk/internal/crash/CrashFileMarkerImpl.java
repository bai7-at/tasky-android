package io.embrace.android.embracesdk.internal.crash;

import defpackage.c04;
import defpackage.lf2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CrashFileMarkerImpl implements CrashFileMarker {
    public static final String CRASH_MARKER_FILE_NAME = "embrace_crash_marker";
    private static final String CRASH_MARKER_SOURCE_JVM = "1";
    public static final Companion Companion = new Companion(null);
    private final Object lock;
    private final InternalEmbraceLogger logger;
    private final c04 markerFile;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CrashFileMarkerImpl(c04 c04Var, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(c04Var, "markerFile");
        zq3.h(internalEmbraceLogger, "logger");
        this.markerFile = c04Var;
        this.logger = internalEmbraceLogger;
        this.lock = new Object();
    }

    private final boolean createMarkerFile() {
        try {
            lf2.i((File) this.markerFile.getValue(), "1", null, 2, null);
            return true;
        } catch (Exception e) {
            this.logger.log("Error creating the marker file: " + ((File) this.markerFile.getValue()).getPath(), InternalEmbraceLogger.Severity.ERROR, e, false);
            return false;
        }
    }

    private final boolean deleteMarkerFile() {
        try {
            boolean delete = ((File) this.markerFile.getValue()).delete();
            if (!delete) {
                this.logger.log("Error deleting the marker file: " + ((File) this.markerFile.getValue()).getPath() + '.', InternalEmbraceLogger.Severity.ERROR, new Throwable("File not deleted"), false);
            }
            return delete;
        } catch (SecurityException e) {
            this.logger.log("Error deleting the marker file: " + ((File) this.markerFile.getValue()).getPath() + '.', InternalEmbraceLogger.Severity.ERROR, e, false);
            return false;
        }
    }

    private final Boolean markerFileExists() {
        try {
            return Boolean.valueOf(((File) this.markerFile.getValue()).exists());
        } catch (SecurityException e) {
            this.logger.log("Error checking the marker file: " + ((File) this.markerFile.getValue()).getPath(), InternalEmbraceLogger.Severity.ERROR, e, false);
            return null;
        }
    }

    @Override // io.embrace.android.embracesdk.internal.crash.CrashFileMarker
    public boolean getAndCleanMarker() {
        boolean isMarked;
        synchronized (this.lock) {
            isMarked = isMarked();
            removeMark();
        }
        return isMarked;
    }

    @Override // io.embrace.android.embracesdk.internal.crash.CrashFileMarker
    public boolean isMarked() {
        boolean booleanValue;
        synchronized (this.lock) {
            try {
                Boolean markerFileExists = markerFileExists();
                if (markerFileExists == null) {
                    markerFileExists = markerFileExists();
                }
                booleanValue = markerFileExists != null ? markerFileExists.booleanValue() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    @Override // io.embrace.android.embracesdk.internal.crash.CrashFileMarker
    public void mark() {
        synchronized (this.lock) {
            try {
                if (!createMarkerFile()) {
                    createMarkerFile();
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.embrace.android.embracesdk.internal.crash.CrashFileMarker
    public void removeMark() {
        synchronized (this.lock) {
            try {
                if (((File) this.markerFile.getValue()).exists() && !deleteMarkerFile()) {
                    deleteMarkerFile();
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
