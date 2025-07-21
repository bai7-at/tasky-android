package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public final class w5g {
    private final s7[] a;
    private final String b;

    public w5g(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, ln6.AdsAttrs);
        String string = obtainAttributes.getString(ln6.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(ln6.AdsAttrs_adSizes);
        boolean isEmpty = TextUtils.isEmpty(string);
        boolean isEmpty2 = TextUtils.isEmpty(string2);
        if (!isEmpty && isEmpty2) {
            this.a = c(string);
        } else {
            if (!isEmpty || isEmpty2) {
                if (isEmpty) {
                    obtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.a = c(string2);
        }
        String string3 = obtainAttributes.getString(ln6.AdsAttrs_adUnitId);
        this.b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static s7[] c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        s7[] s7VarArr = new s7[length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    s7VarArr[i] = new s7("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                s7VarArr[i] = s7.i;
            } else if ("LARGE_BANNER".equals(trim)) {
                s7VarArr[i] = s7.k;
            } else if ("FULL_BANNER".equals(trim)) {
                s7VarArr[i] = s7.j;
            } else if ("LEADERBOARD".equals(trim)) {
                s7VarArr[i] = s7.l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                s7VarArr[i] = s7.m;
            } else if ("SMART_BANNER".equals(trim)) {
                s7VarArr[i] = s7.o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                s7VarArr[i] = s7.n;
            } else if ("FLUID".equals(trim)) {
                s7VarArr[i] = s7.p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
                s7VarArr[i] = s7.s;
            }
        }
        if (length != 0) {
            return s7VarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.b;
    }

    public final s7[] b(boolean z) {
        if (z || this.a.length == 1) {
            return this.a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
