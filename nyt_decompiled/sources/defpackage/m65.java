package defpackage;

/* loaded from: classes4.dex */
public class m65 implements ew3 {
    private final bp5 a;

    public m65(bp5 bp5Var) {
        this.a = bp5Var;
    }

    @Override // defpackage.ew3, io.reactivex.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return this.a.apply(obj2);
    }
}
