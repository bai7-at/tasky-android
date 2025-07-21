package defpackage;

/* loaded from: classes3.dex */
public abstract class dge implements uge {
    protected dge() {
    }

    public static dge b(char c) {
        return new age(c);
    }

    public abstract boolean a(char c);

    @Override // defpackage.uge
    public final /* synthetic */ boolean zza(Object obj) {
        return a(((Character) obj).charValue());
    }
}
