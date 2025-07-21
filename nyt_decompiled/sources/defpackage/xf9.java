package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class xf9 extends rs7 {
    private final yo5 o;
    private final sf9 p;

    public xf9() {
        super("WebvttDecoder");
        this.o = new yo5();
        this.p = new sf9();
    }

    private static int B(yo5 yo5Var) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = yo5Var.f();
            String s = yo5Var.s();
            i = s == null ? 0 : "STYLE".equals(s) ? 2 : s.startsWith("NOTE") ? 1 : 3;
        }
        yo5Var.U(i2);
        return i;
    }

    private static void C(yo5 yo5Var) {
        while (!TextUtils.isEmpty(yo5Var.s())) {
        }
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        uf9 m;
        this.o.S(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            zf9.e(this.o);
            while (!TextUtils.isEmpty(this.o.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = B(this.o);
                if (B == 0) {
                    return new bg9(arrayList2);
                }
                if (B == 1) {
                    C(this.o);
                } else if (B == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.o.s();
                    arrayList.addAll(this.p.d(this.o));
                } else if (B == 3 && (m = vf9.m(this.o, arrayList)) != null) {
                    arrayList2.add(m);
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
