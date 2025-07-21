package io.embrace.android.embracesdk.samples;

import android.app.Activity;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.lf2;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class AutomaticVerificationChecker {
    private File file;
    private final String fileName = "emb_marker_file.txt";
    private final VerificationResult verificationResult = new VerificationResult();
    private final EmbraceSerializer serializer = new EmbraceSerializer();

    public static final /* synthetic */ File access$getFile$p(AutomaticVerificationChecker automaticVerificationChecker) {
        File file = automaticVerificationChecker.file;
        if (file == null) {
            zq3.z(TransferTable.COLUMN_FILE);
        }
        return file;
    }

    private final boolean generateMarkerFile() {
        File file = this.file;
        if (file == null) {
            zq3.z(TransferTable.COLUMN_FILE);
        }
        if (file.exists()) {
            return false;
        }
        File file2 = this.file;
        if (file2 == null) {
            zq3.z(TransferTable.COLUMN_FILE);
        }
        return file2.createNewFile();
    }

    public final void addException(Throwable th) {
        zq3.h(th, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        this.verificationResult.getExceptions().add(th);
        File file = this.file;
        if (file == null) {
            zq3.z(TransferTable.COLUMN_FILE);
        }
        lf2.i(file, this.serializer.toJson(this.verificationResult), null, 2, null);
    }

    public final boolean createFile(Activity activity) {
        zq3.h(activity, "activity");
        File cacheDir = activity.getCacheDir();
        zq3.g(cacheDir, "activity.cacheDir");
        this.file = new File(cacheDir.getAbsolutePath() + '/' + this.fileName);
        return generateMarkerFile();
    }

    public final void deleteFile() {
        File file = this.file;
        if (file == null) {
            zq3.z(TransferTable.COLUMN_FILE);
        }
        if (file.exists()) {
            File file2 = this.file;
            if (file2 == null) {
                zq3.z(TransferTable.COLUMN_FILE);
            }
            if (file2.isDirectory()) {
                return;
            }
            File file3 = this.file;
            if (file3 == null) {
                zq3.z(TransferTable.COLUMN_FILE);
            }
            file3.delete();
        }
    }

    public final List<Throwable> getExceptions() {
        File file = this.file;
        if (file == null) {
            zq3.z(TransferTable.COLUMN_FILE);
        }
        String g = lf2.g(file, null, 1, null);
        return h.d0(g) ? i.l() : ((VerificationResult) this.serializer.fromJson(g, VerificationResult.class)).getExceptions();
    }

    public final Boolean isVerificationCorrect() {
        try {
            File file = this.file;
            if (file != null) {
                if (file == null) {
                    zq3.z(TransferTable.COLUMN_FILE);
                }
                String g = lf2.g(file, null, 1, null);
                return g.length() == 0 ? Boolean.TRUE : Boolean.valueOf(((VerificationResult) this.serializer.fromJson(g, VerificationResult.class)).getExceptions().isEmpty());
            }
        } catch (FileNotFoundException e) {
            Embrace embrace = Embrace.getInstance();
            zq3.g(embrace, "Embrace.getInstance()");
            embrace.getInternalInterface().logError("Cannot open file", null, null, false);
            Embrace embrace2 = Embrace.getInstance();
            zq3.g(embrace2, "Embrace.getInstance()");
            embrace2.getInternalInterface().logInternalError(e);
        }
        return null;
    }
}
