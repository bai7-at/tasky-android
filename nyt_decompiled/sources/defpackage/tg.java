package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class tg {
    private final XmlPullParser a;
    private int b;

    public tg(XmlPullParser xmlPullParser, int i) {
        this.a = xmlPullParser;
        this.b = i;
    }

    private final void l(int i) {
        this.b = i | this.b;
    }

    public final float a(TypedArray typedArray, int i, float f) {
        float dimension = typedArray.getDimension(i, f);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i, float f) {
        float f2 = typedArray.getFloat(i, f);
        l(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int c(TypedArray typedArray, int i, int i2) {
        int i3 = typedArray.getInt(i, i2);
        l(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean d(TypedArray typedArray, String str, int i, boolean z) {
        boolean e = nu8.e(typedArray, this.a, str, i, z);
        l(typedArray.getChangingConfigurations());
        return e;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        ColorStateList g = nu8.g(typedArray, this.a, theme, str, i);
        l(typedArray.getChangingConfigurations());
        return g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return zq3.c(this.a, tgVar.a) && this.b == tgVar.b;
    }

    public final iq0 f(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        iq0 i3 = nu8.i(typedArray, this.a, theme, str, i, i2);
        l(typedArray.getChangingConfigurations());
        return i3;
    }

    public final float g(TypedArray typedArray, String str, int i, float f) {
        float j = nu8.j(typedArray, this.a, str, i, f);
        l(typedArray.getChangingConfigurations());
        return j;
    }

    public final int h(TypedArray typedArray, String str, int i, int i2) {
        int k = nu8.k(typedArray, this.a, str, i, i2);
        l(typedArray.getChangingConfigurations());
        return k;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public final String i(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray q = nu8.q(resources, theme, attributeSet, iArr);
        l(q.getChangingConfigurations());
        return q;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.b + ')';
    }

    public /* synthetic */ tg(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
