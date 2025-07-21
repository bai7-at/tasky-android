package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import com.comscore.streaming.ContentType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFb1oSDK {
    private static AFb1oSDK AFInAppEventParameterName = null;
    private static int AFLogger = 870107318;
    private static short[] AFLogger$LogLevel = null;
    private static int AFVersionDeclaration = 0;
    private static int afDebugLog = 25;
    private static int afWarnLog = 98653129;
    private static byte[] getLevel = {-120, -15, -113, -26, 0};
    private static int init = 1;
    private List<String> AFKeystoreWrapper = new ArrayList();
    private boolean AFInAppEventType = true;

    @NonNull
    private final Map<String, Object> values = new HashMap();
    private String afErrorLog = "-1";
    private boolean afRDLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int valueOf = 0;
    private boolean afInfoLog = false;

    private AFb1oSDK() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName = new com.appsflyer.internal.AFb1oSDK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName == null) goto L9;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.AFb1oSDK AFInAppEventType() {
        /*
            int r0 = com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration
            int r0 = r0 + 1
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1oSDK.init = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L15
            com.appsflyer.internal.AFb1oSDK r0 = com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName
            r1 = 61
            int r1 = r1 / 0
            if (r0 != 0) goto L20
            goto L19
        L15:
            com.appsflyer.internal.AFb1oSDK r0 = com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName
            if (r0 != 0) goto L20
        L19:
            com.appsflyer.internal.AFb1oSDK r0 = new com.appsflyer.internal.AFb1oSDK
            r0.<init>()
            com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName = r0
        L20:
            com.appsflyer.internal.AFb1oSDK r0 = com.appsflyer.internal.AFb1oSDK.AFInAppEventParameterName
            int r1 = com.appsflyer.internal.AFb1oSDK.init
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L32
            r1 = 50
            int r1 = r1 / 0
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1oSDK.AFInAppEventType():com.appsflyer.internal.AFb1oSDK");
    }

    private synchronized void AFLogger() {
        this.AFKeystoreWrapper = new ArrayList();
        this.valueOf = 0;
        int i = AFVersionDeclaration + ContentType.USER_GENERATED_LIVE;
        init = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @NonNull
    private synchronized Map<String, Object> afDebugLog() {
        Map<String, Object> map;
        AFVersionDeclaration = (init + 107) % 128;
        this.values.put("data", this.AFKeystoreWrapper);
        AFLogger();
        map = this.values;
        AFVersionDeclaration = (init + 83) % 128;
        return map;
    }

    private boolean afInfoLog() {
        if (!this.afRDLog) {
            return false;
        }
        if (!this.AFInAppEventType) {
            init = (AFVersionDeclaration + ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND) % 128;
            if (!this.afInfoLog) {
                return false;
            }
        }
        int i = AFVersionDeclaration + 119;
        init = i % 128;
        if (i % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r9.length() > 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void values(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.values     // Catch: java.lang.Throwable -> Lb5
            int r1 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch: java.lang.Throwable -> Lb5
            int r1 = r1 >> 8
            int r1 = r1 + (-20)
            int r2 = android.view.ViewConfiguration.getTapTimeout()     // Catch: java.lang.Throwable -> Lb5
            int r2 = r2 >> 16
            r3 = -870107318(0xffffffffcc23374a, float:-4.278609E7)
            int r3 = r3 - r2
            int r2 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch: java.lang.Throwable -> Lb5
            int r2 = r2 >> 16
            int r2 = r2 + (-59)
            short r2 = (short) r2     // Catch: java.lang.Throwable -> Lb5
            int r4 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4 >> 16
            int r4 = (-69) - r4
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> Lb5
            int r5 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch: java.lang.Throwable -> Lb5
            int r5 = r5 >> 8
            r6 = -98653031(0xfffffffffa1eac99, float:-2.059709E35)
            int r6 = r6 - r5
            java.lang.String r1 = AFInAppEventParameterName(r1, r3, r2, r4, r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lb5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.values     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lb5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.values     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "platform"
            java.lang.String r2 = "Android"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.values     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "platform_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lb5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            if (r8 == 0) goto L73
            int r0 = r8.length()     // Catch: java.lang.Throwable -> Lb5
            if (r0 <= 0) goto L73
            int r0 = com.appsflyer.internal.AFb1oSDK.init     // Catch: java.lang.Throwable -> L71
            int r0 = r0 + 83
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration = r0     // Catch: java.lang.Throwable -> L71
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.values     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "advertiserId"
            r0.put(r1, r8)     // Catch: java.lang.Throwable -> Lb5
            goto L73
        L71:
            r8 = move-exception
            goto Lb1
        L73:
            if (r9 == 0) goto L99
            int r8 = com.appsflyer.internal.AFb1oSDK.init     // Catch: java.lang.Throwable -> L71
            int r8 = r8 + 99
            int r0 = r8 % 128
            com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration = r0     // Catch: java.lang.Throwable -> L71
            int r8 = r8 % 2
            if (r8 == 0) goto L8c
            int r8 = r9.length()     // Catch: java.lang.Throwable -> Lb5
            r0 = 77
            int r0 = r0 / 0
            if (r8 <= 0) goto L99
            goto L92
        L8c:
            int r8 = r9.length()     // Catch: java.lang.Throwable -> Lb5
            if (r8 <= 0) goto L99
        L92:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r7.values     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = "imei"
            r8.put(r0, r9)     // Catch: java.lang.Throwable -> Lb5
        L99:
            if (r10 == 0) goto Lb3
            int r8 = com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration     // Catch: java.lang.Throwable -> L71
            int r8 = r8 + 53
            int r8 = r8 % 128
            com.appsflyer.internal.AFb1oSDK.init = r8     // Catch: java.lang.Throwable -> L71
            int r8 = r10.length()     // Catch: java.lang.Throwable -> Lb5
            if (r8 <= 0) goto Lb3
            java.util.Map<java.lang.String, java.lang.Object> r8 = r7.values     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r9 = "android_id"
            r8.put(r9, r10)     // Catch: java.lang.Throwable -> Lb5
            goto Lb3
        Lb1:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            throw r8
        Lb3:
            monitor-exit(r7)
            return
        Lb5:
            monitor-exit(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1oSDK.values(java.lang.String, java.lang.String, java.lang.String):void");
    }

    final synchronized void AFInAppEventParameterName() {
        try {
            int i = AFVersionDeclaration + 25;
            init = i % 128;
            if (i % 2 == 0) {
                this.values.clear();
                AFInAppEventParameterName = null;
                throw null;
            }
            this.values.clear();
            AFInAppEventParameterName = null;
            int i2 = AFVersionDeclaration + 125;
            init = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    final synchronized void AFKeystoreWrapper(String str) {
        int i = (AFVersionDeclaration + 27) % 128;
        init = i;
        this.afErrorLog = str;
        AFVersionDeclaration = (i + 23) % 128;
    }

    final void afErrorLog() {
        int i = init + 83;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        this.afRDLog = false;
    }

    final boolean afRDLog() {
        int i = (init + 37) % 128;
        AFVersionDeclaration = i;
        boolean z = this.afInfoLog;
        init = (i + 107) % 128;
        return z;
    }

    final synchronized void valueOf() {
        values("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.afInfoLog = false;
        this.AFInAppEventType = false;
        int i = init + 3;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    final synchronized void AFKeystoreWrapper() {
        this.afInfoLog = true;
        values("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        init = (AFVersionDeclaration + 57) % 128;
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        int i = AFVersionDeclaration + 17;
        init = i % 128;
        try {
            if (i % 2 != 0) {
                if (str != null && str.length() > 0) {
                    this.values.put("app_id", str);
                }
                if (str2 != null && str2.length() > 0) {
                    int i2 = AFVersionDeclaration + 89;
                    init = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.values.put("app_version", str2);
                        throw null;
                    }
                    this.values.put("app_version", str2);
                }
                if (str3 != null) {
                    int i3 = init + 71;
                    AFVersionDeclaration = i3 % 128;
                    if (i3 % 2 == 0) {
                        if (str3.length() > 0) {
                            AFVersionDeclaration = (init + 39) % 128;
                            this.values.put(AppsFlyerProperties.CHANNEL, str3);
                        }
                    } else {
                        str3.length();
                        throw null;
                    }
                }
                if (str4 != null) {
                    AFVersionDeclaration = (init + 9) % 128;
                    if (str4.length() > 0) {
                        int i4 = AFVersionDeclaration + 57;
                        init = i4 % 128;
                        if (i4 % 2 == 0) {
                            this.values.put("preInstall", str4);
                            throw null;
                        }
                        this.values.put("preInstall", str4);
                    }
                }
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    public final void valueOf(String str, String str2) {
        init = (AFVersionDeclaration + 33) % 128;
        values((String) null, str, str2);
        int i = AFVersionDeclaration + 117;
        init = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static String AFInAppEventParameterName(int i, int i2, short s, byte b, int i3) {
        String obj;
        synchronized (AFf1sSDK.afDebugLog) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = afDebugLog;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = getLevel;
                    if (bArr != null) {
                        i5 = (byte) (bArr[AFLogger + i2] + i4);
                    } else {
                        i5 = (short) (AFLogger$LogLevel[AFLogger + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    AFf1sSDK.valueOf = ((i2 + i5) - 2) + AFLogger + i6;
                    AFf1sSDK.values = b;
                    char c = (char) (i3 + afWarnLog);
                    AFf1sSDK.AFInAppEventType = c;
                    sb.append(c);
                    AFf1sSDK.AFKeystoreWrapper = AFf1sSDK.AFInAppEventType;
                    AFf1sSDK.AFInAppEventParameterName = 1;
                    while (AFf1sSDK.AFInAppEventParameterName < i5) {
                        byte[] bArr2 = getLevel;
                        if (bArr2 != null) {
                            int i7 = AFf1sSDK.valueOf;
                            AFf1sSDK.valueOf = i7 - 1;
                            AFf1sSDK.AFInAppEventType = (char) (AFf1sSDK.AFKeystoreWrapper + (((byte) (bArr2[i7] + s)) ^ AFf1sSDK.values));
                        } else {
                            short[] sArr = AFLogger$LogLevel;
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

    final void AFInAppEventType(String str, PackageManager packageManager, AFc1xSDK aFc1xSDK) {
        try {
            AFKeystoreWrapper(str, packageManager, aFc1xSDK.AFLogger$LogLevel());
            AFd1sSDK aFd1sSDK = new AFd1sSDK(afDebugLog(), aFc1xSDK);
            AFc1lSDK afRDLog = aFc1xSDK.afRDLog();
            afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFd1sSDK));
            int i = init + 103;
            AFVersionDeclaration = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th);
        }
    }

    public final void AFInAppEventType(Throwable th) {
        StackTraceElement[] stackTrace;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            int i = init + 81;
            AFVersionDeclaration = i % 128;
            if (i % 2 == 0) {
                stackTrace = th.getStackTrace();
            } else {
                th.getStackTrace();
                throw null;
            }
        } else {
            stackTrace = cause.getStackTrace();
        }
        values("exception", simpleName, AFInAppEventType(message, stackTrace));
        AFVersionDeclaration = (init + 101) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r5.length() > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void values(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.values     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "sdk_version"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L28
            int r3 = com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 83
            int r0 = r3 % 128
            com.appsflyer.internal.AFb1oSDK.init = r0     // Catch: java.lang.Throwable -> L26
            int r3 = r3 % 2
            if (r3 == 0) goto L24
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L91
            if (r3 <= 0) goto L28
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.values     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "devkey"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L91
            goto L28
        L24:
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L91
        L26:
            r3 = move-exception
            goto L8f
        L28:
            if (r5 == 0) goto L56
            int r3 = com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 13
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1oSDK.init = r4     // Catch: java.lang.Throwable -> L26
            int r3 = r3 % 2
            if (r3 != 0) goto L41
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L91
            r4 = 80
            int r4 = r4 / 0
            if (r3 <= 0) goto L56
            goto L47
        L41:
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L91
            if (r3 <= 0) goto L56
        L47:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.values     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "originalAppsFlyerId"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L91
            int r3 = com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 45
            int r3 = r3 % 128
            com.appsflyer.internal.AFb1oSDK.init = r3     // Catch: java.lang.Throwable -> L26
        L56:
            if (r6 == 0) goto L85
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L91
            if (r3 <= 0) goto L85
            int r3 = com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 77
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1oSDK.init = r4     // Catch: java.lang.Throwable -> L26
            int r3 = r3 % 2
            if (r3 != 0) goto L76
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.values     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "uid"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L91
            r3 = 59
            int r3 = r3 / 0
            goto L7d
        L76:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.values     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "uid"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L91
        L7d:
            int r3 = com.appsflyer.internal.AFb1oSDK.init     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 35
            int r3 = r3 % 128
            com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration = r3     // Catch: java.lang.Throwable -> L26
        L85:
            int r3 = com.appsflyer.internal.AFb1oSDK.init     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 63
            int r3 = r3 % 128
            com.appsflyer.internal.AFb1oSDK.AFVersionDeclaration = r3     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)
            return
        L8f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r3
        L91:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1oSDK.values(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    final void AFKeystoreWrapper(String str, String... strArr) {
        init = (AFVersionDeclaration + 69) % 128;
        values("public_api_call", str, strArr);
        AFVersionDeclaration = (init + 21) % 128;
    }

    private static String[] AFInAppEventType(String str, StackTraceElement[] stackTraceElementArr) {
        int i = init;
        AFVersionDeclaration = (i + 95) % 128;
        if (stackTraceElementArr == null) {
            int i2 = i + 83;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 == 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        for (int i3 = 1; i3 < stackTraceElementArr.length; i3++) {
            strArr2[i3] = stackTraceElementArr[i3].toString();
        }
        init = (AFVersionDeclaration + 7) % 128;
        return strArr2;
    }

    private synchronized void AFKeystoreWrapper(String str, PackageManager packageManager, AFd1kSDK aFd1kSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.values.clear();
            if (string != null) {
                try {
                    this.values.putAll(AFa1pSDK.values(new JSONObject(string)));
                    AFVersionDeclaration = (init + ContentType.USER_GENERATED_LIVE) % 128;
                } catch (Throwable unused) {
                }
            } else {
                AFa1aSDK values = AFa1aSDK.values();
                values(appsFlyerProperties.getString("advertiserId"), aFd1kSDK.values, values.afErrorLog);
                StringBuilder sb = new StringBuilder("6.8.2.");
                sb.append(AFa1aSDK.AFInAppEventType);
                values(sb.toString(), values.AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    int i = packageManager.getPackageInfo(str, 0).versionCode;
                    AFKeystoreWrapper(str, String.valueOf(i), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.values).toString());
                init = (AFVersionDeclaration + 73) % 128;
            }
            this.values.put("launch_counter", this.afErrorLog);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void values(String str, String str2) {
        init = (AFVersionDeclaration + 9) % 128;
        values("server_request", str, str2);
        init = (AFVersionDeclaration + 59) % 128;
    }

    public final void values(String str, int i, String str2) {
        AFVersionDeclaration = (init + 125) % 128;
        values("server_response", str, String.valueOf(i), str2);
        int i2 = AFVersionDeclaration + 45;
        init = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private synchronized void values(String str, String str2, String... strArr) {
        String obj;
        AFVersionDeclaration = (init + 119) % 128;
        if (afInfoLog()) {
            int i = init + 81;
            AFVersionDeclaration = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (this.valueOf < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_6.8.2 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(join);
                        obj = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_6.8.2 ");
                        sb2.append(join);
                        obj = sb2.toString();
                    }
                    this.AFKeystoreWrapper.add(obj);
                    this.valueOf += obj.length() << 1;
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        AFVersionDeclaration = (init + 15) % 128;
    }

    final synchronized void values() {
        AFVersionDeclaration = (init + 65) % 128;
        this.AFInAppEventType = false;
        AFLogger();
        init = (AFVersionDeclaration + 63) % 128;
    }
}
