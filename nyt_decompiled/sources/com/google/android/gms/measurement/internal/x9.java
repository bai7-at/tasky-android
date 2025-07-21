package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.chb;
import defpackage.lef;
import defpackage.p4f;
import defpackage.q3f;
import defpackage.s4f;
import defpackage.w2f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
public final class x9 extends v5 {
    private static final String[] g = {"firebase_", "google_", "ga_"};
    private static final String[] h = {"_err"};
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private Integer f;

    x9(a5 a5Var) {
        super(a5Var);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    static boolean V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(QueryKeys.END_MARKER);
    }

    static boolean W(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean X(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean Y(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return h0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean Z(String str) {
        return !h[0].equals(str);
    }

    static final boolean c0(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    static final boolean d0(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int e0(String str) {
        if ("_ldl".equals(str)) {
            this.a.y();
            return ProgressEvent.PART_COMPLETED_EVENT_CODE;
        }
        if (TransferTable.COLUMN_ID.equals(str)) {
            this.a.y();
            return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if ("_lgclid".equals(str)) {
            this.a.y();
            return 100;
        }
        this.a.y();
        return 36;
    }

    private final Object f0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return n(obj.toString(), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle t0 = t0((Bundle) parcelable);
                if (!t0.isEmpty()) {
                    arrayList.add(t0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean g0(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (lef.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static long p0(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    static MessageDigest s() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList u(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zzac zzacVar = (zzac) it2.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.zza);
            bundle.putString("origin", zzacVar.zzb);
            bundle.putLong("creation_timestamp", zzacVar.zzd);
            bundle.putString(AuthenticationTokenClaims.JSON_KEY_NAME, zzacVar.zzc.zzb);
            w2f.b(bundle, Preconditions.checkNotNull(zzacVar.zzc.t0()));
            bundle.putBoolean("active", zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.zzg;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.zza);
                zzau zzauVar = zzawVar.zzb;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.G0());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.zzh);
            zzaw zzawVar2 = zzacVar.zzi;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.zza);
                zzau zzauVar2 = zzawVar2.zzb;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.G0());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.zzc.zzc);
            bundle.putLong("time_to_live", zzacVar.zzj);
            zzaw zzawVar3 = zzacVar.zzk;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.zza);
                zzau zzauVar3 = zzawVar3.zzb;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.G0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void x(e7 e7Var, Bundle bundle, boolean z) {
        if (bundle != null && e7Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = e7Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = e7Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", e7Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && e7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    final void A(w9 w9Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        c0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        w9Var.a(str, "_err", bundle);
    }

    final void B(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.a.o().w().c("Not putting event parameter. Invalid value type. name, type", this.a.C().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void C(chb chbVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(QueryKeys.EXTERNAL_REFERRER, z);
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void D(chb chbVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(QueryKeys.EXTERNAL_REFERRER, arrayList);
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning bundle list to wrapper", e);
        }
    }

    public final void E(chb chbVar, Bundle bundle) {
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning bundle value to wrapper", e);
        }
    }

    public final void F(chb chbVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(QueryKeys.EXTERNAL_REFERRER, bArr);
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning byte array to wrapper", e);
        }
    }

    public final void G(chb chbVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(QueryKeys.EXTERNAL_REFERRER, i);
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning int value to wrapper", e);
        }
    }

    public final void H(chb chbVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(QueryKeys.EXTERNAL_REFERRER, j);
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning long value to wrapper", e);
        }
    }

    public final void I(chb chbVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(QueryKeys.EXTERNAL_REFERRER, str);
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning string value to wrapper", e);
        }
    }

    final void J(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int N;
        if (bundle == null) {
            return;
        }
        this.a.y();
        int i2 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int l0 = !z ? l0(str5) : 0;
                if (l0 == 0) {
                    l0 = k0(str5);
                }
                i = l0;
            } else {
                i = 0;
            }
            if (i != 0) {
                w(bundle, i, str5, str5, i == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (T(bundle.get(str5))) {
                    this.a.o().w().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    N = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    N = N(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (N != 0 && !"_ev".equals(str4)) {
                    w(bundle, N, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (W(str4) && !g0(str4, p4f.d) && (i2 = i2 + 1) > 0) {
                    this.a.o().r().c("Item cannot contain custom parameters", this.a.C().d(str2), this.a.C().b(bundle));
                    c0(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    final boolean K(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (d0(str)) {
                return true;
            }
            if (this.a.m()) {
                this.a.o().r().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", x3.y(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.a.m()) {
                this.a.o().r().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (d0(str2)) {
            return true;
        }
        this.a.o().r().b("Invalid admob_app_id. Analytics disabled.", x3.y(str2));
        return false;
    }

    final boolean L(String str, int i, String str2) {
        if (str2 == null) {
            this.a.o().r().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.a.o().r().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    final boolean M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.a.o().r().b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.a.o().r().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !g0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && g0(str2, strArr2)) {
            return true;
        }
        this.a.o().r().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int N(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.N(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    final boolean O(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.a.o().w().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    final boolean P(String str, String str2) {
        if (str2 == null) {
            this.a.o().r().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.o().r().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.a.o().r().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.a.o().r().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final boolean Q(String str, String str2) {
        if (str2 == null) {
            this.a.o().r().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.o().r().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.a.o().r().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.a.o().r().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final boolean R(String str) {
        c();
        if (Wrappers.packageManager(this.a.zzau()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.a.o().m().b("Permission not granted", str);
        return false;
    }

    final boolean S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String t = this.a.y().t();
        this.a.q();
        return t.equals(str);
    }

    final boolean T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final boolean U(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.a.o().n().b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.a.o().n().b("Error obtaining certificate", e2);
            return true;
        }
    }

    final boolean a0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    final byte[] b0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final void d() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.a.o().v().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean f() {
        return true;
    }

    final int i0(String str, Object obj) {
        return "_ldl".equals(str) ? O("user property referrer", str, e0(str), obj) : O("user property", str, e0(str), obj) ? 0 : 7;
    }

    final int j0(String str) {
        if (!P("event", str)) {
            return 2;
        }
        if (!M("event", q3f.a, q3f.b, str)) {
            return 13;
        }
        this.a.y();
        return !L("event", 40, str) ? 2 : 0;
    }

    final Object k(String str, Object obj) {
        boolean equals = "_ev".equals(str);
        int i = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        if (equals) {
            this.a.y();
            return f0(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, obj, true, true);
        }
        if (V(str)) {
            this.a.y();
        } else {
            this.a.y();
            i = 100;
        }
        return f0(i, obj, false, true);
    }

    final int k0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!M("event param", null, null, str)) {
            return 14;
        }
        this.a.y();
        return !L("event param", 40, str) ? 3 : 0;
    }

    final Object l(String str, Object obj) {
        return "_ldl".equals(str) ? f0(e0(str), obj, true, false) : f0(e0(str), obj, false, false);
    }

    final int l0(String str) {
        if (!Q("event param", str)) {
            return 3;
        }
        if (!M("event param", null, null, str)) {
            return 14;
        }
        this.a.y();
        return !L("event param", 40, str) ? 3 : 0;
    }

    final String m() {
        byte[] bArr = new byte[16];
        t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final int m0(String str) {
        if (!P("user property", str)) {
            return 6;
        }
        if (!M("user property", s4f.a, null, str)) {
            return 15;
        }
        this.a.y();
        return !L("user property", 24, str) ? 6 : 0;
    }

    public final String n(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final int n0() {
        if (this.f == null) {
            this.f = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.a.zzau()) / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        }
        return this.f.intValue();
    }

    public final int o0(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.a.zzau(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long q0() {
        long andIncrement;
        long j;
        if (this.d.get() != 0) {
            synchronized (this.d) {
                this.d.compareAndSet(-1L, 1L);
                andIncrement = this.d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.d) {
            long nextLong = new Random(System.nanoTime() ^ this.a.p().currentTimeMillis()).nextLong();
            int i = this.e + 1;
            this.e = i;
            j = nextLong + i;
        }
        return j;
    }

    public final URL r(long j, String str, String str2, long j2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 64000L, Integer.valueOf(n0())), str2, str, Long.valueOf(j2));
            if (str.equals(this.a.y().u())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.a.o().n().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long r0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    final Bundle s0(Uri uri, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str2 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str4 = uri.getQueryParameter("utm_medium");
                    str5 = uri.getQueryParameter("gclid");
                    if (z) {
                        str6 = uri.getQueryParameter("utm_id");
                        str7 = uri.getQueryParameter("dclid");
                    } else {
                        str6 = null;
                        str7 = null;
                    }
                    str = z2 ? uri.getQueryParameter("srsltid") : null;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && ((!z || (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7))) && (!z2 || TextUtils.isEmpty(str)))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("campaign", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("medium", str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (z) {
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("campaign_id", str6);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString("dclid", str7);
                    }
                    String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("source_platform", queryParameter6);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("creative_format", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("marketing_tactic", queryParameter8);
                    }
                }
                if (z2 && !TextUtils.isEmpty(str)) {
                    bundle.putString("srsltid", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.a.o().v().b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    final SecureRandom t() {
        c();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    final Bundle t0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object k = k(str, bundle.get(str));
                if (k == null) {
                    this.a.o().w().b("Param value can't be null", this.a.C().e(str));
                } else {
                    B(bundle2, str, k);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.os.Bundle u0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.u0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    final void v(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.a.o().v().b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    final zzaw v0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (j0(str2) != 0) {
            this.a.o().n().b("Invalid conditional property event name", this.a.C().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle u0 = u0(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            u0 = t0(u0);
        }
        Preconditions.checkNotNull(u0);
        return new zzaw(str2, new zzau(u0), str3, j);
    }

    final void w(Bundle bundle, int i, String str, String str2, Object obj) {
        if (c0(bundle, i)) {
            this.a.y();
            bundle.putString("_ev", n(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final void y(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.a.M().B(bundle, str, bundle2.get(str));
            }
        }
    }

    final void z(y3 y3Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(y3Var.d.keySet())) {
            if (W(str) && (i2 = i2 + 1) > i) {
                this.a.o().r().c("Event can't contain more than " + i + " params", this.a.C().d(y3Var.a), this.a.C().b(y3Var.d));
                c0(y3Var.d, 5);
                y3Var.d.remove(str);
            }
        }
    }
}
