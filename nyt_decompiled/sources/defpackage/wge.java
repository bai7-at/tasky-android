package defpackage;

/* loaded from: classes3.dex */
final class wge extends bhe {
    final /* synthetic */ xge g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    wge(xge xgeVar, dhe dheVar, CharSequence charSequence) {
        super(dheVar, charSequence);
        this.g = xgeVar;
    }

    @Override // defpackage.bhe
    final int d(int i) {
        return i + 1;
    }

    @Override // defpackage.bhe
    final int e(int i) {
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        tge.b(i, length, "index");
        while (i < length) {
            xge xgeVar = this.g;
            if (xgeVar.a.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
