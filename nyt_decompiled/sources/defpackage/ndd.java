package defpackage;

import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;

/* loaded from: classes3.dex */
final class ndd {
    final String a;
    final String b;
    int c;
    long d;
    final Integer e;

    ndd(String str, String str2, int i, long j, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = num;
    }

    public final String toString() {
        String str = this.a + InstructionFileId.DOT + this.c + InstructionFileId.DOT + this.d;
        if (!TextUtils.isEmpty(this.b)) {
            str = str + InstructionFileId.DOT + this.b;
        }
        if (!((Boolean) pla.c().a(mpa.C1)).booleanValue() || this.e == null || TextUtils.isEmpty(this.b)) {
            return str;
        }
        return str + InstructionFileId.DOT + this.e;
    }
}
