package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class mh implements sh {
    private final dh a;
    private final dh b;

    public mh(dh dhVar, dh dhVar2) {
        this.a = dhVar;
        this.b = dhVar2;
    }

    @Override // defpackage.sh
    public p50 a() {
        return new dz7(this.a.a(), this.b.a());
    }

    @Override // defpackage.sh
    public List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.sh
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}
