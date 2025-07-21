package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
abstract class o13 {
    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray q = nu8.q(resources, theme, attributeSet, zn6.GradientColor);
        float j = nu8.j(q, xmlPullParser, "startX", zn6.GradientColor_android_startX, 0.0f);
        float j2 = nu8.j(q, xmlPullParser, "startY", zn6.GradientColor_android_startY, 0.0f);
        float j3 = nu8.j(q, xmlPullParser, "endX", zn6.GradientColor_android_endX, 0.0f);
        float j4 = nu8.j(q, xmlPullParser, "endY", zn6.GradientColor_android_endY, 0.0f);
        float j5 = nu8.j(q, xmlPullParser, "centerX", zn6.GradientColor_android_centerX, 0.0f);
        float j6 = nu8.j(q, xmlPullParser, "centerY", zn6.GradientColor_android_centerY, 0.0f);
        int k = nu8.k(q, xmlPullParser, TransferTable.COLUMN_TYPE, zn6.GradientColor_android_type, 0);
        int f = nu8.f(q, xmlPullParser, "startColor", zn6.GradientColor_android_startColor, 0);
        boolean p = nu8.p(xmlPullParser, "centerColor");
        int f2 = nu8.f(q, xmlPullParser, "centerColor", zn6.GradientColor_android_centerColor, 0);
        int f3 = nu8.f(q, xmlPullParser, "endColor", zn6.GradientColor_android_endColor, 0);
        int k2 = nu8.k(q, xmlPullParser, "tileMode", zn6.GradientColor_android_tileMode, 0);
        float j7 = nu8.j(q, xmlPullParser, "gradientRadius", zn6.GradientColor_android_gradientRadius, 0.0f);
        q.recycle();
        a a2 = a(c(resources, xmlPullParser, attributeSet, theme), f, f3, p, f2);
        if (k != 1) {
            return k != 2 ? new LinearGradient(j, j2, j3, j4, a2.a, a2.b, d(k2)) : new SweepGradient(j5, j6, a2.a, a2.b);
        }
        if (j7 > 0.0f) {
            return new RadialGradient(j5, j6, j7, a2.a, a2.b, d(k2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static o13.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = defpackage.zn6.GradientColorItem
            android.content.res.TypedArray r3 = defpackage.nu8.q(r8, r11, r10, r3)
            int r5 = defpackage.zn6.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = defpackage.zn6.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = defpackage.zn6.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = defpackage.zn6.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            o13$a r8 = new o13$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o13.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o13$a");
    }

    private static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    static final class a {
        final int[] a;
        final float[] b;

        a(List list, List list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = ((Integer) list.get(i)).intValue();
                this.b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
