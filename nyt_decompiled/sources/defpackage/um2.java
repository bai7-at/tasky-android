package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.comscore.streaming.WindowState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class um2 {

    static class a {
        static int a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public interface b {
    }

    public static final class c implements b {
        private final d[] a;

        public c(d[] dVarArr) {
            this.a = dVarArr;
        }

        public d[] a() {
            return this.a;
        }
    }

    public static final class d {
        private final String a;
        private final int b;
        private final boolean c;
        private final String d;
        private final int e;
        private final int f;

        public d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public int a() {
            return this.f;
        }

        public int b() {
            return this.e;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }

        public boolean e() {
            return this.c;
        }
    }

    public static final class e implements b {
        private final sm2 a;
        private final int b;
        private final int c;
        private final String d;

        public e(sm2 sm2Var, int i, int i2, String str) {
            this.a = sm2Var;
            this.c = i;
            this.b = i2;
            this.d = str;
        }

        public int a() {
            return this.c;
        }

        public sm2 b() {
            return this.a;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        return a.a(typedArray, i);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), zn6.FontFamily);
        String string = obtainAttributes.getString(zn6.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(zn6.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(zn6.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(zn6.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(zn6.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(zn6.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(zn6.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new sm2(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), zn6.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(zn6.FontFamilyFont_fontWeight) ? zn6.FontFamilyFont_fontWeight : zn6.FontFamilyFont_android_fontWeight, WindowState.NORMAL);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(zn6.FontFamilyFont_fontStyle) ? zn6.FontFamilyFont_fontStyle : zn6.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(zn6.FontFamilyFont_ttcIndex) ? zn6.FontFamilyFont_ttcIndex : zn6.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(zn6.FontFamilyFont_fontVariationSettings) ? zn6.FontFamilyFont_fontVariationSettings : zn6.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(zn6.FontFamilyFont_font) ? zn6.FontFamilyFont_font : zn6.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i, z, string, i3, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
