package defpackage;

import defpackage.r18;

/* loaded from: classes3.dex */
final class i20 extends r18.c {
    private final String a;
    private final String b;
    private final boolean c;

    i20(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // r18.c
    public boolean b() {
        return this.c;
    }

    @Override // r18.c
    public String c() {
        return this.b;
    }

    @Override // r18.c
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r18.c)) {
            return false;
        }
        r18.c cVar = (r18.c) obj;
        return this.a.equals(cVar.d()) && this.b.equals(cVar.c()) && this.c == cVar.b();
    }

    public int hashCode() {
        return (this.c ? 1231 : 1237) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
