package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class eda implements Iterable, caa {
    private final String a;

    public eda(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0277  */
    @Override // defpackage.caa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.caa a(java.lang.String r20, defpackage.xhe r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eda.a(java.lang.String, xhe, java.util.List):caa");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eda) {
            return this.a.equals(((eda) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xca(this);
    }

    public final String toString() {
        return "\"" + this.a + "\"";
    }

    @Override // defpackage.caa
    public final caa zzd() {
        return new eda(this.a);
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.caa
    public final Double zzh() {
        if (this.a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.caa
    public final String zzi() {
        return this.a;
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return new aca(this);
    }
}
