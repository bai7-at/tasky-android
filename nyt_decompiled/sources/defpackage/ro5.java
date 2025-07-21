package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.a;

/* loaded from: classes2.dex */
public final class ro5 implements iz6 {
    private final a a;

    public ro5(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz6 b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, sk5 sk5Var) {
        return this.a.d(parcelFileDescriptor, i, i2, sk5Var);
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, sk5 sk5Var) {
        return this.a.o(parcelFileDescriptor);
    }
}
