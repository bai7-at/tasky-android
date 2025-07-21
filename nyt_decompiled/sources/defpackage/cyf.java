package defpackage;

/* loaded from: classes3.dex */
final class cyf extends f2g {
    final /* synthetic */ zyf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cyf(zyf zyfVar, p3g p3gVar, CharSequence charSequence) {
        super(p3gVar, charSequence);
        this.h = zyfVar;
    }

    @Override // defpackage.f2g
    final int d(int i) {
        return i + 1;
    }

    @Override // defpackage.f2g
    final int e(int i) {
        ykf ykfVar = this.h.a;
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        twf.b(i, length, "index");
        while (i < length) {
            if (ykfVar.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
