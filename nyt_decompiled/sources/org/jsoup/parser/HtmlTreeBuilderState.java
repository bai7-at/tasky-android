package org.jsoup.parser;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.appsflyer.oaid.BuildConfig;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.EventType;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Tag;
import defpackage.bp2;
import defpackage.o48;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.i;
import org.jsoup.parser.Token;

/* loaded from: classes5.dex */
enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.h()) {
                bVar.P(token.b());
            } else {
                if (!token.i()) {
                    bVar.C0(HtmlTreeBuilderState.BeforeHtml);
                    return bVar.f(token);
                }
                Token.e c = token.c();
                org.jsoup.nodes.f fVar = new org.jsoup.nodes.f(bVar.h.c(c.p()), c.r(), c.s());
                fVar.X(c.q());
                bVar.x().V(fVar);
                if (c.t()) {
                    bVar.x().R0(Document.QuirksMode.quirks);
                }
                bVar.C0(HtmlTreeBuilderState.BeforeHtml);
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        private boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            bVar.W(AssetConstants.HTML);
            bVar.C0(HtmlTreeBuilderState.BeforeHead);
            return bVar.f(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.i()) {
                bVar.q(this);
                return false;
            }
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
                return true;
            }
            if (token.l() && token.e().D().equals(AssetConstants.HTML)) {
                bVar.M(token.e());
                bVar.C0(HtmlTreeBuilderState.BeforeHead);
                return true;
            }
            if ((!token.k() || !o48.d(token.d().D(), b.e)) && token.k()) {
                bVar.q(this);
                return false;
            }
            return anythingElse(token, bVar);
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
                return true;
            }
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (token.i()) {
                bVar.q(this);
                return false;
            }
            if (token.l() && token.e().D().equals(AssetConstants.HTML)) {
                return HtmlTreeBuilderState.InBody.process(token, bVar);
            }
            if (token.l() && token.e().D().equals("head")) {
                bVar.A0(bVar.M(token.e()));
                bVar.C0(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (token.k() && o48.d(token.d().D(), b.e)) {
                bVar.h("head");
                return bVar.f(token);
            }
            if (token.k()) {
                bVar.q(this);
                return false;
            }
            bVar.h("head");
            return bVar.f(token);
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        private boolean anythingElse(Token token, h hVar) {
            hVar.g("head");
            return hVar.f(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
                return true;
            }
            int i = a.a[token.a.ordinal()];
            if (i == 1) {
                bVar.P(token.b());
            } else {
                if (i == 2) {
                    bVar.q(this);
                    return false;
                }
                if (i == 3) {
                    Token.h e = token.e();
                    String D = e.D();
                    if (D.equals(AssetConstants.HTML)) {
                        return HtmlTreeBuilderState.InBody.process(token, bVar);
                    }
                    if (o48.d(D, b.a)) {
                        Element Q = bVar.Q(e);
                        if (D.equals("base") && Q.q(Tag.HREF)) {
                            bVar.f0(Q);
                        }
                    } else if (D.equals("meta")) {
                        bVar.Q(e);
                    } else if (D.equals("title")) {
                        HtmlTreeBuilderState.handleRcData(e, bVar);
                    } else if (o48.d(D, b.b)) {
                        HtmlTreeBuilderState.handleRawtext(e, bVar);
                    } else if (D.equals("noscript")) {
                        bVar.M(e);
                        bVar.C0(HtmlTreeBuilderState.InHeadNoscript);
                    } else {
                        if (!D.equals("script")) {
                            if (!D.equals("head")) {
                                return anythingElse(token, bVar);
                            }
                            bVar.q(this);
                            return false;
                        }
                        bVar.c.v(TokeniserState.ScriptData);
                        bVar.e0();
                        bVar.C0(HtmlTreeBuilderState.Text);
                        bVar.M(e);
                    }
                } else {
                    if (i != 4) {
                        return anythingElse(token, bVar);
                    }
                    String D2 = token.d().D();
                    if (!D2.equals("head")) {
                        if (o48.d(D2, b.c)) {
                            return anythingElse(token, bVar);
                        }
                        bVar.q(this);
                        return false;
                    }
                    bVar.j0();
                    bVar.C0(HtmlTreeBuilderState.AfterHead);
                }
            }
            return true;
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        private boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            bVar.q(this);
            bVar.O(new Token.c().p(token.toString()));
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.i()) {
                bVar.q(this);
                return true;
            }
            if (token.l() && token.e().D().equals(AssetConstants.HTML)) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.k() && token.d().D().equals("noscript")) {
                bVar.j0();
                bVar.C0(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token) || token.h() || (token.l() && o48.d(token.e().D(), b.f))) {
                return bVar.n0(token, HtmlTreeBuilderState.InHead);
            }
            if (token.k() && token.d().D().equals("br")) {
                return anythingElse(token, bVar);
            }
            if ((!token.l() || !o48.d(token.e().D(), b.K)) && !token.k()) {
                return anythingElse(token, bVar);
            }
            bVar.q(this);
            return false;
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        private boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            bVar.h("body");
            bVar.r(true);
            return bVar.f(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
                return true;
            }
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (token.i()) {
                bVar.q(this);
                return true;
            }
            if (!token.l()) {
                if (!token.k()) {
                    anythingElse(token, bVar);
                    return true;
                }
                if (o48.d(token.d().D(), b.d)) {
                    anythingElse(token, bVar);
                    return true;
                }
                bVar.q(this);
                return false;
            }
            Token.h e = token.e();
            String D = e.D();
            if (D.equals(AssetConstants.HTML)) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            if (D.equals("body")) {
                bVar.M(e);
                bVar.r(false);
                bVar.C0(HtmlTreeBuilderState.InBody);
                return true;
            }
            if (D.equals("frameset")) {
                bVar.M(e);
                bVar.C0(HtmlTreeBuilderState.InFrameset);
                return true;
            }
            if (!o48.d(D, b.g)) {
                if (D.equals("head")) {
                    bVar.q(this);
                    return false;
                }
                anythingElse(token, bVar);
                return true;
            }
            bVar.q(this);
            Element A = bVar.A();
            bVar.o0(A);
            bVar.n0(token, HtmlTreeBuilderState.InHead);
            bVar.s0(A);
            return true;
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        private boolean inBodyEndTag(Token token, org.jsoup.parser.b bVar) {
            Token.g d;
            String D;
            d = token.d();
            D = d.D();
            D.hashCode();
            switch (D) {
                case "p":
                    if (!bVar.D(D)) {
                        bVar.q(this);
                        bVar.h(D);
                        return bVar.f(d);
                    }
                    bVar.u(D);
                    if (!bVar.a().v0().equals(D)) {
                        bVar.q(this);
                    }
                    bVar.l0(D);
                    return true;
                case "br":
                    bVar.q(this);
                    bVar.h("br");
                    return false;
                case "dd":
                case "dt":
                    if (!bVar.F(D)) {
                        bVar.q(this);
                        return false;
                    }
                    bVar.u(D);
                    if (!bVar.a().v0().equals(D)) {
                        bVar.q(this);
                    }
                    bVar.l0(D);
                    return true;
                case "h1":
                case "h2":
                case "h3":
                case "h4":
                case "h5":
                case "h6":
                    String[] strArr = b.i;
                    if (!bVar.H(strArr)) {
                        bVar.q(this);
                        return false;
                    }
                    bVar.u(D);
                    if (!bVar.a().v0().equals(D)) {
                        bVar.q(this);
                    }
                    bVar.m0(strArr);
                    return true;
                case "li":
                    if (!bVar.E(D)) {
                        bVar.q(this);
                        return false;
                    }
                    bVar.u(D);
                    if (!bVar.a().v0().equals(D)) {
                        bVar.q(this);
                    }
                    bVar.l0(D);
                    return true;
                case "body":
                    if (bVar.F("body")) {
                        bVar.C0(HtmlTreeBuilderState.AfterBody);
                        return true;
                    }
                    bVar.q(this);
                    return false;
                case "form":
                    bp2 y = bVar.y();
                    bVar.y0(null);
                    if (y == null || !bVar.F(D)) {
                        bVar.q(this);
                        return false;
                    }
                    bVar.t();
                    if (!bVar.a().v0().equals(D)) {
                        bVar.q(this);
                    }
                    bVar.s0(y);
                    return true;
                case "html":
                    if (bVar.g("body")) {
                        return bVar.f(d);
                    }
                    return true;
                case "span":
                case "sarcasm":
                    return anyOtherEndTag(token, bVar);
                default:
                    if (o48.d(D, b.s)) {
                        return inBodyEndTagAdoption(token, bVar);
                    }
                    if (o48.d(D, b.r)) {
                        if (!bVar.F(D)) {
                            bVar.q(this);
                            return false;
                        }
                        bVar.t();
                        if (!bVar.a().v0().equals(D)) {
                            bVar.q(this);
                        }
                        bVar.l0(D);
                    } else {
                        if (!o48.d(D, b.m)) {
                            return anyOtherEndTag(token, bVar);
                        }
                        if (!bVar.F(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                            if (!bVar.F(D)) {
                                bVar.q(this);
                                return false;
                            }
                            bVar.t();
                            if (!bVar.a().v0().equals(D)) {
                                bVar.q(this);
                            }
                            bVar.l0(D);
                            bVar.l();
                        }
                    }
                    return true;
            }
        }

        private boolean inBodyEndTagAdoption(Token token, org.jsoup.parser.b bVar) {
            String D = token.d().D();
            ArrayList C = bVar.C();
            for (int i = 0; i < 8; i++) {
                Element v = bVar.v(D);
                if (v == null) {
                    return anyOtherEndTag(token, bVar);
                }
                if (!bVar.h0(v)) {
                    bVar.q(this);
                    bVar.r0(v);
                    return true;
                }
                if (!bVar.F(v.v0())) {
                    bVar.q(this);
                    return false;
                }
                if (bVar.a() != v) {
                    bVar.q(this);
                }
                int size = C.size();
                Element element = null;
                int i2 = 0;
                boolean z = false;
                Element element2 = null;
                while (true) {
                    if (i2 >= size || i2 >= 64) {
                        break;
                    }
                    Element element3 = (Element) C.get(i2);
                    if (element3 == v) {
                        element2 = (Element) C.get(i2 - 1);
                        z = true;
                    } else if (z && bVar.c0(element3)) {
                        element = element3;
                        break;
                    }
                    i2++;
                }
                if (element == null) {
                    bVar.l0(v.v0());
                    bVar.r0(v);
                    return true;
                }
                Element element4 = element;
                Element element5 = element4;
                for (int i3 = 0; i3 < 3; i3++) {
                    if (bVar.h0(element4)) {
                        element4 = bVar.k(element4);
                    }
                    if (!bVar.a0(element4)) {
                        bVar.s0(element4);
                    } else {
                        if (element4 == v) {
                            break;
                        }
                        Element element6 = new Element(f.p(element4.v(), d.d), bVar.w());
                        bVar.u0(element4, element6);
                        bVar.w0(element4, element6);
                        if (element5.D() != null) {
                            element5.H();
                        }
                        element6.V(element5);
                        element4 = element6;
                        element5 = element4;
                    }
                }
                if (o48.d(element2.v0(), b.t)) {
                    if (element5.D() != null) {
                        element5.H();
                    }
                    bVar.S(element5);
                } else {
                    if (element5.D() != null) {
                        element5.H();
                    }
                    element2.V(element5);
                }
                Element element7 = new Element(v.F0(), bVar.w());
                element7.e().g(v.e());
                for (i iVar : (i[]) element.k().toArray(new i[0])) {
                    element7.V(iVar);
                }
                element.V(element7);
                bVar.r0(v);
                bVar.s0(v);
                bVar.V(element, element7);
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private boolean inBodyStartTag(Token token, org.jsoup.parser.b bVar) {
            char c;
            Token.h e = token.e();
            String D = e.D();
            D.hashCode();
            switch (D.hashCode()) {
                case -1644953643:
                    if (D.equals("frameset")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1377687758:
                    if (D.equals("button")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1191214428:
                    if (D.equals("iframe")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1010136971:
                    if (D.equals("option")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1003243718:
                    if (D.equals("textarea")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -906021636:
                    if (D.equals("select")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -80773204:
                    if (D.equals("optgroup")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 97:
                    if (D.equals(Tag.A)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3200:
                    if (D.equals("dd")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3216:
                    if (D.equals("dt")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3273:
                    if (D.equals("h1")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3274:
                    if (D.equals("h2")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 3275:
                    if (D.equals("h3")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 3276:
                    if (D.equals(Tag.H4)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 3277:
                    if (D.equals("h5")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 3278:
                    if (D.equals("h6")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3338:
                    if (D.equals("hr")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 3453:
                    if (D.equals("li")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 3646:
                    if (D.equals("rp")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3650:
                    if (D.equals("rt")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 111267:
                    if (D.equals("pre")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 114276:
                    if (D.equals("svg")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 118811:
                    if (D.equals("xmp")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029410:
                    if (D.equals("body")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3148996:
                    if (D.equals("form")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 3213227:
                    if (D.equals(AssetConstants.HTML)) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 3344136:
                    if (D.equals("math")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 3386833:
                    if (D.equals("nobr")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536714:
                    if (D.equals("span")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 100313435:
                    if (D.equals(AssetConstants.IMAGE_TYPE)) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 100358090:
                    if (D.equals("input")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 110115790:
                    if (D.equals("table")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 181975684:
                    if (D.equals("listing")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 1973234167:
                    if (D.equals("plaintext")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 2091304424:
                    if (D.equals("isindex")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 2115613112:
                    if (D.equals("noembed")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    bVar.q(this);
                    ArrayList C = bVar.C();
                    if (C.size() == 1 || ((C.size() > 2 && !((Element) C.get(1)).v0().equals("body")) || !bVar.s())) {
                        return false;
                    }
                    Element element = (Element) C.get(1);
                    if (element.D() != null) {
                        element.H();
                    }
                    while (C.size() > 1) {
                        C.remove(C.size() - 1);
                    }
                    bVar.M(e);
                    bVar.C0(HtmlTreeBuilderState.InFrameset);
                    return true;
                case 1:
                    if (bVar.D("button")) {
                        bVar.q(this);
                        bVar.g("button");
                        bVar.f(e);
                    } else {
                        bVar.q0();
                        bVar.M(e);
                        bVar.r(false);
                    }
                    return true;
                case 2:
                    bVar.r(false);
                    HtmlTreeBuilderState.handleRawtext(e, bVar);
                    return true;
                case 3:
                case 6:
                    if (bVar.a().v0().equals("option")) {
                        bVar.g("option");
                    }
                    bVar.q0();
                    bVar.M(e);
                    return true;
                case 4:
                    bVar.M(e);
                    if (!e.z()) {
                        bVar.c.v(TokeniserState.Rcdata);
                        bVar.e0();
                        bVar.r(false);
                        bVar.C0(HtmlTreeBuilderState.Text);
                    }
                    return true;
                case 5:
                    bVar.q0();
                    bVar.M(e);
                    bVar.r(false);
                    HtmlTreeBuilderState B0 = bVar.B0();
                    if (B0.equals(HtmlTreeBuilderState.InTable) || B0.equals(HtmlTreeBuilderState.InCaption) || B0.equals(HtmlTreeBuilderState.InTableBody) || B0.equals(HtmlTreeBuilderState.InRow) || B0.equals(HtmlTreeBuilderState.InCell)) {
                        bVar.C0(HtmlTreeBuilderState.InSelectInTable);
                    } else {
                        bVar.C0(HtmlTreeBuilderState.InSelect);
                    }
                    return true;
                case 7:
                    if (bVar.v(Tag.A) != null) {
                        bVar.q(this);
                        bVar.g(Tag.A);
                        Element z = bVar.z(Tag.A);
                        if (z != null) {
                            bVar.r0(z);
                            bVar.s0(z);
                        }
                    }
                    bVar.q0();
                    bVar.p0(bVar.M(e));
                    return true;
                case '\b':
                case '\t':
                    bVar.r(false);
                    ArrayList C2 = bVar.C();
                    int size = C2.size() - 1;
                    while (true) {
                        if (size > 0) {
                            Element element2 = (Element) C2.get(size);
                            if (o48.d(element2.v0(), b.k)) {
                                bVar.g(element2.v0());
                            } else if (!bVar.c0(element2) || o48.d(element2.v0(), b.j)) {
                                size--;
                            }
                        }
                    }
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.M(e);
                    return true;
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    if (o48.d(bVar.a().v0(), b.i)) {
                        bVar.q(this);
                        bVar.j0();
                    }
                    bVar.M(e);
                    return true;
                case 16:
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.Q(e);
                    bVar.r(false);
                    return true;
                case 17:
                    bVar.r(false);
                    ArrayList C3 = bVar.C();
                    int size2 = C3.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            Element element3 = (Element) C3.get(size2);
                            if (element3.v0().equals("li")) {
                                bVar.g("li");
                            } else if (!bVar.c0(element3) || o48.d(element3.v0(), b.j)) {
                                size2--;
                            }
                        }
                    }
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.M(e);
                    return true;
                case 18:
                case 19:
                    if (bVar.F("ruby")) {
                        bVar.t();
                        if (!bVar.a().v0().equals("ruby")) {
                            bVar.q(this);
                            bVar.k0("ruby");
                        }
                        bVar.M(e);
                    }
                    return true;
                case 20:
                case ' ':
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.M(e);
                    bVar.b.w("\n");
                    bVar.r(false);
                    return true;
                case 21:
                    bVar.q0();
                    bVar.M(e);
                    return true;
                case 22:
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.q0();
                    bVar.r(false);
                    HtmlTreeBuilderState.handleRawtext(e, bVar);
                    return true;
                case 23:
                    bVar.q(this);
                    ArrayList C4 = bVar.C();
                    if (C4.size() == 1 || (C4.size() > 2 && !((Element) C4.get(1)).v0().equals("body"))) {
                        return false;
                    }
                    bVar.r(false);
                    Element element4 = (Element) C4.get(1);
                    Iterator it2 = e.y().iterator();
                    while (it2.hasNext()) {
                        org.jsoup.nodes.a aVar = (org.jsoup.nodes.a) it2.next();
                        if (!element4.q(aVar.getKey())) {
                            element4.e().I(aVar);
                        }
                    }
                    return true;
                case 24:
                    if (bVar.y() != null) {
                        bVar.q(this);
                        return false;
                    }
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.R(e, true);
                    return true;
                case EventType.SUBS /* 25 */:
                    bVar.q(this);
                    Element element5 = (Element) bVar.C().get(0);
                    Iterator it3 = e.y().iterator();
                    while (it3.hasNext()) {
                        org.jsoup.nodes.a aVar2 = (org.jsoup.nodes.a) it3.next();
                        if (!element5.q(aVar2.getKey())) {
                            element5.e().I(aVar2);
                        }
                    }
                    return true;
                case EventType.CDN /* 26 */:
                    bVar.q0();
                    bVar.M(e);
                    return true;
                case 27:
                    bVar.q0();
                    if (bVar.F("nobr")) {
                        bVar.q(this);
                        bVar.g("nobr");
                        bVar.q0();
                    }
                    bVar.p0(bVar.M(e));
                    return true;
                case 28:
                    bVar.q0();
                    bVar.M(e);
                    return true;
                case BuildConfig.VERSION_CODE /* 29 */:
                    if (bVar.z("svg") == null) {
                        return bVar.f(e.B("img"));
                    }
                    bVar.M(e);
                    return true;
                case 30:
                    bVar.q0();
                    if (!bVar.Q(e).c(TransferTable.COLUMN_TYPE).equalsIgnoreCase("hidden")) {
                        bVar.r(false);
                    }
                    return true;
                case 31:
                    if (bVar.x().Q0() != Document.QuirksMode.quirks && bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.M(e);
                    bVar.r(false);
                    bVar.C0(HtmlTreeBuilderState.InTable);
                    return true;
                case '!':
                    if (bVar.D("p")) {
                        bVar.g("p");
                    }
                    bVar.M(e);
                    bVar.c.v(TokeniserState.PLAINTEXT);
                    return true;
                case '\"':
                    bVar.q(this);
                    if (bVar.y() != null) {
                        return false;
                    }
                    bVar.h("form");
                    if (e.j.w("action")) {
                        bVar.y().Y("action", e.j.u("action"));
                    }
                    bVar.h("hr");
                    bVar.h("label");
                    bVar.f(new Token.c().p(e.j.w("prompt") ? e.j.u("prompt") : "This is a searchable index. Enter search keywords: "));
                    org.jsoup.nodes.b bVar2 = new org.jsoup.nodes.b();
                    Iterator it4 = e.j.iterator();
                    while (it4.hasNext()) {
                        org.jsoup.nodes.a aVar3 = (org.jsoup.nodes.a) it4.next();
                        if (!o48.d(aVar3.getKey(), b.p)) {
                            bVar2.I(aVar3);
                        }
                    }
                    bVar2.H(AuthenticationTokenClaims.JSON_KEY_NAME, "isindex");
                    bVar.i("input", bVar2);
                    bVar.g("label");
                    bVar.h("hr");
                    bVar.g("form");
                    return true;
                case '#':
                    HtmlTreeBuilderState.handleRawtext(e, bVar);
                    return true;
                default:
                    if (o48.d(D, b.n)) {
                        bVar.q0();
                        bVar.Q(e);
                        bVar.r(false);
                    } else if (o48.d(D, b.h)) {
                        if (bVar.D("p")) {
                            bVar.g("p");
                        }
                        bVar.M(e);
                    } else {
                        if (o48.d(D, b.g)) {
                            return bVar.n0(token, HtmlTreeBuilderState.InHead);
                        }
                        if (o48.d(D, b.l)) {
                            bVar.q0();
                            bVar.p0(bVar.M(e));
                        } else if (o48.d(D, b.m)) {
                            bVar.q0();
                            bVar.M(e);
                            bVar.T();
                            bVar.r(false);
                        } else if (o48.d(D, b.o)) {
                            bVar.Q(e);
                        } else {
                            if (o48.d(D, b.q)) {
                                bVar.q(this);
                                return false;
                            }
                            bVar.q0();
                            bVar.M(e);
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean anyOtherEndTag(org.jsoup.parser.Token r6, org.jsoup.parser.b r7) {
            /*
                r5 = this;
                org.jsoup.parser.Token$g r6 = r6.d()
                java.lang.String r6 = r6.c
                java.util.ArrayList r0 = r7.C()
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L10:
                if (r1 < 0) goto L48
                java.lang.Object r3 = r0.get(r1)
                org.jsoup.nodes.Element r3 = (org.jsoup.nodes.Element) r3
                java.lang.String r4 = r3.v0()
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L3a
                r7.u(r6)
                org.jsoup.nodes.Element r0 = r7.a()
                java.lang.String r0 = r0.v0()
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L36
                r7.q(r5)
            L36:
                r7.l0(r6)
                goto L48
            L3a:
                boolean r3 = r7.c0(r3)
                if (r3 == 0) goto L45
                r7.q(r5)
                r5 = 0
                return r5
            L45:
                int r1 = r1 + (-1)
                goto L10
            L48:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.AnonymousClass7.anyOtherEndTag(org.jsoup.parser.Token, org.jsoup.parser.b):boolean");
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            int i = a.a[token.a.ordinal()];
            if (i == 1) {
                bVar.P(token.b());
            } else {
                if (i == 2) {
                    bVar.q(this);
                    return false;
                }
                if (i == 3) {
                    return inBodyStartTag(token, bVar);
                }
                if (i == 4) {
                    return inBodyEndTag(token, bVar);
                }
                if (i == 5) {
                    Token.c a = token.a();
                    if (a.q().equals(HtmlTreeBuilderState.nullString)) {
                        bVar.q(this);
                        return false;
                    }
                    if (bVar.s() && HtmlTreeBuilderState.isWhitespace(a)) {
                        bVar.q0();
                        bVar.O(a);
                    } else {
                        bVar.q0();
                        bVar.O(a);
                        bVar.r(false);
                    }
                }
            }
            return true;
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.g()) {
                bVar.O(token.a());
                return true;
            }
            if (token.j()) {
                bVar.q(this);
                bVar.j0();
                bVar.C0(bVar.i0());
                return bVar.f(token);
            }
            if (!token.k()) {
                return true;
            }
            bVar.j0();
            bVar.C0(bVar.i0());
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            bVar.q(this);
            if (!o48.d(bVar.a().v0(), b.C)) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            bVar.z0(true);
            boolean n0 = bVar.n0(token, HtmlTreeBuilderState.InBody);
            bVar.z0(false);
            return n0;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.g()) {
                bVar.g0();
                bVar.e0();
                bVar.C0(HtmlTreeBuilderState.InTableText);
                return bVar.f(token);
            }
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (token.i()) {
                bVar.q(this);
                return false;
            }
            if (!token.l()) {
                if (!token.k()) {
                    if (!token.j()) {
                        return anythingElse(token, bVar);
                    }
                    if (bVar.a().v0().equals(AssetConstants.HTML)) {
                        bVar.q(this);
                    }
                    return true;
                }
                String D = token.d().D();
                if (!D.equals("table")) {
                    if (!o48.d(D, b.B)) {
                        return anythingElse(token, bVar);
                    }
                    bVar.q(this);
                    return false;
                }
                if (!bVar.L(D)) {
                    bVar.q(this);
                    return false;
                }
                bVar.l0("table");
                bVar.x0();
                return true;
            }
            Token.h e = token.e();
            String D2 = e.D();
            if (D2.equals("caption")) {
                bVar.o();
                bVar.T();
                bVar.M(e);
                bVar.C0(HtmlTreeBuilderState.InCaption);
            } else if (D2.equals("colgroup")) {
                bVar.o();
                bVar.M(e);
                bVar.C0(HtmlTreeBuilderState.InColumnGroup);
            } else {
                if (D2.equals("col")) {
                    bVar.h("colgroup");
                    return bVar.f(token);
                }
                if (o48.d(D2, b.u)) {
                    bVar.o();
                    bVar.M(e);
                    bVar.C0(HtmlTreeBuilderState.InTableBody);
                } else {
                    if (o48.d(D2, b.v)) {
                        bVar.h("tbody");
                        return bVar.f(token);
                    }
                    if (D2.equals("table")) {
                        bVar.q(this);
                        if (bVar.g("table")) {
                            return bVar.f(token);
                        }
                    } else {
                        if (o48.d(D2, b.w)) {
                            return bVar.n0(token, HtmlTreeBuilderState.InHead);
                        }
                        if (D2.equals("input")) {
                            if (!e.j.u(TransferTable.COLUMN_TYPE).equalsIgnoreCase("hidden")) {
                                return anythingElse(token, bVar);
                            }
                            bVar.Q(e);
                        } else {
                            if (!D2.equals("form")) {
                                return anythingElse(token, bVar);
                            }
                            bVar.q(this);
                            if (bVar.y() != null) {
                                return false;
                            }
                            bVar.R(e, false);
                        }
                    }
                }
            }
            return true;
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.a == Token.TokenType.Character) {
                Token.c a = token.a();
                if (a.q().equals(HtmlTreeBuilderState.nullString)) {
                    bVar.q(this);
                    return false;
                }
                bVar.B().add(a.q());
                return true;
            }
            if (bVar.B().size() > 0) {
                for (String str : bVar.B()) {
                    if (HtmlTreeBuilderState.isWhitespace(str)) {
                        bVar.O(new Token.c().p(str));
                    } else {
                        bVar.q(this);
                        if (o48.d(bVar.a().v0(), b.C)) {
                            bVar.z0(true);
                            bVar.n0(new Token.c().p(str), HtmlTreeBuilderState.InBody);
                            bVar.z0(false);
                        } else {
                            bVar.n0(new Token.c().p(str), HtmlTreeBuilderState.InBody);
                        }
                    }
                }
                bVar.g0();
            }
            bVar.C0(bVar.i0());
            return bVar.f(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.k() && token.d().D().equals("caption")) {
                if (!bVar.L(token.d().D())) {
                    bVar.q(this);
                    return false;
                }
                bVar.t();
                if (!bVar.a().v0().equals("caption")) {
                    bVar.q(this);
                }
                bVar.l0("caption");
                bVar.l();
                bVar.C0(HtmlTreeBuilderState.InTable);
                return true;
            }
            if ((token.l() && o48.d(token.e().D(), b.A)) || (token.k() && token.d().D().equals("table"))) {
                bVar.q(this);
                if (bVar.g("caption")) {
                    return bVar.f(token);
                }
                return true;
            }
            if (!token.k() || !o48.d(token.d().D(), b.L)) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            bVar.q(this);
            return false;
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        private boolean anythingElse(Token token, h hVar) {
            if (hVar.g("colgroup")) {
                return hVar.f(token);
            }
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
                return true;
            }
            int i = a.a[token.a.ordinal()];
            if (i == 1) {
                bVar.P(token.b());
            } else if (i == 2) {
                bVar.q(this);
            } else if (i == 3) {
                Token.h e = token.e();
                String D = e.D();
                D.hashCode();
                if (!D.equals("col")) {
                    return !D.equals(AssetConstants.HTML) ? anythingElse(token, bVar) : bVar.n0(token, HtmlTreeBuilderState.InBody);
                }
                bVar.Q(e);
            } else {
                if (i != 4) {
                    if (i == 6 && bVar.a().v0().equals(AssetConstants.HTML)) {
                        return true;
                    }
                    return anythingElse(token, bVar);
                }
                if (!token.d().c.equals("colgroup")) {
                    return anythingElse(token, bVar);
                }
                if (bVar.a().v0().equals(AssetConstants.HTML)) {
                    bVar.q(this);
                    return false;
                }
                bVar.j0();
                bVar.C0(HtmlTreeBuilderState.InTable);
            }
            return true;
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        private boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            return bVar.n0(token, HtmlTreeBuilderState.InTable);
        }

        private boolean exitTableBody(Token token, org.jsoup.parser.b bVar) {
            if (!bVar.L("tbody") && !bVar.L("thead") && !bVar.F("tfoot")) {
                bVar.q(this);
                return false;
            }
            bVar.n();
            bVar.g(bVar.a().v0());
            return bVar.f(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            int i = a.a[token.a.ordinal()];
            if (i == 3) {
                Token.h e = token.e();
                String D = e.D();
                if (D.equals("template")) {
                    bVar.M(e);
                    return true;
                }
                if (D.equals("tr")) {
                    bVar.n();
                    bVar.M(e);
                    bVar.C0(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (!o48.d(D, b.x)) {
                    return o48.d(D, b.D) ? exitTableBody(token, bVar) : anythingElse(token, bVar);
                }
                bVar.q(this);
                bVar.h("tr");
                return bVar.f(e);
            }
            if (i != 4) {
                return anythingElse(token, bVar);
            }
            String D2 = token.d().D();
            if (!o48.d(D2, b.J)) {
                if (D2.equals("table")) {
                    return exitTableBody(token, bVar);
                }
                if (!o48.d(D2, b.E)) {
                    return anythingElse(token, bVar);
                }
                bVar.q(this);
                return false;
            }
            if (!bVar.L(D2)) {
                bVar.q(this);
                return false;
            }
            bVar.n();
            bVar.j0();
            bVar.C0(HtmlTreeBuilderState.InTable);
            return true;
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        private boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            return bVar.n0(token, HtmlTreeBuilderState.InTable);
        }

        private boolean handleMissingTr(Token token, h hVar) {
            if (hVar.g("tr")) {
                return hVar.f(token);
            }
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.l()) {
                Token.h e = token.e();
                String D = e.D();
                if (D.equals("template")) {
                    bVar.M(e);
                    return true;
                }
                if (!o48.d(D, b.x)) {
                    return o48.d(D, b.F) ? handleMissingTr(token, bVar) : anythingElse(token, bVar);
                }
                bVar.p();
                bVar.M(e);
                bVar.C0(HtmlTreeBuilderState.InCell);
                bVar.T();
                return true;
            }
            if (!token.k()) {
                return anythingElse(token, bVar);
            }
            String D2 = token.d().D();
            if (D2.equals("tr")) {
                if (!bVar.L(D2)) {
                    bVar.q(this);
                    return false;
                }
                bVar.p();
                bVar.j0();
                bVar.C0(HtmlTreeBuilderState.InTableBody);
                return true;
            }
            if (D2.equals("table")) {
                return handleMissingTr(token, bVar);
            }
            if (!o48.d(D2, b.u)) {
                if (!o48.d(D2, b.G)) {
                    return anythingElse(token, bVar);
                }
                bVar.q(this);
                return false;
            }
            if (bVar.L(D2)) {
                bVar.g("tr");
                return bVar.f(token);
            }
            bVar.q(this);
            return false;
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        private boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            return bVar.n0(token, HtmlTreeBuilderState.InBody);
        }

        private void closeCell(org.jsoup.parser.b bVar) {
            if (bVar.L("td")) {
                bVar.g("td");
            } else {
                bVar.g("th");
            }
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (!token.k()) {
                if (!token.l() || !o48.d(token.e().D(), b.A)) {
                    return anythingElse(token, bVar);
                }
                if (bVar.L("td") || bVar.L("th")) {
                    closeCell(bVar);
                    return bVar.f(token);
                }
                bVar.q(this);
                return false;
            }
            String D = token.d().D();
            if (!o48.d(D, b.x)) {
                if (o48.d(D, b.y)) {
                    bVar.q(this);
                    return false;
                }
                if (!o48.d(D, b.z)) {
                    return anythingElse(token, bVar);
                }
                if (bVar.L(D)) {
                    closeCell(bVar);
                    return bVar.f(token);
                }
                bVar.q(this);
                return false;
            }
            if (!bVar.L(D)) {
                bVar.q(this);
                bVar.C0(HtmlTreeBuilderState.InRow);
                return false;
            }
            bVar.t();
            if (!bVar.a().v0().equals(D)) {
                bVar.q(this);
            }
            bVar.l0(D);
            bVar.l();
            bVar.C0(HtmlTreeBuilderState.InRow);
            return true;
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        private boolean anythingElse(Token token, org.jsoup.parser.b bVar) {
            bVar.q(this);
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            String D;
            switch (a.a[token.a.ordinal()]) {
                case 1:
                    bVar.P(token.b());
                    return true;
                case 2:
                    bVar.q(this);
                    return false;
                case 3:
                    Token.h e = token.e();
                    String D2 = e.D();
                    if (D2.equals(AssetConstants.HTML)) {
                        return bVar.n0(e, HtmlTreeBuilderState.InBody);
                    }
                    if (D2.equals("option")) {
                        if (bVar.a().v0().equals("option")) {
                            bVar.g("option");
                        }
                        bVar.M(e);
                    } else {
                        if (!D2.equals("optgroup")) {
                            if (D2.equals("select")) {
                                bVar.q(this);
                                return bVar.g("select");
                            }
                            if (!o48.d(D2, b.H)) {
                                return D2.equals("script") ? bVar.n0(token, HtmlTreeBuilderState.InHead) : anythingElse(token, bVar);
                            }
                            bVar.q(this);
                            if (!bVar.I("select")) {
                                return false;
                            }
                            bVar.g("select");
                            return bVar.f(e);
                        }
                        if (bVar.a().v0().equals("option")) {
                            bVar.g("option");
                        }
                        if (bVar.a().v0().equals("optgroup")) {
                            bVar.g("optgroup");
                        }
                        bVar.M(e);
                    }
                    return true;
                case 4:
                    D = token.d().D();
                    D.hashCode();
                    switch (D) {
                        case "option":
                            if (bVar.a().v0().equals("option")) {
                                bVar.j0();
                            } else {
                                bVar.q(this);
                            }
                            return true;
                        case "select":
                            if (!bVar.I(D)) {
                                bVar.q(this);
                                return false;
                            }
                            bVar.l0(D);
                            bVar.x0();
                            return true;
                        case "optgroup":
                            if (bVar.a().v0().equals("option") && bVar.k(bVar.a()) != null && bVar.k(bVar.a()).v0().equals("optgroup")) {
                                bVar.g("option");
                            }
                            if (bVar.a().v0().equals("optgroup")) {
                                bVar.j0();
                            } else {
                                bVar.q(this);
                            }
                            return true;
                        default:
                            return anythingElse(token, bVar);
                    }
                case 5:
                    Token.c a = token.a();
                    if (a.q().equals(HtmlTreeBuilderState.nullString)) {
                        bVar.q(this);
                        return false;
                    }
                    bVar.O(a);
                    return true;
                case 6:
                    if (!bVar.a().v0().equals(AssetConstants.HTML)) {
                        bVar.q(this);
                    }
                    return true;
                default:
                    return anythingElse(token, bVar);
            }
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.l() && o48.d(token.e().D(), b.I)) {
                bVar.q(this);
                bVar.g("select");
                return bVar.f(token);
            }
            if (!token.k() || !o48.d(token.d().D(), b.I)) {
                return bVar.n0(token, HtmlTreeBuilderState.InSelect);
            }
            bVar.q(this);
            if (!bVar.L(token.d().D())) {
                return false;
            }
            bVar.g("select");
            return bVar.f(token);
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
                return true;
            }
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (token.i()) {
                bVar.q(this);
                return false;
            }
            if (token.l() && token.e().D().equals(AssetConstants.HTML)) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.k() && token.d().D().equals(AssetConstants.HTML)) {
                if (bVar.Z()) {
                    bVar.q(this);
                    return false;
                }
                bVar.C0(HtmlTreeBuilderState.AfterAfterBody);
                return true;
            }
            if (token.j()) {
                return true;
            }
            bVar.q(this);
            bVar.C0(HtmlTreeBuilderState.InBody);
            return bVar.f(token);
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            Token.h e;
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
            } else if (token.h()) {
                bVar.P(token.b());
            } else {
                if (token.i()) {
                    bVar.q(this);
                    return false;
                }
                if (token.l()) {
                    e = token.e();
                    String D = e.D();
                    D.hashCode();
                    switch (D) {
                        case "frameset":
                            bVar.M(e);
                            break;
                        case "html":
                            return bVar.n0(e, HtmlTreeBuilderState.InBody);
                        case "frame":
                            bVar.Q(e);
                            break;
                        case "noframes":
                            return bVar.n0(e, HtmlTreeBuilderState.InHead);
                        default:
                            bVar.q(this);
                            return false;
                    }
                } else if (token.k() && token.d().D().equals("frameset")) {
                    if (bVar.a().v0().equals(AssetConstants.HTML)) {
                        bVar.q(this);
                        return false;
                    }
                    bVar.j0();
                    if (!bVar.Z() && !bVar.a().v0().equals("frameset")) {
                        bVar.C0(HtmlTreeBuilderState.AfterFrameset);
                    }
                } else {
                    if (!token.j()) {
                        bVar.q(this);
                        return false;
                    }
                    if (!bVar.a().v0().equals(AssetConstants.HTML)) {
                        bVar.q(this);
                    }
                }
            }
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                bVar.O(token.a());
                return true;
            }
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (token.i()) {
                bVar.q(this);
                return false;
            }
            if (token.l() && token.e().D().equals(AssetConstants.HTML)) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.k() && token.d().D().equals(AssetConstants.HTML)) {
                bVar.C0(HtmlTreeBuilderState.AfterAfterFrameset);
                return true;
            }
            if (token.l() && token.e().D().equals("noframes")) {
                return bVar.n0(token, HtmlTreeBuilderState.InHead);
            }
            if (token.j()) {
                return true;
            }
            bVar.q(this);
            return false;
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (token.i() || (token.l() && token.e().D().equals(AssetConstants.HTML))) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                Element l0 = bVar.l0(AssetConstants.HTML);
                bVar.O(token.a());
                bVar.e.add(l0);
                bVar.e.add(l0.D0("body"));
                return true;
            }
            if (token.j()) {
                return true;
            }
            bVar.q(this);
            bVar.C0(HtmlTreeBuilderState.InBody);
            return bVar.f(token);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            if (token.h()) {
                bVar.P(token.b());
                return true;
            }
            if (token.i() || HtmlTreeBuilderState.isWhitespace(token) || (token.l() && token.e().D().equals(AssetConstants.HTML))) {
                return bVar.n0(token, HtmlTreeBuilderState.InBody);
            }
            if (token.j()) {
                return true;
            }
            if (token.l() && token.e().D().equals("noframes")) {
                return bVar.n0(token, HtmlTreeBuilderState.InHead);
            }
            bVar.q(this);
            return false;
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        boolean process(Token token, org.jsoup.parser.b bVar) {
            return true;
        }
    };

    private static final String nullString = String.valueOf((char) 0);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            a = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static final class b {
        static final String[] a = {"base", "basefont", "bgsound", "command", "link"};
        static final String[] b = {"noframes", "style"};
        static final String[] c = {"body", "br", AssetConstants.HTML};
        static final String[] d = {"body", AssetConstants.HTML};
        static final String[] e = {"body", "br", "head", AssetConstants.HTML};
        static final String[] f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
        static final String[] g = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
        static final String[] h = {"address", AssetConstants.ARTICLE_TYPE, "aside", Tag.BLOCK_QUOTE, "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        static final String[] i = {"h1", "h2", "h3", Tag.H4, "h5", "h6"};
        static final String[] j = {"address", "div", "p"};
        static final String[] k = {"dd", "dt"};
        static final String[] l = {"b", "big", "code", Tag.EM, "font", QueryKeys.VIEW_TITLE, "s", "small", "strike", Tag.STRONG, "tt", QueryKeys.USER_ID};
        static final String[] m = {"applet", "marquee", "object"};
        static final String[] n = {"area", "br", "embed", "img", "keygen", "wbr"};
        static final String[] o = {"param", "source", "track"};
        static final String[] p = {"action", AuthenticationTokenClaims.JSON_KEY_NAME, "prompt"};
        static final String[] q = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] r = {"address", AssetConstants.ARTICLE_TYPE, "aside", Tag.BLOCK_QUOTE, "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] s = {Tag.A, "b", "big", "code", Tag.EM, "font", QueryKeys.VIEW_TITLE, "nobr", "s", "small", "strike", Tag.STRONG, "tt", QueryKeys.USER_ID};
        static final String[] t = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] u = {"tbody", "tfoot", "thead"};
        static final String[] v = {"td", "th", "tr"};
        static final String[] w = {"script", "style"};
        static final String[] x = {"td", "th"};
        static final String[] y = {"body", "caption", "col", "colgroup", AssetConstants.HTML};
        static final String[] z = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] A = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] B = {"body", "caption", "col", "colgroup", AssetConstants.HTML, "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] C = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        static final String[] E = {"body", "caption", "col", "colgroup", AssetConstants.HTML, "td", "th", "tr"};
        static final String[] F = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        static final String[] G = {"body", "caption", "col", "colgroup", AssetConstants.HTML, "td", "th"};
        static final String[] H = {"input", "keygen", "textarea"};
        static final String[] I = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] J = {"tbody", "tfoot", "thead"};
        static final String[] K = {"head", "noscript"};
        static final String[] L = {"body", "col", "colgroup", AssetConstants.HTML, "tbody", "td", "tfoot", "th", "thead", "tr"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRawtext(Token.h hVar, org.jsoup.parser.b bVar) {
        bVar.c.v(TokeniserState.Rawtext);
        bVar.e0();
        bVar.C0(Text);
        bVar.M(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRcData(Token.h hVar, org.jsoup.parser.b bVar) {
        bVar.c.v(TokeniserState.Rcdata);
        bVar.e0();
        bVar.C0(Text);
        bVar.M(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(Token token) {
        if (token.g()) {
            return o48.f(token.a().q());
        }
        return false;
    }

    abstract boolean process(Token token, org.jsoup.parser.b bVar);

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(String str) {
        return o48.f(str);
    }
}
