package org.jsoup.nodes;

import com.facebook.AuthenticationTokenClaims;
import defpackage.o48;
import defpackage.u29;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class f extends h {
    public f(String str, String str2, String str3) {
        u29.i(str);
        u29.i(str2);
        u29.i(str3);
        d(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        d("publicId", str2);
        d("systemId", str3);
        Y();
    }

    private boolean W(String str) {
        return !o48.f(c(str));
    }

    private void Y() {
        if (W("publicId")) {
            d("pubSysKey", "PUBLIC");
        } else if (W("systemId")) {
            d("pubSysKey", "SYSTEM");
        }
    }

    @Override // org.jsoup.nodes.i
    void A(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public void X(String str) {
        if (str != null) {
            d("pubSysKey", str);
        }
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ String c(String str) {
        return super.c(str);
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ i d(String str, String str2) {
        return super.d(str, str2);
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ String f() {
        return super.f();
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ int i() {
        return super.i();
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ i o() {
        return super.o();
    }

    @Override // org.jsoup.nodes.h, org.jsoup.nodes.i
    public /* bridge */ /* synthetic */ boolean q(String str) {
        return super.q(str);
    }

    @Override // org.jsoup.nodes.i
    public String v() {
        return "#doctype";
    }

    @Override // org.jsoup.nodes.i
    void z(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        if (outputSettings.k() != Document.OutputSettings.Syntax.html || W("publicId") || W("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (W(AuthenticationTokenClaims.JSON_KEY_NAME)) {
            appendable.append(" ").append(c(AuthenticationTokenClaims.JSON_KEY_NAME));
        }
        if (W("pubSysKey")) {
            appendable.append(" ").append(c("pubSysKey"));
        }
        if (W("publicId")) {
            appendable.append(" \"").append(c("publicId")).append('\"');
        }
        if (W("systemId")) {
            appendable.append(" \"").append(c("systemId")).append('\"');
        }
        appendable.append('>');
    }
}
