package defpackage;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class jw8 {
    private final int a;
    private a b;
    private a c;
    private int d;
    private Long e;
    private boolean f;

    private static final class a {
        private a a;
        private TextFieldValue b;

        public a(a aVar, TextFieldValue textFieldValue) {
            this.a = aVar;
            this.b = textFieldValue;
        }

        public final a a() {
            return this.a;
        }

        public final TextFieldValue b() {
            return this.b;
        }

        public final void c(a aVar) {
            this.a = aVar;
        }

        public final void d(TextFieldValue textFieldValue) {
            this.b = textFieldValue;
        }
    }

    public jw8(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:7:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[EDGE_INSN: B:13:0x0023->B:14:0x0023 BREAK  A[LOOP:0: B:7:0x000e->B:12:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            r2 = this;
            jw8$a r2 = r2.b
            r0 = 0
            if (r2 == 0) goto La
            jw8$a r1 = r2.a()
            goto Lb
        La:
            r1 = r0
        Lb:
            if (r1 != 0) goto Le
            return
        Le:
            if (r2 == 0) goto L1b
            jw8$a r1 = r2.a()
            if (r1 == 0) goto L1b
            jw8$a r1 = r1.a()
            goto L1c
        L1b:
            r1 = r0
        L1c:
            if (r1 == 0) goto L23
            jw8$a r2 = r2.a()
            goto Le
        L23:
            if (r2 != 0) goto L26
            goto L29
        L26:
            r2.c(r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw8.d():void");
    }

    public static /* synthetic */ void f(jw8 jw8Var, TextFieldValue textFieldValue, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = lw8.a();
        }
        jw8Var.e(textFieldValue, j);
    }

    public final void a() {
        this.f = true;
    }

    public final void b(TextFieldValue textFieldValue) {
        TextFieldValue b;
        this.f = false;
        a aVar = this.b;
        if (zq3.c(textFieldValue, aVar != null ? aVar.b() : null)) {
            return;
        }
        String h = textFieldValue.h();
        a aVar2 = this.b;
        if (zq3.c(h, (aVar2 == null || (b = aVar2.b()) == null) ? null : b.h())) {
            a aVar3 = this.b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(textFieldValue);
            return;
        }
        this.b = new a(this.b, textFieldValue);
        this.c = null;
        int length = this.d + textFieldValue.h().length();
        this.d = length;
        if (length > this.a) {
            d();
        }
    }

    public final TextFieldValue c() {
        a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        this.c = aVar.a();
        this.b = new a(this.b, aVar.b());
        this.d += aVar.b().h().length();
        return aVar.b();
    }

    public final void e(TextFieldValue textFieldValue, long j) {
        if (!this.f) {
            Long l = this.e;
            if (j <= (l != null ? l.longValue() : 0L) + kw8.a()) {
                return;
            }
        }
        this.e = Long.valueOf(j);
        b(textFieldValue);
    }

    public final TextFieldValue g() {
        a a2;
        a aVar = this.b;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return null;
        }
        this.b = a2;
        this.d -= aVar.b().h().length();
        this.c = new a(this.c, aVar.b());
        return a2.b();
    }

    public /* synthetic */ jw8(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100000 : i);
    }
}
