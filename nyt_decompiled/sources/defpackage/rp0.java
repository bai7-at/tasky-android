package defpackage;

import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class rp0 implements Comparable {
    private final String a;

    public rp0(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Version can not be null");
        }
        if (!new Regex("[0-9]+(\\.[0-9]+)*").d(str)) {
            throw new IllegalArgumentException("Invalid version format");
        }
        this.a = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(rp0 rp0Var) {
        if (rp0Var == null) {
            return 1;
        }
        String[] strArr = (String[]) new Regex("\\.").g(b(), 0).toArray(new String[0]);
        String[] strArr2 = (String[]) new Regex("\\.").g(rp0Var.b(), 0).toArray(new String[0]);
        int max = Math.max(strArr.length, strArr2.length);
        int i = 0;
        while (i < max) {
            int parseInt = i < strArr.length ? Integer.parseInt(strArr[i]) : 0;
            int parseInt2 = i < strArr2.length ? Integer.parseInt(strArr2[i]) : 0;
            if (parseInt < parseInt2) {
                return -1;
            }
            if (parseInt > parseInt2) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return zq3.c(rp0.class, obj.getClass()) && compareTo((rp0) obj) == 0;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
