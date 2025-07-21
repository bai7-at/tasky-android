package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.SaversKt;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.pj8;
import defpackage.ss2;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final a d = new a(null);
    private static final ea7 e = SaverKt.a(new gt2() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, TextFieldValue textFieldValue) {
            return i.h(SaversKt.u(textFieldValue.e(), SaversKt.e(), fa7Var), SaversKt.u(androidx.compose.ui.text.i.b(textFieldValue.g()), SaversKt.q(androidx.compose.ui.text.i.b), fa7Var));
        }
    }, new ss2() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextFieldValue invoke(Object obj) {
            zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ea7 e2 = SaversKt.e();
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.text.i iVar = null;
            androidx.compose.ui.text.a aVar = (zq3.c(obj2, bool) || obj2 == null) ? null : (androidx.compose.ui.text.a) e2.b(obj2);
            zq3.e(aVar);
            Object obj3 = list.get(1);
            ea7 q = SaversKt.q(androidx.compose.ui.text.i.b);
            if (!zq3.c(obj3, bool) && obj3 != null) {
                iVar = (androidx.compose.ui.text.i) q.b(obj3);
            }
            zq3.e(iVar);
            return new TextFieldValue(aVar, iVar.r(), (androidx.compose.ui.text.i) null, 4, (DefaultConstructorMarker) null);
        }
    });
    private final androidx.compose.ui.text.a a;
    private final long b;
    private final androidx.compose.ui.text.i c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.a aVar, long j, androidx.compose.ui.text.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j, iVar);
    }

    public static /* synthetic */ TextFieldValue c(TextFieldValue textFieldValue, androidx.compose.ui.text.a aVar, long j, androidx.compose.ui.text.i iVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = textFieldValue.a;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.b;
        }
        if ((i & 4) != 0) {
            iVar = textFieldValue.c;
        }
        return textFieldValue.a(aVar, j, iVar);
    }

    public static /* synthetic */ TextFieldValue d(TextFieldValue textFieldValue, String str, long j, androidx.compose.ui.text.i iVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.b;
        }
        if ((i & 4) != 0) {
            iVar = textFieldValue.c;
        }
        return textFieldValue.b(str, j, iVar);
    }

    public final TextFieldValue a(androidx.compose.ui.text.a aVar, long j, androidx.compose.ui.text.i iVar) {
        return new TextFieldValue(aVar, j, iVar, (DefaultConstructorMarker) null);
    }

    public final TextFieldValue b(String str, long j, androidx.compose.ui.text.i iVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new TextFieldValue(new androidx.compose.ui.text.a(str, null, null, 6, defaultConstructorMarker), j, iVar, defaultConstructorMarker);
    }

    public final androidx.compose.ui.text.a e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return androidx.compose.ui.text.i.g(this.b, textFieldValue.b) && zq3.c(this.c, textFieldValue.c) && zq3.c(this.a, textFieldValue.a);
    }

    public final androidx.compose.ui.text.i f() {
        return this.c;
    }

    public final long g() {
        return this.b;
    }

    public final String h() {
        return this.a.j();
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + androidx.compose.ui.text.i.o(this.b)) * 31;
        androidx.compose.ui.text.i iVar = this.c;
        return hashCode + (iVar != null ? androidx.compose.ui.text.i.o(iVar.r()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) androidx.compose.ui.text.i.q(this.b)) + ", composition=" + this.c + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j, androidx.compose.ui.text.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, iVar);
    }

    private TextFieldValue(androidx.compose.ui.text.a aVar, long j, androidx.compose.ui.text.i iVar) {
        this.a = aVar;
        this.b = pj8.c(j, 0, h().length());
        this.c = iVar != null ? androidx.compose.ui.text.i.b(pj8.c(iVar.r(), 0, h().length())) : null;
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.a aVar, long j, androidx.compose.ui.text.i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? androidx.compose.ui.text.i.b.a() : j, (i & 4) != 0 ? null : iVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, androidx.compose.ui.text.i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? androidx.compose.ui.text.i.b.a() : j, (i & 4) != 0 ? null : iVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private TextFieldValue(java.lang.String r8, long r9, androidx.compose.ui.text.i r11) {
        /*
            r7 = this;
            androidx.compose.ui.text.a r6 = new androidx.compose.ui.text.a
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r6
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextFieldValue.<init>(java.lang.String, long, androidx.compose.ui.text.i):void");
    }
}
