package zendesk.core;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.zendesk.logger.Logger;
import defpackage.r48;
import defpackage.r74;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
class DeviceInfo {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "DeviceInfo";
    private static final String PLATFORM_ANDROID = "Android";
    private final ActivityManager activityManager;
    private final Context context;

    DeviceInfo(Context context) {
        this.context = context;
        this.activityManager = (ActivityManager) context.getSystemService("activity");
    }

    @TargetApi(18)
    private long getAvailableInternalDiskMemory() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    private String getBytesInMb(long j) {
        return String.valueOf(j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public static Locale getCurrentLocale(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    private long getDiskSize() {
        return getTotalInternalDiskSize();
    }

    private String getManufacturer() {
        String str = Build.MANUFACTURER;
        return (DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str) || r48.d(str)) ? "" : str;
    }

    private String getOS() {
        String str = Build.VERSION.RELEASE;
        if (!DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str)) {
            r48.d(str);
        }
        return String.format(Locale.US, "%s/%s", str, Integer.valueOf(Build.VERSION.SDK_INT));
    }

    @TargetApi(18)
    private long getTotalInternalDiskSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    @TargetApi(16)
    private long getTotalMemory() {
        Logger.b(LOG_TAG, "Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c A[Catch: NumberFormatException -> 0x009f, NoSuchElementException -> 0x00a1, TRY_LEAVE, TryCatch #8 {NumberFormatException -> 0x009f, NoSuchElementException -> 0x00a1, blocks: (B:10:0x0085, B:12:0x008c), top: B:9:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long getTotalMemoryCompat() {
        /*
            r7 = this;
            java.lang.String r7 = "Failed to close /proc/meminfo file stream: "
            java.lang.String r0 = "DeviceInfo"
            r1 = 0
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3f
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3f
            java.lang.String r5 = "/proc/meminfo"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3f
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
            r3.close()     // Catch: java.io.IOException -> L1a
            goto L7e
        L1a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r7 = r3.getMessage()
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.h(r0, r7, r3, r4)
            goto L7e
        L34:
            r2 = move-exception
            goto Lb3
        L37:
            r2 = move-exception
            goto L43
        L39:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto Lb3
        L3f:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r4.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "Failed to determine total memory from /proc/meminfo: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> L34
            r4.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L34
            com.zendesk.logger.Logger.c(r0, r4, r2, r5)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L7c
            r3.close()     // Catch: java.io.IOException -> L63
            goto L7c
        L63:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r7 = r2.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.h(r0, r7, r2, r3)
        L7c:
            java.lang.String r2 = ""
        L7e:
            java.util.StringTokenizer r7 = new java.util.StringTokenizer
            r7.<init>(r2)
            r2 = -1
            int r4 = r7.countTokens()     // Catch: java.lang.NumberFormatException -> L9f java.util.NoSuchElementException -> La1
            r5 = 3
            if (r4 != r5) goto Lb2
            r7.nextToken()     // Catch: java.lang.NumberFormatException -> L9f java.util.NoSuchElementException -> La1
            java.lang.String r7 = r7.nextToken()     // Catch: java.lang.NumberFormatException -> L9f java.util.NoSuchElementException -> La1
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L9f java.util.NoSuchElementException -> La1
            long r0 = r7.longValue()     // Catch: java.lang.NumberFormatException -> L9f java.util.NoSuchElementException -> La1
            r2 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            goto Lb2
        L9f:
            r7 = move-exception
            goto La3
        La1:
            r7 = move-exception
            goto Lab
        La3:
            java.lang.String r4 = "Error reading memory size from proc/meminfo"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.c(r0, r4, r7, r1)
            goto Lb2
        Lab:
            java.lang.String r4 = "Error reading tokens from the /proc/meminfo"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.c(r0, r4, r7, r1)
        Lb2:
            return r2
        Lb3:
            if (r3 == 0) goto Ld2
            r3.close()     // Catch: java.io.IOException -> Lb9
            goto Ld2
        Lb9:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r7 = r3.getMessage()
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.zendesk.logger.Logger.h(r0, r7, r3, r1)
        Ld2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.core.DeviceInfo.getTotalMemoryCompat():long");
    }

    private long getUsedDiskSpace() {
        return getDiskSize() - getAvailableInternalDiskMemory();
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    Map<String, String> getInfo() {
        HashMap hashMap = new HashMap();
        String os = getOS();
        String model = getModel();
        long usedMemory = getUsedMemory();
        long totalMemory = getTotalMemory();
        long diskSize = getDiskSize();
        long usedDiskSpace = getUsedDiskSpace();
        int batteryLevel = getBatteryLevel();
        String locale = getLocale();
        String manufacturer = getManufacturer();
        if (!r48.d(os)) {
            hashMap.put("os", os);
        }
        if (!r48.d(model)) {
            hashMap.put("model", model);
        }
        if (usedMemory != -1) {
            hashMap.put("memory_used", getBytesInMb(usedMemory));
        }
        if (totalMemory != -1) {
            hashMap.put("memory_total", getBytesInMb(totalMemory));
        }
        if (diskSize != -1) {
            hashMap.put("disk_total", getBytesInMb(diskSize));
        }
        if (usedDiskSpace != -1) {
            hashMap.put("disk_used", getBytesInMb(usedDiskSpace));
        }
        if (batteryLevel != -1) {
            hashMap.put("battery_level", String.valueOf(batteryLevel));
        }
        if (!r48.d(locale)) {
            hashMap.put("sys_locale", locale);
        }
        if (!r48.d(manufacturer)) {
            hashMap.put("manufacturer", manufacturer);
        }
        hashMap.put("platform", PLATFORM_ANDROID);
        return hashMap;
    }

    String getLocale() {
        return r74.a(Locale.getDefault());
    }

    String getModel() {
        String str = Build.MODEL;
        boolean z = true;
        boolean z2 = DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str) || r48.d(str);
        String str2 = Build.DEVICE;
        if (!DatasetUtils.UNKNOWN_IDENTITY_ID.equals(str2) && !r48.d(str2)) {
            z = false;
        }
        return (z2 && z) ? "" : str.equals(str2) ? str : String.format(Locale.US, "%s/%s", str, str2);
    }
}
