package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzaa extends zzbi {
    private final String message;
    private final String name;

    zzaa(String str, String str2) {
        this.name = str;
        this.message = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbi) {
            zzbi zzbiVar = (zzbi) obj;
            String str = this.name;
            if (str != null ? str.equals(zzbiVar.name()) : zzbiVar.name() == null) {
                String str2 = this.message;
                if (str2 != null ? str2.equals(zzbiVar.message()) : zzbiVar.message() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public String message() {
        return this.message;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbi
    public String name() {
        return this.name;
    }

    public String toString() {
        return "LoggableException{name=" + this.name + ", message=" + this.message + "}";
    }
}
