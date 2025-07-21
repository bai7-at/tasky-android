package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.nodes.Entities;

/* loaded from: classes5.dex */
public class Document extends Element {
    private OutputSettings j;
    private org.jsoup.parser.e k;
    private QuirksMode l;
    private String m;
    private boolean n;

    public static class OutputSettings implements Cloneable {
        private Charset b;
        Entities.CoreCharset d;
        private Entities.EscapeMode a = Entities.EscapeMode.base;
        private ThreadLocal c = new ThreadLocal();
        private boolean e = true;
        private boolean f = false;
        private int g = 1;
        private Syntax h = Syntax.html;

        public enum Syntax {
            html,
            xml
        }

        public OutputSettings() {
            b(Charset.forName("UTF8"));
        }

        public OutputSettings a(String str) {
            b(Charset.forName(str));
            return this;
        }

        public OutputSettings b(Charset charset) {
            this.b = charset;
            return this;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.a(this.b.name());
                outputSettings.a = Entities.EscapeMode.valueOf(this.a.name());
                return outputSettings;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        CharsetEncoder d() {
            CharsetEncoder charsetEncoder = (CharsetEncoder) this.c.get();
            return charsetEncoder != null ? charsetEncoder : h();
        }

        public Entities.EscapeMode e() {
            return this.a;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        CharsetEncoder h() {
            CharsetEncoder newEncoder = this.b.newEncoder();
            this.c.set(newEncoder);
            this.d = Entities.CoreCharset.byName(newEncoder.charset().name());
            return newEncoder;
        }

        public boolean i() {
            return this.e;
        }

        public Syntax k() {
            return this.h;
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(org.jsoup.parser.f.p("#root", org.jsoup.parser.d.c), str);
        this.j = new OutputSettings();
        this.l = QuirksMode.noQuirks;
        this.n = false;
        this.m = str;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.i
    /* renamed from: M0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Document d0() {
        Document document = (Document) super.d0();
        document.j = this.j.clone();
        return document;
    }

    public OutputSettings N0() {
        return this.j;
    }

    public Document O0(org.jsoup.parser.e eVar) {
        this.k = eVar;
        return this;
    }

    public org.jsoup.parser.e P0() {
        return this.k;
    }

    public QuirksMode Q0() {
        return this.l;
    }

    public Document R0(QuirksMode quirksMode) {
        this.l = quirksMode;
        return this;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.i
    public String v() {
        return "#document";
    }

    @Override // org.jsoup.nodes.i
    public String x() {
        return super.o0();
    }
}
