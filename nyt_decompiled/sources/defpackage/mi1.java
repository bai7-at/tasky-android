package defpackage;

import com.nytimes.android.eventtracker.model.Metadata;
import defpackage.e52;

/* loaded from: classes4.dex */
public final class mi1 implements ls4 {
    private final Metadata a;

    public mi1(Metadata metadata) {
        zq3.h(metadata, "metadata");
        this.a = metadata;
    }

    @Override // defpackage.ls4
    public Metadata a(e52 e52Var) {
        zq3.h(e52Var, "subject");
        if (e52Var instanceof e52.g ? true : e52Var instanceof e52.i) {
            return this.a;
        }
        return null;
    }
}
