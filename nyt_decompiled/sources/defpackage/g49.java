package defpackage;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import defpackage.ch3;
import defpackage.dh3;

/* loaded from: classes.dex */
public abstract class g49 {
    public static final dh3.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        tg tgVar = new tg(xmlResourceParser, 0, 2, null);
        ch3.a a = cm9.a(tgVar, resources, theme, asAttributeSet);
        int i2 = 0;
        while (!cm9.d(xmlResourceParser)) {
            i2 = cm9.g(tgVar, resources, asAttributeSet, theme, a, i2);
            xmlResourceParser.next();
        }
        return new dh3.a(a.f(), i);
    }
}
