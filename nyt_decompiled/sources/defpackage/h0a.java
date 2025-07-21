package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;

/* loaded from: classes3.dex */
public abstract class h0a implements g0a {
    protected h0a() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long zzd = zzd();
        long zzd2 = ((g0a) obj).zzd();
        if (zzd < zzd2) {
            return -1;
        }
        return zzd > zzd2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0a) && zzd() == ((g0a) obj).zzd();
    }

    public final int hashCode() {
        long zzd = zzd();
        return (int) (zzd ^ (zzd >>> 32));
    }

    public final String toString() {
        long zzd = zzd();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        j0a.a(stringBuffer, zzd);
        while (true) {
            if (stringBuffer.length() >= (zzd < 0 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(zzd < 0 ? 3 : 2, "0");
        }
        if ((zzd / 1000) * 1000 == zzd) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, InstructionFileId.DOT);
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
