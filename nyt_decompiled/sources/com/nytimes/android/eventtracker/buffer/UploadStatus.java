package com.nytimes.android.eventtracker.buffer;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UploadStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UploadStatus[] $VALUES;
    public static final UploadStatus PENDING = new UploadStatus("PENDING", 0);
    public static final UploadStatus UPLOADED = new UploadStatus("UPLOADED", 1);

    private static final /* synthetic */ UploadStatus[] $values() {
        return new UploadStatus[]{PENDING, UPLOADED};
    }

    static {
        UploadStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UploadStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UploadStatus valueOf(String str) {
        return (UploadStatus) Enum.valueOf(UploadStatus.class, str);
    }

    public static UploadStatus[] values() {
        return (UploadStatus[]) $VALUES.clone();
    }
}
