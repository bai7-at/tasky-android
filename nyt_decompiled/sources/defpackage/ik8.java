package defpackage;

import android.graphics.Typeface;
import android.text.Html;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.widget.TextView;
import com.skydoves.balloon.IconGravity;
import com.skydoves.balloon.g;
import com.skydoves.balloon.h;
import com.skydoves.balloon.vectortext.VectorTextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class ik8 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IconGravity.values().length];
            try {
                iArr[IconGravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconGravity.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconGravity.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconGravity.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void a(android.widget.TextView r9, defpackage.h49 r10) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik8.a(android.widget.TextView, h49):void");
    }

    public static final /* synthetic */ void b(VectorTextView vectorTextView, g gVar) {
        zq3.h(vectorTextView, "<this>");
        zq3.h(gVar, "iconForm");
        if (gVar.a() != null) {
            int h = gVar.h();
            int f = gVar.f();
            int g = gVar.g();
            CharSequence d = gVar.d();
            Integer valueOf = Integer.valueOf(gVar.c());
            if (!(valueOf.intValue() != Integer.MIN_VALUE)) {
                valueOf = null;
            }
            h49 h49Var = new h49(null, null, null, null, null, null, null, null, false, d, Integer.valueOf(g), Integer.valueOf(h), Integer.valueOf(f), null, valueOf, null, null, null, 238079, null);
            int i = a.a[gVar.e().ordinal()];
            if (i == 1) {
                h49Var.w(gVar.a());
                h49Var.x(gVar.b());
            } else if (i == 2) {
                h49Var.y(gVar.a());
                h49Var.z(gVar.b());
            } else if (i == 3) {
                h49Var.s(gVar.a());
                h49Var.t(gVar.b());
            } else if (i == 4) {
                h49Var.u(gVar.a());
                h49Var.v(gVar.b());
            }
            vectorTextView.setDrawableTextViewParams(h49Var);
        }
    }

    public static final /* synthetic */ void c(TextView textView, h hVar) {
        CharSequence c;
        ww8 ww8Var;
        zq3.h(textView, "<this>");
        zq3.h(hVar, "textForm");
        boolean f = hVar.f();
        if (f) {
            c = d(hVar.c().toString());
        } else {
            if (f) {
                throw new NoWhenBranchMatchedException();
            }
            c = hVar.c();
        }
        textView.setText(c);
        textView.setTextSize(hVar.i());
        textView.setGravity(hVar.e());
        textView.setTextColor(hVar.d());
        textView.setIncludeFontPadding(hVar.a());
        Float h = hVar.h();
        if (h != null) {
            textView.setLineSpacing(h.floatValue(), 1.0f);
        }
        Float g = hVar.g();
        if (g != null) {
            textView.setLetterSpacing(g.floatValue());
        }
        Typeface k = hVar.k();
        if (k != null) {
            textView.setTypeface(k);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            textView.setTypeface(textView.getTypeface(), hVar.j());
        }
        MovementMethod b = hVar.b();
        if (b != null) {
            textView.setMovementMethod(b);
        }
    }

    private static final Spanned d(String str) {
        return Html.fromHtml(str, 0);
    }
}
