package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzn extends zzau {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private zzn(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.height = i3;
        this.width = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (this.left == zzauVar.left() && this.top == zzauVar.top() && this.height == zzauVar.height() && this.width == zzauVar.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.width ^ ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int left() {
        return this.left;
    }

    public String toString() {
        return "BoundingRectData{left=" + this.left + ", top=" + this.top + ", height=" + this.height + ", width=" + this.width + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzau
    public int width() {
        return this.width;
    }
}
