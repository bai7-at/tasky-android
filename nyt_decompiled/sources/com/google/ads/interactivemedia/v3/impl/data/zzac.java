package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzac extends zzbj {
    private final String content;
    private final String contentType;
    private final int errorCode;
    private final String id;

    zzac(String str, String str2, String str3, int i) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null content");
        }
        this.content = str2;
        if (str3 == null) {
            throw new NullPointerException("Null contentType");
        }
        this.contentType = str3;
        this.errorCode = i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String content() {
        return this.content;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbj) {
            zzbj zzbjVar = (zzbj) obj;
            if (this.id.equals(zzbjVar.id()) && this.content.equals(zzbjVar.content()) && this.contentType.equals(zzbjVar.contentType()) && this.errorCode == zzbjVar.errorCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public int errorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return this.errorCode ^ ((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbj
    public String id() {
        return this.id;
    }

    public String toString() {
        return "NetworkResponseData{id=" + this.id + ", content=" + this.content + ", contentType=" + this.contentType + ", errorCode=" + this.errorCode + "}";
    }
}
