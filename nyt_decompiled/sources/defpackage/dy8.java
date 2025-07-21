package defpackage;

import com.nytimes.android.eventtracker.buffer.UploadStatus;

/* loaded from: classes4.dex */
public final class dy8 {
    public final String a(UploadStatus uploadStatus) {
        zq3.h(uploadStatus, "uploadStatus");
        return uploadStatus.name();
    }

    public final UploadStatus b(String str) {
        zq3.h(str, "value");
        return UploadStatus.valueOf(str);
    }
}
