package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class lqe {
    private String a;
    private mqe b;
    private jme c;

    /* synthetic */ lqe(kqe kqeVar) {
    }

    public final lqe a(jme jmeVar) {
        this.c = jmeVar;
        return this;
    }

    public final lqe b(mqe mqeVar) {
        this.b = mqeVar;
        return this;
    }

    public final lqe c(String str) {
        this.a = str;
        return this;
    }

    public final oqe d() {
        if (this.a == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        mqe mqeVar = this.b;
        if (mqeVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        jme jmeVar = this.c;
        if (jmeVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (jmeVar.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
        }
        if ((mqeVar.equals(mqe.b) && (jmeVar instanceof noe)) || ((mqeVar.equals(mqe.d) && (jmeVar instanceof npe)) || ((mqeVar.equals(mqe.c) && (jmeVar instanceof hre)) || ((mqeVar.equals(mqe.e) && (jmeVar instanceof ane)) || ((mqeVar.equals(mqe.f) && (jmeVar instanceof tne)) || (mqeVar.equals(mqe.g) && (jmeVar instanceof ape))))))) {
            return new oqe(this.a, this.b, this.c, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.b.toString() + " when new keys are picked according to " + String.valueOf(this.c) + InstructionFileId.DOT);
    }
}
