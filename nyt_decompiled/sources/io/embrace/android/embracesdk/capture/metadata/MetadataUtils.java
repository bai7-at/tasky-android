package io.embrace.android.embracesdk.capture.metadata;

import android.os.StatFs;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes5.dex */
final class MetadataUtils {
    private MetadataUtils() {
    }

    static long getInternalStorageFreeCapacity(StatFs statFs) {
        return statFs.getFreeBytes();
    }

    static long getInternalStorageTotalCapacity(StatFs statFs) {
        return statFs.getTotalBytes();
    }

    static String getLocale() {
        return Locale.getDefault().getLanguage() + QueryKeys.END_MARKER + Locale.getDefault().getCountry();
    }

    static int getNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    static String getTimezoneId() {
        return TimeZone.getDefault().getID();
    }
}
