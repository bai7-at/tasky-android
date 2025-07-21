package defpackage;

import com.nytimes.android.eventtracker.model.Metadata;

/* loaded from: classes4.dex */
public interface ls4 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final ls4 a(Metadata metadata) {
            zq3.h(metadata, "metadata");
            return new mi1(metadata);
        }
    }

    Metadata a(e52 e52Var);
}
