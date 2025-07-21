package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class gt3 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final boolean h;
    private final boolean i;
    private final String j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public gt3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, xt3 xt3Var, boolean z11) {
        zq3.h(str, "prettyPrintIndent");
        zq3.h(str2, "classDiscriminator");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = str;
        this.h = z7;
        this.i = z8;
        this.j = str2;
        this.k = z9;
        this.l = z10;
        this.m = z11;
    }

    public final boolean a() {
        return this.k;
    }

    public final boolean b() {
        return this.d;
    }

    public final String c() {
        return this.j;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return this.m;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.b;
    }

    public final xt3 i() {
        return null;
    }

    public final boolean j() {
        return this.e;
    }

    public final String k() {
        return this.g;
    }

    public final boolean l() {
        return this.l;
    }

    public final boolean m() {
        return this.i;
    }

    public final boolean n() {
        return this.c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=" + this.d + ", prettyPrint=" + this.e + ", explicitNulls=" + this.f + ", prettyPrintIndent='" + this.g + "', coerceInputValues=" + this.h + ", useArrayPolymorphism=" + this.i + ", classDiscriminator='" + this.j + "', allowSpecialFloatingPointValues=" + this.k + ", useAlternativeNames=" + this.l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.m + ')';
    }

    public /* synthetic */ gt3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, xt3 xt3Var, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z8, (i & 512) != 0 ? TransferTable.COLUMN_TYPE : str2, (i & 1024) != 0 ? false : z9, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) == 0 ? z10 : true, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : xt3Var, (i & 8192) == 0 ? z11 : false);
    }
}
