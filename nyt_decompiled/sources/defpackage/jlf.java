package defpackage;

/* loaded from: classes3.dex */
final class jlf extends ksf {
    final /* synthetic */ apf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jlf(apf apfVar, avf avfVar, CharSequence charSequence) {
        super(avfVar, charSequence);
        this.g = apfVar;
    }

    @Override // defpackage.ksf
    final int d(int i) {
        return i + 1;
    }

    @Override // defpackage.ksf
    final int e(int i) {
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        aif.b(i, length, "index");
        while (i < length) {
            if (charSequence.charAt(i) == ':') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
