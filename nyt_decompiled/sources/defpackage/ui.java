package defpackage;

import java.util.Objects;

/* loaded from: classes5.dex */
final class ui implements si {
    private final String a;

    private ui(String str) {
        this.a = str;
    }

    static si b(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return new ui(str);
    }

    @Override // defpackage.si
    public String asString() {
        return this.a;
    }

    @Override // defpackage.si
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si) && Objects.equals(this.a, ((si) obj).getValue());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AnyValueString{" + this.a + "}";
    }
}
