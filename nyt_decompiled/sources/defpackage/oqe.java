package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class oqe extends jme {
    private final String a;
    private final mqe b;
    private final jme c;

    /* synthetic */ oqe(String str, mqe mqeVar, jme jmeVar, nqe nqeVar) {
        this.a = str;
        this.b = mqeVar;
        this.c = jmeVar;
    }

    @Override // defpackage.ple
    public final boolean a() {
        return false;
    }

    public final jme b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oqe)) {
            return false;
        }
        oqe oqeVar = (oqe) obj;
        return oqeVar.b.equals(this.b) && oqeVar.c.equals(this.c) && oqeVar.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(oqe.class, this.a, this.b, this.c);
    }

    public final String toString() {
        jme jmeVar = this.c;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.a + ", dekParsingStrategy: " + String.valueOf(this.b) + ", dekParametersForNewKeys: " + String.valueOf(jmeVar) + ")";
    }
}
