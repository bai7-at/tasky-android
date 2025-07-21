package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.comscore.streaming.ContentType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class AFa1xSDK {
    private static int AFInAppEventParameterName = 715484193;
    private static int AFInAppEventType = 2062588566;
    private static int AFKeystoreWrapper = 51;
    private static int AFLogger = 1;
    private static int afInfoLog;
    private static short[] values;
    private static byte[] valueOf = {-17, 13, -2, 6, -13, 13, 20, -44, 11, -1, 7, -8, 11, -7, 7, 17, 38, -75, 11, -1, 7, -8, 11, -7, 7, -15, 70, -54, -5, -6, -3, 14, -10, 13, -50, -33, -25, 0, 6, 0, 37, 0, -23, -5, 0, 55, -32, 0, 32, -76, 0, 0, 0, -49, -46, -37, 9, 5, -12, 3, -7, 70, -65, 6, 59, -51, -21, 21, -9, -45, -3, 5, 2, -2, 52, -10, -26, -52, -1, 6, -11, 4, 11, 2, -21, 19, 69, -72, -12, 11, -14, 87, -72, -12, 19, -15, 80, -69, -3, 5, 2, -2, 67, -84, 15, -2, 71, -79, -5, 84, -68, -1, -7, 3, 8, 27};
    private static char[] afRDLog = {'0', 46828, 59603, 2708, 44127, 52767, 25031, 33750, 9503, 18263, 59126, 6371, 47657, 56383, 32736, 37375, 13113, 21882, 63252, 5762, 18591, 59914, 3079, 44946, 49626, 25418, 34155, 9383, 18108, 63532, 6770, 48567, 57339, 57381, 48662, 23640, 64130, 39131, 14081, 54600, 29646, 4555, 45099, 20018, 60562, 35573, 10556, 51064, 26021, 1014, 41409, 16433, 7761, 48282, 23241, 63755, 38725, 13718, 62009, 44042, 20036, 59550, 35527, 9501, 51028, 25042, 976, 41509, 23666, 65192, 39167, 15157, 54626, 30649, 4534, 46071, 20997, 3138, 44699, 18651, 60162, 51065, 39242, 31492, 56798, 49031, 4189, 61972, 21650, 13975, 38775, 26990, 52173, 44475, 3693, 57406, 17151, 9356, 34437, 26451, 14599, 25165, 15486, 56880, 30954, 6835, 46441, 22304, 61862, 37794, 12885, 52224, 28310, 2217, 43858, 17677, '.', 18580, 5804, 62701, 21074, 12345, 40892, 32250, 56112, 47472, 6287, 'C', 24148, 48157, 6871, 30875, 55135, 13597, 37833, 61861, 20580, 44603, 3313, 27296, 51576, 10017, 34283, 58286};
    private static long afErrorLog = 6272649895886347836L;

    @Nullable
    static String AFInAppEventParameterName(Context context, long j) {
        String AFInAppEventType2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (valueOf(valueOf(TextUtils.lastIndexOf("", '0', 0) - 715484095, (short) TextUtils.getOffsetAfter("", 0), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-52) - (ViewConfiguration.getLongPressTimeout() >> 16), (-2062588567) - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
            AFLogger = (afInfoLog + 47) % 128;
            AFInAppEventType2 = valueOf((-715484145) - ExpandableListView.getPackedPositionChild(0L), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (ViewConfiguration.getTapTimeout() >> 16), (-53) - Process.getGidForName(""), (-2062588533) - Process.getGidForName(""));
        } else {
            AFInAppEventType2 = AFInAppEventType(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1);
        }
        sb2.append(AFInAppEventType2.intern());
        sb.append(values(context, sb2));
        try {
            sb.append(new SimpleDateFormat(valueOf((-715484073) - Process.getGidForName(""), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getSize(0) - 52, (KeyEvent.getMaxKeyCode() >> 16) - 2062588531).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            afInfoLog = (AFLogger + 75) % 128;
            sb.append(j);
            valueOf(sb3);
            String AFKeystoreWrapper2 = AFKeystoreWrapper(AFKeystoreWrapper(AFKeystoreWrapper(AFKeystoreWrapper(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
            afInfoLog = (AFLogger + 33) % 128;
            return AFKeystoreWrapper2;
        } catch (PackageManager.NameNotFoundException unused) {
            return AFInAppEventType(TextUtils.indexOf("", "", 0) + 1, (char) (ImageFormat.getBitsPerPixel(0) + 46735), TextUtils.getOffsetAfter("", 0) + 32).intern();
        }
    }

    private static String AFInAppEventType(String str) {
        if (!str.contains(AFInAppEventType((KeyEvent.getMaxKeyCode() >> 16) + 116, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (KeyEvent.getMaxKeyCode() >> 16) + 1).intern())) {
            return str;
        }
        String[] split = str.split(valueOf((-715484102) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 52, (-2062588514) - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i = length - 1;
        sb.append(split[i]);
        sb.append(AFInAppEventType(116 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) View.resolveSizeAndState(0, 0, 0), 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
        AFLogger = (afInfoLog + 35) % 128;
        for (int i2 = 1; i2 < i; i2++) {
            AFLogger = (afInfoLog + 25) % 128;
            sb.append(split[i2]);
            sb.append(AFInAppEventType((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 116, (char) View.resolveSizeAndState(0, 0, 0), Gravity.getAbsoluteGravity(0, 0) + 1).intern());
        }
        sb.append(split[0]);
        return sb.toString();
    }

    private static String AFKeystoreWrapper(String str, Long l) {
        int i = afInfoLog;
        AFLogger = (i + 105) % 128;
        long j = 0;
        if (str != null) {
            AFLogger = (i + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
            if (l != null && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                int i2 = 0;
                int i3 = 0;
                while (i2 < obj.length()) {
                    int i4 = AFLogger + 55;
                    afInfoLog = i4 % 128;
                    if (i4 % 2 != 0) {
                        i3 /= Character.getNumericValue(obj.charAt(i2));
                        i2 += 40;
                    } else {
                        i3 += Character.getNumericValue(obj.charAt(i2));
                        i2++;
                    }
                }
                String hexString = Integer.toHexString(i3);
                sb.replace(7, hexString.length() + 7, hexString);
                int i5 = 0;
                while (i5 < sb.length()) {
                    int i6 = AFLogger + 21;
                    afInfoLog = i6 % 128;
                    if (i6 % 2 != 0) {
                        j += Character.getNumericValue(sb.charAt(i5));
                        i5 += 39;
                    } else {
                        j += Character.getNumericValue(sb.charAt(i5));
                        i5++;
                    }
                }
                while (j > 100) {
                    j %= 100;
                }
                sb.insert(23, (int) j);
                if (j < 10) {
                    sb.insert(23, AFInAppEventType(Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getMode(0) + 1).intern());
                }
                return sb.toString();
            }
        }
        return AFInAppEventType(ExpandableListView.getPackedPositionGroup(0L) + 1, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 46733), Color.blue(0) + 32).intern();
    }

    private static boolean valueOf(String str) {
        afInfoLog = (AFLogger + 3) % 128;
        try {
            Class.forName(str);
            AFLogger = (afInfoLog + 49) % 128;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String values(Context context, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFInAppEventType2 = AFInAppEventType(packageName);
        sb.append(valueOf((-715484144) - TextUtils.getOffsetBefore("", 0), (short) ExpandableListView.getPackedPositionType(0L), (byte) Color.red(0), TextUtils.indexOf((CharSequence) "", '0') - 51, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 2062588532).intern());
        sb2.append(AFInAppEventType2);
        if (AFKeystoreWrapper(context) == null) {
            sb.append(AFInAppEventType(View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
            sb2.append(packageName);
        } else {
            sb.append(valueOf((-715484144) - TextUtils.getCapsMode("", 0, 0), (short) KeyEvent.normalizeMetaState(0), (byte) KeyEvent.keyCodeFromString(""), (-51) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 26044 - AndroidCharacter.getMirror('0')).intern());
            sb2.append(packageName);
            AFLogger = (afInfoLog + 65) % 128;
        }
        String valueOf2 = valueOf(context);
        if (valueOf2 == null) {
            sb.append(AFInAppEventType((Process.getThreadPriority(0) + 20) >> 6, (char) (ImageFormat.getBitsPerPixel(0) + 1), 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            sb2.append(packageName);
        } else {
            sb.append(valueOf((ViewConfiguration.getScrollDefaultDelay() >> 16) - 715484144, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) View.resolveSize(0, 0), (-53) - TextUtils.lastIndexOf("", '0', 0), (-2062588532) - View.resolveSize(0, 0)).intern());
            sb2.append(valueOf2);
        }
        sb2.append(Boolean.TRUE.toString());
        String obj = sb2.toString();
        AFLogger = (afInfoLog + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
        return obj;
    }

    private static void valueOf(StringBuilder sb) {
        String intern;
        String intern2;
        if (valueOf(AFInAppEventType(TextUtils.getCapsMode("", 0, 0) + 33, (char) (57412 - View.resolveSizeAndState(0, 0, 0)), 25 - TextUtils.getOffsetAfter("", 0)).intern())) {
            AFLogger = (afInfoLog + 17) % 128;
            intern = valueOf(View.MeasureSpec.getMode(0) - 715484144, (short) Drawable.resolveOpacity(0, 0), (byte) TextUtils.getTrimmedLength(""), (-51) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.myPid() >> 22) - 2062588532).intern();
        } else {
            intern = AFInAppEventType(Color.argb(0, 0, 0, 0), (char) Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern();
            AFLogger = (afInfoLog + 103) % 128;
        }
        sb.append(intern);
        if (!valueOf(AFInAppEventType((ViewConfiguration.getJumpTapTimeout() >> 16) + 58, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 62040), KeyEvent.getDeadChar(0, 0) + 23).intern())) {
            intern2 = AFInAppEventType(ExpandableListView.getPackedPositionType(0L), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1 - TextUtils.indexOf("", "", 0, 0)).intern();
        } else {
            intern2 = valueOf((ViewConfiguration.getEdgeSlop() >> 16) - 715484144, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (Process.myTid() >> 22), (-52) - Color.blue(0), (-2062588533) - ImageFormat.getBitsPerPixel(0)).intern();
            afInfoLog = (AFLogger + 31) % 128;
        }
        sb.append(intern2);
        sb.append((valueOf(AFInAppEventType(ExpandableListView.getPackedPositionChild(0L) + 82, (char) (50969 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20).intern()) ? valueOf((ViewConfiguration.getWindowTouchSlop() >> 8) - 715484144, (short) KeyEvent.keyCodeFromString(""), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') - 51, (-2062588532) - (ViewConfiguration.getKeyRepeatDelay() >> 16)) : AFInAppEventType(Process.myTid() >> 22, (char) ('0' - AndroidCharacter.getMirror('0')), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern());
        sb.append((valueOf(AFInAppEventType(101 - (Process.myTid() >> 22), (char) (25133 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()) ? valueOf((-715484144) - (ViewConfiguration.getTouchSlop() >> 8), (short) (KeyEvent.getMaxKeyCode() >> 16), (byte) (Process.myTid() >> 22), ExpandableListView.getPackedPositionGroup(0L) - 52, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 2062588532) : AFInAppEventType(View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.alpha(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern());
    }

    private static String AFInAppEventType(int i, char c, int i2) {
        String str;
        synchronized (AFf1zSDK.AFInAppEventParameterName) {
            try {
                char[] cArr = new char[i2];
                AFf1zSDK.valueOf = 0;
                while (true) {
                    int i3 = AFf1zSDK.valueOf;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((afRDLog[i + i3] ^ (i3 * afErrorLog)) ^ c);
                        AFf1zSDK.valueOf = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private static String valueOf(Context context) {
        afInfoLog = (AFLogger + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            AFLogger = (afInfoLog + 59) % 128;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static class AFa1wSDK extends HashMap<String, Object> {
        private static int afErrorLog = 0;
        private static int afRDLog = 1;
        private final Context AFInAppEventType;
        private final Map<String, Object> values;
        private static char[] AFKeystoreWrapper = {'a', 56365, 47305, 38037, 28997, 19738, 10663, 1662, 57900, 48834, 39555, 30537, 'b', 56377, 47351, 38031, 29000, 20271, 37733, 63400, 56258, 15903, 599, 26349, 18728, 20684, 35968, 59477, 50215, 8675, 7609, 31048, 22208, 45719, 61031, 51745, 10209, 847, 32529, 23769, 47265, 38013, 61553, 11655, 2398, 25872, 17069, 48819, 39538, 63451, 54233, 3907, 27434, 18666, 42173, 32832, 64986, 55730, 13666, 4409, 20123, 43602, 34324, 58343, 57257, 15144, 6281, '-', 56377, 47349, 38095, 28934, 55483, 1267, 24621, 19549, 43412, 38347, 61739, 57057, 15029, 26186, 16979, 45017, 35692, 63344, 54513, 12428, 7256, 30746, 14814, 58778, 33101, 44332, 18684, 29857, 4121, 16284, 56206, 34674, 41765, 20195, 27221, 5636, 13707, 53691, 64876, 39216, 17552, 24641, 3085, 11190, 55183, 62275, 40675, 47800, 26212, 516, 8658, 52639, 59702, 38114, 45214, 23642, 30734, 10171, 50039, 43160, 29890, 4119, 15485, 55717, 58857, 33103, 44693, 19137, 5693, 12903, 40620, 17063, 9844, 's', 56366, 47352, 38034, 28995, 19717, 'b', 39328, 17853};
        private static long valueOf = -3428720173081568181L;
        private static int[] AFInAppEventParameterName = {-805533219, -894798121, 2127287910, 1155743266, -120298127, -1547388918, 289613097, -384523935, -786561857, -1856584467, 320999411, 1464239501, 1836290310, -103943118, -1530720858, -464988529, -130962176, -926333798};

        /* renamed from: com.appsflyer.internal.AFa1xSDK$AFa1wSDK$AFa1wSDK, reason: collision with other inner class name */
        static class C0143AFa1wSDK {
            private static int AFInAppEventParameterName = 0;
            private static int[] AFInAppEventType = {1479593657, 1475315638, 651399440, 1763526436, 18605197, -1921871982, 502823046, -1250260641, 94420503, -1035645435, 819078517, -1122488234, 637916120, 2088452607, -1868842497, 293175046, 899298938, -694152858};
            private static int values = 1;

            C0143AFa1wSDK() {
            }

            @NonNull
            private static byte[] AFInAppEventType(@NonNull String str) throws Exception {
                values = (AFInAppEventParameterName + 85) % 128;
                byte[] bytes = str.getBytes();
                values = (AFInAppEventParameterName + 5) % 128;
                return bytes;
            }

            @NonNull
            static String values(String str) throws Exception {
                int i = values + 95;
                AFInAppEventParameterName = i % 128;
                int i2 = i % 2;
                byte[] AFInAppEventType2 = AFInAppEventType(str);
                if (i2 == 0) {
                    return AFInAppEventType(values(AFInAppEventType2));
                }
                AFInAppEventType(values(AFInAppEventType2));
                throw null;
            }

            @NonNull
            private static String AFInAppEventType(@NonNull byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                int length = bArr.length;
                int i = 0;
                while (i < length) {
                    values = (AFInAppEventParameterName + 19) % 128;
                    String hexString = Integer.toHexString(bArr[i]);
                    if (hexString.length() == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(values(new int[]{1536847348, -1723242409}, -TextUtils.indexOf((CharSequence) "", '0')).intern());
                        sb2.append(hexString);
                        hexString = sb2.toString();
                    }
                    sb.append(hexString);
                    i++;
                    values = (AFInAppEventParameterName + 91) % 128;
                }
                return sb.toString();
            }

            private static byte[] values(@NonNull byte[] bArr) throws Exception {
                values = (AFInAppEventParameterName + 77) % 128;
                int i = 0;
                while (i < bArr.length) {
                    int i2 = (values + 73) % 128;
                    AFInAppEventParameterName = i2;
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                    i++;
                    values = (i2 + 61) % 128;
                }
                return bArr;
            }

            private static String values(int[] iArr, int i) {
                String str;
                synchronized (AFf1wSDK.AFInAppEventType) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) AFInAppEventType.clone();
                        AFf1wSDK.valueOf = 0;
                        while (true) {
                            int i2 = AFf1wSDK.valueOf;
                            if (i2 < iArr.length) {
                                int i3 = iArr[i2];
                                char c = (char) (i3 >> 16);
                                cArr[0] = c;
                                char c2 = (char) i3;
                                cArr[1] = c2;
                                char c3 = (char) (iArr[i2 + 1] >> 16);
                                cArr[2] = c3;
                                char c4 = (char) iArr[i2 + 1];
                                cArr[3] = c4;
                                AFf1wSDK.values = (c << 16) + c2;
                                AFf1wSDK.AFKeystoreWrapper = (c3 << 16) + c4;
                                AFf1wSDK.AFInAppEventParameterName(iArr2);
                                for (int i4 = 0; i4 < 16; i4++) {
                                    int i5 = AFf1wSDK.values ^ iArr2[i4];
                                    AFf1wSDK.values = i5;
                                    AFf1wSDK.AFKeystoreWrapper = AFf1wSDK.values(i5) ^ AFf1wSDK.AFKeystoreWrapper;
                                    int i6 = AFf1wSDK.values;
                                    AFf1wSDK.values = AFf1wSDK.AFKeystoreWrapper;
                                    AFf1wSDK.AFKeystoreWrapper = i6;
                                }
                                int i7 = AFf1wSDK.values;
                                AFf1wSDK.values = AFf1wSDK.AFKeystoreWrapper;
                                AFf1wSDK.AFKeystoreWrapper = i7;
                                AFf1wSDK.AFKeystoreWrapper = i7 ^ iArr2[16];
                                AFf1wSDK.values ^= iArr2[17];
                                int i8 = AFf1wSDK.valueOf;
                                int i9 = AFf1wSDK.values;
                                cArr[0] = (char) (i9 >>> 16);
                                cArr[1] = (char) i9;
                                int i10 = AFf1wSDK.AFKeystoreWrapper;
                                cArr[2] = (char) (i10 >>> 16);
                                cArr[3] = (char) i10;
                                AFf1wSDK.AFInAppEventParameterName(iArr2);
                                int i11 = AFf1wSDK.valueOf;
                                cArr2[i11 << 1] = cArr[0];
                                cArr2[(i11 << 1) + 1] = cArr[1];
                                cArr2[(i11 << 1) + 2] = cArr[2];
                                cArr2[(i11 << 1) + 3] = cArr[3];
                                AFf1wSDK.valueOf = i11 + 2;
                            } else {
                                str = new String(cArr2, 0, i);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            }
        }

        public AFa1wSDK(Map<String, Object> map, Context context) {
            this.values = map;
            this.AFInAppEventType = context;
            put(valueOf(), AFInAppEventParameterName());
        }

        private String AFInAppEventParameterName() {
            String obj;
            int i;
            try {
                String obj2 = this.values.get(AFKeystoreWrapper((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 12).intern()).toString();
                String obj3 = this.values.get(values(new int[]{-230129531, -786767535, 1944392033, -111502298, -1377192421, 1648956086, -1118078941, 541116269}, MotionEvent.axisFromString("") + 16).intern()).toString();
                String replaceAll = values(new int[]{1052829877, 2111149162, 1674220627, 1154512075}, ImageFormat.getBitsPerPixel(0) + 6).intern().replaceAll(AFKeystoreWrapper(Color.argb(0, 0, 0, 0) + 67, (char) ((-1) - MotionEvent.axisFromString("")), Process.getGidForName("") + 6).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj2);
                sb.append(obj3);
                sb.append(replaceAll);
                String values = AFb1sSDK.values(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(values.substring(0, 16));
                obj = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(values(new int[]{-651842138, -24342087, -26008375, 88110930, 2077298691, 2095967898, -1329155940, 1963333426, 70524885, -318083974, 1020192001, 319212647, -818703439, 833137862, 707668250, -1144126352, -1350128054, 1674048480, -30067188, -97047447, 1233218911, 986569747}, 43 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(AFKeystoreWrapper((ViewConfiguration.getTouchSlop() >> 8) + 72, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 55513), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17).intern());
                obj = sb4.toString();
            }
            String str = obj;
            try {
                Intent registerReceiver = this.AFInAppEventType.registerReceiver(null, new IntentFilter(AFKeystoreWrapper(Color.rgb(0, 0, 0) + 16777306, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 14784), 37 - Color.green(0)).intern()));
                int i2 = -2700;
                if (registerReceiver != null) {
                    i2 = registerReceiver.getIntExtra(AFKeystoreWrapper(127 - TextUtils.getTrimmedLength(""), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43243), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10).intern(), -2700);
                } else {
                    afErrorLog = (afRDLog + 25) % 128;
                }
                String str2 = this.AFInAppEventType.getApplicationInfo().nativeLibraryDir;
                if (str2 == null || !str2.contains(AFKeystoreWrapper(138 - Gravity.getAbsoluteGravity(0, 0), (char) (40660 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), KeyEvent.keyCodeFromString("") + 3).intern())) {
                    i = 0;
                } else {
                    afErrorLog = (afRDLog + 109) % 128;
                    i = 1;
                }
                int size = ((SensorManager) this.AFInAppEventType.getSystemService(AFKeystoreWrapper(141 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "") + 6).intern())).getSensorList(-1).size();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(AFKeystoreWrapper(147 - View.MeasureSpec.getMode(0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 1 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
                sb5.append(i2);
                sb5.append(values(new int[]{647671226, 949277519}, 2 - TextUtils.getOffsetAfter("", 0)).intern());
                sb5.append(i);
                sb5.append(values(new int[]{-1758999284, 1772821201}, 2 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
                sb5.append(size);
                sb5.append(AFKeystoreWrapper(148 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39303), Color.alpha(0) + 2).intern());
                sb5.append(this.values.size());
                String obj4 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(C0143AFa1wSDK.values(obj4));
                return sb6.toString();
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(values(new int[]{-651842138, -24342087, -26008375, 88110930, 2077298691, 2095967898, -1329155940, 1963333426, 70524885, -318083974, 1020192001, 319212647, -818703439, 833137862, 707668250, -1144126352, -1350128054, 1674048480, -30067188, -97047447, 1233218911, 986569747}, 44 - (Process.myPid() >> 22)).intern());
                sb7.append(e2);
                AFLogger.afRDLog(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(values(new int[]{-1284848007, -861800959, -1256166135, 1268482942, 1367464703, -620228810, -1590717295, -1372289372}, KeyEvent.keyCodeFromString("") + 16).intern());
                return sb8.toString();
            }
        }

        private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) throws Exception {
            int charAt;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < intValue; i2++) {
                int i3 = afRDLog + 59;
                afErrorLog = i3 % 128;
                Integer num = null;
                for (int i4 = i3 % 2 != 0 ? 1 : 0; i4 < 3; i4++) {
                    int i5 = afErrorLog + 71;
                    afRDLog = i5 % 128;
                    if (i5 % 2 == 0) {
                        charAt = strArr[i4].charAt(i2);
                        int i6 = 29 / 0;
                        if (num == null) {
                            num = Integer.valueOf(charAt);
                        }
                        charAt ^= num.intValue();
                        num = Integer.valueOf(charAt);
                    } else {
                        charAt = strArr[i4].charAt(i2);
                        if (num == null) {
                            num = Integer.valueOf(charAt);
                        }
                        charAt ^= num.intValue();
                        num = Integer.valueOf(charAt);
                    }
                }
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        @NonNull
        private String valueOf() {
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.values.get(AFKeystoreWrapper((-1) - ExpandableListView.getPackedPositionChild(0L), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11).intern()).toString();
                String obj2 = this.values.get(AFKeystoreWrapper(12 - TextUtils.getTrimmedLength(""), (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 5).intern()).toString();
                if (obj2 == null) {
                    afErrorLog = (afRDLog + 19) % 128;
                    obj2 = AFKeystoreWrapper(17 - Color.blue(0), (char) (20321 - TextUtils.indexOf("", "")), KeyEvent.normalizeMetaState(0) + 8).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb.toString());
                int length = AFKeystoreWrapper2.length();
                if (length > 4) {
                    AFKeystoreWrapper2.delete(4, length);
                    afRDLog = (afErrorLog + 73) % 128;
                } else {
                    while (length < 4) {
                        length++;
                        AFKeystoreWrapper2.append('1');
                    }
                }
                AFKeystoreWrapper2.insert(0, values(new int[]{530947833, 54854536}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4).intern());
                return AFKeystoreWrapper2.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFKeystoreWrapper((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24, (char) (20650 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 42).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                return values(new int[]{-2119272565, -1440690105, -78314069, -563153315}, TextUtils.lastIndexOf("", '0', 0, 0) + 8).intern();
            }
        }

        private static String values(int[] iArr, int i) {
            String str;
            synchronized (AFf1wSDK.AFInAppEventType) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) AFInAppEventParameterName.clone();
                    AFf1wSDK.valueOf = 0;
                    while (true) {
                        int i2 = AFf1wSDK.valueOf;
                        if (i2 < iArr.length) {
                            int i3 = iArr[i2];
                            char c = (char) (i3 >> 16);
                            cArr[0] = c;
                            char c2 = (char) i3;
                            cArr[1] = c2;
                            char c3 = (char) (iArr[i2 + 1] >> 16);
                            cArr[2] = c3;
                            char c4 = (char) iArr[i2 + 1];
                            cArr[3] = c4;
                            AFf1wSDK.values = (c << 16) + c2;
                            AFf1wSDK.AFKeystoreWrapper = (c3 << 16) + c4;
                            AFf1wSDK.AFInAppEventParameterName(iArr2);
                            for (int i4 = 0; i4 < 16; i4++) {
                                int i5 = AFf1wSDK.values ^ iArr2[i4];
                                AFf1wSDK.values = i5;
                                AFf1wSDK.AFKeystoreWrapper = AFf1wSDK.values(i5) ^ AFf1wSDK.AFKeystoreWrapper;
                                int i6 = AFf1wSDK.values;
                                AFf1wSDK.values = AFf1wSDK.AFKeystoreWrapper;
                                AFf1wSDK.AFKeystoreWrapper = i6;
                            }
                            int i7 = AFf1wSDK.values;
                            AFf1wSDK.values = AFf1wSDK.AFKeystoreWrapper;
                            AFf1wSDK.AFKeystoreWrapper = i7;
                            AFf1wSDK.AFKeystoreWrapper = i7 ^ iArr2[16];
                            AFf1wSDK.values ^= iArr2[17];
                            int i8 = AFf1wSDK.valueOf;
                            int i9 = AFf1wSDK.values;
                            cArr[0] = (char) (i9 >>> 16);
                            cArr[1] = (char) i9;
                            int i10 = AFf1wSDK.AFKeystoreWrapper;
                            cArr[2] = (char) (i10 >>> 16);
                            cArr[3] = (char) i10;
                            AFf1wSDK.AFInAppEventParameterName(iArr2);
                            int i11 = AFf1wSDK.valueOf;
                            cArr2[i11 << 1] = cArr[0];
                            cArr2[(i11 << 1) + 1] = cArr[1];
                            cArr2[(i11 << 1) + 2] = cArr[2];
                            cArr2[(i11 << 1) + 3] = cArr[3];
                            AFf1wSDK.valueOf = i11 + 2;
                        } else {
                            str = new String(cArr2, 0, i);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        private static String AFKeystoreWrapper(int i, char c, int i2) {
            String str;
            synchronized (AFf1zSDK.AFInAppEventParameterName) {
                try {
                    char[] cArr = new char[i2];
                    AFf1zSDK.valueOf = 0;
                    while (true) {
                        int i3 = AFf1zSDK.valueOf;
                        if (i3 < i2) {
                            cArr[i3] = (char) ((AFKeystoreWrapper[i + i3] ^ (i3 * valueOf)) ^ c);
                            AFf1zSDK.valueOf = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
    }

    private static String AFKeystoreWrapper(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, AFInAppEventParameterName(str2).charAt(0));
        String obj = sb.toString();
        int i2 = afInfoLog + 45;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
        return obj;
    }

    private static String valueOf(int i, short s, byte b, int i2, int i3) {
        String obj;
        synchronized (AFf1sSDK.afDebugLog) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = AFKeystoreWrapper;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = valueOf;
                    if (bArr != null) {
                        i5 = (byte) (bArr[AFInAppEventType + i3] + i4);
                    } else {
                        i5 = (short) (values[AFInAppEventType + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    AFf1sSDK.valueOf = ((i3 + i5) - 2) + AFInAppEventType + i6;
                    AFf1sSDK.values = b;
                    char c = (char) (i + AFInAppEventParameterName);
                    AFf1sSDK.AFInAppEventType = c;
                    sb.append(c);
                    AFf1sSDK.AFKeystoreWrapper = AFf1sSDK.AFInAppEventType;
                    AFf1sSDK.AFInAppEventParameterName = 1;
                    while (AFf1sSDK.AFInAppEventParameterName < i5) {
                        byte[] bArr2 = valueOf;
                        if (bArr2 != null) {
                            int i7 = AFf1sSDK.valueOf;
                            AFf1sSDK.valueOf = i7 - 1;
                            AFf1sSDK.AFInAppEventType = (char) (AFf1sSDK.AFKeystoreWrapper + (((byte) (bArr2[i7] + s)) ^ AFf1sSDK.values));
                        } else {
                            short[] sArr = values;
                            int i8 = AFf1sSDK.valueOf;
                            AFf1sSDK.valueOf = i8 - 1;
                            AFf1sSDK.AFInAppEventType = (char) (AFf1sSDK.AFKeystoreWrapper + (((short) (sArr[i8] + s)) ^ AFf1sSDK.values));
                        }
                        sb.append(AFf1sSDK.AFInAppEventType);
                        AFf1sSDK.AFKeystoreWrapper = AFf1sSDK.AFInAppEventType;
                        AFf1sSDK.AFInAppEventParameterName++;
                    }
                }
                obj = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    private static String AFKeystoreWrapper(String str) {
        int i = AFLogger + 43;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            String valueOf2 = AFb1sSDK.valueOf(AFb1sSDK.values(str));
            afInfoLog = (AFLogger + 1) % 128;
            return valueOf2;
        }
        AFb1sSDK.valueOf(AFb1sSDK.values(str));
        throw null;
    }

    private static String AFInAppEventParameterName(String str) {
        AFLogger = (afInfoLog + 33) % 128;
        String num = Integer.toString(Integer.parseInt(str, 2), 16);
        AFLogger = (afInfoLog + 63) % 128;
        return num;
    }

    private static String AFKeystoreWrapper(Context context) {
        afInfoLog = (AFLogger + 85) % 128;
        if (!System.getProperties().containsKey(valueOf(AndroidCharacter.getMirror('0') - 27623, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) Color.argb(0, 0, 0, 0), (-53) - TextUtils.indexOf((CharSequence) "", '0'), (-2062588510) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
            return null;
        }
        AFLogger = (afInfoLog + 105) % 128;
        try {
            Matcher matcher = Pattern.compile(AFInAppEventType(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 118, (char) (18618 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.resolveSize(0, 0) + 10).intern()).matcher(context.getCacheDir().getPath().replace(valueOf(KeyEvent.getDeadChar(0, 0) - 715484146, (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (-51) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-2062588497) - Color.argb(0, 0, 0, 0)).intern(), ""));
            if (!matcher.find()) {
                return null;
            }
            return matcher.group(1);
        } catch (Exception e) {
            AFb1oSDK AFInAppEventType2 = AFb1oSDK.AFInAppEventType();
            String intern = AFInAppEventType(View.getDefaultSize(0, 0) + 127, (char) View.MeasureSpec.getSize(0), (Process.myTid() >> 22) + 17).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf((ViewConfiguration.getPressedStateDuration() >> 16) - 715484123, (short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-52) - (ViewConfiguration.getTapTimeout() >> 16), (-2062588492) - MotionEvent.axisFromString("")).intern());
            sb.append(e);
            AFInAppEventType2.valueOf(intern, sb.toString());
            return null;
        }
    }
}
