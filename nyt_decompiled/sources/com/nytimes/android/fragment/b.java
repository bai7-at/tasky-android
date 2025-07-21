package com.nytimes.android.fragment;

/* loaded from: classes4.dex */
public interface b {

    public static final class a implements b {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        @Override // com.nytimes.android.fragment.b
        public int getPosition() {
            return this.a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Bottom(position=" + this.a + ", delta=" + this.b + ")";
        }
    }

    /* renamed from: com.nytimes.android.fragment.b$b, reason: collision with other inner class name */
    public static final class C0316b implements b {
        private final int a;
        private final int b;

        public C0316b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0316b)) {
                return false;
            }
            C0316b c0316b = (C0316b) obj;
            return this.a == c0316b.a && this.b == c0316b.b;
        }

        @Override // com.nytimes.android.fragment.b
        public int getPosition() {
            return this.a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "ScrollToBottom(position=" + this.a + ", delta=" + this.b + ")";
        }
    }

    public static final class c implements b {
        private final int a;
        private final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        @Override // com.nytimes.android.fragment.b
        public int getPosition() {
            return this.a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "ScrollToTop(position=" + this.a + ", delta=" + this.b + ")";
        }
    }

    public static final class d implements b {
        private final int a;
        private final int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        @Override // com.nytimes.android.fragment.b
        public int getPosition() {
            return this.a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Top(position=" + this.a + ", delta=" + this.b + ")";
        }
    }

    int getPosition();
}
