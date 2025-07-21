package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;

/* loaded from: classes5.dex */
public interface dp2 {

    public static final class a implements dp2 {
        public static final dp2 b = new a("TEXT_MAP");
        public static final dp2 c = new a("TEXT_MAP_INJECT");
        public static final dp2 d = new a("TEXT_MAP_EXTRACT");
        public static final dp2 e = new a("HTTP_HEADERS");
        public static final dp2 f = new a("BINARY");
        public static final dp2 g = new a("BINARY_INJECT");
        public static final dp2 h = new a("BINARY_EXTRACT");
        private final String a;

        private a(String str) {
            this.a = str;
        }

        public String toString() {
            return a.class.getSimpleName() + InstructionFileId.DOT + this.a;
        }
    }
}
