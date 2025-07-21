package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ao3 {
    public static final ao3 a = new ao3();
    private static final char[] b;
    public static final int c;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        zq3.g(charArray, "toCharArray(...)");
        b = charArray;
        c = 8;
    }

    private ao3() {
    }

    private final String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = b;
            cArr[i2] = cArr2[b2 >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static final String b(Bundle bundle) {
        zq3.h(bundle, "bundle");
        Parcel obtain = Parcel.obtain();
        zq3.g(obtain, "obtain(...)");
        bundle.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        ao3 ao3Var = a;
        zq3.e(marshall);
        String a2 = ao3Var.a(marshall);
        obtain.recycle();
        return a2;
    }

    public static final String c(Intent intent) {
        String arrays;
        zq3.h(intent, "intent");
        StringBuilder sb = new StringBuilder();
        sb.append("action: ");
        sb.append(intent.getAction());
        sb.append("; data: ");
        sb.append(intent.getDataString());
        sb.append("; category: ");
        Set<String> categories = intent.getCategories();
        String str = Constants.NULL_VERSION_ID;
        if (categories == null) {
            arrays = Constants.NULL_VERSION_ID;
        } else {
            Set<String> categories2 = intent.getCategories();
            zq3.g(categories2, "getCategories(...)");
            arrays = Arrays.toString(categories2.toArray(new String[0]));
        }
        sb.append(arrays);
        sb.append("; type: ");
        sb.append(intent.getType());
        sb.append("; component: ");
        if (intent.getComponent() != null) {
            ComponentName component = intent.getComponent();
            zq3.e(component);
            str = component.toString();
            zq3.g(str, "toString(...)");
        }
        sb.append(str);
        sb.append("; extras: ");
        sb.append(d(intent.getExtras()));
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public static final String d(Bundle bundle) {
        if (bundle == null) {
            return Constants.NULL_VERSION_ID;
        }
        try {
            String bundle2 = bundle.toString();
            zq3.e(bundle2);
            return bundle2;
        } catch (RuntimeException unused) {
            return "exception getting extras";
        }
    }
}
