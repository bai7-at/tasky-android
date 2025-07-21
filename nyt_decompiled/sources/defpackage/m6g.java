package defpackage;

/* loaded from: classes3.dex */
public final class m6g {
    public final v3c a;
    public final int[] b;

    public m6g(v3c v3cVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            ezd.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = v3cVar;
        this.b = iArr;
    }
}
