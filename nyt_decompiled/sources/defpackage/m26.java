package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.pb8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class m26 {
    public static final a a(pb8 pb8Var, String str, Composer composer, int i, int i2) {
        zq3.h(pb8Var, "price");
        composer.z(-63495841);
        String str2 = (i2 & 2) != 0 ? "" : str;
        if (b.G()) {
            b.S(-63495841, i, -1, "com.nytimes.android.growthui.common.components.utils.formatPriceCaptionString (PricingFormatter.kt:60)");
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        if (pb8Var instanceof pb8.b) {
            c0064a.i(str2);
        } else if (pb8Var instanceof pb8.c) {
            pb8.c cVar = (pb8.c) pb8Var;
            c0064a.i(cVar.c().b());
            c0064a.i("/");
            c0064a.i(ob8.b(cVar.c().a()));
            c0064a.i(" after ");
            if (ob8.a(pb8Var.a()) == 1) {
                c0064a.i("the first " + ob8.b(pb8Var.a()));
            } else {
                c0064a.i("initial " + ob8.a(pb8Var.a()) + " " + ob8.b(pb8Var.a()) + "s");
            }
            if (!h.d0(str2)) {
                c0064a.i(". " + str2);
            }
        } else if (pb8Var instanceof pb8.a) {
            c0064a.n(new jy7(0L, 0L, o.b.a(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, 16379, (DefaultConstructorMarker) null));
            pb8.a aVar = (pb8.a) pb8Var;
            c0064a.i(aVar.b().b() + "/" + ob8.b(aVar.b().a()));
            c0064a.j();
            c0064a.i(" after ");
            if (zq3.c(pb8Var.a().b(), "P1W")) {
                c0064a.i("7-day trial. ");
            } else {
                c0064a.i(ob8.a(pb8Var.a()) + "-" + ob8.b(pb8Var.a()) + " trial. ");
            }
            if (h.d0(str2)) {
                c0064a.i("Cancel anytime.");
            } else {
                c0064a.i(str2);
            }
        }
        a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    public static final a b(String str, pb8 pb8Var, jy7 jy7Var, Composer composer, int i, int i2) {
        a.C0064a c0064a;
        jy7 c;
        zq3.h(pb8Var, "price");
        zq3.h(jy7Var, "spanStyle");
        composer.z(-1251947048);
        String str2 = (i2 & 1) != 0 ? "" : str;
        if (b.G()) {
            b.S(-1251947048, i, -1, "com.nytimes.android.growthui.common.components.utils.formatPriceString (PricingFormatter.kt:17)");
        }
        a.C0064a c0064a2 = new a.C0064a(0, 1, null);
        c0064a2.n(jy7Var);
        composer.z(1353020906);
        if (pb8Var instanceof pb8.c) {
            c0064a2.i(str2);
            c = jy7Var.c((r35 & 1) != 0 ? jy7Var.i() : c74.a.a(composer, 6).d().d(), (r35 & 2) != 0 ? jy7Var.b : 0L, (r35 & 4) != 0 ? jy7Var.c : null, (r35 & 8) != 0 ? jy7Var.d : null, (r35 & 16) != 0 ? jy7Var.e : null, (r35 & 32) != 0 ? jy7Var.f : null, (r35 & 64) != 0 ? jy7Var.g : null, (r35 & 128) != 0 ? jy7Var.h : 0L, (r35 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? jy7Var.i : null, (r35 & 512) != 0 ? jy7Var.j : null, (r35 & 1024) != 0 ? jy7Var.k : null, (r35 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? jy7Var.l : 0L, (r35 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? jy7Var.m : ph8.b.b(), (r35 & 8192) != 0 ? jy7Var.n : null);
            c0064a = c0064a2;
            c0064a.n(c);
            pb8.c cVar = (pb8.c) pb8Var;
            c0064a.i(cVar.c().b());
            c0064a.j();
            c0064a.i(" ");
            c0064a.i(cVar.b());
            c0064a.i("/");
            c0064a.i(ob8.b(pb8Var.a()));
        } else {
            c0064a = c0064a2;
            if (pb8Var instanceof pb8.b) {
                c0064a.i(str2);
                c0064a.i(((pb8.b) pb8Var).b());
                c0064a.i("/");
                c0064a.i(ob8.b(pb8Var.a()));
            } else if (pb8Var instanceof pb8.a) {
                c0064a.i("Try ");
                if (zq3.c(pb8Var.a().b(), "P1W")) {
                    c0064a.i("7 days");
                } else {
                    String str3 = pb8Var.a().a() > 1 ? "s" : "";
                    c0064a.i(pb8Var.a().a() + " " + ob8.b(pb8Var.a()) + str3);
                }
                c0064a.i(" free");
            }
        }
        composer.R();
        a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }
}
