package defpackage;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.t91;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class so5 implements t91 {
    private final b a;

    public static final class a implements t91.a {
        @Override // t91.a
        public Class a() {
            return ParcelFileDescriptor.class;
        }

        @Override // t91.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t91 b(ParcelFileDescriptor parcelFileDescriptor) {
            return new so5(parcelFileDescriptor);
        }
    }

    private static final class b {
        private final ParcelFileDescriptor a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        ParcelFileDescriptor a() {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public so5(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return true;
    }

    @Override // defpackage.t91
    public void b() {
    }

    @Override // defpackage.t91
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() {
        return this.a.a();
    }
}
