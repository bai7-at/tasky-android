package defpackage;

import com.nytimes.android.image.loader.internals.ImageSource;
import com.squareup.picasso.Picasso;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class st5 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Picasso.LoadedFrom.values().length];
            try {
                iArr[Picasso.LoadedFrom.MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Picasso.LoadedFrom.DISK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Picasso.LoadedFrom.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final ImageSource a(Picasso.LoadedFrom loadedFrom) {
        if (loadedFrom == null) {
            return null;
        }
        int i = a.a[loadedFrom.ordinal()];
        if (i == 1) {
            return ImageSource.MEMORY;
        }
        if (i == 2) {
            return ImageSource.DISK;
        }
        if (i == 3) {
            return ImageSource.NETWORK;
        }
        throw new NoWhenBranchMatchedException();
    }
}
