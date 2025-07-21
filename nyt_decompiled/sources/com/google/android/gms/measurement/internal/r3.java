package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.fmd;
import defpackage.p4f;
import defpackage.q3f;
import defpackage.s4f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r3 {
    protected static final AtomicReference b = new AtomicReference();
    protected static final AtomicReference c = new AtomicReference();
    protected static final AtomicReference d = new AtomicReference();
    private final fmd a;

    public r3(fmd fmdVar) {
        this.a = fmdVar;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String b2 = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (b2 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String c(zzaw zzawVar) {
        if (!this.a.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzawVar.zzc);
        sb.append(",name=");
        sb.append(d(zzawVar.zza));
        sb.append(",params=");
        zzau zzauVar = zzawVar.zzb;
        sb.append(zzauVar == null ? null : !this.a.zza() ? zzauVar.toString() : b(zzauVar.G0()));
        return sb.toString();
    }

    protected final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.zza() ? str : g(str, q3f.c, q3f.a, b);
    }

    protected final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.zza() ? str : g(str, p4f.b, p4f.a, c);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, s4f.b, s4f.a, d);
        }
        return "experiment_id(" + str + ")";
    }
}
