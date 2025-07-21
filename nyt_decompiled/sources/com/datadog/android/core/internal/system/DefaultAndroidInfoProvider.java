package com.datadog.android.core.internal.system;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.datadog.android.api.context.DeviceType;
import defpackage.c04;
import defpackage.jf;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class DefaultAndroidInfoProvider implements jf {
    public static final a j = new a(null);
    private final c04 a;
    private final c04 b;
    private final c04 c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final c04 h;
    private final c04 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.software.leanback") || packageManager.hasSystemFeature("com.google.android.tv");
        }

        private final boolean c(String str, Context context) {
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            boolean z = false;
            if (h.P(lowerCase, "phone", false, 2, null)) {
                return true;
            }
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                z = true;
            }
            return !z;
        }

        private final boolean d(String str, Context context) {
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            return h.P(lowerCase, "tablet", false, 2, null) || h.P(lowerCase, "sm-t", false, 2, null) || context.getResources().getConfiguration().smallestScreenWidthDp >= 800;
        }

        private final boolean e(Context context) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            zq3.g(packageManager, "appContext.packageManager");
            return b(packageManager);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeviceType f(String str, Context context) {
            return e(context) ? DeviceType.TV : d(str, context) ? DeviceType.TABLET : c(str, context) ? DeviceType.MOBILE : DeviceType.OTHER;
        }

        private a() {
        }
    }

    public DefaultAndroidInfoProvider(final Context context, final String str, final String str2, String str3, String str4) {
        zq3.h(context, "appContext");
        zq3.h(str, "rawDeviceBrand");
        zq3.h(str2, "rawDeviceModel");
        zq3.h(str3, "rawDeviceId");
        zq3.h(str4, "rawOsVersion");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.a = c.b(lazyThreadSafetyMode, new qs2() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DeviceType mo865invoke() {
                DeviceType f;
                f = DefaultAndroidInfoProvider.j.f(str2, context);
                return f;
            }
        });
        this.b = c.b(lazyThreadSafetyMode, new qs2() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceName$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                if (h.d0(DefaultAndroidInfoProvider.this.d())) {
                    return DefaultAndroidInfoProvider.this.b();
                }
                if (h.P(DefaultAndroidInfoProvider.this.b(), DefaultAndroidInfoProvider.this.d(), false, 2, null)) {
                    return DefaultAndroidInfoProvider.this.b();
                }
                return DefaultAndroidInfoProvider.this.d() + " " + DefaultAndroidInfoProvider.this.b();
            }
        });
        this.c = c.b(lazyThreadSafetyMode, new qs2() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceBrand$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String valueOf;
                String str5 = str;
                if (str5.length() <= 0) {
                    return str5;
                }
                StringBuilder sb = new StringBuilder();
                char charAt = str5.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    Locale locale = Locale.US;
                    zq3.g(locale, "US");
                    valueOf = a.d(charAt, locale);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb.append((Object) valueOf);
                String substring = str5.substring(1);
                zq3.g(substring, "substring(...)");
                sb.append(substring);
                return sb.toString();
            }
        });
        this.d = str2;
        this.e = str3;
        this.f = "Android";
        this.g = str4;
        this.h = c.b(lazyThreadSafetyMode, new qs2() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$osMajorVersion$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return (String) i.k0(h.E0(DefaultAndroidInfoProvider.this.getOsVersion(), new char[]{'.'}, false, 0, 6, null));
            }
        });
        this.i = c.b(lazyThreadSafetyMode, new qs2() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$architecture$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String property = System.getProperty("os.arch");
                return property == null ? DatasetUtils.UNKNOWN_IDENTITY_ID : property;
            }
        });
    }

    @Override // defpackage.jf
    public String a() {
        return this.e;
    }

    @Override // defpackage.jf
    public String b() {
        return this.d;
    }

    @Override // defpackage.jf
    public DeviceType c() {
        return (DeviceType) this.a.getValue();
    }

    @Override // defpackage.jf
    public String d() {
        return (String) this.c.getValue();
    }

    @Override // defpackage.jf
    public String e() {
        return (String) this.h.getValue();
    }

    @Override // defpackage.jf
    public String f() {
        return (String) this.b.getValue();
    }

    @Override // defpackage.jf
    public String g() {
        return this.f;
    }

    @Override // defpackage.jf
    public String getArchitecture() {
        return (String) this.i.getValue();
    }

    @Override // defpackage.jf
    public String getOsVersion() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DefaultAndroidInfoProvider(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "appContext"
            defpackage.zq3.h(r9, r0)
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            r4 = r1
            goto Le
        Ld:
            r4 = r0
        Le:
            java.lang.String r0 = android.os.Build.MODEL
            if (r0 != 0) goto L14
            r5 = r1
            goto L15
        L14:
            r5 = r0
        L15:
            java.lang.String r0 = android.os.Build.ID
            if (r0 != 0) goto L1b
            r6 = r1
            goto L1c
        L1b:
            r6 = r0
        L1c:
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            if (r0 != 0) goto L22
            r7 = r1
            goto L23
        L22:
            r7 = r0
        L23:
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.<init>(android.content.Context):void");
    }
}
