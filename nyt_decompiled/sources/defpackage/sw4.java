package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import defpackage.y31;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class sw4 extends rs7 {
    private final yo5 o;

    public sw4() {
        super("Mp4WebvttDecoder");
        this.o = new yo5();
    }

    private static y31 B(yo5 yo5Var, int i) {
        CharSequence charSequence = null;
        y31.b bVar = null;
        while (i > 0) {
            if (i < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int q = yo5Var.q();
            int q2 = yo5Var.q();
            int i2 = q - 8;
            String F = z19.F(yo5Var.e(), yo5Var.f(), i2);
            yo5Var.V(i2);
            i = (i - 8) - i2;
            if (q2 == 1937011815) {
                bVar = vf9.o(F);
            } else if (q2 == 1885436268) {
                charSequence = vf9.q(null, F.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.o(charSequence).a() : vf9.l(charSequence);
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        this.o.S(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.o.a() > 0) {
            if (this.o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int q = this.o.q();
            if (this.o.q() == 1987343459) {
                arrayList.add(B(this.o, q - 8));
            } else {
                this.o.V(q - 8);
            }
        }
        return new tw4(arrayList);
    }
}
