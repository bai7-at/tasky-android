package org.jsoup.parser;

import defpackage.u29;
import java.io.Reader;
import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class h {
    protected e a;
    a b;
    g c;
    protected Document d;
    protected ArrayList e;
    protected String f;
    protected Token g;
    protected d h;
    private Token.h i = new Token.h();
    private Token.g j = new Token.g();

    h() {
    }

    protected Element a() {
        int size = this.e.size();
        if (size > 0) {
            return (Element) this.e.get(size - 1);
        }
        return null;
    }

    abstract d b();

    protected void c(String str) {
        ParseErrorList a = this.a.a();
        if (a.a()) {
            a.add(new c(this.b.H(), str));
        }
    }

    protected void d(Reader reader, String str, e eVar) {
        u29.j(reader, "String input must not be null");
        u29.j(str, "BaseURI must not be null");
        Document document = new Document(str);
        this.d = document;
        document.O0(eVar);
        this.a = eVar;
        this.h = eVar.c();
        this.b = new a(reader);
        this.g = null;
        this.c = new g(this.b, eVar.a());
        this.e = new ArrayList(32);
        this.f = str;
    }

    Document e(Reader reader, String str, e eVar) {
        d(reader, str, eVar);
        j();
        this.b.d();
        this.b = null;
        this.c = null;
        this.e = null;
        return this.d;
    }

    protected abstract boolean f(Token token);

    protected boolean g(String str) {
        Token token = this.g;
        Token.g gVar = this.j;
        return token == gVar ? f(new Token.g().B(str)) : f(gVar.m().B(str));
    }

    protected boolean h(String str) {
        Token.h hVar = this.i;
        return this.g == hVar ? f(new Token.h().B(str)) : f(hVar.m().B(str));
    }

    public boolean i(String str, org.jsoup.nodes.b bVar) {
        Token.h hVar = this.i;
        if (this.g == hVar) {
            return f(new Token.h().G(str, bVar));
        }
        hVar.m();
        hVar.G(str, bVar);
        return f(hVar);
    }

    protected void j() {
        Token u;
        g gVar = this.c;
        Token.TokenType tokenType = Token.TokenType.EOF;
        do {
            u = gVar.u();
            f(u);
            u.m();
        } while (u.a != tokenType);
    }
}
