package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ol0 {
    private static final ol0 e = new a().b();
    private final km8 a;
    private final List b;
    private final e13 c;
    private final String d;

    public static final class a {
        private km8 a = null;
        private List b = new ArrayList();
        private e13 c = null;
        private String d = "";

        a() {
        }

        public a a(a94 a94Var) {
            this.b.add(a94Var);
            return this;
        }

        public ol0 b() {
            return new ol0(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(e13 e13Var) {
            this.c = e13Var;
            return this;
        }

        public a e(km8 km8Var) {
            this.a = km8Var;
            return this;
        }
    }

    ol0(km8 km8Var, List list, e13 e13Var, String str) {
        this.a = km8Var;
        this.b = list;
        this.c = e13Var;
        this.d = str;
    }

    public static a e() {
        return new a();
    }

    public String a() {
        return this.d;
    }

    public e13 b() {
        return this.c;
    }

    public List c() {
        return this.b;
    }

    public km8 d() {
        return this.a;
    }

    public byte[] f() {
        return j76.a(this);
    }
}
