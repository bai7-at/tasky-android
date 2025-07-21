package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ch3;
import defpackage.np5;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class cm9 {
    private static final int a = 0;

    public static final ch3.a a(tg tgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long g;
        int z;
        ug ugVar = ug.a;
        TypedArray k = tgVar.k(resources, theme, attributeSet, ugVar.F());
        boolean d = tgVar.d(k, "autoMirrored", ugVar.a(), false);
        float g2 = tgVar.g(k, "viewportWidth", ugVar.H(), 0.0f);
        float g3 = tgVar.g(k, "viewportHeight", ugVar.G(), 0.0f);
        if (g2 <= 0.0f) {
            throw new XmlPullParserException(k.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (g3 <= 0.0f) {
            throw new XmlPullParserException(k.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float a2 = tgVar.a(k, ugVar.I(), 0.0f);
        float a3 = tgVar.a(k, ugVar.n(), 0.0f);
        if (k.hasValue(ugVar.D())) {
            TypedValue typedValue = new TypedValue();
            k.getValue(ugVar.D(), typedValue);
            if (typedValue.type == 2) {
                g = nn0.b.g();
            } else {
                ColorStateList e = tgVar.e(k, theme, "tint", ugVar.D());
                g = e != null ? wn0.b(e.getDefaultColor()) : nn0.b.g();
            }
        } else {
            g = nn0.b.g();
        }
        long j = g;
        int c = tgVar.c(k, ugVar.E(), -1);
        if (c == -1) {
            z = b90.a.z();
        } else if (c == 3) {
            z = b90.a.B();
        } else if (c == 5) {
            z = b90.a.z();
        } else if (c != 9) {
            switch (c) {
                case 14:
                    z = b90.a.q();
                    break;
                case 15:
                    z = b90.a.v();
                    break;
                case 16:
                    z = b90.a.t();
                    break;
                default:
                    z = b90.a.z();
                    break;
            }
        } else {
            z = b90.a.y();
        }
        int i = z;
        float g4 = bu1.g(a2 / resources.getDisplayMetrics().density);
        float g5 = bu1.g(a3 / resources.getDisplayMetrics().density);
        k.recycle();
        return new ch3.a(null, g4, g5, g2, g3, j, i, d, 1, null);
    }

    private static final int b(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : v48.a.c() : v48.a.b() : v48.a.a();
    }

    private static final int c(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : x48.a.a() : x48.a.c() : x48.a.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final yc0 e(iq0 iq0Var) {
        if (!iq0Var.l()) {
            return null;
        }
        Shader f = iq0Var.f();
        return f != null ? zc0.a(f) : new ox7(wn0.b(iq0Var.e()), null);
    }

    public static final void f(tg tgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ch3.a aVar) {
        ug ugVar = ug.a;
        TypedArray k = tgVar.k(resources, theme, attributeSet, ugVar.b());
        String i = tgVar.i(k, ugVar.c());
        if (i == null) {
            i = "";
        }
        List a2 = c49.a(tgVar.i(k, ugVar.d()));
        k.recycle();
        aVar.a((r20 & 1) != 0 ? "" : i, (r20 & 2) != 0 ? 0.0f : 0.0f, (r20 & 4) != 0 ? 0.0f : 0.0f, (r20 & 8) != 0 ? 0.0f : 0.0f, (r20 & 16) != 0 ? 1.0f : 0.0f, (r20 & 32) == 0 ? 0.0f : 1.0f, (r20 & 64) != 0 ? 0.0f : 0.0f, (r20 & 128) == 0 ? 0.0f : 0.0f, (r20 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c49.e() : a2);
    }

    public static final int g(tg tgVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ch3.a aVar, int i) {
        int eventType = tgVar.j().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !zq3.c("group", tgVar.j().getName())) {
                return i;
            }
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                aVar.g();
            }
            return 0;
        }
        String name = tgVar.j().getName();
        if (name == null) {
            return i;
        }
        int hashCode = name.hashCode();
        if (hashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i;
            }
            f(tgVar, resources, theme, attributeSet, aVar);
            return i + 1;
        }
        if (hashCode == 3433509) {
            if (!name.equals("path")) {
                return i;
            }
            i(tgVar, resources, theme, attributeSet, aVar);
            return i;
        }
        if (hashCode != 98629247 || !name.equals("group")) {
            return i;
        }
        h(tgVar, resources, theme, attributeSet, aVar);
        return i;
    }

    public static final void h(tg tgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ch3.a aVar) {
        ug ugVar = ug.a;
        TypedArray k = tgVar.k(resources, theme, attributeSet, ugVar.e());
        float g = tgVar.g(k, "rotation", ugVar.i(), 0.0f);
        float b = tgVar.b(k, ugVar.g(), 0.0f);
        float b2 = tgVar.b(k, ugVar.h(), 0.0f);
        float g2 = tgVar.g(k, "scaleX", ugVar.j(), 1.0f);
        float g3 = tgVar.g(k, "scaleY", ugVar.k(), 1.0f);
        float g4 = tgVar.g(k, "translateX", ugVar.l(), 0.0f);
        float g5 = tgVar.g(k, "translateY", ugVar.m(), 0.0f);
        String i = tgVar.i(k, ugVar.f());
        if (i == null) {
            i = "";
        }
        k.recycle();
        aVar.a(i, g, b, b2, g2, g3, g4, g5, c49.e());
    }

    public static final void i(tg tgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ch3.a aVar) {
        ug ugVar = ug.a;
        TypedArray k = tgVar.k(resources, theme, attributeSet, ugVar.o());
        if (!nu8.p(tgVar.j(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String i = tgVar.i(k, ugVar.r());
        if (i == null) {
            i = "";
        }
        String str = i;
        List a2 = c49.a(tgVar.i(k, ugVar.s()));
        iq0 f = tgVar.f(k, theme, "fillColor", ugVar.q(), 0);
        float g = tgVar.g(k, "fillAlpha", ugVar.p(), 1.0f);
        int b = b(tgVar.h(k, "strokeLineCap", ugVar.v(), -1), v48.a.a());
        int c = c(tgVar.h(k, "strokeLineJoin", ugVar.w(), -1), x48.a.a());
        float g2 = tgVar.g(k, "strokeMiterLimit", ugVar.x(), 1.0f);
        iq0 f2 = tgVar.f(k, theme, "strokeColor", ugVar.u(), 0);
        float g3 = tgVar.g(k, "strokeAlpha", ugVar.t(), 1.0f);
        float g4 = tgVar.g(k, "strokeWidth", ugVar.y(), 1.0f);
        float g5 = tgVar.g(k, "trimPathEnd", ugVar.z(), 1.0f);
        float g6 = tgVar.g(k, "trimPathOffset", ugVar.B(), 0.0f);
        float g7 = tgVar.g(k, "trimPathStart", ugVar.C(), 0.0f);
        int h = tgVar.h(k, "fillType", ugVar.A(), a);
        k.recycle();
        yc0 e = e(f);
        yc0 e2 = e(f2);
        np5.a aVar2 = np5.a;
        aVar.c(a2, h == 0 ? aVar2.b() : aVar2.a(), str, e, g, e2, g3, g4, b, c, g2, g7, g5, g6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
