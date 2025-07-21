package org.jsoup.parser;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Tag;
import defpackage.a95;
import defpackage.u29;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class f implements Cloneable {
    private static final Map j = new HashMap();
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] r;
    private static final String[] s;
    private static final String[] t;
    private String a;
    private String b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    static {
        String[] strArr = {AssetConstants.HTML, "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", Tag.H4, "h5", "h6", "ul", "ol", "pre", "div", Tag.BLOCK_QUOTE, "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", AssetConstants.VIDEO_TYPE, AssetConstants.AUDIO_TYPE, "canvas", "details", "menu", "plaintext", "template", AssetConstants.ARTICLE_TYPE, "main", "svg", "math", "center"};
        k = strArr;
        l = new String[]{"object", "base", "font", "tt", QueryKeys.VIEW_TITLE, "b", QueryKeys.USER_ID, "big", "small", Tag.EM, Tag.STRONG, "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", Tag.A, "img", "br", "wbr", "map", "q", "sub", Tag.SUP, "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};
        m = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        n = new String[]{"title", Tag.A, "p", "h1", "h2", "h3", Tag.H4, "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        r = new String[]{"pre", "plaintext", "title", "textarea"};
        s = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        t = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (String str : strArr) {
            m(new f(str));
        }
        for (String str2 : l) {
            f fVar = new f(str2);
            fVar.c = false;
            fVar.d = false;
            m(fVar);
        }
        for (String str3 : m) {
            f fVar2 = (f) j.get(str3);
            u29.i(fVar2);
            fVar2.e = true;
        }
        for (String str4 : n) {
            f fVar3 = (f) j.get(str4);
            u29.i(fVar3);
            fVar3.d = false;
        }
        for (String str5 : r) {
            f fVar4 = (f) j.get(str5);
            u29.i(fVar4);
            fVar4.g = true;
        }
        for (String str6 : s) {
            f fVar5 = (f) j.get(str6);
            u29.i(fVar5);
            fVar5.h = true;
        }
        for (String str7 : t) {
            f fVar6 = (f) j.get(str7);
            u29.i(fVar6);
            fVar6.i = true;
        }
    }

    private f(String str) {
        this.a = str;
        this.b = a95.a(str);
    }

    private static void m(f fVar) {
        j.put(fVar.a, fVar);
    }

    public static f o(String str) {
        return p(str, d.d);
    }

    public static f p(String str, d dVar) {
        u29.i(str);
        Map map = j;
        f fVar = (f) map.get(str);
        if (fVar != null) {
            return fVar;
        }
        String c = dVar.c(str);
        u29.g(c);
        String a = a95.a(c);
        f fVar2 = (f) map.get(a);
        if (fVar2 == null) {
            f fVar3 = new f(c);
            fVar3.c = false;
            return fVar3;
        }
        if (!dVar.e() || c.equals(a)) {
            return fVar2;
        }
        f clone = fVar2.clone();
        clone.a = c;
        return clone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.e == fVar.e && this.d == fVar.d && this.c == fVar.c && this.g == fVar.g && this.f == fVar.f && this.h == fVar.h && this.i == fVar.i;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return !this.c;
    }

    public boolean h() {
        return j.containsKey(this.a);
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public boolean i() {
        return this.e || this.f;
    }

    public String k() {
        return this.b;
    }

    public boolean l() {
        return this.g;
    }

    f n() {
        this.f = true;
        return this;
    }

    public String toString() {
        return this.a;
    }
}
