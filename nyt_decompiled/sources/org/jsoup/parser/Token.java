package org.jsoup.parser;

import defpackage.a95;
import defpackage.u29;

/* loaded from: classes5.dex */
abstract class Token {
    TokenType a;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    static final class b extends c {
        b(String str) {
            p(str);
        }

        @Override // org.jsoup.parser.Token.c
        public String toString() {
            return "<![CDATA[" + q() + "]]>";
        }
    }

    static class c extends Token {
        private String b;

        c() {
            super();
            this.a = TokenType.Character;
        }

        @Override // org.jsoup.parser.Token
        Token m() {
            this.b = null;
            return this;
        }

        c p(String str) {
            this.b = str;
            return this;
        }

        String q() {
            return this.b;
        }

        public String toString() {
            return q();
        }
    }

    static final class d extends Token {
        private final StringBuilder b;
        private String c;
        boolean d;

        d() {
            super();
            this.b = new StringBuilder();
            this.d = false;
            this.a = TokenType.Comment;
        }

        private void r() {
            String str = this.c;
            if (str != null) {
                this.b.append(str);
                this.c = null;
            }
        }

        @Override // org.jsoup.parser.Token
        Token m() {
            Token.n(this.b);
            this.c = null;
            this.d = false;
            return this;
        }

        final d p(char c) {
            r();
            this.b.append(c);
            return this;
        }

        final d q(String str) {
            r();
            if (this.b.length() == 0) {
                this.c = str;
            } else {
                this.b.append(str);
            }
            return this;
        }

        String s() {
            String str = this.c;
            return str != null ? str : this.b.toString();
        }

        public String toString() {
            return "<!--" + s() + "-->";
        }
    }

    static final class e extends Token {
        final StringBuilder b;
        String c;
        final StringBuilder d;
        final StringBuilder e;
        boolean f;

        e() {
            super();
            this.b = new StringBuilder();
            this.c = null;
            this.d = new StringBuilder();
            this.e = new StringBuilder();
            this.f = false;
            this.a = TokenType.Doctype;
        }

        @Override // org.jsoup.parser.Token
        Token m() {
            Token.n(this.b);
            this.c = null;
            Token.n(this.d);
            Token.n(this.e);
            this.f = false;
            return this;
        }

        String p() {
            return this.b.toString();
        }

        String q() {
            return this.c;
        }

        String r() {
            return this.d.toString();
        }

        public String s() {
            return this.e.toString();
        }

        public boolean t() {
            return this.f;
        }
    }

    static final class f extends Token {
        f() {
            super();
            this.a = TokenType.EOF;
        }

        @Override // org.jsoup.parser.Token
        Token m() {
            return this;
        }
    }

    static final class g extends i {
        g() {
            this.a = TokenType.EndTag;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            String str = this.b;
            if (str == null) {
                str = "(unset)";
            }
            sb.append(str);
            sb.append(">");
            return sb.toString();
        }
    }

    static final class h extends i {
        h() {
            this.a = TokenType.StartTag;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.Token.i, org.jsoup.parser.Token
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public i m() {
            super.m();
            this.j = null;
            return this;
        }

        h G(String str, org.jsoup.nodes.b bVar) {
            this.b = str;
            this.j = bVar;
            this.c = a95.a(str);
            return this;
        }

        public String toString() {
            org.jsoup.nodes.b bVar = this.j;
            if (bVar == null || bVar.size() <= 0) {
                return "<" + A() + ">";
            }
            return "<" + A() + " " + this.j.toString() + ">";
        }
    }

    static abstract class i extends Token {
        protected String b;
        protected String c;
        private String d;
        private StringBuilder e;
        private String f;
        private boolean g;
        private boolean h;
        boolean i;
        org.jsoup.nodes.b j;

        i() {
            super();
            this.e = new StringBuilder();
            this.g = false;
            this.h = false;
            this.i = false;
        }

        private void w() {
            this.h = true;
            String str = this.f;
            if (str != null) {
                this.e.append(str);
                this.f = null;
            }
        }

        final String A() {
            String str = this.b;
            u29.b(str == null || str.length() == 0);
            return this.b;
        }

        final i B(String str) {
            this.b = str;
            this.c = a95.a(str);
            return this;
        }

        final void C() {
            if (this.j == null) {
                this.j = new org.jsoup.nodes.b();
            }
            String str = this.d;
            if (str != null) {
                String trim = str.trim();
                this.d = trim;
                if (trim.length() > 0) {
                    this.j.f(this.d, this.h ? this.e.length() > 0 ? this.e.toString() : this.f : this.g ? "" : null);
                }
            }
            this.d = null;
            this.g = false;
            this.h = false;
            Token.n(this.e);
            this.f = null;
        }

        final String D() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.Token
        /* renamed from: E */
        public i m() {
            this.b = null;
            this.c = null;
            this.d = null;
            Token.n(this.e);
            this.f = null;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = null;
            return this;
        }

        final void F() {
            this.g = true;
        }

        final void p(char c) {
            q(String.valueOf(c));
        }

        final void q(String str) {
            String str2 = this.d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.d = str;
        }

        final void r(char c) {
            w();
            this.e.append(c);
        }

        final void s(String str) {
            w();
            if (this.e.length() == 0) {
                this.f = str;
            } else {
                this.e.append(str);
            }
        }

        final void t(int[] iArr) {
            w();
            for (int i : iArr) {
                this.e.appendCodePoint(i);
            }
        }

        final void u(char c) {
            v(String.valueOf(c));
        }

        final void v(String str) {
            String str2 = this.b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.b = str;
            this.c = a95.a(str);
        }

        final void x() {
            if (this.d != null) {
                C();
            }
        }

        final org.jsoup.nodes.b y() {
            if (this.j == null) {
                this.j = new org.jsoup.nodes.b();
            }
            return this.j;
        }

        final boolean z() {
            return this.i;
        }
    }

    static void n(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    final c a() {
        return (c) this;
    }

    final d b() {
        return (d) this;
    }

    final e c() {
        return (e) this;
    }

    final g d() {
        return (g) this;
    }

    final h e() {
        return (h) this;
    }

    final boolean f() {
        return this instanceof b;
    }

    final boolean g() {
        return this.a == TokenType.Character;
    }

    final boolean h() {
        return this.a == TokenType.Comment;
    }

    final boolean i() {
        return this.a == TokenType.Doctype;
    }

    final boolean j() {
        return this.a == TokenType.EOF;
    }

    final boolean k() {
        return this.a == TokenType.EndTag;
    }

    final boolean l() {
        return this.a == TokenType.StartTag;
    }

    abstract Token m();

    String o() {
        return getClass().getSimpleName();
    }

    private Token() {
    }
}
