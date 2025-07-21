package defpackage;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.b;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class v16 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(InputStream inputStream) {
            zq3.h(inputStream, "input");
            try {
                b O = b.O(inputStream);
                zq3.g(O, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return O;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }

        private a() {
        }
    }
}
