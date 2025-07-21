package com.caverock.androidsvg;

import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;

/* loaded from: classes2.dex */
public class c {
    CSSParser.n a = null;
    PreserveAspectRatio b = null;
    String c = null;
    SVG.b d = null;
    String e = null;
    SVG.b f = null;

    public c a(String str) {
        this.a = new CSSParser(CSSParser.Source.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        CSSParser.n nVar = this.a;
        return nVar != null && nVar.f() > 0;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.e != null;
    }

    public boolean f() {
        return this.d != null;
    }

    public boolean g() {
        return this.f != null;
    }

    public c h(float f, float f2, float f3, float f4) {
        this.f = new SVG.b(f, f2, f3, f4);
        return this;
    }
}
