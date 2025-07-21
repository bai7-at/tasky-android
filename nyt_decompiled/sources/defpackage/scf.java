package defpackage;

/* loaded from: classes3.dex */
final class scf extends hcf {
    private final String a;
    private final int b;

    /* synthetic */ scf(String str, int i, rcf rcfVar) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b - 2;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
