package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.internal.icing.a2;
import com.google.android.gms.internal.icing.b1;
import com.google.android.gms.internal.icing.c2;
import com.google.android.gms.internal.icing.p1;
import com.google.android.gms.internal.icing.q1;
import com.google.android.gms.internal.icing.r1;
import com.google.android.gms.internal.icing.s1;
import com.google.android.gms.internal.icing.t1;
import com.google.android.gms.internal.icing.u1;
import com.google.android.gms.internal.icing.zzk;
import com.google.android.gms.internal.icing.zzx;

/* loaded from: classes3.dex */
public abstract class az9 {
    public static zzx a(u3 u3Var, long j, String str, int i) {
        String str2;
        Uri uri;
        String str3;
        String str4;
        int i2;
        Bundle bundle = new Bundle();
        bundle.putAll(u3Var.a());
        Bundle bundle2 = bundle.getBundle("object");
        if (bundle2 != null) {
            String string = bundle2.getString("id");
            uri = string != null ? Uri.parse(string) : null;
            str3 = bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
            str4 = bundle2.getString(TransferTable.COLUMN_TYPE);
            str2 = bundle2.getString("url");
        } else {
            str2 = null;
            uri = null;
            str3 = null;
            str4 = null;
        }
        Intent d = g5a.d(str, str2 != null ? Uri.parse(str2) : null);
        b1 G0 = zzx.G0(d, str3, uri, str4, null);
        byte[] byteArray = bundle.getByteArray(".private:ssbContext");
        if (byteArray != null) {
            G0.a(zzk.t0(byteArray));
            bundle.remove(".private:ssbContext");
        }
        String string2 = bundle.getString(".private:accountName");
        if (string2 != null) {
            G0.d(new Account(string2, AccountType.GOOGLE));
            bundle.remove(".private:accountName");
        }
        boolean z = false;
        if (bundle.containsKey(".private:isContextOnly") && bundle.getBoolean(".private:isContextOnly")) {
            bundle.remove(".private:isContextOnly");
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (bundle.containsKey(".private:isDeviceOnly")) {
            z = bundle.getBoolean(".private:isDeviceOnly", false);
            bundle.remove(".private:isDeviceOnly");
        }
        s1 b = b(bundle);
        a2 a2Var = new a2(".private:action");
        a2Var.b(true);
        a2Var.d(".private:action");
        a2Var.a("blob");
        G0.a(new zzk(b.b(), a2Var.e()));
        c2 c2Var = new c2();
        c2Var.a(zzx.t0(str, d));
        c2Var.b(j);
        c2Var.c(i2);
        c2Var.d(G0.e());
        c2Var.e(z);
        c2Var.f(i);
        return c2Var.g();
    }

    public static s1 b(Bundle bundle) {
        r1 o = s1.o();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                t1 o2 = u1.o();
                o2.l((String) obj);
                u1 u1Var = (u1) o2.g();
                p1 o3 = q1.o();
                o3.i(str);
                o3.l(u1Var);
                o.l((q1) o3.g());
            } else if (obj instanceof Bundle) {
                t1 o4 = u1.o();
                o4.m(b((Bundle) obj));
                u1 u1Var2 = (u1) o4.g();
                p1 o5 = q1.o();
                o5.i(str);
                o5.l(u1Var2);
                o.l((q1) o5.g());
            } else {
                int i = 0;
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    int length = strArr.length;
                    while (i < length) {
                        String str2 = strArr[i];
                        if (str2 != null) {
                            t1 o6 = u1.o();
                            o6.l(str2);
                            u1 u1Var3 = (u1) o6.g();
                            p1 o7 = q1.o();
                            o7.i(str);
                            o7.l(u1Var3);
                            o.l((q1) o7.g());
                        }
                        i++;
                    }
                } else if (obj instanceof Bundle[]) {
                    Bundle[] bundleArr = (Bundle[]) obj;
                    int length2 = bundleArr.length;
                    while (i < length2) {
                        Bundle bundle2 = bundleArr[i];
                        if (bundle2 != null) {
                            t1 o8 = u1.o();
                            o8.m(b(bundle2));
                            u1 u1Var4 = (u1) o8.g();
                            p1 o9 = q1.o();
                            o9.i(str);
                            o9.l(u1Var4);
                            o.l((q1) o9.g());
                        }
                        i++;
                    }
                } else if (obj instanceof Boolean) {
                    t1 o10 = u1.o();
                    o10.i(((Boolean) obj).booleanValue());
                    u1 u1Var5 = (u1) o10.g();
                    p1 o11 = q1.o();
                    o11.i(str);
                    o11.l(u1Var5);
                    o.l((q1) o11.g());
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                    sb.append("Unsupported value: ");
                    sb.append(valueOf);
                    Log.e("SearchIndex", sb.toString());
                }
            }
        }
        String string = bundle.getString(TransferTable.COLUMN_TYPE);
        if (string != null) {
            o.i(string);
        }
        return (s1) o.g();
    }
}
