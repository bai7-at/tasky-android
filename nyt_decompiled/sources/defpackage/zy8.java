package defpackage;

/* loaded from: classes.dex */
public final class zy8 {
    private final String a;

    public zy8(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy8) && zq3.c(this.a, ((zy8) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}
