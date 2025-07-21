package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class db3 {
    private final int a;
    private final List b;
    private final sd0 c;
    private final ByteString d;

    public static final class a {
        private final int a;
        private sd0 b;
        private ByteString c;
        private final List d = new ArrayList();

        public a(int i) {
            this.a = i;
        }

        private final boolean d() {
            return (this.b == null && this.c == null) ? false : true;
        }

        public final a a(List list) {
            zq3.h(list, "headers");
            this.d.addAll(list);
            return this;
        }

        public final a b(sd0 sd0Var) {
            zq3.h(sd0Var, "bodySource");
            if (d()) {
                throw new IllegalStateException("body() can only be called once");
            }
            this.b = sd0Var;
            return this;
        }

        public final db3 c() {
            return new db3(this.a, this.d, this.b, this.c, null);
        }
    }

    public /* synthetic */ db3(int i, List list, sd0 sd0Var, ByteString byteString, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, sd0Var, byteString);
    }

    public final sd0 a() {
        sd0 sd0Var = this.c;
        if (sd0Var != null) {
            return sd0Var;
        }
        ByteString byteString = this.d;
        return byteString != null ? new ad0().m1(byteString) : null;
    }

    public final List b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    private db3(int i, List list, sd0 sd0Var, ByteString byteString) {
        this.a = i;
        this.b = list;
        this.c = sd0Var;
        this.d = byteString;
    }
}
