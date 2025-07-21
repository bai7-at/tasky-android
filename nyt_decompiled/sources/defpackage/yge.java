package defpackage;

/* loaded from: classes3.dex */
final class yge extends bhe {
    final /* synthetic */ zge g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yge(zge zgeVar, dhe dheVar, CharSequence charSequence) {
        super(dheVar, charSequence);
        this.g = zgeVar;
    }

    @Override // defpackage.bhe
    public final int d(int i) {
        return i;
    }

    @Override // defpackage.bhe
    public final int e(int i) {
        int i2 = i + 4000;
        if (i2 < this.c.length()) {
            return i2;
        }
        return -1;
    }
}
