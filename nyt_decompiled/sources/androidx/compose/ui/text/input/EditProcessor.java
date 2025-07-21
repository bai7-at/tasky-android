package androidx.compose.ui.text.input;

import androidx.compose.ui.text.i;
import defpackage.am1;
import defpackage.bm1;
import defpackage.fy1;
import defpackage.kp0;
import defpackage.ly1;
import defpackage.oh2;
import defpackage.pj8;
import defpackage.ss2;
import defpackage.vi8;
import defpackage.vl7;
import defpackage.wl7;
import defpackage.yl1;
import defpackage.zl7;
import defpackage.zq3;
import defpackage.zt6;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class EditProcessor {
    private TextFieldValue a = new TextFieldValue(androidx.compose.ui.text.b.g(), i.b.a(), (i) null, (DefaultConstructorMarker) null);
    private ly1 b = new ly1(this.a.e(), this.a.g(), null);

    private final String c(List list, final fy1 fy1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.b.h() + ", composition=" + this.b.d() + ", selection=" + ((Object) i.q(this.b.i())) + "):");
        zq3.g(sb, "append(value)");
        sb.append('\n');
        zq3.g(sb, "append('\\n')");
        CollectionsKt___CollectionsKt.r0(list, sb, (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new ss2() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(fy1 fy1Var2) {
                String e;
                String str = fy1.this == fy1Var2 ? " > " : "   ";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                e = this.e(fy1Var2);
                sb2.append(e);
                return sb2.toString();
            }
        });
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(fy1 fy1Var) {
        if (fy1Var instanceof kp0) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            kp0 kp0Var = (kp0) fy1Var;
            sb.append(kp0Var.c().length());
            sb.append(", newCursorPosition=");
            sb.append(kp0Var.b());
            sb.append(')');
            return sb.toString();
        }
        if (fy1Var instanceof wl7) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            wl7 wl7Var = (wl7) fy1Var;
            sb2.append(wl7Var.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(wl7Var.b());
            sb2.append(')');
            return sb2.toString();
        }
        if (!(fy1Var instanceof vl7) && !(fy1Var instanceof am1) && !(fy1Var instanceof bm1) && !(fy1Var instanceof zl7) && !(fy1Var instanceof oh2) && !(fy1Var instanceof yl1)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown EditCommand: ");
            String d = zt6.b(fy1Var.getClass()).d();
            if (d == null) {
                d = "{anonymous EditCommand}";
            }
            sb3.append(d);
            return sb3.toString();
        }
        return fy1Var.toString();
    }

    public final TextFieldValue b(List list) {
        fy1 fy1Var;
        Exception e;
        fy1 fy1Var2;
        try {
            int size = list.size();
            int i = 0;
            fy1Var = null;
            while (i < size) {
                try {
                    fy1Var2 = (fy1) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    fy1Var2.a(this.b);
                    i++;
                    fy1Var = fy1Var2;
                } catch (Exception e3) {
                    e = e3;
                    fy1Var = fy1Var2;
                    throw new RuntimeException(c(list, fy1Var), e);
                }
            }
            androidx.compose.ui.text.a s = this.b.s();
            long i2 = this.b.i();
            i b = i.b(i2);
            b.r();
            i iVar = i.m(this.a.g()) ? null : b;
            TextFieldValue textFieldValue = new TextFieldValue(s, iVar != null ? iVar.r() : pj8.b(i.k(i2), i.l(i2)), this.b.d(), (DefaultConstructorMarker) null);
            this.a = textFieldValue;
            return textFieldValue;
        } catch (Exception e4) {
            fy1Var = null;
            e = e4;
        }
    }

    public final void d(TextFieldValue textFieldValue, vi8 vi8Var) {
        boolean c = zq3.c(textFieldValue.f(), this.b.d());
        boolean z = true;
        boolean z2 = false;
        if (!zq3.c(this.a.e(), textFieldValue.e())) {
            this.b = new ly1(textFieldValue.e(), textFieldValue.g(), null);
        } else if (i.g(this.a.g(), textFieldValue.g())) {
            z = false;
        } else {
            this.b.p(i.l(textFieldValue.g()), i.k(textFieldValue.g()));
            z2 = true;
            z = false;
        }
        if (textFieldValue.f() == null) {
            this.b.a();
        } else if (!i.h(textFieldValue.f().r())) {
            this.b.n(i.l(textFieldValue.f().r()), i.k(textFieldValue.f().r()));
        }
        if (z || (!z2 && !c)) {
            this.b.a();
            textFieldValue = TextFieldValue.c(textFieldValue, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue2 = this.a;
        this.a = textFieldValue;
        if (vi8Var != null) {
            vi8Var.d(textFieldValue2, textFieldValue);
        }
    }

    public final TextFieldValue f() {
        return this.a;
    }
}
